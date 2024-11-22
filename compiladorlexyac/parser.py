import ply.yacc as yacc
from lexer import tokens  # Asegúrate de que tus tokens están en lexer.py
# Definición de la gramática
#regla inicial va de primero(la regla 
# de entrada), alternativa parser = yacc.yacc(start='start'), start
#es la regla inicial
#definicion de la regla sentencia
#regla para todo, regla principal :
def p_program(p):
    '''program : procedure_list main '''
    p[0] = {
            'type': 'program',
            'procedures': p[1],  # Capturamos el ID.
            'main': p[2],       # La lista de caseaux.    # No hay bloque ELSE.
        }
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
        p[0] = p[1]  # Asignar directamente el valor del identificador
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
    
    if len(p) == 6:  # ADDO PAR_OPEN ID PAR_CLOSE SEMICOLON
        p[0] = {
            'type': 'add',
            'id': p[3],  # ID del parámetro
            'value': None  # No hay valor asociado en este caso
        }
    elif len(p) == 8:  # ADDO PAR_OPEN ID COLON n2 PAR_CLOSE SEMICOLON
        p[0] = {
            'type': 'add',
            'id': p[3],  # ID del parámetro
            'value': p[5]  # El valor n2 asociado, que ya tiene su propia estructura
        }
#regla para el equals:
def p_equal(p):
    '''equal : EQUAL PAR_OPEN n2 COLON n2 PAR_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'equal',
        'left': p[3],   # Primer operando (n2)
        'right': p[5]   # Segundo operando (n2)
    }
#regla para el sub:
def p_sub(p):
    '''sub : SUBSTR PAR_OPEN n3 COLON n2 PAR_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'sub',
        'id': p[3],    # n3 (primer operando: número o variable)
        'value': p[5]  # n2 (segundo operando: número o variable)
    }
#regla para el and : 
def p_and(p):
    '''and : AND PAR_OPEN n4 COLON n4 PAR_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'and',
        'left': p[3],   # Primer operando (n2)
        'right': p[5]   # Segundo operando (n2)
    }
    #regla para el or
def p_or(p):
    '''or : OR PAR_OPEN n4 COLON n4 PAR_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'or',
        'left': p[3],   # Primer operando (n2)
        'right': p[5]   # Segundo operando (n2)
    }
#regla para el greater:
def p_greater(p):
    '''greater : GREATER PAR_OPEN n2 COLON n2 PAR_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'greater',
        'left': p[3],   # Primer operando (n2)
        'right': p[5]   # Segundo operando (n2)
    }
    #regla para el smaller:
def p_smaller(p):
    '''smaller : SMALLER PAR_OPEN n2 COLON n2 PAR_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'smaller',
        'left': p[3],   # Primer operando (n2)
        'right': p[5]   # Segundo operando (n2)
    }
#regla para el random
def p_random(p):
    '''random : RANDOM PAR_OPEN n3 PAR_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'random',
        'value': p[3],   # Primer operando (n2)
    }     
#regla para la multiplicacion 
def p_mult(p):
    '''mult : MULTO PAR_OPEN n3 COLON n2 PAR_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'mult',
        'left': p[3],    # n3 (primer operando: número o variable)
        'right': p[5]  # n2 (segundo operando: número o variable)
    }
def p_div(p):
    '''div : DIVO PAR_OPEN n3 COLON n2 PAR_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'div',
        'left': p[3],    # n3 (primer operando: número o variable)
        'right': p[5]  # n2 (segundo operando: número o variable)
    }
def p_sum(p):
    '''sum : SUMO PAR_OPEN n3 COLON n2 PAR_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'sum',
        'left': p[3],    # n3 (primer operando: número o variable)
        'right': p[5]  # n2 (segundo operando: número o variable)
    }
#reglas put:
def p_put(p):
    '''put : PUT PAR_OPEN ID COLON n1 PAR_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'put',
        'id': p[3],    # n3 (primer operando: número o variable)
        'value': p[5]  # n2 (segundo operando: número o variable)
    }
#reglascontinue
#reglas def:
def p_cup(p):
    '''cup : CUP n2 SEMICOLON'''
    p[0] = {
        'type': 'Cup',
        'value': p[2]# n2 (segundo operando: número o variable)
    }
def p_cdown(p):
    '''cdown : CDOWN n2 SEMICOLON'''
    p[0] = {
        'type': 'Cdown',
        'value': p[2]# n2 (segundo operando: número o variable)
    }
def p_cright(p):
    '''cright : CRIGHT n2 SEMICOLON'''
    p[0] = {
        'type': 'Cright',
        'value': p[2]# n2 (segundo operando: número o variable)
    }
def p_cleft(p):
    '''cleft : CLEFT n2 SEMICOLON'''
    p[0] = {
        'type': 'Cleft',
        'value': p[2]# n2 (segundo operando: número o variable)
    }
#reglas para el pos:
def p_pos(p):
    '''pos : POS PAR_OPEN n2 COLON n2 PAR_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'pos',
        'left': p[3],
        'right': p[5]# n2 (segundo operando: número o variable)
    }
def p_posx(p):
    '''posx : POSX n2 SEMICOLON'''
    p[0] = {
        'type': 'posx',
        'value': p[2],
    }
def p_posy(p):
    '''posy : POSY n2 SEMICOLON'''
    p[0] = {
        'type': 'posy',
        'value': p[2],
    }
#reglas extras
def p_color(p):
    '''color : COLOR n2 SEMICOLON'''
    p[0] = {
        'type': 'color',
        'value': p[2],
    }
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
#regla sentence list, una o muchas sentencias-------------------
def p_sentencia_list(p):
    '''sentencia_list : sentencia
                      | sentencia_list sentencia'''
    if len(p) == 2:  # Caso: sentencia_list -> sentencia
        # Creamos un nodo con una única sentencia.
        p[0] = ['sentencia_list', p[1]]
    elif len(p) == 3:  # Caso: sentencia_list -> sentencia_list sentencia
        # Agregamos la nueva sentencia a la lista existente.
        p[0] = p[1] + [p[2]]
#regla para el forlooop
def p_forloops(p):
    '''forloops : FOR ID PAR_OPEN NUMBER TO NUMBER PAR_CLOSE LOOP P_OPEN sentencia_list P_CLOSE END LOOP SEMICOLON'''
    p[0] = {
        'type': 'forloop',
        'id': p[2],
        'start': p[4],
        'end': p[6],
        'body': p[10]  # Aquí se almacena la lista de sentencias (p[10] es sentencia_list)
    }
#regla para el whileloop:
def p_whiles(p):
    '''whiles : WHILE P_OPEN n2 P_CLOSE  P_OPEN sentencia_list P_CLOSE WHEND SEMICOLON'''
    p[0] = {
        'type': 'while',
        'condition': p[3],
        'body': p[6]  # Aquí se almacena la lista de sentencias (p[10] es sentencia_list)
    }
#regla para el repeat:
def p_repeat(p):
    '''repeat : REPEAT P_OPEN sentencia_list P_CLOSE UNTIL P_OPEN n2 P_CLOSE SEMICOLON'''
    p[0] = {
        'type': 'repeat',
        'condition': p[7],
        'body': p[3]  # Aquí se almacena la lista de sentencias (p[10] es sentencia_list)
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
    if len(p) == 2:  # Caso: sentencia_list -> sentencia
        # Creamos un nodo con una única sentencia.
        p[0] = ['caseaux_list', p[1]]
    elif len(p) == 3:  # Caso: sentencia_list -> sentencia_list sentencia
        # Agregamos la nueva sentencia a la lista existente.
        p[0] = p[1] + [p[2]]
#regla para el case:
def p_case(p):
    '''case : CASE ID caseaux_list END CASE SEMICOLON
            | CASE ID caseaux_list ELSE P_OPEN sentencia_list P_CLOSE END CASE SEMICOLON'''
    if len(p) == 7:  # Caso: CASE ID caseaux_list END CASE SEMICOLON
        p[0] = {
            'type': 'case',
            'identifier': p[2],  # Capturamos el ID.
            'cases': p[3],       # La lista de caseaux.
            'else_body': None    # No hay bloque ELSE.
        }
    elif len(p) == 10:  # Caso: CASE ID caseaux_list ELSE P_OPEN sentencia_list P_CLOSE END CASE SEMICOLON
        p[0] = {
            'type': 'case',
            'identifier': p[2],  # Capturamos el ID.
            'cases': p[3],       # La lista de caseaux.
            'else_body': p[6]    # Capturamos el bloque ELSE.
        }
#regla para parametros del procedure:
def p_paramet_list(p):
    '''paramet_list : n5
                      | paramet_list n5'''
    if len(p) == 2:  # Caso: sentencia_list -> sentencia
        # Creamos un nodo con una única sentencia.
        p[0] = ['paramet_list', p[1]]
    elif len(p) == 3:  # Caso: sentencia_list -> sentencia_list sentencia
        # Agregamos la nueva sentencia a la lista existente.
        p[0] = p[1] + [p[2]]
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
    if len(p) == 2:  # Caso: sentencia_list -> sentencia
        # Creamos un nodo con una única sentencia.
        p[0] = ['codigo_list', p[1]]
    elif len(p) == 3:  # Caso: sentencia_list -> sentencia_list sentencia
        # Agregamos la nueva sentencia a la lista existente.
        p[0] = p[1] + [p[2]]
#regla para el procedure:
def p_procedure(p):
    '''procedure : PROC ID PAR_OPEN paramet_list PAR_CLOSE P_OPEN codigo_list P_CLOSE SEMICOLON END SEMICOLON
                | PROC ID PAR_OPEN PAR_CLOSE P_OPEN codigo_list P_CLOSE SEMICOLON END SEMICOLON '''
    if len(p) == 12:  # Caso: CASE ID caseaux_list END CASE SEMICOLON
        p[0] = {
            'type': 'procedure',
            'identifier': p[2],  # Capturamos el ID.
            'parameters': p[4],       # La lista de caseaux.
            'body': p[7]    # No hay bloque ELSE.
        }
    elif len(p) == 11:  # Caso: CASE ID caseaux_list ELSE P_OPEN sentencia_list P_CLOSE END CASE SEMICOLON
        p[0] = {
            'type': 'case',
            'identifier': p[2],  # Capturamos el ID.
            'parameters': None,       # La lista de caseaux.
            'body': p[6]    # Capturamos el bloque ELSE.
        }
#regla para el main
def p_main_list(p):
    '''main_list : CALL procedure PAR_OPEN PAR_CLOSE
                      | main_list CALL procedure PAR_OPEN PAR_CLOSE'''
    if len(p) == 2:  # Caso: sentencia_list -> sentencia
        # Creamos un nodo con una única sentencia.
        p[0] = ['main_list', p[1]]
    elif len(p) == 3:  # Caso: sentencia_list -> sentencia_list sentencia
        # Agregamos la nueva sentencia a la lista existente.
        p[0] = p[1] + [p[2]]     
def p_main(p):
    '''main : MAIN PAR_OPEN PAR_CLOSE P_OPEN main_list P_CLOSE  SEMICOLON END '''  
#regla para un procedure list  
def p_procedure_list(p):
    '''procedure_list : procedure
                      | procedure_list procedure'''
    if len(p) == 2:  # Caso: sentencia_list -> sentencia
        # Creamos un nodo con una única sentencia.
        p[0] = ['procedure_list', p[1]]
    elif len(p) == 3:  # Caso: sentencia_list -> sentencia_list sentencia
        # Agregamos la nueva sentencia a la lista existente.
        p[0] = p[1] + [p[2]]
#regla para todo, regla principal :
def p_program(p):
    '''program : procedure_list main '''
#regla para el error--------------------------

def p_error(p):
    print(f"Syntax error at '{p.value}'" if p else "Syntax error at EOF")
#regla para el error--------------------------
# Construir el parser
parser = yacc.yacc()