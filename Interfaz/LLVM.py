from ctypes import CFUNCTYPE, c_int
import sys
import math
import llvmlite.ir as ll
import llvmlite.binding as llvm
import re
import os
import random

llvm.initialize()
llvm.initialize_native_target()
llvm.initialize_native_asmprinter()

listregister = []
listfunction = []
actualFunction = ""
actualblock = ""
futureblock = ""
timefunction = 0
condloop = ""
whilecondition = ""
loop = False
loopwhile = False
new = False
repeat = False
module = ll.Module()

class registers:
    def __init__(self, build, values, name):
        self.stack = build.alloca(ll.IntType(32))
        self.value = build.store(ll.Constant(self.stack.type.pointee, values), self.stack)
        self.name = name
    def getName(self):
        return self.name
    def getStack(self):
        return self.stack
    def setNumber(self, build, value):
        self.stack = build.alloca(ll.IntType(32))
        self.value = build.store(ll.Constant(self.stack.type.pointee, value), self.stack)
    def setValue(self, build, values):
        register = values.__str__()
        newregister = ''
        i = 0
        j = 0
        while i < 2:
            if register[j] != '"':
                newregister = newregister + register[j]
            else:
                i = i + 1
            j = j + 1
        self.value = build.store(ll.Constant(self.stack.type.pointee, newregister), self.stack)

class functions:
    def __init__(self, func, name):
        self.function = func
        self.name = name
    def getName(self):
        return self.name
    def getFunction(self):
        return self.function

def createBlock(text):
    global actualFunction
    func_ty = ll.FunctionType(ll.IntType(32), [])
    func = ll.Function(module, func_ty, name=text)
    listfunction.append(functions(func,text))
    actualFunction = func
    bb_entry = func.append_basic_block('entry')
    irbuilder = ll.IRBuilder()
    irbuilder.position_at_end(bb_entry)
    return irbuilder

def createRepeat(build, conda):
    global loop
    global actualblock
    global futureblock
    global condloop
    condloop = conda
    actualblock = actualFunction.append_basic_block('loop'+str(timefunction))
    futureblock = actualFunction.append_basic_block('endloop'+str(timefunction))
    build.branch(actualblock)
    build.position_at_end(actualblock)
    loop = True

def VERIFYLOOP(build, very):
    global loop
    if very != -1:
        if loop == True:
            for obj in listregister:
                if obj.getName() == condloop:
                    cond = build.icmp_unsigned('==', build.load(obj.getStack()), ll.Constant(ll.IntType(32), 1))
                    build.cbranch(cond, futureblock, actualblock)
                    build.position_at_end(futureblock)
                    loop = False

def createWhile(build, conda):
    global loopwhile
    global actualblock
    global futureblock
    actualblock = actualFunction.append_basic_block('loop'+str(timefunction))
    futureblock = actualFunction.append_basic_block('endloop'+str(timefunction))
    for obj in listregister:
        if obj.getName() == conda:
            cond = build.icmp_unsigned('==', build.load(obj.getStack()), ll.Constant(ll.IntType(32), 1))
            build.cbranch(cond, futureblock, actualblock)
    build.position_at_end(actualblock)
    loopwhile = True

def VERIFYWHILE(build, very):
    global loopwhile
    if very != -1:
        if loopwhile == True:
            build.branch(actualblock)
            build.position_at_end(futureblock)
            loopwhile = False

def SUM(build, value1, exit, i):
    var = exit[i+1].split(":")
    for obj in listregister:
        if obj.getName() == value1:
            if var[1] == "number":
                return build.add(build.load(obj.getStack()), ll.Constant(ll.IntType(32), var[3]))
            elif var[1] == "id":
                for obj2 in listregister:
                    if obj2.getName() == value1:
                        return build.add(build.load(obj.getStack()), build.load(obj2.getStack()))
            elif var[1] == "add":
                        return build.add(build.load(obj.getStack()), SUM(build, var[3], exit, i))
            elif var[1] == "sub":
                        return build.add(build.load(obj.getStack()), SUB(build, var[3], exit, i))
            elif var[1] == "mult":
                        return build.add(build.load(obj.getStack()), MUL(build, var[3], exit, i))
            elif var[1] == "div":
                        return build.add(build.load(obj.getStack()), DIV(build, var[3], exit, i))

def SUB(build, value1, exit, i):
    var = exit[i+1].split(":")
    for obj in listregister:
        if obj.getName() == value1:
            if var[1] == "number":
                return build.sub(build.load(obj.getStack()), ll.Constant(ll.IntType(32), var[3]))
            elif var[1] == "id":
                for obj2 in listregister:
                    if obj2.getName() == value1:
                        return build.sub(build.load(obj.getStack()), build.load(obj2.getStack()))
            elif var[1] == "add":
                        return build.sub(build.load(obj.getStack()), SUM(build, var[3], exit, i))
            elif var[1] == "sub":
                        return build.sub(build.load(obj.getStack()), SUB(build, var[3], exit, i))
            elif var[1] == "mult":
                        return build.sub(build.load(obj.getStack()), MUL(build, var[3], exit, i))
            elif var[1] == "div":
                        return build.sub(build.load(obj.getStack()), DIV(build, var[3], exit, i))

def MUL(build, value1, exit, i):
    var = exit[i+1].split(":")
    for obj in listregister:
        if obj.getName() == value1:
            if var[1] == "number":
                return build.mul(build.load(obj.getStack()), ll.Constant(ll.IntType(32), var[3]))
            elif var[1] == "id":
                for obj2 in listregister:
                    if obj2.getName() == value1:
                        return build.mul(build.load(obj.getStack()), build.load(obj2.getStack()))
            elif var[1] == "add":
                        return build.mul(build.load(obj.getStack()), SUM(build, var[3], exit, i))
            elif var[1] == "sub":
                        return build.mul(build.load(obj.getStack()), SUB(build, var[3], exit, i))
            elif var[1] == "mult":
                        return build.mul(build.load(obj.getStack()), MUL(build, var[3], exit, i))
            elif var[1] == "div":
                        return build.mul(build.load(obj.getStack()), DIV(build, var[3], exit, i))

def DIV(build, value1, exit, i):
    var = exit[i+1].split(":")
    for obj in listregister:
        if obj.getName() == value1:
            if var[1] == "number":
                return build.udiv(build.load(obj.getStack()), ll.Constant(ll.IntType(32), var[3]))
            elif var[1] == "id":
                for obj2 in listregister:
                    if obj2.getName() == value1:
                        return build.udiv(build.load(obj.getStack()), build.load(obj2.getStack()))
            elif var[1] == "add":
                        return build.udiv(build.load(obj.getStack()), SUM(build, var[3], exit, i))
            elif var[1] == "sub":
                        return build.udiv(build.load(obj.getStack()), SUB(build, var[3], exit, i))
            elif var[1] == "mult":
                        return build.udiv(build.load(obj.getStack()), MUL(build, var[3], exit, i))
            elif var[1] == "div":
                        return build.udiv(build.load(obj.getStack()), DIV(build, var[3], exit, i))

def SMALLER(build, value1, value2):
    build.icmp_unsigned('<', value1, value2)
    
def GREATER(build, value1, value2):
    build.icmp_unsigned('>', value1, value2)

def EQUAL(build, value1, value2):
    build.icmp_unsigned('==', value1, value2)

def AND(build, value1, value2):
    build.and_(value1, value2)

def OR(build, value1, value2):
    build.or_(value1, value2)

def RANDOM(value):
    randomvalue = random.randint(0, value)
    return ll.Constant(ll.IntType(32),randomvalue)
    
def DEF(build, values, name):
    if values == "True": 
        listregister.append(registers(build, 1, name))
    elif values == "False":
        listregister.append(registers(build, 0, name))
    else: 
        listregister.append(registers(build, int(values), name))

def PUT(build, exit, i, name):
    global repeat
    var = exit[i+1].split(":")
    if var[1] == "add":
        repeat = True
        temp = SUM(build, var[3], exit, i+1)
        for obj in listregister:
            if obj.getName() == name:
                obj.setValue(build, temp)
    elif var[1] == "sub":
        repeat = True
        temp = SUB(build, var[3], exit, i+1)
        for obj in listregister:
            if obj.getName() == name:
                obj.setValue(build, temp)
    elif var[1] == "mult":
        repeat = True
        temp = MUL(build, var[3], exit, i+1)
        for obj in listregister:
            if obj.getName() == name:
                obj.setValue(build, temp)
    elif var[1] == "up":
        for obj in listregister:
            if obj.getName() == name:
                obj.setNumber(build, 1)
    elif var[1] == "down":
        for obj in listregister:
            if obj.getName() == name:
                obj.setNumber(build, 0)
    elif var[1] == "Cup":
        for obj in listregister:
            if obj.getName() == name:
                temp = SUM(build, "Y", exit, i+1)
                obj.setValue(build, temp)
    elif var[1] == "Cdown":
        for obj in listregister:
            if obj.getName() == name:
                temp = SUB(build, "Y", exit, i+1)
                obj.setValue(build, temp)
    elif var[1] == "Cleft":
        for obj in listregister:
            if obj.getName() == name:
                temp = SUB(build, "X", exit, i+1)
                obj.setValue(build, temp)
    elif var[1] == "Cright":
        for obj in listregister:
            if obj.getName() == name:
                temp = SUM(build, "X", exit, i+1)
                obj.setValue(build, temp)
    elif var[1] == "id":
        temp = build.load(obj.getStack())
        for obj in listregister:
            if obj.getName() == name:
                obj.setValue(build, temp)
    elif var[1] == "number":
        for obj in listregister:
            if obj.getName() == name:
                    if var[3] == "True": 
                        obj.setValue(build, 1)
                    elif var[3] == "False":
                        obj.setValue(build, 0)
                    else: 
                        obj.setValue(build, int(var[3]))

def ADDI(build, name, value, tipe):
    for obj in listregister:
        if obj.getName() == name:
            if tipe == "number":
                add = build.add(build.load(obj.getStack()), ll.Constant(ll.IntType(32), value))
                obj.setValue(build, add)
                break
            elif tipe == "id":
                for obj2 in listregister:
                    if obj2.getName() == value:
                        add = build.add(build.load(obj.getStack()), build.load(obj2.getStack()))
                        obj.setValue(build, add)
                break

def ADD(build, name):
    for obj in listregister:
        if obj.getName() == name:
            add = build.add(build.load(obj.getStack()), ll.Constant(ll.IntType(32), 1))
            obj.setValue(build, add)
            break

def CALL(build, name):
    for obj in listfunction:
        if obj.getName() == name:
            build.call(obj.getFunction(),[])
            break

def generate_LLVM(AST):

    global listregister
    global listfunction
    global actualFunction
    global actualblock
    global futureblock
    global timefunction
    global condloop
    global whilecondition
    global loop
    global loopwhile 
    global new
    global repeat
    global module 

    temp = AST
    temp = temp.replace(" ","")
    temp = temp.replace("'","")
    temp = temp.replace("}","")
    temp = temp.replace(",",":")
    temp = temp.replace("[","")
    temp = temp.replace("\n","")
    exit = re.split(r'{+', temp)

    builder = ll.IRBuilder()
    times = exit.__len__()
    print("=== AST")
    for obj in exit:
        print(obj)
        print("-------------")

    builder = createBlock("--INIT--")
    DEF(builder, "0", "X")
    DEF(builder, "0", "Y")
    DEF(builder, "0", "Color")
    DEF(builder, "0", "Position")
    builder.ret(ll.Constant(ll.IntType(32), 0))

    for i in range(1,times):
        text = exit[i].split(":")
        if text[1] == "procedure":
            if new != False:
                builder.ret(ll.Constant(ll.IntType(32), 0))
            builder = createBlock(text[3])
            new = True
        elif text[1] == "main_list":
            if new != False:
                builder.ret(ll.Constant(ll.IntType(32), 0))
            builder = createBlock("main")
            new = True
        elif text[1] == "repeat":
            future = exit[i+1].split(":")
            createRepeat(builder, future[3])
        elif text[1] == "while":
            future = exit[i+1].split(":")
            createWhile(builder, future[3])
        elif text[1] == "def":
            future = exit[i+1].split(":")
            DEF(builder, future[3], text[3])
        elif text[1] == "put":
            PUT(builder, exit, i, text[3])
        elif text[1] == "add":
            if repeat == False:
                ADDI(builder,text[3],future[3],future[1])
        elif text[1] == "sub":
            if repeat == False:
                PUT(builder, exit, i-1, text[3])
        elif text[1] == "mult":
            if repeat == False:
                PUT(builder, exit, i-1, text[3])
        elif text[1] == "div":
            if repeat == False:
                PUT(builder, exit, i-1, text[3])
        elif text[1] == "proc_call":
            CALL(builder, text[3].replace("]",""))
        elif text[1] == "color":
            PUT(builder, exit, i-1, "Color")
        elif text[1] == "down":
            PUT(builder, exit, i-1, "Position")
        elif text[1] == "up":
            PUT(builder, exit, i-1, "Position")
        elif text[1] == "Cup":
            PUT(builder, exit, i-1, "Y")
        elif text[1] == "Cdown":
            PUT(builder, exit, i-1, "Y")
        elif text[1] == "Cleft":
            PUT(builder, exit, i-1, "X")
        elif text[1] == "Cright":
            PUT(builder, exit, i-1, "X")
        if exit[i].find("]") != -1:
            repeat = False
        VERIFYWHILE(builder, exit[i].find("]"))
        VERIFYLOOP(builder, exit[i].find("]"))

    for obj in listregister:
        if obj.getName() == "var1":
            added = builder.add(builder.load(obj.getStack()),ll.Constant(ll.IntType(32), 1))
            builder.ret(added)
    #builder.ret(ll.Constant(ll.IntType(32), 0))

    print('=== LLVM IR')
    print(module)
    f = open("Code.txt", "w")
    f.write(module.__str__())

    # Convert textual LLVM IR into in-memory representation.
    llvm_module = llvm.parse_assembly(str(module))
    llvm_module.verify()

    tm = llvm.Target.from_default_triple().create_target_machine()

    # Compile the module to machine code using MCJIT
    with llvm.create_mcjit_compiler(llvm_module, tm) as ee:
        ee.finalize_object()
        print('=== Assembly')
        print(tm.emit_assembly(llvm_module))

        f = open("Assembly.txt", "w")
        f.write(tm.emit_assembly(llvm_module))

        obj_file_path = "output.o"
        with open(obj_file_path, "wb") as obj_file:
            obj_file.write(tm.emit_object(llvm_module))
        
        #executable_name = "output"
        #os.system(f"gcc {obj_file_path} -o {executable_name}")
        #print(f"Ejecutable generado: {executable_name}")

        # Obtain a pointer to the compiled 'sum' - it's the address of its JITed
        # code in memory.
        #print('--------------------------------------------------------')
        #print(llvm_module.get_function('linea1'))
        cfptr = ee.get_function_address('main')

        # To convert an address to an actual callable thing we have to use
        # CFUNCTYPE, and specify the arguments & return type.
        cfunc = CFUNCTYPE(c_int, c_int, c_int)(cfptr)

        # Now 'cfunc' is an actual callable we can invoke
        res = cfunc(10,12,14)
        print('El resultado es', res)


