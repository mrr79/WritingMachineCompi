grammar Simple;

@parser::header {
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.milenguaje.simple.interprete2.ast.*;
}

@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
}
program: MAIN PAR_OPEN PAR_CLOSE BRACKET_OPEN
			{
				List<ASTNode> body = new ArrayList<ASTNode>();
			}
			(sentence {body.add($sentence.node);})*
			BRACKET_CLOSE
			{ 
				for(ASTNode n : body) {
					n.execute(symbolTable);
				}
			};

sentence returns [ASTNode node]: define {$node = $define.node;}
| put {$node = $put.node;}
| println {$node = $println.node;}
| add {$node = $add.node;}
| continueup {$node = $continueup.node;}
| continuedown {$node = $continuedown.node;}
| continueright {$node = $continueright.node;}
| continueleft {$node = $continueleft.node;}
| pos {$node = $pos.node;}
| posx {$node = $posx.node;}
| posy {$node = $posy.node;}
| color {$node = $color.node;}
| down {$node = $down.node;}
| up {$node = $up.node;}
| beggining {$node = $beggining.node;};

temporal: fory
| cases
| repeat
| whiles
;

operation returns [ASTNode node]:
	logical {$node = $logical.node;}
	| substr {$node = $substr.node;}
	| random {$node = $random.node;}
	| mult {$node = $mult.node;}
	| div {$node = $div.node;}
	| sum {$node = $sum.node;} 
	;

logical returns [ASTNode node]:
	equal {$node = $equal.node;}
	| and {$node = $and.node;}
	| or {$node = $or.node;}
	| greater {$node = $greater.node;}
	| smaller {$node = $smaller.node;}
;

println returns [ASTNode node]:
	PRINTLN expression SEMICOLON
	{$node = new Println($expression.node);}
	| PRINTLN and SEMICOLON
	{$node = new Println($and.node);};

define returns [ASTNode node]: 
	DEF PAR_OPEN ID COLON logic PAR_CLOSE SEMICOLON
	{$node = new VarAssign($ID.text, $logic.node);};

put returns [ASTNode node]:
	PUT PAR_OPEN ID COLON logic PAR_CLOSE SEMICOLON 
	{$node = new VarAssign($ID.text, $logic.node);}
	| PUT PAR_OPEN ID COLON operation PAR_CLOSE SEMICOLON
	{$node = new VarAssign($ID.text, $operation.node);}
	| PUT PAR_OPEN ID COLON expression PAR_CLOSE SEMICOLON
	{$node = new VarAssign($ID.text, $expression.node);};
	
add returns [ASTNode node]:
	ADDO PAR_OPEN ID PAR_CLOSE SEMICOLON
	{$node = new VarAssign($ID.text, new Addition(new VarRef($ID.text), new Constant(1)));}
	| ADDO PAR_OPEN ID COLON values PAR_CLOSE SEMICOLON
	{$node = new VarAssign($ID.text, new Addition(new VarRef($ID.text), $values.node));}; 
	
continueup returns [ASTNode node]:
	CUP values SEMICOLON
	{$node = new Continue($values.node, new Constant(1));};
	
continuedown returns [ASTNode node]:
	CDOWN values SEMICOLON
	{$node = new Continue($values.node, new Constant(2));};

continueright returns [ASTNode node]:
	CRIGHT values SEMICOLON
	{$node = new Continue($values.node, new Constant(3));};

continueleft returns [ASTNode node]:
	CLEFT values SEMICOLON
	{$node = new Continue($values.node, new Constant(4));};

pos returns [ASTNode node]:
	POS PAR_OPEN t1=expression COLON t2=expression PAR_CLOSE SEMICOLON
	{$node = new Pos($t1.node, $t2.node, new Constant(1));};

posx returns [ASTNode node]:
	POSX expression SEMICOLON
	{$node = new Pos($expression.node, new Constant(0), new Constant(2));};

posy returns [ASTNode node]:
	POSY expression SEMICOLON
	{$node = new Pos(new Constant(0), $expression.node, new Constant(3));};

color returns [ASTNode node]:
	COLOR NUMBER SEMICOLON
	{$node = new Color(new Constant(Integer.parseInt($NUMBER.text)));};

down returns [ASTNode node]:
	DOWN SEMICOLON
	{$node = new Move(new Constant(1));};
	
up returns [ASTNode node]:
	UP SEMICOLON
	{$node = new Move(new Constant(2));};

beggining returns [ASTNode node]: BEG SEMICOLON
	{$node = new Pos(new Constant(0), new Constant(0), new Constant(1));};

fory: FOR ID PAR_OPEN NUMBER TO NUMBER PAR_CLOSE LOOP P_OPEN sentence* P_CLOSE END LOOP SEMICOLON; 

cases: CASE ID when* elses* END CASE SEMICOLON; 

when: WHEN logic THEN P_OPEN sentence* P_CLOSE;

elses: ELSE P_OPEN sentence* P_CLOSE;

repeat: REPEAT P_OPEN sentence* P_CLOSE UNTIL P_OPEN cond P_CLOSE SEMICOLON;

whiles: WHILE P_OPEN cond P_CLOSE P_OPEN sentence* P_CLOSE WHEND SEMICOLON;
	
cond returns [ASTNode node]:
	| t1=num equations t2=num {$node = new Logical($t1.node, $t2.node, $equations.node);}
	| logical {$node = $logical.node;}
	| BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));}
	| ID {$node = new VarRef($ID.text);};

equations returns [ASTNode node]:
	GT {$node = new Constant(1);}
	| LT {$node = new Constant(2);}
	| GEQ {$node = new Constant(3);}
	| LEQ {$node = new Constant(4);}
	| EQ {$node = new Constant(5);}
	| NEQ {$node = new Constant(6);};


equal returns [ASTNode node]:
	EQUAL PAR_OPEN t1=values COLON t2=values PAR_CLOSE SEMICOLON*
	{$node = new Logical($t1.node, $t1.node, new Constant(5));};
	
and returns [ASTNode node]:
	AND PAR_OPEN t1=cond COLON t2=cond PAR_CLOSE SEMICOLON*
	{$node = new And($t1.node, $t2.node);};

or returns [ASTNode node]:
	OR PAR_OPEN t1=cond COLON t2=cond PAR_CLOSE SEMICOLON*
	{$node = new Or($t1.node, $t2.node);};

greater returns [ASTNode node]:
	GREATER PAR_OPEN t1=values COLON t2=values PAR_CLOSE SEMICOLON*
	{$node = new Logical($t1.node, $t1.node, new Constant(1));};

smaller returns [ASTNode node]:
	SMALLER PAR_OPEN t1=values COLON t2=values PAR_CLOSE SEMICOLON*
	{$node = new Logical($t1.node, $t1.node, new Constant(2));};

values returns [ASTNode node]:
	expression {$node = $expression.node;}
	| ID  {$node = new VarRef($ID.text);};

substr returns [ASTNode node]: 
	SUBSTR PAR_OPEN t1=values COLON t2=values PAR_CLOSE SEMICOLON*
	{$node = new Subtraction($t1.node,$t2.node);}; 

mult returns [ASTNode node]:
	MULTO PAR_OPEN t1=values COLON t2=values PAR_CLOSE SEMICOLON*
	{$node = new Multiplication($t1.node,$t2.node);}; 

div returns [ASTNode node]:
	DIVO PAR_OPEN t1=values COLON t2=values PAR_CLOSE SEMICOLON*
	{$node = new Division($t1.node,$t2.node);}; 

sum returns [ASTNode node]:
	SUMO PAR_OPEN t1=values COLON t2=values PAR_CLOSE SEMICOLON*
	{$node = new Division($t1.node,$t2.node);}; 

random returns [ASTNode node]:
	RANDOM PAR_OPEN expression PAR_CLOSE SEMICOLON*
	{$node = new Random($expression.node);}; 

expression returns [ASTNode node]:
	t1 = factor {$node = $t1.node;}
	(PLUS t2=factor {$node = new Addition($node, $t2.node);})*
	| 	t1 = factor {$node = $t1.node;}
	(MINUS t2=factor {$node = new Subtraction($node, $t2.node);})*
	;

factor returns [ASTNode node]:
	t1 = term {$node = $t1.node;}
	(MULT t2=term {$node = new Multiplication($node, $t2.node);})*
	| t1 = term {$node = $t1.node;}
	(DIV t2=term {$node = new Division($node, $t2.node);})*
	;

term returns [ASTNode node]: 
	NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));};
	
logic returns [ASTNode node]:
	NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));}
	| BOOLEAN  {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));};

num returns [ASTNode node]:
	NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));}
	| BOOLEAN  {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));}
	| ID {$node = new VarRef($ID.text);};

MAIN: 'main';
PRINTLN: 'println';

COM: '//';


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
ELSE: 'Else';

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

WS: [ \t\r\n]+ -> skip;