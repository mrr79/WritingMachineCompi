// Generated from /home/huevitoentorta/Documents/ProyectoCompi/Compilador/src/main/java/org/example/compilador/compilacion/gramatica.g4 by ANTLR 4.13.1
package org.example.compilador.compilacion;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;


    import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
    import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, ELSE=4, DEF=5, PUT=6, ADDO=7, MULTO=8, DIVO=9, 
		SUMO=10, CUP=11, CDOWN=12, CRIGHT=13, CLEFT=14, POS=15, POSX=16, POSY=17, 
		COLOR=18, DOWN=19, UP=20, BEG=21, FOR=22, LOOP=23, END=24, TO=25, CASE=26, 
		WHEN=27, THEN=28, REPEAT=29, UNTIL=30, WHILE=31, WHEND=32, EQUAL=33, AND=34, 
		OR=35, GREATER=36, SMALLER=37, SUBSTR=38, RANDOM=39, PLUS=40, MINUS=41, 
		MULT=42, DIV=43, GT=44, LT=45, GEQ=46, LEQ=47, EQ=48, NEQ=49, ASSIGN=50, 
		BRACKET_OPEN=51, BRACKET_CLOSE=52, PAR_OPEN=53, PAR_CLOSE=54, P_OPEN=55, 
		P_CLOSE=56, SEMICOLON=57, COLON=58, BOOLEAN=59, ID=60, NUMBER=61, VALID=62, 
		WS=63;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_operation = 2, RULE_logical = 3, 
		RULE_define = 4, RULE_put = 5, RULE_add = 6, RULE_continueup = 7, RULE_continuedown = 8, 
		RULE_continueright = 9, RULE_continueleft = 10, RULE_pos = 11, RULE_posx = 12, 
		RULE_posy = 13, RULE_color = 14, RULE_down = 15, RULE_up = 16, RULE_beggining = 17, 
		RULE_fory = 18, RULE_cases = 19, RULE_when = 20, RULE_elses = 21, RULE_repeat = 22, 
		RULE_whiles = 23, RULE_cont = 24, RULE_equations = 25, RULE_equal = 26, 
		RULE_newcont = 27, RULE_and = 28, RULE_or = 29, RULE_greater = 30, RULE_smaller = 31, 
		RULE_substr = 32, RULE_random = 33, RULE_mult = 34, RULE_div = 35, RULE_sum = 36, 
		RULE_expression = 37, RULE_term = 38, RULE_logic = 39, RULE_num = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentence", "operation", "logical", "define", "put", "add", 
			"continueup", "continuedown", "continueright", "continueleft", "pos", 
			"posx", "posy", "color", "down", "up", "beggining", "fory", "cases", 
			"when", "elses", "repeat", "whiles", "cont", "equations", "equal", "newcont", 
			"and", "or", "greater", "smaller", "substr", "random", "mult", "div", 
			"sum", "expression", "term", "logic", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'println'", "'Else'", "'Def'", "'Put'", 
			"'Add'", "'Mult'", "'Div'", "'Sum'", "'ContinueUp'", "'ContinueDown'", 
			"'ContinueRight'", "'ContinueLeft'", "'Pos'", "'PosX'", "'PosY'", "'UseColor'", 
			"'Down'", "'Up'", "'Beginning'", "'For'", "'Loop'", "'End'", "'to'", 
			"'Case'", "'When'", "'Then'", "'Repeat'", "'Until'", "'While'", "'Whend'", 
			"'Equal'", "'And'", "'Or'", "'Greater'", "'Smaller'", "'Substr'", "'Random'", 
			"'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'='", "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "ELSE", "DEF", "PUT", "ADDO", "MULTO", 
			"DIVO", "SUMO", "CUP", "CDOWN", "CRIGHT", "CLEFT", "POS", "POSX", "POSY", 
			"COLOR", "DOWN", "UP", "BEG", "FOR", "LOOP", "END", "TO", "CASE", "WHEN", 
			"THEN", "REPEAT", "UNTIL", "WHILE", "WHEND", "EQUAL", "AND", "OR", "GREATER", 
			"SMALLER", "SUBSTR", "RANDOM", "PLUS", "MINUS", "MULT", "DIV", "GT", 
			"LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", 
			"PAR_OPEN", "PAR_CLOSE", "P_OPEN", "P_CLOSE", "SEMICOLON", "COLON", "BOOLEAN", 
			"ID", "NUMBER", "VALID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> symbolTable = new HashMap<String, Object>();

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(gramaticaParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(gramaticaParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(gramaticaParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(PROGRAM);
			setState(83);
			match(ID);
			setState(84);
			match(BRACKET_OPEN);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1093681545184L) != 0)) {
				{
				{
				setState(85);
				sentence();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public PutContext put() {
			return getRuleContext(PutContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public ContinueupContext continueup() {
			return getRuleContext(ContinueupContext.class,0);
		}
		public ContinuedownContext continuedown() {
			return getRuleContext(ContinuedownContext.class,0);
		}
		public ContinuerightContext continueright() {
			return getRuleContext(ContinuerightContext.class,0);
		}
		public ContinueleftContext continueleft() {
			return getRuleContext(ContinueleftContext.class,0);
		}
		public PosContext pos() {
			return getRuleContext(PosContext.class,0);
		}
		public PosxContext posx() {
			return getRuleContext(PosxContext.class,0);
		}
		public PosyContext posy() {
			return getRuleContext(PosyContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public DownContext down() {
			return getRuleContext(DownContext.class,0);
		}
		public UpContext up() {
			return getRuleContext(UpContext.class,0);
		}
		public BegginingContext beggining() {
			return getRuleContext(BegginingContext.class,0);
		}
		public ForyContext fory() {
			return getRuleContext(ForyContext.class,0);
		}
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public WhilesContext whiles() {
			return getRuleContext(WhilesContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				define();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				put();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				add();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				continueup();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				continuedown();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				continueright();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				continueleft();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				pos();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				posx();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(102);
				posy();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(103);
				color();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(104);
				down();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(105);
				up();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(106);
				beggining();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(107);
				fory();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(108);
				cases();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(109);
				repeat();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(110);
				whiles();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(111);
				operation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public SmallerContext smaller() {
			return getRuleContext(SmallerContext.class,0);
		}
		public SubstrContext substr() {
			return getRuleContext(SubstrContext.class,0);
		}
		public RandomContext random() {
			return getRuleContext(RandomContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				add();
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				equal();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				and();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				or();
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				greater();
				}
				break;
			case SMALLER:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				smaller();
				}
				break;
			case SUBSTR:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				substr();
				}
				break;
			case RANDOM:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				random();
				}
				break;
			case MULTO:
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				mult();
				}
				break;
			case DIVO:
				enterOuterAlt(_localctx, 10);
				{
				setState(123);
				div();
				}
				break;
			case SUMO:
				enterOuterAlt(_localctx, 11);
				{
				setState(124);
				sum();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalContext extends ParserRuleContext {
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public SmallerContext smaller() {
			return getRuleContext(SmallerContext.class,0);
		}
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logical);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				equal();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				and();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				or();
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				greater();
				}
				break;
			case SMALLER:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				smaller();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefineContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(gramaticaParser.DEF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(DEF);
			setState(135);
			match(PAR_OPEN);
			setState(136);
			match(ID);
			setState(137);
			match(COLON);
			setState(138);
			logic();
			setState(139);
			match(PAR_CLOSE);
			setState(140);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PutContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(gramaticaParser.PUT, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public PutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutContext put() throws RecognitionException {
		PutContext _localctx = new PutContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_put);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(PUT);
				setState(143);
				match(PAR_OPEN);
				setState(144);
				match(ID);
				setState(145);
				match(COLON);
				setState(146);
				expression();
				setState(147);
				match(PAR_CLOSE);
				setState(148);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(PUT);
				setState(151);
				match(PAR_OPEN);
				setState(152);
				match(ID);
				setState(153);
				match(COLON);
				setState(154);
				operation();
				setState(155);
				match(PAR_CLOSE);
				setState(156);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADDO() { return getToken(gramaticaParser.ADDO, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_add);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(ADDO);
				setState(161);
				match(PAR_OPEN);
				setState(162);
				match(ID);
				setState(163);
				match(PAR_CLOSE);
				setState(164);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(ADDO);
				setState(166);
				match(PAR_OPEN);
				setState(167);
				match(ID);
				setState(168);
				match(COLON);
				setState(169);
				num();
				setState(170);
				match(PAR_CLOSE);
				setState(171);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueupContext extends ParserRuleContext {
		public TerminalNode CUP() { return getToken(gramaticaParser.CUP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public ContinueupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterContinueup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitContinueup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitContinueup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueupContext continueup() throws RecognitionException {
		ContinueupContext _localctx = new ContinueupContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_continueup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(CUP);
			setState(176);
			expression();
			setState(177);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinuedownContext extends ParserRuleContext {
		public TerminalNode CDOWN() { return getToken(gramaticaParser.CDOWN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public ContinuedownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuedown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterContinuedown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitContinuedown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitContinuedown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuedownContext continuedown() throws RecognitionException {
		ContinuedownContext _localctx = new ContinuedownContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_continuedown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(CDOWN);
			setState(180);
			expression();
			setState(181);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinuerightContext extends ParserRuleContext {
		public TerminalNode CRIGHT() { return getToken(gramaticaParser.CRIGHT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public ContinuerightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueright; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterContinueright(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitContinueright(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitContinueright(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuerightContext continueright() throws RecognitionException {
		ContinuerightContext _localctx = new ContinuerightContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_continueright);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(CRIGHT);
			setState(184);
			expression();
			setState(185);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueleftContext extends ParserRuleContext {
		public TerminalNode CLEFT() { return getToken(gramaticaParser.CLEFT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public ContinueleftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueleft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterContinueleft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitContinueleft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitContinueleft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueleftContext continueleft() throws RecognitionException {
		ContinueleftContext _localctx = new ContinueleftContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_continueleft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(CLEFT);
			setState(188);
			expression();
			setState(189);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PosContext extends ParserRuleContext {
		public TerminalNode POS() { return getToken(gramaticaParser.POS, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public PosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosContext pos() throws RecognitionException {
		PosContext _localctx = new PosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(POS);
			setState(192);
			match(PAR_OPEN);
			setState(193);
			expression();
			setState(194);
			match(COLON);
			setState(195);
			expression();
			setState(196);
			match(PAR_CLOSE);
			setState(197);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PosxContext extends ParserRuleContext {
		public TerminalNode POSX() { return getToken(gramaticaParser.POSX, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public PosxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPosx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPosx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPosx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosxContext posx() throws RecognitionException {
		PosxContext _localctx = new PosxContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_posx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(POSX);
			setState(200);
			expression();
			setState(201);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PosyContext extends ParserRuleContext {
		public TerminalNode POSY() { return getToken(gramaticaParser.POSY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public PosyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPosy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPosy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPosy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosyContext posy() throws RecognitionException {
		PosyContext _localctx = new PosyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_posy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(POSY);
			setState(204);
			expression();
			setState(205);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(gramaticaParser.COLOR, 0); }
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(COLOR);
			setState(208);
			match(NUMBER);
			setState(209);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DownContext extends ParserRuleContext {
		public TerminalNode DOWN() { return getToken(gramaticaParser.DOWN, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public DownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_down; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DownContext down() throws RecognitionException {
		DownContext _localctx = new DownContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_down);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(DOWN);
			setState(212);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpContext extends ParserRuleContext {
		public TerminalNode UP() { return getToken(gramaticaParser.UP, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public UpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_up; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitUp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpContext up() throws RecognitionException {
		UpContext _localctx = new UpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_up);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(UP);
			setState(215);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BegginingContext extends ParserRuleContext {
		public TerminalNode BEG() { return getToken(gramaticaParser.BEG, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public BegginingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beggining; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterBeggining(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitBeggining(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitBeggining(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BegginingContext beggining() throws RecognitionException {
		BegginingContext _localctx = new BegginingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_beggining);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(BEG);
			setState(218);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForyContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(gramaticaParser.FOR, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(gramaticaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(gramaticaParser.NUMBER, i);
		}
		public TerminalNode TO() { return getToken(gramaticaParser.TO, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public List<TerminalNode> LOOP() { return getTokens(gramaticaParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(gramaticaParser.LOOP, i);
		}
		public TerminalNode P_OPEN() { return getToken(gramaticaParser.P_OPEN, 0); }
		public TerminalNode P_CLOSE() { return getToken(gramaticaParser.P_CLOSE, 0); }
		public TerminalNode END() { return getToken(gramaticaParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ForyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForyContext fory() throws RecognitionException {
		ForyContext _localctx = new ForyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(FOR);
			setState(221);
			match(ID);
			setState(222);
			match(PAR_OPEN);
			setState(223);
			match(NUMBER);
			setState(224);
			match(TO);
			setState(225);
			match(NUMBER);
			setState(226);
			match(PAR_CLOSE);
			setState(227);
			match(LOOP);
			setState(228);
			match(P_OPEN);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1093681545184L) != 0)) {
				{
				{
				setState(229);
				sentence();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(P_CLOSE);
			setState(236);
			match(END);
			setState(237);
			match(LOOP);
			setState(238);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasesContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(gramaticaParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(gramaticaParser.CASE, i);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode END() { return getToken(gramaticaParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public List<WhenContext> when() {
			return getRuleContexts(WhenContext.class);
		}
		public WhenContext when(int i) {
			return getRuleContext(WhenContext.class,i);
		}
		public List<ElsesContext> elses() {
			return getRuleContexts(ElsesContext.class);
		}
		public ElsesContext elses(int i) {
			return getRuleContext(ElsesContext.class,i);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(CASE);
			setState(241);
			match(ID);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(242);
				when();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(248);
				elses();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(END);
			setState(255);
			match(CASE);
			setState(256);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(gramaticaParser.WHEN, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode THEN() { return getToken(gramaticaParser.THEN, 0); }
		public TerminalNode P_OPEN() { return getToken(gramaticaParser.P_OPEN, 0); }
		public TerminalNode P_CLOSE() { return getToken(gramaticaParser.P_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(WHEN);
			setState(259);
			logic();
			setState(260);
			match(THEN);
			setState(261);
			match(P_OPEN);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1093681545184L) != 0)) {
				{
				{
				setState(262);
				sentence();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(P_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElsesContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(gramaticaParser.ELSE, 0); }
		public TerminalNode P_OPEN() { return getToken(gramaticaParser.P_OPEN, 0); }
		public TerminalNode P_CLOSE() { return getToken(gramaticaParser.P_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ElsesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterElses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitElses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitElses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsesContext elses() throws RecognitionException {
		ElsesContext _localctx = new ElsesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ELSE);
			setState(271);
			match(P_OPEN);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1093681545184L) != 0)) {
				{
				{
				setState(272);
				sentence();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(P_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(gramaticaParser.REPEAT, 0); }
		public List<TerminalNode> P_OPEN() { return getTokens(gramaticaParser.P_OPEN); }
		public TerminalNode P_OPEN(int i) {
			return getToken(gramaticaParser.P_OPEN, i);
		}
		public List<TerminalNode> P_CLOSE() { return getTokens(gramaticaParser.P_CLOSE); }
		public TerminalNode P_CLOSE(int i) {
			return getToken(gramaticaParser.P_CLOSE, i);
		}
		public TerminalNode UNTIL() { return getToken(gramaticaParser.UNTIL, 0); }
		public ContContext cont() {
			return getRuleContext(ContContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(REPEAT);
			setState(281);
			match(P_OPEN);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1093681545184L) != 0)) {
				{
				{
				setState(282);
				sentence();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(P_CLOSE);
			setState(289);
			match(UNTIL);
			setState(290);
			match(P_OPEN);
			setState(291);
			cont();
			setState(292);
			match(P_CLOSE);
			setState(293);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhilesContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(gramaticaParser.WHILE, 0); }
		public List<TerminalNode> P_OPEN() { return getTokens(gramaticaParser.P_OPEN); }
		public TerminalNode P_OPEN(int i) {
			return getToken(gramaticaParser.P_OPEN, i);
		}
		public ContContext cont() {
			return getRuleContext(ContContext.class,0);
		}
		public List<TerminalNode> P_CLOSE() { return getTokens(gramaticaParser.P_CLOSE); }
		public TerminalNode P_CLOSE(int i) {
			return getToken(gramaticaParser.P_CLOSE, i);
		}
		public TerminalNode WHEND() { return getToken(gramaticaParser.WHEND, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public WhilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterWhiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitWhiles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitWhiles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilesContext whiles() throws RecognitionException {
		WhilesContext _localctx = new WhilesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whiles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(WHILE);
			setState(296);
			match(P_OPEN);
			setState(297);
			cont();
			setState(298);
			match(P_CLOSE);
			setState(299);
			match(P_OPEN);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1093681545184L) != 0)) {
				{
				{
				setState(300);
				sentence();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(P_CLOSE);
			setState(307);
			match(WHEND);
			setState(308);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public EquationsContext equations() {
			return getRuleContext(EquationsContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public ContContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCont(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCont(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContContext cont() throws RecognitionException {
		ContContext _localctx = new ContContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cont);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(ID);
				setState(311);
				equations();
				setState(312);
				match(NUMBER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(NUMBER);
				setState(315);
				equations();
				setState(316);
				match(ID);
				}
				break;
			case EQUAL:
			case AND:
			case OR:
			case GREATER:
			case SMALLER:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				logical();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EquationsContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(gramaticaParser.GT, 0); }
		public TerminalNode LT() { return getToken(gramaticaParser.LT, 0); }
		public TerminalNode GEQ() { return getToken(gramaticaParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(gramaticaParser.LEQ, 0); }
		public TerminalNode EQ() { return getToken(gramaticaParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(gramaticaParser.NEQ, 0); }
		public EquationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEquations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEquations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitEquations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationsContext equations() throws RecognitionException {
		EquationsContext _localctx = new EquationsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_equations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307720798208L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(gramaticaParser.EQUAL, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(EQUAL);
			setState(324);
			match(PAR_OPEN);
			setState(325);
			expression();
			setState(326);
			match(COLON);
			setState(327);
			expression();
			setState(328);
			match(PAR_CLOSE);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(329);
				match(SEMICOLON);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewcontContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(gramaticaParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ContContext cont() {
			return getRuleContext(ContContext.class,0);
		}
		public NewcontContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newcont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNewcont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNewcont(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNewcont(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewcontContext newcont() throws RecognitionException {
		NewcontContext _localctx = new NewcontContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_newcont);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(BOOLEAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				cont();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(gramaticaParser.AND, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<NewcontContext> newcont() {
			return getRuleContexts(NewcontContext.class);
		}
		public NewcontContext newcont(int i) {
			return getRuleContext(NewcontContext.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(AND);
			setState(341);
			match(PAR_OPEN);
			setState(342);
			newcont();
			setState(343);
			match(COLON);
			setState(344);
			newcont();
			setState(345);
			match(PAR_CLOSE);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(346);
				match(SEMICOLON);
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(gramaticaParser.OR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<NewcontContext> newcont() {
			return getRuleContexts(NewcontContext.class);
		}
		public NewcontContext newcont(int i) {
			return getRuleContext(NewcontContext.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(OR);
			setState(353);
			match(PAR_OPEN);
			setState(354);
			newcont();
			setState(355);
			match(COLON);
			setState(356);
			newcont();
			setState(357);
			match(PAR_CLOSE);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(358);
				match(SEMICOLON);
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GreaterContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(gramaticaParser.GREATER, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_greater);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(GREATER);
			setState(365);
			match(PAR_OPEN);
			setState(366);
			expression();
			setState(367);
			match(COLON);
			setState(368);
			expression();
			setState(369);
			match(PAR_CLOSE);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(370);
				match(SEMICOLON);
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SmallerContext extends ParserRuleContext {
		public TerminalNode SMALLER() { return getToken(gramaticaParser.SMALLER, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public List<TerminalNode> PAR_CLOSE() { return getTokens(gramaticaParser.PAR_CLOSE); }
		public TerminalNode PAR_CLOSE(int i) {
			return getToken(gramaticaParser.PAR_CLOSE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public SmallerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smaller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSmaller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSmaller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSmaller(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmallerContext smaller() throws RecognitionException {
		SmallerContext _localctx = new SmallerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_smaller);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(SMALLER);
			setState(377);
			match(PAR_OPEN);
			setState(378);
			expression();
			setState(379);
			match(COLON);
			setState(380);
			expression();
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(381);
					match(PAR_CLOSE);
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(387);
				match(SEMICOLON);
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubstrContext extends ParserRuleContext {
		public TerminalNode SUBSTR() { return getToken(gramaticaParser.SUBSTR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public SubstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSubstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSubstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSubstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstrContext substr() throws RecognitionException {
		SubstrContext _localctx = new SubstrContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_substr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(SUBSTR);
			setState(394);
			match(PAR_OPEN);
			setState(395);
			expression();
			setState(396);
			match(COLON);
			setState(397);
			expression();
			setState(398);
			match(PAR_CLOSE);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(399);
				match(SEMICOLON);
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RandomContext extends ParserRuleContext {
		public TerminalNode RANDOM() { return getToken(gramaticaParser.RANDOM, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public RandomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRandom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRandom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRandom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RandomContext random() throws RecognitionException {
		RandomContext _localctx = new RandomContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_random);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(RANDOM);
			setState(406);
			match(PAR_OPEN);
			setState(407);
			expression();
			setState(408);
			match(PAR_CLOSE);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(409);
				match(SEMICOLON);
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends ParserRuleContext {
		public TerminalNode MULTO() { return getToken(gramaticaParser.MULTO, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(MULTO);
			setState(416);
			match(PAR_OPEN);
			setState(417);
			expression();
			setState(418);
			match(COLON);
			setState(419);
			expression();
			setState(420);
			match(PAR_CLOSE);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(421);
				match(SEMICOLON);
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIVO() { return getToken(gramaticaParser.DIVO, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(DIVO);
			setState(428);
			match(PAR_OPEN);
			setState(429);
			expression();
			setState(430);
			match(COLON);
			setState(431);
			expression();
			setState(432);
			match(PAR_CLOSE);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(433);
				match(SEMICOLON);
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SumContext extends ParserRuleContext {
		public TerminalNode SUMO() { return getToken(gramaticaParser.SUMO, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(SUMO);
			setState(440);
			match(PAR_OPEN);
			setState(441);
			expression();
			setState(442);
			match(COLON);
			setState(443);
			expression();
			setState(444);
			match(PAR_CLOSE);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(445);
				match(SEMICOLON);
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(gramaticaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(gramaticaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(gramaticaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(gramaticaParser.MINUS, i);
		}
		public List<TerminalNode> MULT() { return getTokens(gramaticaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(gramaticaParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(gramaticaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(gramaticaParser.DIV, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expression);
		int _la;
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				term();
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(452);
					match(PLUS);
					setState(453);
					term();
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				term();
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(460);
					match(MINUS);
					setState(461);
					term();
					}
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				term();
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT) {
					{
					{
					setState(468);
					match(MULT);
					setState(469);
					term();
					}
					}
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				term();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(476);
					match(DIV);
					setState(477);
					term();
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(gramaticaParser.BOOLEAN, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(gramaticaParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4035225266123964416L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001?\u01ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000W"+
		"\b\u0000\n\u0000\f\u0000Z\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001q\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002~\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0085\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009f\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00ae\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00e7\b\u0012\n\u0012"+
		"\f\u0012\u00ea\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00f4\b\u0013"+
		"\n\u0013\f\u0013\u00f7\t\u0013\u0001\u0013\u0005\u0013\u00fa\b\u0013\n"+
		"\u0013\f\u0013\u00fd\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0108\b\u0014\n\u0014\f\u0014\u010b\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0112\b\u0015\n\u0015"+
		"\f\u0015\u0115\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u011c\b\u0016\n\u0016\f\u0016\u011f\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u012e\b\u0017\n\u0017\f\u0017\u0131\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0140\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u014b\b\u001a\n\u001a\f\u001a\u014e\t\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0153\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u015c\b\u001c\n"+
		"\u001c\f\u001c\u015f\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0168\b\u001d\n"+
		"\u001d\f\u001d\u016b\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0174\b\u001e\n"+
		"\u001e\f\u001e\u0177\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u017f\b\u001f\n\u001f\f\u001f"+
		"\u0182\t\u001f\u0001\u001f\u0005\u001f\u0185\b\u001f\n\u001f\f\u001f\u0188"+
		"\t\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0191"+
		"\b \n \f \u0194\t \u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u019b\b!"+
		"\n!\f!\u019e\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0005\"\u01a7\b\"\n\"\f\"\u01aa\t\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0005#\u01b3\b#\n#\f#\u01b6\t#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0005$\u01bf\b$\n$\f$\u01c2\t$\u0001%\u0001%\u0001"+
		"%\u0005%\u01c7\b%\n%\f%\u01ca\t%\u0001%\u0001%\u0001%\u0005%\u01cf\b%"+
		"\n%\f%\u01d2\t%\u0001%\u0001%\u0001%\u0005%\u01d7\b%\n%\f%\u01da\t%\u0001"+
		"%\u0001%\u0001%\u0005%\u01df\b%\n%\f%\u01e2\t%\u0003%\u01e4\b%\u0001&"+
		"\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0000\u0000)\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNP\u0000\u0004\u0001\u0000,1\u0001\u0000<=\u0002"+
		"\u0000;;==\u0001\u0000;=\u0202\u0000R\u0001\u0000\u0000\u0000\u0002p\u0001"+
		"\u0000\u0000\u0000\u0004}\u0001\u0000\u0000\u0000\u0006\u0084\u0001\u0000"+
		"\u0000\u0000\b\u0086\u0001\u0000\u0000\u0000\n\u009e\u0001\u0000\u0000"+
		"\u0000\f\u00ad\u0001\u0000\u0000\u0000\u000e\u00af\u0001\u0000\u0000\u0000"+
		"\u0010\u00b3\u0001\u0000\u0000\u0000\u0012\u00b7\u0001\u0000\u0000\u0000"+
		"\u0014\u00bb\u0001\u0000\u0000\u0000\u0016\u00bf\u0001\u0000\u0000\u0000"+
		"\u0018\u00c7\u0001\u0000\u0000\u0000\u001a\u00cb\u0001\u0000\u0000\u0000"+
		"\u001c\u00cf\u0001\u0000\u0000\u0000\u001e\u00d3\u0001\u0000\u0000\u0000"+
		" \u00d6\u0001\u0000\u0000\u0000\"\u00d9\u0001\u0000\u0000\u0000$\u00dc"+
		"\u0001\u0000\u0000\u0000&\u00f0\u0001\u0000\u0000\u0000(\u0102\u0001\u0000"+
		"\u0000\u0000*\u010e\u0001\u0000\u0000\u0000,\u0118\u0001\u0000\u0000\u0000"+
		".\u0127\u0001\u0000\u0000\u00000\u013f\u0001\u0000\u0000\u00002\u0141"+
		"\u0001\u0000\u0000\u00004\u0143\u0001\u0000\u0000\u00006\u0152\u0001\u0000"+
		"\u0000\u00008\u0154\u0001\u0000\u0000\u0000:\u0160\u0001\u0000\u0000\u0000"+
		"<\u016c\u0001\u0000\u0000\u0000>\u0178\u0001\u0000\u0000\u0000@\u0189"+
		"\u0001\u0000\u0000\u0000B\u0195\u0001\u0000\u0000\u0000D\u019f\u0001\u0000"+
		"\u0000\u0000F\u01ab\u0001\u0000\u0000\u0000H\u01b7\u0001\u0000\u0000\u0000"+
		"J\u01e3\u0001\u0000\u0000\u0000L\u01e5\u0001\u0000\u0000\u0000N\u01e7"+
		"\u0001\u0000\u0000\u0000P\u01e9\u0001\u0000\u0000\u0000RS\u0005\u0001"+
		"\u0000\u0000ST\u0005<\u0000\u0000TX\u00053\u0000\u0000UW\u0003\u0002\u0001"+
		"\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000[\\\u00054\u0000\u0000\\\u0001\u0001\u0000\u0000\u0000"+
		"]q\u0003\b\u0004\u0000^q\u0003\n\u0005\u0000_q\u0003\f\u0006\u0000`q\u0003"+
		"\u000e\u0007\u0000aq\u0003\u0010\b\u0000bq\u0003\u0012\t\u0000cq\u0003"+
		"\u0014\n\u0000dq\u0003\u0016\u000b\u0000eq\u0003\u0018\f\u0000fq\u0003"+
		"\u001a\r\u0000gq\u0003\u001c\u000e\u0000hq\u0003\u001e\u000f\u0000iq\u0003"+
		" \u0010\u0000jq\u0003\"\u0011\u0000kq\u0003$\u0012\u0000lq\u0003&\u0013"+
		"\u0000mq\u0003,\u0016\u0000nq\u0003.\u0017\u0000oq\u0003\u0004\u0002\u0000"+
		"p]\u0001\u0000\u0000\u0000p^\u0001\u0000\u0000\u0000p_\u0001\u0000\u0000"+
		"\u0000p`\u0001\u0000\u0000\u0000pa\u0001\u0000\u0000\u0000pb\u0001\u0000"+
		"\u0000\u0000pc\u0001\u0000\u0000\u0000pd\u0001\u0000\u0000\u0000pe\u0001"+
		"\u0000\u0000\u0000pf\u0001\u0000\u0000\u0000pg\u0001\u0000\u0000\u0000"+
		"ph\u0001\u0000\u0000\u0000pi\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000"+
		"\u0000pk\u0001\u0000\u0000\u0000pl\u0001\u0000\u0000\u0000pm\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u0003"+
		"\u0001\u0000\u0000\u0000r~\u0003\f\u0006\u0000s~\u00034\u001a\u0000t~"+
		"\u00038\u001c\u0000u~\u0003:\u001d\u0000v~\u0003<\u001e\u0000w~\u0003"+
		">\u001f\u0000x~\u0003@ \u0000y~\u0003B!\u0000z~\u0003D\"\u0000{~\u0003"+
		"F#\u0000|~\u0003H$\u0000}r\u0001\u0000\u0000\u0000}s\u0001\u0000\u0000"+
		"\u0000}t\u0001\u0000\u0000\u0000}u\u0001\u0000\u0000\u0000}v\u0001\u0000"+
		"\u0000\u0000}w\u0001\u0000\u0000\u0000}x\u0001\u0000\u0000\u0000}y\u0001"+
		"\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}|\u0001\u0000\u0000\u0000~\u0005\u0001\u0000\u0000\u0000\u007f\u0085"+
		"\u00034\u001a\u0000\u0080\u0085\u00038\u001c\u0000\u0081\u0085\u0003:"+
		"\u001d\u0000\u0082\u0085\u0003<\u001e\u0000\u0083\u0085\u0003>\u001f\u0000"+
		"\u0084\u007f\u0001\u0000\u0000\u0000\u0084\u0080\u0001\u0000\u0000\u0000"+
		"\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0007\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005\u0005\u0000\u0000\u0087\u0088\u00055\u0000\u0000\u0088"+
		"\u0089\u0005<\u0000\u0000\u0089\u008a\u0005:\u0000\u0000\u008a\u008b\u0003"+
		"N\'\u0000\u008b\u008c\u00056\u0000\u0000\u008c\u008d\u00059\u0000\u0000"+
		"\u008d\t\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0006\u0000\u0000\u008f"+
		"\u0090\u00055\u0000\u0000\u0090\u0091\u0005<\u0000\u0000\u0091\u0092\u0005"+
		":\u0000\u0000\u0092\u0093\u0003J%\u0000\u0093\u0094\u00056\u0000\u0000"+
		"\u0094\u0095\u00059\u0000\u0000\u0095\u009f\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005\u0006\u0000\u0000\u0097\u0098\u00055\u0000\u0000\u0098\u0099"+
		"\u0005<\u0000\u0000\u0099\u009a\u0005:\u0000\u0000\u009a\u009b\u0003\u0004"+
		"\u0002\u0000\u009b\u009c\u00056\u0000\u0000\u009c\u009d\u00059\u0000\u0000"+
		"\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u008e\u0001\u0000\u0000\u0000"+
		"\u009e\u0096\u0001\u0000\u0000\u0000\u009f\u000b\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0005\u0007\u0000\u0000\u00a1\u00a2\u00055\u0000\u0000\u00a2"+
		"\u00a3\u0005<\u0000\u0000\u00a3\u00a4\u00056\u0000\u0000\u00a4\u00ae\u0005"+
		"9\u0000\u0000\u00a5\u00a6\u0005\u0007\u0000\u0000\u00a6\u00a7\u00055\u0000"+
		"\u0000\u00a7\u00a8\u0005<\u0000\u0000\u00a8\u00a9\u0005:\u0000\u0000\u00a9"+
		"\u00aa\u0003P(\u0000\u00aa\u00ab\u00056\u0000\u0000\u00ab\u00ac\u0005"+
		"9\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a0\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a5\u0001\u0000\u0000\u0000\u00ae\r\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0005\u000b\u0000\u0000\u00b0\u00b1\u0003J%\u0000\u00b1"+
		"\u00b2\u00059\u0000\u0000\u00b2\u000f\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0005\f\u0000\u0000\u00b4\u00b5\u0003J%\u0000\u00b5\u00b6\u00059\u0000"+
		"\u0000\u00b6\u0011\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\r\u0000\u0000"+
		"\u00b8\u00b9\u0003J%\u0000\u00b9\u00ba\u00059\u0000\u0000\u00ba\u0013"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u000e\u0000\u0000\u00bc\u00bd"+
		"\u0003J%\u0000\u00bd\u00be\u00059\u0000\u0000\u00be\u0015\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005\u000f\u0000\u0000\u00c0\u00c1\u00055\u0000"+
		"\u0000\u00c1\u00c2\u0003J%\u0000\u00c2\u00c3\u0005:\u0000\u0000\u00c3"+
		"\u00c4\u0003J%\u0000\u00c4\u00c5\u00056\u0000\u0000\u00c5\u00c6\u0005"+
		"9\u0000\u0000\u00c6\u0017\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0010"+
		"\u0000\u0000\u00c8\u00c9\u0003J%\u0000\u00c9\u00ca\u00059\u0000\u0000"+
		"\u00ca\u0019\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0011\u0000\u0000"+
		"\u00cc\u00cd\u0003J%\u0000\u00cd\u00ce\u00059\u0000\u0000\u00ce\u001b"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0012\u0000\u0000\u00d0\u00d1"+
		"\u0005=\u0000\u0000\u00d1\u00d2\u00059\u0000\u0000\u00d2\u001d\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0005\u0013\u0000\u0000\u00d4\u00d5\u00059\u0000"+
		"\u0000\u00d5\u001f\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0014\u0000"+
		"\u0000\u00d7\u00d8\u00059\u0000\u0000\u00d8!\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005\u0015\u0000\u0000\u00da\u00db\u00059\u0000\u0000\u00db#\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0005\u0016\u0000\u0000\u00dd\u00de\u0005"+
		"<\u0000\u0000\u00de\u00df\u00055\u0000\u0000\u00df\u00e0\u0005=\u0000"+
		"\u0000\u00e0\u00e1\u0005\u0019\u0000\u0000\u00e1\u00e2\u0005=\u0000\u0000"+
		"\u00e2\u00e3\u00056\u0000\u0000\u00e3\u00e4\u0005\u0017\u0000\u0000\u00e4"+
		"\u00e8\u00057\u0000\u0000\u00e5\u00e7\u0003\u0002\u0001\u0000\u00e6\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u00058\u0000\u0000\u00ec\u00ed\u0005\u0018\u0000\u0000\u00ed\u00ee\u0005"+
		"\u0017\u0000\u0000\u00ee\u00ef\u00059\u0000\u0000\u00ef%\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0005\u001a\u0000\u0000\u00f1\u00f5\u0005<\u0000\u0000"+
		"\u00f2\u00f4\u0003(\u0014\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00fb\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003*\u0015\u0000\u00f9\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005\u0018\u0000\u0000\u00ff\u0100\u0005\u001a\u0000\u0000\u0100\u0101"+
		"\u00059\u0000\u0000\u0101\'\u0001\u0000\u0000\u0000\u0102\u0103\u0005"+
		"\u001b\u0000\u0000\u0103\u0104\u0003N\'\u0000\u0104\u0105\u0005\u001c"+
		"\u0000\u0000\u0105\u0109\u00057\u0000\u0000\u0106\u0108\u0003\u0002\u0001"+
		"\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u00058\u0000\u0000\u010d)\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0005\u0004\u0000\u0000\u010f\u0113\u00057\u0000\u0000\u0110\u0112"+
		"\u0003\u0002\u0001\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0115"+
		"\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0113"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u00058\u0000\u0000\u0117+\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0005\u001d\u0000\u0000\u0119\u011d\u00057\u0000"+
		"\u0000\u011a\u011c\u0003\u0002\u0001\u0000\u011b\u011a\u0001\u0000\u0000"+
		"\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u00058\u0000\u0000"+
		"\u0121\u0122\u0005\u001e\u0000\u0000\u0122\u0123\u00057\u0000\u0000\u0123"+
		"\u0124\u00030\u0018\u0000\u0124\u0125\u00058\u0000\u0000\u0125\u0126\u0005"+
		"9\u0000\u0000\u0126-\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u001f\u0000"+
		"\u0000\u0128\u0129\u00057\u0000\u0000\u0129\u012a\u00030\u0018\u0000\u012a"+
		"\u012b\u00058\u0000\u0000\u012b\u012f\u00057\u0000\u0000\u012c\u012e\u0003"+
		"\u0002\u0001\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e\u0131\u0001"+
		"\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001"+
		"\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u012f\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u00058\u0000\u0000\u0133\u0134\u0005 \u0000"+
		"\u0000\u0134\u0135\u00059\u0000\u0000\u0135/\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0005<\u0000\u0000\u0137\u0138\u00032\u0019\u0000\u0138\u0139\u0005"+
		"=\u0000\u0000\u0139\u0140\u0001\u0000\u0000\u0000\u013a\u013b\u0005=\u0000"+
		"\u0000\u013b\u013c\u00032\u0019\u0000\u013c\u013d\u0005<\u0000\u0000\u013d"+
		"\u0140\u0001\u0000\u0000\u0000\u013e\u0140\u0003\u0006\u0003\u0000\u013f"+
		"\u0136\u0001\u0000\u0000\u0000\u013f\u013a\u0001\u0000\u0000\u0000\u013f"+
		"\u013e\u0001\u0000\u0000\u0000\u01401\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0007\u0000\u0000\u0000\u01423\u0001\u0000\u0000\u0000\u0143\u0144\u0005"+
		"!\u0000\u0000\u0144\u0145\u00055\u0000\u0000\u0145\u0146\u0003J%\u0000"+
		"\u0146\u0147\u0005:\u0000\u0000\u0147\u0148\u0003J%\u0000\u0148\u014c"+
		"\u00056\u0000\u0000\u0149\u014b\u00059\u0000\u0000\u014a\u0149\u0001\u0000"+
		"\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d5\u0001\u0000\u0000"+
		"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0153\u0005;\u0000\u0000"+
		"\u0150\u0153\u0005<\u0000\u0000\u0151\u0153\u00030\u0018\u0000\u0152\u014f"+
		"\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0151"+
		"\u0001\u0000\u0000\u0000\u01537\u0001\u0000\u0000\u0000\u0154\u0155\u0005"+
		"\"\u0000\u0000\u0155\u0156\u00055\u0000\u0000\u0156\u0157\u00036\u001b"+
		"\u0000\u0157\u0158\u0005:\u0000\u0000\u0158\u0159\u00036\u001b\u0000\u0159"+
		"\u015d\u00056\u0000\u0000\u015a\u015c\u00059\u0000\u0000\u015b\u015a\u0001"+
		"\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e9\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0161\u0005#\u0000"+
		"\u0000\u0161\u0162\u00055\u0000\u0000\u0162\u0163\u00036\u001b\u0000\u0163"+
		"\u0164\u0005:\u0000\u0000\u0164\u0165\u00036\u001b\u0000\u0165\u0169\u0005"+
		"6\u0000\u0000\u0166\u0168\u00059\u0000\u0000\u0167\u0166\u0001\u0000\u0000"+
		"\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a;\u0001\u0000\u0000\u0000"+
		"\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u016d\u0005$\u0000\u0000\u016d"+
		"\u016e\u00055\u0000\u0000\u016e\u016f\u0003J%\u0000\u016f\u0170\u0005"+
		":\u0000\u0000\u0170\u0171\u0003J%\u0000\u0171\u0175\u00056\u0000\u0000"+
		"\u0172\u0174\u00059\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174"+
		"\u0177\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0001\u0000\u0000\u0000\u0176=\u0001\u0000\u0000\u0000\u0177\u0175"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0005%\u0000\u0000\u0179\u017a\u0005"+
		"5\u0000\u0000\u017a\u017b\u0003J%\u0000\u017b\u017c\u0005:\u0000\u0000"+
		"\u017c\u0180\u0003J%\u0000\u017d\u017f\u00056\u0000\u0000\u017e\u017d"+
		"\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0186"+
		"\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0185"+
		"\u00059\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u0188\u0001"+
		"\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187?\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0005&\u0000\u0000\u018a\u018b\u00055\u0000\u0000"+
		"\u018b\u018c\u0003J%\u0000\u018c\u018d\u0005:\u0000\u0000\u018d\u018e"+
		"\u0003J%\u0000\u018e\u0192\u00056\u0000\u0000\u018f\u0191\u00059\u0000"+
		"\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000"+
		"\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193A\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0005\'\u0000\u0000\u0196\u0197\u00055\u0000\u0000\u0197"+
		"\u0198\u0003J%\u0000\u0198\u019c\u00056\u0000\u0000\u0199\u019b\u0005"+
		"9\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000"+
		"\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019dC\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000"+
		"\u0000\u019f\u01a0\u0005\b\u0000\u0000\u01a0\u01a1\u00055\u0000\u0000"+
		"\u01a1\u01a2\u0003J%\u0000\u01a2\u01a3\u0005:\u0000\u0000\u01a3\u01a4"+
		"\u0003J%\u0000\u01a4\u01a8\u00056\u0000\u0000\u01a5\u01a7\u00059\u0000"+
		"\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a9E\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0005\t\u0000\u0000\u01ac\u01ad\u00055\u0000\u0000\u01ad"+
		"\u01ae\u0003J%\u0000\u01ae\u01af\u0005:\u0000\u0000\u01af\u01b0\u0003"+
		"J%\u0000\u01b0\u01b4\u00056\u0000\u0000\u01b1\u01b3\u00059\u0000\u0000"+
		"\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b5G\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0005\n\u0000\u0000\u01b8\u01b9\u00055\u0000\u0000\u01b9\u01ba"+
		"\u0003J%\u0000\u01ba\u01bb\u0005:\u0000\u0000\u01bb\u01bc\u0003J%\u0000"+
		"\u01bc\u01c0\u00056\u0000\u0000\u01bd\u01bf\u00059\u0000\u0000\u01be\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1I\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c8\u0003"+
		"L&\u0000\u01c4\u01c5\u0005(\u0000\u0000\u01c5\u01c7\u0003L&\u0000\u01c6"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9"+
		"\u01e4\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb"+
		"\u01d0\u0003L&\u0000\u01cc\u01cd\u0005)\u0000\u0000\u01cd\u01cf\u0003"+
		"L&\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d1\u01e4\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d8\u0003L&\u0000\u01d4\u01d5\u0005*\u0000\u0000\u01d5"+
		"\u01d7\u0003L&\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01da\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d9\u01e4\u0001\u0000\u0000\u0000\u01da\u01d8\u0001"+
		"\u0000\u0000\u0000\u01db\u01e0\u0003L&\u0000\u01dc\u01dd\u0005+\u0000"+
		"\u0000\u01dd\u01df\u0003L&\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e3\u01c3\u0001\u0000\u0000\u0000\u01e3"+
		"\u01cb\u0001\u0000\u0000\u0000\u01e3\u01d3\u0001\u0000\u0000\u0000\u01e3"+
		"\u01db\u0001\u0000\u0000\u0000\u01e4K\u0001\u0000\u0000\u0000\u01e5\u01e6"+
		"\u0007\u0001\u0000\u0000\u01e6M\u0001\u0000\u0000\u0000\u01e7\u01e8\u0007"+
		"\u0002\u0000\u0000\u01e8O\u0001\u0000\u0000\u0000\u01e9\u01ea\u0007\u0003"+
		"\u0000\u0000\u01eaQ\u0001\u0000\u0000\u0000\u001fXp}\u0084\u009e\u00ad"+
		"\u00e8\u00f5\u00fb\u0109\u0113\u011d\u012f\u013f\u014c\u0152\u015d\u0169"+
		"\u0175\u0180\u0186\u0192\u019c\u01a8\u01b4\u01c0\u01c8\u01d0\u01d8\u01e0"+
		"\u01e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}