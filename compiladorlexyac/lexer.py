# lexer.py
import ply.lex as lex

# Definir los tokens
tokens = (
    'MAIN', 'PRINTLN', 'CALL', 'PROC', 'COM', 'RIGHT', 'LEFT', 'DEF', 'PUT', 
    'ADDO', 'MULTO', 'DIVO', 'SUMO', 'CUP', 'CDOWN', 'CRIGHT', 'CLEFT', 'POS', 
    'POSX', 'POSY', 'COLOR', 'DOWN', 'UP', 'BEG', 'FOR', 'LOOP', 'END', 'TO', 
    'CASE', 'WHEN', 'THEN', 'ELSE', 'REPEAT', 'UNTIL', 'WHILE', 'WHEND', 'EQUAL', 
    'AND', 'OR', 'GREATER', 'SMALLER', 'SUBSTR', 'RANDOM', 'PLUS', 'MINUS', 
    'MULT', 'DIV', 'GT', 'LT', 'GEQ', 'LEQ', 'EQ', 'NEQ', 'ASSIGN', 'BRACKET_OPEN', 
    'BRACKET_CLOSE', 'PAR_OPEN', 'PAR_CLOSE', 'P_OPEN', 'P_CLOSE', 'SEMICOLON', 
    'COLON', 'BOOLEAN', 'ID', 'NUMBER'
)

# Expresiones regulares simples para tokens literales
t_MAIN = r'main'
t_PRINTLN = r'println'
t_CALL = r'call'
t_PROC = r'Proc'
t_COM = r'//[^\r\n]*'
t_RIGHT = r'TurnRight'
t_LEFT = r'TurnLeft'
t_DEF = r'Def'
t_PUT = r'Put'
t_ADDO = r'ADD|Add'
t_MULTO = r'Mult'
t_DIVO = r'Div'
t_SUMO = r'Sum'
t_CUP = r'ContinueUp'
t_CDOWN = r'ContinueDown'
t_CRIGHT = r'ContinueRight'
t_CLEFT = r'ContinueLeft'
t_POS = r'Pos'
t_POSX = r'PosX'
t_POSY = r'PosY'
t_COLOR = r'UseColor'
t_DOWN = r'Down'
t_UP = r'Up'
t_BEG = r'Beginning'
t_FOR = r'For'
t_LOOP = r'Loop'
t_END = r'End'
t_TO = r'to'
t_CASE = r'Case|case'
t_WHEN = r'When'
t_THEN = r'Then'
t_ELSE = r'Else'
t_REPEAT = r'Repeat'
t_UNTIL = r'Until'
t_WHILE = r'While'
t_WHEND = r'Whend'
t_EQUAL = r'Equal|equal'
t_AND = r'And'
t_OR = r'Or|or'
t_GREATER = r'Greater'
t_SMALLER = r'Smaller'
t_SUBSTR = r'SUBSTR|Substr'
t_RANDOM = r'Random'
t_PLUS = r'\+'
t_MINUS = r'-'
t_MULT = r'\*'
t_DIV = r'/'
t_GT = r'>'
t_LT = r'<'
t_GEQ = r'>='
t_LEQ = r'<='
t_EQ = r'=='
t_NEQ = r'!='
t_ASSIGN = r'='
t_BRACKET_OPEN = r'\{'
t_BRACKET_CLOSE = r'\}'
t_PAR_OPEN = r'\('
t_PAR_CLOSE = r'\)'
t_P_OPEN = r'\['
t_P_CLOSE = r'\]'
t_SEMICOLON = r';'
t_COLON = r','
t_BOOLEAN = r'TRUE|FALSE'

# Expresión regular para identificadores (ID)
t_ID = r'[a-z][a-zA-Z0-9_@]*'

# Expresión regular para números (NUMBER)
def t_NUMBER(t):
    r'\d+'
    t.value = int(t.value)  # Convertir el valor a entero
    return t

# Ignorar espacios en blanco y tabulaciones
t_ignore = ' \t\r\n'

# Manejar errores léxicos
def t_error(t):
    print(f"Illegal character '{t.value[0]}'")
    t.lexer.skip(1)

# Construir el lexer
lexer = lex.lex()