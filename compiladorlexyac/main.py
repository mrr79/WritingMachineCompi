import ply.yacc as yacc
from lexer import lexer, tokens  # Importa el lexer y los tokens
from parser import parser  # Importa el parser

# Define tu input de prueba
#Add (colu2,var1); check
#SUBSTR o Substr (4,var1); check
#Equal , no se puede el equal pequeño , check
#true y false son en mayusculas
#And (var1,4); check
#Or (var1,4); check
#Greater (var1,4) check
#Smaller (var1,4) check
#Random (var1); check
#Mult (var1,4); check
#Div (var1,4); check
#Sum (var1,4); check
test_input = """
Def (var3_2,9);
"""

def main():
    # Parsear el input usando el lexer de lexer.py
    result = parser.parse(test_input, lexer=lexer)
    
    # Mostrar el resultado del análisis sintáctico
    print(result)

if __name__ == '__main__':
    main()

