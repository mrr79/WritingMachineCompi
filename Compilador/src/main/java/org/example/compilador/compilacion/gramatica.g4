grammar gramatica;
@parser::header {
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;

}

@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
}
//a continuación se detalla las reglas generadas por LUIS, buscando arreglar la sintaxis:
//definicion de las reglas para el metodo def:
define:
	DEF PAR_OPEN ID COLON logic PAR_CLOSE SEMICOLON;
//regla logic, detalla ya sea un numero o un bolean
logic:
	NUMBER
	| BOOLEAN;
//regla del N1: N1 son valores numericos u operaciones
//considere las operaciones como add, substr,equal,and,or,greater,smaller,random,mult,div
n1:
    NUMBER
    | operacion
    | BOOLEAN;
//ES LO MISMO QUE N1, SOLO POR COMO ESTA REDACTADO LA ESPECIFIC, N2 CONSIDERA ADEMAS LAS VARIABLES
n2: //numeros variables u operaciones
    NUMBER
    | operacion
    | ID;
//n3 son valores numericos o variables
n3:
    NUMBER
    | ID;
n4: //para los operadores logicos, QUEDA PENDIENTE ARREGLAR SI SOLO USAR N2 O SI USAR N4 EN LOS OP LOGICOS
   //utilzia numeros operaciones variables o boolean
    NUMBER
    | operacion
    | ID
    | BOOLEAN;
n5:
    NUMBER
    | ID
    | BOOLEAN;
n6:
    NUMBER
    | BOOLEAN;

//considere las operaciones como add, substr,equal,and,or,greater,smaller,random,mult,div
operacion:
    add
    | sub
    | equal
    | and
    | or
    | greater
    | smaller
    | random
    | mult
    | div
    | sum;
//definicion de operaciones basicas:
//PREGUNTA DE CONSULTA, ADD PARA MI ES SOLO UN VALOR O VARIABLE, PERO MENCIONA QUE
//TAMBIEN OTRAS OPERACIONES
add:
	ADDO PAR_OPEN ID PAR_CLOSE SEMICOLON
	| ADDO PAR_OPEN ID COLON n2 PAR_CLOSE SEMICOLON;
//añadido de la regla del substr
sub: //el orden es sub ( n3 (que es numero o variable) , n2 ) ;
	SUBSTR PAR_OPEN n3 COLON n2 PAR_CLOSE SEMICOLON;
//regla de la suma, similar a la resta
sum:
	SUMO PAR_OPEN n3 COLON n2 PAR_CLOSE SEMICOLON;
//regla del equal
equal: //debe poder comparar variables, numeros u operaciones
	EQUAL PAR_OPEN n2 COLON n2 PAR_CLOSE SEMICOLON;
//regla del greater:
greater: //greater no utiliza boleans, dado que compara si es mayor o no
	GREATER PAR_OPEN n2 COLON n2 PAR_CLOSE SEMICOLON;
smaller://regla del smaller
	SMALLER PAR_OPEN n2 COLON n2 PAR_CLOSE SEMICOLON;
//regla del random, genera un numero randon entre los valores 0 y variable.
random://random usa un numero o una variable
	RANDOM PAR_OPEN n3 PAR_CLOSE SEMICOLON;
//regla de la multiplicacion , operando 1 es variable o valor int, operando 2 es variable, int, operaicon
mult:
	MULTO PAR_OPEN n3 COLON n2 PAR_CLOSE SEMICOLON;
//regla de la division , similar a la multiplicacion
div: //n3 son numeros o variables, n2 numeros variables u operaciones
	DIVO PAR_OPEN n3 COLON n2 PAR_CLOSE SEMICOLON;
//REGLAS LOGICAS(usan n4)******************************************************************************
//regla del and: NO RECONOCE AND(TRUE,TRUE) AND(TRUE,FALSE)
and: //considerando que and compara variables, operaciones o numeros
	AND PAR_OPEN n4 COLON n4 PAR_CLOSE SEMICOLON;
or:
	OR PAR_OPEN n4 COLON n4 PAR_CLOSE SEMICOLON;
//FIN REGLAS LOGICAS******************************************************************************
//regla del put
put://el put utiliza el put , parentesis , N1 ,parentesis y ;, CONSIDERE EL N1 COMO UN NUMERO,bool U OPERACION
	PUT PAR_OPEN ID COLON n1 PAR_CLOSE SEMICOLON;
//REGLAS DE MOVIMIENTO********************************************************************
continueup: //mueve un numero, variable u operacion
	CUP n2 SEMICOLON;
continuedown:
	CDOWN n2 SEMICOLON;

continueright:
	CRIGHT n2 SEMICOLON;

continueleft:
	CLEFT n2 SEMICOLON;

pos://mueve el puntero a una posicion x,y
	POS PAR_OPEN n2 COLON n2 PAR_CLOSE SEMICOLON;

posx:
	POSX n2 SEMICOLON;

posy:
	POSY n2 SEMICOLON;
color:
	COLOR NUMBER SEMICOLON;

down:
	DOWN SEMICOLON;

up:
	UP SEMICOLON;
beggining: BEG SEMICOLON;
//DEFINICION DE UNA REGLA QUE CONTEMPLA TODOOO
sentencia:
    operacion
    | put
    | continueup
    | continuedown
    | continueleft
    | continueright
    | pos
    | posx
    | posy
    | color
    | down
    | up
    | beggining;

//para los ciclos: NO SE SI UTILIZA SOLO OPERACIONES O TAMBIEN PUEDE LLAMAR PROCEDIMIENTOS
forloop:
    FOR ID PAR_OPEN NUMBER TO NUMBER PAR_CLOSE LOOP P_OPEN sentencia+ P_CLOSE END LOOP SEMICOLON;
//para los whiles
whiles: //no utiliza boleanos para no aceptar ciclos infinitos.
    WHILE P_OPEN n2 P_CLOSE P_OPEN sentencia+ P_CLOSE WHEND SEMICOLON;
repeat:
    REPEAT P_OPEN sentencia+ P_CLOSE UNTIL P_CLOSE n2 P_CLOSE SEMICOLON;

//
cicase://ciclos del case 2 Then [ Add(var2, 1) ]
   WHEN n6 THEN P_OPEN  sentencia P_CLOSE  ;
case:
    CASE ID  cicase+ END CASE SEMICOLON
    |CASE ID cicase+ ELSE P_OPEN  sentencia+ P_CLOSE  END CASE SEMICOLON;
//******************************************************************************
//DEFINICIONES DE REGLAS  NECESARIAS PARA LA ESTRUCTURA GENERAL DEL CODIGO***
listpar://lista de parametros
    n5 (COLON n5)*;  // Lista de n5 separados por comas, siempre tiene un n5 y puede venir 0 o muchos coma n5
listinst://lista de instrucciones:
    define
    | operacion
    | sentencia
    |forloop
    |whiles
    |case
    |repeat
    |procedure;

//DEFINICION DE PROCEDIMIENTOS
procedure:
    PROC ID PAR_OPEN  listpar? PAR_CLOSE P_OPEN listinst+ P_CLOSE SEMICOLON END SEMICOLON ;


main: MAIN PAR_OPEN P_OPEN procedure+ P_CLOSE PAR_CLOSE SEMICOLON END;
comments: COM ;

































MAIN: 'main';
PRINTLN: 'println';
CALL: 'call';
PROC: 'Proc';
//definicion de los skip
COM: '//' ~[\r\n]* -> skip;
RIGHT: 'TurnRight';
LEFT: 'TurnLeft';

DEF: 'DEF' | 'Def';
PUT: 'PUT' |'Put';
ADDO: 'ADD' |'Add';
MULTO: 'Mult';
DIVO: 'Div';
SUMO: 'Sum';


CUP: 'ContinueUp';
CDOWN: 'ContinueDown';
CRIGHT: 'ContinueRight';
CLEFT: 'ContinueLeft';

POS: 'Pos';
POSX: 'PosX';
POSY: 'PosY';

COLOR: 'UseColor';

DOWN: 'Down';
UP: 'Up';
BEG: 'Beginning';

FOR: 'For';
LOOP: 'Loop';
END: 'End';
TO: 'to';

CASE: 'Case'| 'case';
WHEN: 'When';
THEN: 'Then';
ELSE: 'Else';

REPEAT:'Repeat';
UNTIL: 'Until';

WHILE:'While';
WHEND: 'Whend';

EQUAL: 'Equal' ;
AND: 'And' ;
OR: 'Or' | 'or' ;
GREATER: 'Greater' ;
SMALLER: 'Smaller' ;
SUBSTR: 'Substr';
RANDOM: 'Random';


PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';


GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

ASSIGN: '=';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

P_OPEN:'[';
P_CLOSE:']';

SEMICOLON: ';';
COLON: ',';

BOOLEAN: 'TRUE' | 'FALSE' ;
//este ID es el id para los nombres de variables, debe reconocer lo solicitado
//por las restricciones , inicia con letra minuscula, puede contener minusculas, mayusculas
//numeros, barrabaja y el arroba
ID: [a-z][a-zA-Z0-9_@]{2,9};
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;