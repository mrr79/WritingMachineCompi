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
program: PROGRAM ID BRACKET_OPEN
			sentence*
			BRACKET_CLOSE;

sentence: define
| put
| add
| continueup
| continuedown
| continueright
| continueleft
| pos
| posx
| posy
| color
| down
| up
| beggining
| fory
| cases
| repeat
| whiles
| operation
;

operation:
	add
	| equal
	| and
	| or
	| greater
	| smaller
	| substr
	| random
	| mult
	| div
	| sum
	;

logical:
	equal
	| and
	| or
	| greater
	| smaller
;
define: DEF PAR_OPEN ID COLON logic PAR_CLOSE SEMICOLON;

put: PUT PAR_OPEN ID COLON expression PAR_CLOSE SEMICOLON
	|PUT PAR_OPEN ID COLON operation PAR_CLOSE SEMICOLON;

add: ADDO PAR_OPEN ID PAR_CLOSE SEMICOLON
	| ADDO PAR_OPEN ID COLON num PAR_CLOSE SEMICOLON;

continueup: CUP expression SEMICOLON;

continuedown: CDOWN expression SEMICOLON;

continueright: CRIGHT expression SEMICOLON;

continueleft: CLEFT expression SEMICOLON;

pos: POS PAR_OPEN expression COLON expression PAR_CLOSE SEMICOLON;
posx: POSX expression SEMICOLON;
posy: POSY expression SEMICOLON;

color: COLOR NUMBER SEMICOLON;

down: DOWN SEMICOLON;
up: UP SEMICOLON;

beggining: BEG SEMICOLON;

fory: FOR ID PAR_OPEN NUMBER TO NUMBER PAR_CLOSE LOOP P_OPEN sentence* P_CLOSE END LOOP SEMICOLON;

cases: CASE ID when* elses* END CASE SEMICOLON;

when: WHEN logic THEN P_OPEN sentence* P_CLOSE;

elses: ELSE P_OPEN sentence* P_CLOSE;

repeat: REPEAT P_OPEN sentence* P_CLOSE UNTIL P_OPEN cont P_CLOSE SEMICOLON;

whiles: WHILE P_OPEN cont P_CLOSE P_OPEN sentence* P_CLOSE WHEND SEMICOLON;

cont: ID equations NUMBER
	| NUMBER equations ID
	| logical;

equations:
	GT
	| LT
	| GEQ
	| LEQ
	| EQ
	| NEQ;

equal: EQUAL PAR_OPEN expression COLON expression PAR_CLOSE SEMICOLON*;

newcont: BOOLEAN
	| ID
	| cont;

and: AND PAR_OPEN newcont COLON newcont PAR_CLOSE SEMICOLON*;

or: OR PAR_OPEN newcont COLON newcont PAR_CLOSE SEMICOLON*;

greater: GREATER PAR_OPEN expression COLON expression PAR_CLOSE SEMICOLON*;

smaller: SMALLER PAR_OPEN expression COLON expression PAR_CLOSE* SEMICOLON*;

substr: SUBSTR PAR_OPEN expression COLON expression PAR_CLOSE SEMICOLON*;

random: RANDOM PAR_OPEN expression PAR_CLOSE SEMICOLON*;

mult: MULTO PAR_OPEN expression COLON expression PAR_CLOSE SEMICOLON*;

div: DIVO PAR_OPEN expression COLON expression PAR_CLOSE SEMICOLON*;

sum: SUMO PAR_OPEN expression COLON expression PAR_CLOSE SEMICOLON*;

expression: term (PLUS term)*
	| term (MINUS term)*
	| term (MULT term)*
	| term (DIV term)* ;

term:
	NUMBER
	| ID;

logic:
	NUMBER
	| BOOLEAN;

num:
	NUMBER
	| BOOLEAN
	| ID;

PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';
ELSE: 'Else';


DEF: 'Def';
PUT: 'Put';
ADDO: 'Add';
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

CASE: 'Case';
WHEN: 'When';
THEN: 'Then';

REPEAT:'Repeat';
UNTIL: 'Until';

WHILE:'While';
WHEND: 'Whend';

EQUAL: 'Equal' ;
AND: 'And' ;
OR: 'Or' ;
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

BOOLEAN: 'true' | 'false';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

NUMBER: [0-9]+;

VALID: [0-2]+;

WS: [ \t\r\n]+ -> skip;