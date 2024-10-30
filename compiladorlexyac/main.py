import ply.yacc as yacc
from lexer import lexer, tokens  # Importa el lexer y los tokens
from parser import parser  # Importa el parser

# Define tu input de prueba
test_input = """
Add (colu2,10);
"""

def main():
    # Parsear el input usando el lexer de lexer.py
    result = parser.parse(test_input, lexer=lexer)
    
    # Mostrar el resultado del análisis sintáctico
    print(result)

if __name__ == '__main__':
    main()

