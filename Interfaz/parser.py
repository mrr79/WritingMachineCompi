import ply.yacc as yacc
from lexer import tokens  # Asegúrate de que tus tokens están en lexer.py
from errorMnger import errorMnger
from tablasimbolos import tablasimbolos
from verTypes import verTypes
#instancia de clases globales:
tablasimbolo=tablasimbolos()
verType = verTypes()
errorMngers = errorMnger()
# Definición de la gramática
#regla inicial va de primero(la regla 
# de entrada), alternativa parser = yacc.yacc(start='start'), start
#es la regla inicial
#definicion de la regla sentencia
#regla para todo, regla principal :
#regla para el procedure:
def p_program(p):
    '''program : procedure_list Main '''
    p[0] = {
            'type': 'program',
            'procedures': p[1],  # Capturamos el ID.
            'main': p[2],       # La lista de caseaux.    # No hay bloque ELSE.
        }
def p_procedure_list(p):
    '''procedure_list : procedure
                      | procedure_list procedure'''
    if len(p) == 2:  # Caso: procedure_list -> procedure
        p[0] = {
            'type': 'procedure_list',
            'children': [p[1]]  # Creamos un nodo con un hijo inicial.
        }
    elif len(p) == 3:  # Caso: procedure_list -> procedure_list procedure
        # Agregamos el nuevo procedimiento a la lista de hijos existentes.
        p[0] = {
            'type': 'procedure_list',
            'children': p[1]['children'] + [p[2]]
        }
def p_procedure(p): #hay que arreglar el procedure para el semantico
    #la lista de parametros debe de estar bien definida con sus tipos
    '''procedure : PROC ID PAR_OPEN paramet_list PAR_CLOSE P_OPEN codigo_list P_CLOSE SEMICOLON END SEMICOLON
                | PROC ID PAR_OPEN PAR_CLOSE P_OPEN codigo_list P_CLOSE SEMICOLON END SEMICOLON '''
    tablasimbolo.exit_scope() #SE INSERTA EL SCOPE DE TABLA SIMBOLOS !!!!!!
    print("se inserta un scope")
    print("estado tabla antes insercion:",tablasimbolo.table)
    if len(p) == 12:  # Caso: CASE ID caseaux_list END CASE SEMICOLON
        parameters = p[4]
        for param in parameters:
            if param['type'] == 'id':  # Solo registramos IDs
                
                tablasimbolo.add_symbol(
                    param['value'],  # El nombre del parámetro (value del ID)
                    {'type': 'unknown'} #como no se que es , se inserta unkown.
                )
        p[0] = {
            'type': 'procedure',
            'identifier': p[2],  # Capturamos el ID.
            'parameters': p[4],       # La lista de caseaux.
            'body': p[7]    # No hay bloque ELSE.
        }
    elif len(p) == 11:  # Caso: CASE ID caseaux_list ELSE P_OPEN sentencia_list P_CLOSE END CASE SEMICOLON
        p[0] = {
            'type': 'procedure',
            'identifier': p[2],  # Capturamos el ID.
            'parameters': None,       # La lista de caseaux.
            'body': p[6]    # Capturamos el bloque ELSE.
        }
    tablasimbolo.enter_scope() #SE QUITA EL SCOPE, SE TERMINO DE ANALIZAR LAS VARIABLES !!
#entrada al programa, el program
def p_sentencia(p):
    '''sentencia : operation
                | def
                | put
                | cup
                | cdown
                | cleft
                | cright
                | pos
                | posx
                | posy
                | color
                | down
                | up
                | begining'''
    p[0] = p[1]  # Asumimos que cada operación retorna un nodo apropiado
#reglas basicas------------------
#regla n1
def p_n1(p):
    '''n1 : NUMBER
          | operation
          | BOOLEAN'''
    
    if isinstance(p[1], dict):
        p[0] = p[1]  # Si es una operación, simplemente pasa el nodo
    elif p[1] in ['TRUE', 'FALSE']:
        p[0] = {
            'type': 'boolean',
            'value': p[1] == 'TRUE'  # Convertir a valor booleano (True/False)
        }
    else:
        p[0] = {
            'type': 'number',
            'value': p[1]  # Asumimos que es un número
        }
#regla n2*******************************************************
def p_n2(p): 
    '''n2 : NUMBER
          | operation
          | ID'''
    
    if isinstance(p[1], dict):
        p[0] = p[1]  # Si es una operación, pasa el nodo
    elif isinstance(p[1], str):  # Verifica si p[1] es un string (ID)
        p[0] = {
            'type': 'id',
            'value': p[1]  # Se asigna el valor del identificador
        }
    else:
        p[0] = {
            'type': 'number',
            'value': p[1]  # Asumimos que es un número
        }
#regla n3
def p_n3(p):
    '''n3 : NUMBER
          | ID'''
    if isinstance(p[1], str):  # Si p[1] es un string (ID)
        p[0] = {
            'type': 'id',
            'value': p[1]  # Se asigna el valor del identificador
        }
    else:  # Si es un número
        p[0] = {
            'type': 'number',
            'value': p[1]  # Asumimos que es un número
        }
#regla n4
def p_n4(p):
    '''n4 : NUMBER
          | operation
          | ID
          | BOOLEAN'''
    if isinstance(p[1], dict):  # Si es una operación
        p[0] = p[1]  # Pasa el nodo de operación
    elif isinstance(p[1], str):  # Si es un string (ID o BOOLEAN)
        if p[1] in ['TRUE', 'FALSE']:
            p[0] = {
                'type': 'boolean',   #
                'value': p[1] == 'TRUE'  # Convertir a valor booleano
            }
        else:
            p[0] = { #para variables para las variables AA (usar tabla de simbolos para verificar tipo )
                'type': 'id',
                'value': p[1]  # Asignar el valor del identificador
            }
    else:  # Asumimos que es un número
        p[0] = { #p[0]['type']
            'type': 'number',
            'value': p[1]  # Asumimos que es un número
        }
#regla n5
#regla n5
def p_n5(p):
    '''n5 : NUMBER
          | ID
          | BOOLEAN'''
    if isinstance(p[1], str):  # Si p[1] es un string (ID o BOOLEAN)
        if p[1] in ['TRUE', 'FALSE']:
            p[0] = {
                'type': 'boolean',
                'value': p[1] == 'TRUE'  # Convertir a valor booleano
            }
        else:
            p[0] = {
                'type': 'id',
                'value': p[1]  # Asignar el valor del identificador
            }
    else:  # Asumimos que es un número
        p[0] = {
            'type': 'number',
            'value': p[1]  # Asumimos que es un número
        }
#regla n6
def p_n6(p):
    '''n6 : NUMBER
          | BOOLEAN'''
    if isinstance(p[1], str):  # Si p[1] es un string (BOOLEAN)
        p[0] = {
            'type': 'boolean',
            'value': p[1] == 'TRUE'  # Convertir a valor booleano
        }
    else:  # Asumimos que es un número
        p[0] = {
            'type': 'number',
            'value': p[1]  # Asumimos que es un número
        } 
#reglas def:
def p_def(p):
    '''def : DEF PAR_OPEN ID COLON n6 PAR_CLOSE SEMICOLON'''

    #validacion adicional para insertado especial , para el sub
    valorVariable = p[5]
    if valorVariable['type']== 'number':
        tablasimbolo.add_symbol(
                    p[3],  # El nombre del parámetro (value del ID)
                    {'type': p[5]['type'] , 'intValue': p[5]['value']}
                     #como no se que es , se inserta unkown.
                )
    else:
        tablasimbolo.add_symbol(
                    p[3],  # El nombre del parámetro (value del ID)
                    {'type': p[5]['type'] } #como no se que es , se inserta unkown.
                )
    p[0] = {
        'type': 'def',
        'id': p[3],    # n3 (primer operando: número o variable)
        'value': p[5]  # n2 (segundo operando: número o variable)
    }

#fin reglas basicas--------------------------
#reglas complejas--------------------------------
#definicion de la regla operacion
def p_operation(p):
    '''operation : add
                | sub
                | equal
                | and
                | or
                | greater
                | smaller
                | random
                | mult
                | div
                | sum'''
    p[0] = p[1]  # Asumimos que cada operación retorna un nodo apropiado
#regla para el add
def p_add(p):
    
    '''add : ADDO PAR_OPEN ID PAR_CLOSE SEMICOLON
           | ADDO PAR_OPEN ID COLON n2 PAR_CLOSE SEMICOLON'''
    
    #analisis semántico:
    id = p[3] #esto me da el nombre
    #estructura del id type:id , value = nombreVariable
    if tablasimbolo.lookup(id) != None:
        print("encontre simbolos") #variable si esta declarada , busco por nombre
        if len(p)==8: #si existe un segundo valor
            operando2= p[5]
            #busca el nombre de operando 2 en la tabla

            #CHECK MIEO
            if operando2['type'] =='id' and tablasimbolo.lookup(operando2['value'])!=None: 
                #aca hace la comparacion
                if verType.compare_types(tablasimbolo.get_type(id),tablasimbolo.get_type(operando2['value'])) == False:
                    errorMngers.add_error( f"Error semantico,valores de:'{id}'y {operando2['value']} incompatibles")
            #Check
            elif operando2['type'] =='number': #este creo que va a tirar error!!!!!!!
                if verType.compare_types(tablasimbolo.get_type(id),operando2['type']) == False:
                    errorMngers.add_error( f"Error semantico,valores de:'{id}'y {operando2['value']} incompatibles")
            #Check
            elif operando2['type'] !='number' and operando2['type'] !='id':
                    #print("valor de operando 2 es:" , operando2['type'])
                    if tablasimbolo.get_type(id)!=operando2['returnType']:
                        errorMngers.add_error( f"Error semantico,valores de:'{id}'y {operando2['type']} incompatibles")
            #Check
            else:
                 print("encontre un error en el flujo del codigo")
                 errorMngers.add_error( f"Error semantico, variable {operando2['value']} no definida")
    else:
        errorMngers.add_error( f"Error semantico, id :'{id}' no definido.")
        
    #construccion del arbol:
    
    if len(p) == 6:  # ADDO PAR_OPEN ID PAR_CLOSE SEMICOLON
        p[0] = {
            'type': 'add',
            'id': p[3],  # ID del parámetro
            'value': 1,
            'returnType':'number'    # No hay valor asociado en este caso
        }
    elif len(p) == 8:  # ADDO PAR_OPEN ID COLON n2 PAR_CLOSE SEMICOLON
        p[0] = {
            'type': 'add',
            'id': p[3],  # ID del parámetro
            'value': p[5],
            'returnType':'number' # El valor n2 asociado, que ya tiene su propia estructura
        }
#regla para el equals:
def p_equal(p):
    '''equal : EQUAL PAR_OPEN n2 COLON n2 PAR_CLOSE SEMICOLON'''
    #Posibles casos
    #si ambos son variables
    #si el primer n2 es variable y el segundo no
    #si el n2 no es variable y el segundo si
    #si ninguno es variable

    operando1= p[3]
    operando2 = p[5]
    #operando2[´type´]

    if operando1['type'] == 'value':
        if tablasimbolo.get_type(operando1['value']) == None:
            errorMngers.add_error(f"Error semantico, valor de:'{operando1['value']}' no definido en Equal")
    
    if operando2['type'] == 'value':
        if tablasimbolo.get_type(operando2['value']) == None:
            errorMngers.add_error(f"Error semantico, valor de:'{operando2['value']}' no definido en Equal")

    p[0] = {
        'type': 'equal',
        'left': p[3],   # Primer operando (n2)
        'right': p[5],
        'returnType':'boolean'   # Segundo operando (n2)
    }
#regla para el sub:
def p_sub(p):
    '''sub : SUBSTR PAR_OPEN n3 COLON n2 PAR_CLOSE SEMICOLON'''
    #debe tirar error si n3 < n2
    operando1 = p[3]
    operando2 = p[5]
    if operando1['type'] == 'id':
        if tablasimbolo.get_type(operando1['value']) != 'number': #CHECK
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' no es un número o no está definido correctamente en SUB.")
        elif operando2['type'] == 'number' or operando2['type'] == 'id': #check
            # Verificar el segundo operando si es id
            if operando2['type'] == 'id' and tablasimbolo.get_type(operando2['value']) != 'number':
                errorMngers.add_error(f"Error semántico: '{operando2['value']}' no es un número o no está definido correctamente en SUB.")
            elif tablasimbolo.get_type(operando1['value'])=='number' and operando2['type'] == 'id' and (tablasimbolo.get_valueInt(operando1['value']) < tablasimbolo.get_valueInt(operando2['value'])):
                errorMngers.add_error(f"Error semántico: '{operando1['value']}' es menor que el operando 2 en sub.")
        #n2 es una operación ,no puedo comprobar si es menor o no por que las operaciones no dan un resultado
        elif operando2['type'] != 'number' and operando2['type'] != 'id': #check
            if operando2['returnType'] !='number':
                errorMngers.add_error(f"Error semántico: Operandos inválidos en Mult: '{operando2['type']}'.")
        
        else:
            errorMngers.add_error(f"Error semántico: Operandos inválidos en Mult")
    elif operando1['type'] == 'number':
        if operando2['type'] == 'number' or operando2['type'] == 'id':
            # Verificar el segundo operando si es id
            if operando2['type'] == 'id' and tablasimbolo.get_type(operando2['value']) != 'number':
                errorMngers.add_error(f"Error semántico: '{operando2['value']}' no es un número o no está definido correctamente en Mult.")
            elif operando2['type'] == 'id' and (tablasimbolo.get_valueInt(operando1['value']) < tablasimbolo.get_valueInt(operando2['value'])):
                errorMngers.add_error(f"Error semántico: '{operando1['value']}' es menor que el operando 2 en sub.")
        #n2 es una operación
        elif operando2['type'] != 'number' and operando2['type'] != 'id':
            if operando2['returnType'] !='number':
                errorMngers.add_error(f"Error semántico: Operandos inválidos en Mult: '{operando2['value']}'.")
        else:
            errorMngers.add_error(f"Error semántico: Operandos inválidos en Mult")

    # invalidoos
    else:
        errorMngers.add_error(f"Error semántico: Operandos inválidos en Mult.")
    
    
    p[0] = {
        'type': 'sub',
        'id': p[3],    # n3 (primer operando: número o variable)
        'value': p[5],
        'returnType':'number'  # n2 (segundo operando: número o variable)
    }
#regla para el and : 
def p_and(p):
    '''and : AND PAR_OPEN n4 COLON n4 PAR_CLOSE SEMICOLON'''
    operando1= p[3]
    operando2= p[5]
    #caso 1 ambos numeros, CHECK
    if operando1['type'] == 'number' or operando2['type'] == 'number':
        errorMngers.add_error(f"Error semantico, operando u operando 2 son numeros, no bolean en el and")
    #caso 2 ambos son ids CHECK
    elif operando1['type']=='id' and operando2['type']=='id' :
        if tablasimbolo.get_type(operando1['value']) !='boolean' or tablasimbolo.get_type(operando2['value']) != 'boolean':
            errorMngers.add_error(f"Error semantico, '{operando1['value']}' o el '{operando2['value']}' no son bolean o no definidas")
    #ccaso 3 uno es id y el otro operacion: #CHECK
    elif operando1['type']=='id' and (operando2['type']!='id' and operando2['type']!='boolean'):
        print("el operando 2 type es:",operando2['type'])
        if tablasimbolo.get_type(operando1['value']) !='boolean' or operando2['returnType']!='boolean':
            errorMngers.add_error(f"Error semantico, '{operando1['value']}' o la operacion insertada no son bolean")
    #caso 4 inversion
    elif operando2['type']=='id' and (operando1['type']!='id' and operando1['type']!='boolean'):
        if tablasimbolo.get_type(operando2['value']) !='boolean' or operando1['returnType']!='boolean':
            errorMngers.add_error(f"Error semantico, '{operando2['value']}' o el '{operando1['value']}' no son bolean") 
    else:#CASO OERACIONES CHECK
        if operando1['returnType'] !='boolean' or operando2['returnType']!='boolean':
            errorMngers.add_error(f"Error semantico, las operaciones insertadas no son usables para la funcion and") 

        
    p[0] = {
        'type': 'and',
        'left': p[3],   # Primer operando (n2)
        'right': p[5],
        'returnType':'boolean'   # Segundo operando (n2)
    }
    #regla para el or
def p_or(p):
    '''or : OR PAR_OPEN n4 COLON n4 PAR_CLOSE SEMICOLON'''
    operando1 = p[3]
    operando2 = p[5]
    
    # booleanos CHECK
    if operando1['type'] == 'number' or operando2['type'] == 'number':
        errorMngers.add_error(f"Error semántico: el operando 1 o el operando 2 son números, no booleanos.")
    #AMBOS ID CHECK
    elif operando1['type'] == 'id' and operando2['type'] == 'id':
        # tipos en la tabla de símbolos si son identific los dos 
        if tablasimbolo.get_type(operando1['value']) != 'boolean' or tablasimbolo.get_type(operando2['value']) != 'boolean':
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' o '{operando2['value']}' no son booleanos o no están definidos correctamente.")
    #ID OPERACION check
    elif operando1['type'] == 'id' and operando2['type'] != 'id' and operando2['type'] != 'boolean':
        # primer operando = identificador y el segundo no es un booleano o ID
        if tablasimbolo.get_type(operando1['value']) != 'boolean' or operando2['returnType'] != 'boolean':
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' o la operación insertada no son booleanos.")
    #check
    elif operando2['type'] == 'id' and operando1['type'] != 'id' and operando1['type'] != 'boolean':
        # segundo operando identificador y el primero no es un booleano o ID
        if tablasimbolo.get_type(operando2['value']) != 'boolean' or operando1['returnType'] != 'boolean':
            errorMngers.add_error(f"Error semántico: '{operando2['value']}' o la operacion no son booleanos.")
    else:
        # tipos correctos
        if operando1['returnType'] != 'boolean' or operando2['returnType'] != 'boolean':
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' o '{operando2['value']}' no son booleanos.")
    
    # Definir el tipo de la operación OR
    p[0] = {
        'type': 'or',
        'left': p[3],   # Primer operando
        'right': p[5],   # Segundo operando
        'returnType': 'boolean'  # Tipo de retorno de la operación OR
    }

#regla para el greater: CHECK
def p_greater(p):
    '''greater : GREATER PAR_OPEN n2 COLON n2 PAR_CLOSE SEMICOLON'''
    operando1 = p[3]
    operando2 = p[5]

        
    
    #2: Si uno o los dos operandos ID, (tabla de símbolos) CHECK
    if operando1['type'] == 'id' and operando2['type'] == 'id':
        if tablasimbolo.get_type(operando1['value']) != 'number' or tablasimbolo.get_type(operando2['value']) != 'number':
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' o '{operando2['value']}' operandos no son números o no están definidos correctamente para la operacion Greater.")
    
    #3: uno es num y otro ID CHECK
    elif operando1['type'] == 'id' and operando2['type'] == 'number':
        if tablasimbolo.get_type(operando1['value']) != 'number':
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' no es un número.")
    
    # 4: otro operando es ID CHECK
    elif operando1['type'] == 'number' and operando2['type'] == 'id':
        if tablasimbolo.get_type(operando2['value']) != 'number':
            errorMngers.add_error(f"Error semántico: '{operando2['value']}' no es un número.")
    #si ambas son operaciones CHECK   
    elif (operando1['type'] != 'number' and operando1['type'] != 'id') and (operando2['type'] != 'number' and operando2['type'] != 'id'):
        if operando1['returnType'] != 'number' or operando2['returnType'] != 'number':
            errorMngers.add_error(f"Error semántico: '{operando2['type']}' o '{operando1['type']}' no son numeros validos en greater().")
    #si solo la derecha es operación CHECK
    elif operando1['type'] != 'number' and operando1['type'] != 'id':
        if operando1['returnType'] != 'number':
            errorMngers.add_error(f"Error semántico: '{operando1['type']}' no retorna numeros validos en greater().")
        #si operando 2 es una variable
        elif operando2['type'] == 'id' and tablasimbolo.get_type(operando2) !='number':
            errorMngers.add_error(f"Error semántico: '{operando2['value']}' no contiene un valor numerico o no esta definida.")
    #si solo la derecha es operación CHECK
    elif operando2['type'] != 'number' and operando2['type'] != 'id':
        if operando2['returnType'] != 'number':
            errorMngers.add_error(f"Error semántico: '{operando2['type']}' no retorna numeros validos en greater().")
        #si operando 2 es una variable
        elif operando1['type'] == 'id' and tablasimbolo.get_type(operando1) !='number':
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' no contiene un valor numerico o no esta definida.") 
    else:
        errorMngers.add_error(f"Error semántico: '{operando1['value']}' y '{operando2['value']}' no son números.")


    p[0] = {
        'type': 'greater',
        'left': p[3],   # Primer operando (n2)
        'right': p[5],
        'returnType':'boolean'   # Segundo operando (n2)
    }
    #regla para el smaller:
def p_smaller(p):
    '''smaller : SMALLER PAR_OPEN n2 COLON n2 PAR_CLOSE SEMICOLON'''
    operando1 = p[3]
    operando2 = p[5]

    #2: Si uno o los dos operandos ID, (tabla de símbolos) CHECK
    if operando1['type'] == 'id' and operando2['type'] == 'id':
        if tablasimbolo.get_type(operando1['value']) != 'number' or tablasimbolo.get_type(operando2['value']) != 'number':
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' o '{operando2['value']}' operandos no son números o no están definidos correctamente para la operacion Greater.")
    
    #3: uno es num y otro ID CHECK
    elif operando1['type'] == 'id' and operando2['type'] == 'number':
        if tablasimbolo.get_type(operando1['value']) != 'number':
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' no es un número.")
    
    # 4: otro operando es ID CHECK
    elif operando1['type'] == 'number' and operando2['type'] == 'id':
        if tablasimbolo.get_type(operando2['value']) != 'number':
            errorMngers.add_error(f"Error semántico: '{operando2['value']}' no es un número.")
    #si ambas son operaciones CHECK   
    elif (operando1['type'] != 'number' and operando1['type'] != 'id') and (operando2['type'] != 'number' and operando2['type'] != 'id'):
        if operando1['returnType'] != 'number' or operando2['returnType'] != 'number':
            errorMngers.add_error(f"Error semántico: '{operando2['type']}' o '{operando1['type']}' no son numeros validos en greater().")
    #si solo la derecha es operación CHECK
    elif operando1['type'] != 'number' and operando1['type'] != 'id':
        if operando1['returnType'] != 'number':
            errorMngers.add_error(f"Error semántico: '{operando1['type']}' no retorna numeros validos en greater().")
        #si operando 2 es una variable
        elif operando2['type'] == 'id' and tablasimbolo.get_type(operando2) !='number':
            errorMngers.add_error(f"Error semántico: '{operando2['value']}' no contiene un valor numerico o no esta definida.")
    #si solo la derecha es operación CHECK
    elif operando2['type'] != 'number' and operando2['type'] != 'id':
        if operando2['returnType'] != 'number':
            errorMngers.add_error(f"Error semántico: '{operando2['type']}' no retorna numeros validos en greater().")
        #si operando 2 es una variable
        elif operando1['type'] == 'id' and tablasimbolo.get_type(operando1) !='number':
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' no contiene un valor numerico o no esta definida.") 
    else:
        errorMngers.add_error(f"Error semántico: '{operando1['value']}' y '{operando2['value']}' no son números.")


    # Deefinir la operación SMALLER
    p[0] = {
        'type': 'smaller',
        'left': p[3],   # Primer operando
        'right': p[5],   # Segundo operando
        'returnType': 'boolean'  # Tipo de retorno de la operación
    }




  
#regla para el random
def p_random(p): #CHECK
    '''random : RANDOM PAR_OPEN n3 PAR_CLOSE SEMICOLON'''
    operando = p[3]

    # SI ES NUMERO
    if operando['type'] == 'id' and tablasimbolo.get_type(operando['value'])!= 'number':
        errorMngers.add_error(f"Error semántico: El operando '{operando['value']}' no es un numero o no esta definido")

    # Si no es un número ni un id
    elif operando['type'] != 'id' and operando['type'] != 'number':
        errorMngers.add_error(f"Error semántico: El operando '{operando['value']}' debe ser un número o una variable numérica.")

    # Estructura 
    p[0] = {
        'type': 'random',
        'value': operando,   # el rango
        'returnType': 'number'  # Siempre devuelve un número
    }


#regla para la multiplicacion 
def p_mult(p):
    '''mult : MULTO PAR_OPEN n3 COLON n2 PAR_CLOSE SEMICOLON'''
    operando1 = p[3]  
    operando2 = p[5]  
    #N1 es una variable (id)
    if operando1['type'] == 'id':
        if tablasimbolo.get_type(operando1['value']) != 'number': #CHECK
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' no es un número o no está definido correctamente en Mult.")
        elif operando2['type'] == 'number' or operando2['type'] == 'id': #check
            # Verificar el segundo operando si es id
            if operando2['type'] == 'id' and tablasimbolo.get_type(operando2['value']) != 'number':
                errorMngers.add_error(f"Error semántico: '{operando2['value']}' no es un número o no está definido correctamente en Mult.")
        #n2 es una operación
        elif operando2['type'] != 'number' and operando2['type'] != 'id': #check
            if operando2['returnType'] !='number':
                errorMngers.add_error(f"Error semántico: Operandos inválidos en Mult: '{operando2['type']}'.")
        else:
            errorMngers.add_error(f"Error semántico: Operandos inválidos en Mult")
    elif operando1['type'] == 'number':
        if operando2['type'] == 'number' or operando2['type'] == 'id':
            # Verificar el segundo operando si es id
            if operando2['type'] == 'id' and tablasimbolo.get_type(operando2['value']) != 'number':
                errorMngers.add_error(f"Error semántico: '{operando2['value']}' no es un número o no está definido correctamente en Mult.")
        #n2 es una operación
        elif operando2['type'] != 'number' and operando2['type'] != 'id':
            if operando2['returnType'] !='number':
                errorMngers.add_error(f"Error semántico: Operandos inválidos en Mult: '{operando2['value']}'.")
        else:
            errorMngers.add_error(f"Error semántico: Operandos inválidos en Mult")

    # invalidoos
    else:
        errorMngers.add_error(f"Error semántico: Operandos inválidos en Mult.")

    # estructura 
    p[0] = {
        'type': 'mult',
        'left': operando1,
        'right': operando2,
        'returnType': 'number'
    }


    
def p_div(p):
    '''div : DIVO PAR_OPEN n3 COLON n2 PAR_CLOSE SEMICOLON'''
    operando1 = p[3]  # Primer operando (N1)
    operando2 = p[5]  # Segundo operando (N2)

    if operando1['type'] == 'id':
        if tablasimbolo.get_type(operando1['value']) != 'number': #CHECK
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' no es un número o no está definido correctamente en DIV.")
        elif operando2['type'] == 'number' or operando2['type'] == 'id': #check
            # Verificar el segundo operando si es id
            if operando2['type'] == 'id' and tablasimbolo.get_type(operando2['value']) != 'number':
                errorMngers.add_error(f"Error semántico: '{operando2['value']}' no es un número o no está definido correctamente en DIV.")
        #n2 es una operación
        elif operando2['type'] != 'number' and operando2['type'] != 'id': #check
            if operando2['returnType'] !='number':
                errorMngers.add_error(f"Error semántico: Operandos inválidos en DIV: '{operando2['type']}'.")
        else:
            errorMngers.add_error(f"Error semántico: Operandos inválidos en DIV")
    elif operando1['type'] == 'number':
        if operando2['type'] == 'number' or operando2['type'] == 'id':
            # Verificar el segundo operando si es id
            if operando2['type'] == 'id' and tablasimbolo.get_type(operando2['value']) != 'number':
                errorMngers.add_error(f"Error semántico: '{operando2['value']}' no es un número o no está definido correctamente en DIV.")
        #n2 es una operación
        elif operando2['type'] != 'number' and operando2['type'] != 'id':
            if operando2['returnType'] !='number':
                errorMngers.add_error(f"Error semántico: Operandos inválidos en Div: '{operando2['value']}'.")
        else:
            errorMngers.add_error(f"Error semántico: Operandos inválidos en Div")

    # invalidoos
    else:
        errorMngers.add_error(f"Error semántico: Operandos inválidos en Div.")

    # estructura final
    p[0] = {
        'type': 'div',
        'left': operando1,
        'right': operando2,
        'returnType': 'number'
    }

def p_sum(p):
    '''sum : SUMO PAR_OPEN n3 COLON n2 PAR_CLOSE SEMICOLON'''
    operando1 = p[3]  # Primer operando (N1)
    operando2 = p[5]  # Segundo operando (N2)

    # 2 numeros
    if operando1['type'] == 'number' and operando2['type'] == 'number':
        p[0] = {
            'type': 'sum',
            'left': operando1,  # Primer operando
            'right': operando2,  # Segundo operando
            'returnType': 'number'  # La suma siempre retorna un número
        }

    # N1 variable (id)
    elif operando1['type'] == 'id':
        if tablasimbolo.get_type(operando1['value']) != 'number':
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' no es un número o no está definido correctamente.")
        elif operando2['type'] == 'number' or operando2['type'] == 'id':
            # si el otro operando si es id
            if operando2['type'] == 'id' and tablasimbolo.get_type(operando2['value']) != 'number':
                errorMngers.add_error(f"Error semántico: '{operando2['value']}' no es un número o no está definido correctamente.")
            else:
                p[0] = {
                    'type': 'sum',
                    'left': operando1,
                    'right': operando2,
                    'returnType': 'number'
                }

    #3: N2 es una operacion
    elif operando2['type'] in ['mult', 'add', 'sub', 'div', 'sum']:
        if operando1['type'] == 'number' or (operando1['type'] == 'id' and tablasimbolo.get_type(operando1['value']) == 'number'):
            p[0] = {
                'type': 'sum',
                'left': operando1,
                'right': operando2,
                'returnType': 'number'
            }
        else:
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' no es un número válido para la operación Sum.")

    # invalidos
    else:
        errorMngers.add_error(f"Error semántico: Operandos inválidos en Sum: '{operando1['value']}' y '{operando2['value']}'.")

    # Estructura final
    p[0] = {
        'type': 'sum',
        'left': operando1,
        'right': operando2,
        'returnType': 'number'
    }




#reglas put:
def p_put(p):
    #el error solo e genera si la variable id no existe
    '''put : PUT PAR_OPEN ID COLON n1 PAR_CLOSE SEMICOLON'''
    if tablasimbolo.lookup(p[3])!= None:
        operando2=p[5]
        if operando2['type'] =='boolean' or operando2['type'] == 'number':
            if operando2['type'] == 'number':
                tablasimbolo.edit(
                        p[3],  # El nombre del parámetro (value del ID)
                        {'type': p[5]['type'],'intValue': p[5]['value'] }
                        #como no se que es , se inserta unkown.
                    )
            else:
                tablasimbolo.edit(
                        p[3],  # El nombre del parámetro (value del ID)
                        {'type': p[5]['type'] },
                         #como no se que es , se inserta unkown.
                    )
        else: #caso donde sea una operacion
            tablasimbolo.edit(
                    p[3],  # El nombre del parámetro (value del ID)
                    {'type': p[5]['returnType'] } #como no se que es , se inserta unkown.
                )

    else:
        errorMngers.add_error( f"Error semantico, id :'{p[3]}' no definido.")
        
    p[0] = {
        'type': 'put',
        'id': p[3],    # n3 (primer operando: número o variable)
        'value': p[5]  # n2 (segundo operando: número o variable)
    }
#reglascontinue
#reglas def:
def p_cup(p):
    '''cup : CUP n2 SEMICOLON'''
    operando = p[2]

    #Caso 1 es constante pero no numerica
    if operando['type'] != 'number':
        #si es id
        if operando['type'] == 'id':
            if tablasimbolo.lookup(operando['value']) == None or tablasimbolo.get_type(operando['value']) != 'number':
                errorMngers.add_error(f"Error semántico: Operando inválido o indefinido en ContinueUp: '{operando['value']}'.")
    
    #Caso 3 operacion no numerica
        elif operando['type'] != 'number' and operando['type'] != 'id':
            if operando['returnType'] != 'number':
                errorMngers.add_error(f"Error semántico: Operando inválido en ContinueUp: '{operando['type']}'.")

        

    #Caso 2 es variable pero no es numerica
    
    
    p[0] = {
        'type': 'Cup',
        'value': p[2]# n2 (segundo operando: número o variable)
    }
def p_cdown(p):
    '''cdown : CDOWN n2 SEMICOLON'''

    operando = p[2]

    if operando['type'] != 'number':
        #si es id
        if operando['type'] == 'id':
            if tablasimbolo.lookup(operando['value']) == None or tablasimbolo.get_type(operando['value']) != 'number':
                errorMngers.add_error(f"Error semántico: Operando inválido o indefinido en ContinueDown: '{operando['value']}'.")
    
    #Caso 3 operacion no numerica
        elif operando['type'] != 'number' and operando['type'] != 'id':
            if operando['returnType'] != 'number':
                errorMngers.add_error(f"Error semántico: Operando inválido en ContinueDown: '{operando['type']}'.")

    p[0] = {
        'type': 'Cdown',
        'value': p[2]# n2 (segundo operando: número o variable)
    }
def p_cright(p):
    '''cright : CRIGHT n2 SEMICOLON'''

    operando = p[2]

    if operando['type'] != 'number':
        #si es id
        if operando['type'] == 'id':
            if tablasimbolo.lookup(operando['value']) == None or tablasimbolo.get_type(operando['value']) != 'number':
                errorMngers.add_error(f"Error semántico: Operando inválido o indefinido en ContinueRight: '{operando['value']}'.")
    
    #Caso 3 operacion no numerica
        elif operando['type'] != 'number' and operando['type'] != 'id':
            if operando['returnType'] != 'number':
                errorMngers.add_error(f"Error semántico: Operando inválido en ContinueRight: '{operando['type']}'.")
    p[0] = {
        'type': 'Cright',
        'value': p[2]# n2 (segundo operando: número o variable)
    }
def p_cleft(p):
    '''cleft : CLEFT n2 SEMICOLON'''

    operando = p[2]

    if operando['type'] != 'number':
        #si es id
        if operando['type'] == 'id':
            if tablasimbolo.lookup(operando['value']) == None or tablasimbolo.get_type(operando['value']) != 'number':
                errorMngers.add_error(f"Error semántico: Operando inválido o indefinido en ContinueLeft: '{operando['value']}'.")
    
    #Caso 3 operacion no numerica
        elif operando['type'] != 'number' and operando['type'] != 'id':
            if operando['returnType'] != 'number':
                errorMngers.add_error(f"Error semántico: Operando inválido en ContinueLeft: '{operando['type']}'.")
    p[0] = {
        'type': 'Cleft',
        'value': p[2]# n2 (segundo operando: número o variable)
    }
#reglas para el pos:
def p_pos(p):
    '''pos : POS PAR_OPEN n2 COLON n2 PAR_CLOSE SEMICOLON'''
    operando1 = p[3]  # X
    operando2 = p[5]  # y


    
    #2: Si uno o los dos operandos ID, (tabla de símbolos) CHECK
    if operando1['type'] == 'id' and operando2['type'] == 'id':
        if tablasimbolo.get_type(operando1['value']) != 'number' or tablasimbolo.get_type(operando2['value']) != 'number':
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' o '{operando2['value']}' operandos no son números o no están definidos correctamente para la operacion Greater.")
    
    #3: uno es num y otro ID CHECK
    elif operando1['type'] == 'id' and operando2['type'] == 'number':
        if tablasimbolo.get_type(operando1['value']) != 'number':
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' no es un número.")
    
    # 4: otro operando es ID CHECK
    elif operando1['type'] == 'number' and operando2['type'] == 'id':
        if tablasimbolo.get_type(operando2['value']) != 'number':
            errorMngers.add_error(f"Error semántico: '{operando2['value']}' no es un número.")
    #si ambas son operaciones CHECK   
    elif (operando1['type'] != 'number' and operando1['type'] != 'id') and (operando2['type'] != 'number' and operando2['type'] != 'id'):
        if operando1['returnType'] != 'number' or operando2['returnType'] != 'number':
            errorMngers.add_error(f"Error semántico: '{operando2['type']}' o '{operando1['type']}' no son numeros validos en greater().")
    #si solo la derecha es operación CHECK
    elif operando1['type'] != 'number' and operando1['type'] != 'id':
        if operando1['returnType'] != 'number':
            errorMngers.add_error(f"Error semántico: '{operando1['type']}' no retorna numeros validos en greater().")
        #si operando 2 es una variable
        elif operando2['type'] == 'id' and tablasimbolo.get_type(operando2) !='number':
            errorMngers.add_error(f"Error semántico: '{operando2['value']}' no contiene un valor numerico o no esta definida.")
    #si solo la derecha es operación CHECK
    elif operando2['type'] != 'number' and operando2['type'] != 'id':
        if operando2['returnType'] != 'number':
            errorMngers.add_error(f"Error semántico: '{operando2['type']}' no retorna numeros validos en greater().")
        #si operando 2 es una variable
        elif operando1['type'] == 'id' and tablasimbolo.get_type(operando1) !='number':
            errorMngers.add_error(f"Error semántico: '{operando1['value']}' no contiene un valor numerico o no esta definida.") 
    else:
        errorMngers.add_error(f"Error semántico: '{operando1['value']}' y '{operando2['value']}' no son números.")

    # Estructura final
    p[0] = {
        'type': 'pos',
        'left': operando1,
        'right': operando2,
        'returnType': None  # No hay valor de retorno
    }
def p_posx(p):
    '''posx : POSX n2 SEMICOLON'''
    operando = p[2]  # Coordenada X (n)

    # numero 
    if operando['type'] == 'id':
        if tablasimbolo.get_type(operando['value']) != 'number':
            errorMngers.add_error(f"Error semántico: '{operando['value']}' no es un número o no está definido correctamente.")

    # operacion
    elif operando['type']  != 'id' and operando['type']  != 'number':
        if operando['returnType']  != 'number':
            errorMngers.add_error(f"Error semántico: Coordenada inválida en PosY: '{operando['type']}'.")
            

    # Estructura final
    p[0] = {
        'type': 'posx',
        'value': operando,
        'returnType': None  # No hay valor de retorno
    }



    
def p_posy(p):
    '''posy : POSY n2 SEMICOLON'''
    operando = p[2]  # Coordenada Y (n)

    # numero


    # ID
    if operando['type'] == 'id':
        if tablasimbolo.get_type(operando['value']) != 'number':
            errorMngers.add_error(f"Error semántico: '{operando['value']}' no es un número o no está definido correctamente.")

    # operacion
    elif operando['type']  != 'id' and operando['type']  != 'number':
        if operando['returnType']  != 'number':
            errorMngers.add_error(f"Error semántico: Coordenada inválida en PosY: '{operando['type']}'.")
            

    # Estructura final
    p[0] = {
        'type': 'posy',
        'value': operando,
        'returnType': None  # No hay valor de retorno
    }




#reglas extras
def p_color(p):
    '''color : COLOR n2 SEMICOLON'''
    
    valor_color = p[2]  # Valor asignado al color
    
    if valor_color['type'] == 'number':
        # numero entre los validos
        if valor_color['value'] not in [1, 2]:
            errorMngers.add_error(f"Error semántico: el valor '{valor_color['value']}' no es un compartimiento de color válido. Solo se permiten 1 (Negro) o 2 (Rojo).")
    elif valor_color['type'] == 'id':
        # si existe el id y si es num
        if tablasimbolo.get_type(valor_color['value']) != 'number':
            errorMngers.add_error(f"Error semántico: '{valor_color['value']}' no está definido como un número.")
        elif tablasimbolo.get_valueInt(valor_color['value']) not in [1, 2]:
            errorMngers.add_error(f"Error semántico: el valor de '{valor_color['value']}' no es un compartimiento de color válido. Solo se permiten 1 (Negro) o 2 (Rojo).")
    elif valor_color['type'] == 'operation':
        # si la operacion da un num 
        if valor_color['returnType'] != 'number' or valor_color['value'] not in [1, 2]:
            errorMngers.add_error("Error semántico: la operación no retorna un compartimiento de color válido (1 o 2).")
    else:
        # error 
        errorMngers.add_error("Error semántico: el valor especificado para UseColor no es válido.")
    p[0] = {
        'type': 'color',
        'value': valor_color,  
        'returnType': 'void'   
    }
     
    
#NO HACEN FALTA PORQUE NO LLEVAN PARAMETRO, NO SE PUEDE VALIDAR NADA
#--------------------------------------------------------------------------
def p_down(p):
    '''down : DOWN SEMICOLON'''
    p[0] = {
        'type': 'down',
        'value': p[2],
    }
def p_up(p):
    '''up : UP SEMICOLON'''
    p[0] = {
        'type': 'up',
        'value': p[2],
    }
def p_begining(p):
    '''begining : BEG SEMICOLON'''
    p[0] = {
        'type': 'begining',
        'value': p[2],
    }
#--------------------------------------------------------------------------

#regla sentence list, una o muchas sentencias-------------------

def p_sentencia_list(p):
    '''sentencia_list : sentencia
                      | sentencia_list sentencia'''
    if len(p) == 2:  # Caso: sentencia_list -> sentencia
        # Creamos un nodo con una única sentencia.
        p[0] = {
            'type': 'sentencia_list',
            'children': [p[1]]  # Creamos un nodo con un único hijo.
        }
    elif len(p) == 3:  # Caso: sentencia_list -> sentencia_list sentencia
        # Agregamos la nueva sentencia a la lista de hijos existentes.
        p[0] = {
            'type': 'sentencia_list',
            'children': p[1]['children'] + [p[2]]  # Concatenamos los hijos.
        }
#regla para el forlooop
def p_forloops(p):
    '''forloops : FOR ID PAR_OPEN NUMBER TO NUMBER PAR_CLOSE LOOP P_OPEN sentencia_list P_CLOSE END LOOP SEMICOLON'''
    identificador = p[2]  
    inicio = p[4]  #min
    fin = p[6]  # max
    cuerpo = p[10]  # inst dentro del for

    # el identificador no debe existir antes
    if tablasimbolo.lookup(identificador['value']) == None:
        errorMngers.add_error(f"Error semántico: El identificador '{identificador}' no está definido previamente")
    # rango valido max > min
    elif inicio >= fin:
        errorMngers.add_error(f"Error semántico: El rango del bucle FOR debe tener Max > Min. Se encontró Min={inicio} y Max={fin}.")
    

    p[0] = {
        'type': 'forloop',
        'id': identificador,  # Identificador de la variable de control
        'start': {'type': 'number', 'value': inicio},  # Inicio del rango
        'end': {'type': 'number', 'value': fin},  # Fin del rango
        'body': cuerpo,  # Lista de sentencias dentro del bucle
        'returnType': None  # FOR-LOOP no tiene valor de retorno
    }

        # quitar identrificador a tabla de simbolos

#regla para el whileloop:
def p_whiles(p):
    '''whiles : WHILE P_OPEN n2 P_CLOSE  P_OPEN sentencia_list P_CLOSE WHEND SEMICOLON'''
    condicion = p[3]  # Condición del bucle (n2)
    cuerpo = p[6]  # Lista de sentencias dentro del bucle

    # condicion booleana
    if condicion['type'] not in ['boolean', 'comparison', 'equal', 'not_equal', 'greater', 'less', 'greater_equal', 'less_equal']:

        errorMngers.add_error(f"Error semántico: La condición del bucle While debe ser de tipo booleano o una comparación válida.")

    # Estructura 
    p[0] = {
        'type': 'while',
        'condition': condicion,
        'body': cuerpo,
        'returnType': None
    }

    
#regla para el repeat:
def p_repeat(p):
    '''repeat : REPEAT P_OPEN sentencia_list P_CLOSE UNTIL P_OPEN n2 P_CLOSE SEMICOLON'''
    cuerpo = p[3]  # lista de inst
    condicion = p[7]  # Condicion

    # condicion+ booleano o comparacion
    if condicion['type'] not in ['boolean', 'comparison', 'equal', 'not_equal', 'greater', 'less', 'greater_equal', 'less_equal']:

        errorMngers.add_error(f"Error semántico: La condición del bucle Repeat debe ser de tipo booleano o una comparación válida.")

    # Estructura final
    p[0] = {
        'type': 'repeat',
        'condition': condicion,
        'body': cuerpo,
        'returnType': None
    }


    
#reglas para el case:
def p_caseaux(p):
    '''caseaux : WHEN n6 THEN P_OPEN sentencia_list P_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'caseaux',
        'condition': p[2],
        'body': p[4]  # Aquí se almacena la lista de sentencias (p[10] es sentencia_list)
    }
#regla para multiples caseaux:

def p_caseaux_list(p):
    '''caseaux_list : caseaux
                    | caseaux_list caseaux'''
    if len(p) == 2:  # Caso: caseaux_list -> caseaux
        # Creamos un nodo con un único caseaux.
        p[0] = {
            'type': 'caseaux_list',
            'children': [p[1]]  # Creamos un nodo con un único hijo.
        }
    elif len(p) == 3:  # Caso: caseaux_list -> caseaux_list caseaux
        # Agregamos el nuevo caseaux a la lista de hijos existentes.
        p[0] = {
            'type': 'caseaux_list',
            'children': p[1]['children'] + [p[2]]  # Concatenamos los hijos.
        }
#regla para el case:

def p_case(p):
    '''case : CASE ID caseaux_list END CASE SEMICOLON
            | CASE ID caseaux_list ELSE P_OPEN sentencia_list P_CLOSE END CASE SEMICOLON'''
    identificador = p[2]  # variable a evaluar
    cases = p[3]          # lista de  When
    else_body = None if len(p) == 7 else p[6]  # else (si existe)

    # que la variable exista y sea num o bool
    if tablasimbolo.lookup(identificador['value']) == None:
        errorMngers.add_error(f"Error semántico: La variable  no está definida. en el case")
    elif tablasimbolo.get_type(identificador['value']) not in ['number', 'boolean']:
        errorMngers.add_error(f"Error semántico: La variable '{identificador['value']}' debe ser de tipo numérico o booleano.")
    else:
        # Vvalidad los bloques de WHEN
        for case in cases['children']:
            condition = case['condition']
            variable_type = tablasimbolo.get_type(identificador)
            if condition['type'] not in ['number', 'boolean']:
                errorMngers.add_error(f"Error semántico: La condición '{condition}' en el bloque 'When' debe ser compatible con el tipo '{variable_type}'.")

        # salida
    p[0] = {
        'type': 'case',
        'identifier': identificador,
        'cases': cases,
        'else_body': else_body,
        'returnType': None
    }




#regla para parametros del procedure:

def p_paramet_list(p):
    '''paramet_list : n5
                    | paramet_list n5'''
    if len(p) == 2:  # Caso: paramet_list -> n5
        # Creamos un nodo con un único parámetro.
        p[0] = {
            'type': 'paramet_list',
            'children': [p[1]]  # Nodo con un único hijo.
        }
    elif len(p) == 3:  # Caso: paramet_list -> paramet_list n5
        # Agregamos el nuevo parámetro a la lista de hijos existentes.
        p[0] = {
            'type': 'paramet_list',
            'children': p[1]['children'] + [p[2]]  # Concatenamos los hijos.
        }
def p_llamada(p):
    '''llamada : CALL ID PAR_OPEN PAR_CLOSE SEMICOLON'''
    p[0] = {
            'type': 'proc_call',
            'proc_name': p[2]  # Concatenamos los hijos.
        }
def p_llamada_list(p):
    '''llamada_list : llamada
                   | llamada_list llamada'''
    if len(p) == 2:  # Caso: codigo_list -> codigo
        # Creamos un nodo con un único código.
        p[0] = {
            'type': 'llamada_list',
            'children': [p[1]]  # Nodo con un único hijo.
        }
    elif len(p) == 3:  # Caso: codigo_list -> codigo_list codigo
        # Agregamos el nuevo código a la lista de hijos existentes.
        p[0] = {
            'type': 'llamada_list',
            'children': p[1]['children'] + [p[2]] } # Concatenamos los hijos.




#regla para codigo:
def p_codigo(p):
    '''codigo : sentencia
                | case
                | repeat
                | whiles
                | forloops'''
    p[0] = p[1]  # Asumimos que cada operación retorna un nodo apropiado
#regla para multiples lineas de codigo


def p_codigo_list(p):
    '''codigo_list : codigo
                   | codigo_list codigo'''
    if len(p) == 2:  # Caso: codigo_list -> codigo
        # Creamos un nodo con un único código.
        p[0] = {
            'type': 'codigo_list',
            'children': [p[1]]  # Nodo con un único hijo.
        }
    elif len(p) == 3:  # Caso: codigo_list -> codigo_list codigo
        # Agregamos el nuevo código a la lista de hijos existentes.
        p[0] = {
            'type': 'codigo_list',
            'children': p[1]['children'] + [p[2]]  # Concatenamos los hijos.
        }
#regla para el main
'''
def p_main_list(p):
    main_list : CALL procedure PAR_OPEN PAR_CLOSE
                      | main_list CALL procedure PAR_OPEN PAR_CLOSE
    if len(p) == 2:  # Caso: sentencia_list -> sentencia
        # Creamos un nodo con una única sentencia.
        p[0] = ['main_list', p[1]]
    elif len(p) == 3:  # Caso: sentencia_list -> sentencia_list sentencia
        # Agregamos la nueva sentencia a la lista existente.
        p[0] = p[1] + [p[2]] '''    
def p_main_list(p):
    '''main_list : llamada
                   | main_list llamada'''
    if len(p) == 2:  # Caso: codigo_list -> codigo
        # Creamos un nodo con un único código.
        p[0] = {
            'type': 'main_list',
            'children': [p[1]]  # Nodo con un único hijo.
        }
    elif len(p) == 3:  # Caso: codigo_list -> codigo_list codigo
        # Agregamos el nuevo código a la lista de hijos existentes.
        p[0] = {
            'type': 'main_list',
            'children': p[1]['children'] + [p[2]]  # Concatenamos los hijos.
        }
def p_Main(p):
    '''Main : MAIN PAR_OPEN PAR_CLOSE P_OPEN main_list P_CLOSE SEMICOLON END ''' 
    p[0] = {
            'type': 'main',
            'body': p[5],  # Capturamos el ID.
        } 
#regla para un procedure list  



#regla para el error--------------------------

def p_error(p):
    if p:
        # Reportar el error en la línea donde ocurrió
        errorMngers.add_error( f"Error de sintaxis cerca de '{p.value}'.")
        # Recuperación: descartar el token erróneo y continuar
        yacc.errok()
    else:
        errorMngers.add_error( "Error de sintaxis al final del archivo.")
parser = yacc.yacc()