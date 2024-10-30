import ply.yacc as yacc
from lexer import tokens  # Asegúrate de que tus tokens están en lexer.py
# Definición de la gramática
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
            'value': p[1]  # Asignar el valor del identificador
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
#fin reglas basicas--------------------------
#reglas complejas--------------------------------
#definicion de la regla operacion
def p_operation(p):
    '''operation : add
                  '''
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
#regla para el error--------------------------
def p_error(p):
    print(f"Syntax error at '{p.value}'" if p else "Syntax error at EOF")
#regla para el error--------------------------
# Construir el parser
parser = yacc.yacc()