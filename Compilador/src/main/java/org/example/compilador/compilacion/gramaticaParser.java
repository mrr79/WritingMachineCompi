// Generated from /home/huevitoentorta/Documents/WritingMachineCompi/Compilador/src/main/java/org/example/compilador/compilacion/gramatica.g4 by ANTLR 4.13.1
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
		MAIN=1, PRINTLN=2, CALL=3, PROC=4, COM=5, RIGHT=6, LEFT=7, DEF=8, PUT=9, 
		ADDO=10, MULTO=11, DIVO=12, SUMO=13, CUP=14, CDOWN=15, CRIGHT=16, CLEFT=17, 
		POS=18, POSX=19, POSY=20, COLOR=21, DOWN=22, UP=23, BEG=24, FOR=25, LOOP=26, 
		END=27, TO=28, CASE=29, WHEN=30, THEN=31, ELSE=32, REPEAT=33, UNTIL=34, 
		WHILE=35, WHEND=36, EQUAL=37, AND=38, OR=39, GREATER=40, SMALLER=41, SUBSTR=42, 
		RANDOM=43, PLUS=44, MINUS=45, MULT=46, DIV=47, GT=48, LT=49, GEQ=50, LEQ=51, 
		EQ=52, NEQ=53, ASSIGN=54, BRACKET_OPEN=55, BRACKET_CLOSE=56, PAR_OPEN=57, 
		PAR_CLOSE=58, P_OPEN=59, P_CLOSE=60, SEMICOLON=61, COLON=62, BOOLEAN=63, 
		ID=64, NUMBER=65, WS=66;
	public static final int
		RULE_define = 0, RULE_logic = 1, RULE_n1 = 2, RULE_n2 = 3, RULE_n3 = 4, 
		RULE_n4 = 5, RULE_n5 = 6, RULE_n6 = 7, RULE_operacion = 8, RULE_add = 9, 
		RULE_sub = 10, RULE_sum = 11, RULE_equal = 12, RULE_greater = 13, RULE_smaller = 14, 
		RULE_random = 15, RULE_mult = 16, RULE_div = 17, RULE_and = 18, RULE_or = 19, 
		RULE_put = 20, RULE_continueup = 21, RULE_continuedown = 22, RULE_continueright = 23, 
		RULE_continueleft = 24, RULE_pos = 25, RULE_posx = 26, RULE_posy = 27, 
		RULE_color = 28, RULE_down = 29, RULE_up = 30, RULE_beggining = 31, RULE_sentencia = 32, 
		RULE_forloops = 33, RULE_whiles = 34, RULE_repeat = 35, RULE_cicase = 36, 
		RULE_caseStatement = 37, RULE_listpar = 38, RULE_listinst = 39, RULE_procedure = 40, 
		RULE_main = 41, RULE_comments = 42, RULE_procedureSection = 43, RULE_program = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"define", "logic", "n1", "n2", "n3", "n4", "n5", "n6", "operacion", "add", 
			"sub", "sum", "equal", "greater", "smaller", "random", "mult", "div", 
			"and", "or", "put", "continueup", "continuedown", "continueright", "continueleft", 
			"pos", "posx", "posy", "color", "down", "up", "beggining", "sentencia", 
			"forloops", "whiles", "repeat", "cicase", "caseStatement", "listpar", 
			"listinst", "procedure", "main", "comments", "procedureSection", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'println'", "'call'", "'Proc'", null, "'TurnRight'", 
			"'TurnLeft'", null, null, null, "'Mult'", "'Div'", "'Sum'", "'ContinueUp'", 
			"'ContinueDown'", "'ContinueRight'", "'ContinueLeft'", "'Pos'", "'PosX'", 
			"'PosY'", "'UseColor'", "'Down'", "'Up'", "'Beginning'", "'For'", "'Loop'", 
			"'End'", "'to'", null, "'When'", "'Then'", "'Else'", "'Repeat'", "'Until'", 
			"'While'", "'Whend'", "'Equal'", "'And'", null, "'Greater'", "'Smaller'", 
			"'Substr'", "'Random'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='", "'='", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "PRINTLN", "CALL", "PROC", "COM", "RIGHT", "LEFT", "DEF", 
			"PUT", "ADDO", "MULTO", "DIVO", "SUMO", "CUP", "CDOWN", "CRIGHT", "CLEFT", 
			"POS", "POSX", "POSY", "COLOR", "DOWN", "UP", "BEG", "FOR", "LOOP", "END", 
			"TO", "CASE", "WHEN", "THEN", "ELSE", "REPEAT", "UNTIL", "WHILE", "WHEND", 
			"EQUAL", "AND", "OR", "GREATER", "SMALLER", "SUBSTR", "RANDOM", "PLUS", 
			"MINUS", "MULT", "DIV", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "P_OPEN", "P_CLOSE", 
			"SEMICOLON", "COLON", "BOOLEAN", "ID", "NUMBER", "WS"
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
		enterRule(_localctx, 0, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(DEF);
			setState(91);
			match(PAR_OPEN);
			setState(92);
			match(ID);
			setState(93);
			match(COLON);
			setState(94);
			logic();
			setState(95);
			match(PAR_CLOSE);
			setState(96);
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
		enterRule(_localctx, 2, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
	public static class N1Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(gramaticaParser.BOOLEAN, 0); }
		public N1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterN1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitN1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitN1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N1Context n1() throws RecognitionException {
		N1Context _localctx = new N1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_n1);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(NUMBER);
				}
				break;
			case ADDO:
			case MULTO:
			case DIVO:
			case SUMO:
			case EQUAL:
			case AND:
			case OR:
			case GREATER:
			case SMALLER:
			case SUBSTR:
			case RANDOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				operacion();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(BOOLEAN);
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
	public static class N2Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public N2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterN2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitN2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitN2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N2Context n2() throws RecognitionException {
		N2Context _localctx = new N2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_n2);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(NUMBER);
				}
				break;
			case ADDO:
			case MULTO:
			case DIVO:
			case SUMO:
			case EQUAL:
			case AND:
			case OR:
			case GREATER:
			case SMALLER:
			case SUBSTR:
			case RANDOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				operacion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(ID);
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
	public static class N3Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public N3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterN3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitN3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitN3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N3Context n3() throws RecognitionException {
		N3Context _localctx = new N3Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_n3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
	public static class N4Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode BOOLEAN() { return getToken(gramaticaParser.BOOLEAN, 0); }
		public N4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterN4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitN4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitN4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N4Context n4() throws RecognitionException {
		N4Context _localctx = new N4Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_n4);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(NUMBER);
				}
				break;
			case ADDO:
			case MULTO:
			case DIVO:
			case SUMO:
			case EQUAL:
			case AND:
			case OR:
			case GREATER:
			case SMALLER:
			case SUBSTR:
			case RANDOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				operacion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(ID);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(BOOLEAN);
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
	public static class N5Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode BOOLEAN() { return getToken(gramaticaParser.BOOLEAN, 0); }
		public N5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterN5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitN5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitN5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N5Context n5() throws RecognitionException {
		N5Context _localctx = new N5Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_n5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 7L) != 0)) ) {
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
	public static class N6Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(gramaticaParser.BOOLEAN, 0); }
		public N6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterN6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitN6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitN6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N6Context n6() throws RecognitionException {
		N6Context _localctx = new N6Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_n6);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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
	public static class OperacionContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
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
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacion);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				add();
				}
				break;
			case SUBSTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				sub();
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				equal();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				and();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				or();
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				greater();
				}
				break;
			case SMALLER:
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				smaller();
				}
				break;
			case RANDOM:
				enterOuterAlt(_localctx, 8);
				{
				setState(129);
				random();
				}
				break;
			case MULTO:
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				mult();
				}
				break;
			case DIVO:
				enterOuterAlt(_localctx, 10);
				{
				setState(131);
				div();
				}
				break;
			case SUMO:
				enterOuterAlt(_localctx, 11);
				{
				setState(132);
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
	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADDO() { return getToken(gramaticaParser.ADDO, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public N2Context n2() {
			return getRuleContext(N2Context.class,0);
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
		enterRule(_localctx, 18, RULE_add);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(ADDO);
				setState(136);
				match(PAR_OPEN);
				setState(137);
				match(ID);
				setState(138);
				match(PAR_CLOSE);
				setState(139);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(ADDO);
				setState(141);
				match(PAR_OPEN);
				setState(142);
				match(ID);
				setState(143);
				match(COLON);
				setState(144);
				n2();
				setState(145);
				match(PAR_CLOSE);
				setState(146);
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
	public static class SubContext extends ParserRuleContext {
		public TerminalNode SUBSTR() { return getToken(gramaticaParser.SUBSTR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public N3Context n3() {
			return getRuleContext(N3Context.class,0);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public N2Context n2() {
			return getRuleContext(N2Context.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(SUBSTR);
			setState(151);
			match(PAR_OPEN);
			setState(152);
			n3();
			setState(153);
			match(COLON);
			setState(154);
			n2();
			setState(155);
			match(PAR_CLOSE);
			setState(156);
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
	public static class SumContext extends ParserRuleContext {
		public TerminalNode SUMO() { return getToken(gramaticaParser.SUMO, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public N3Context n3() {
			return getRuleContext(N3Context.class,0);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public N2Context n2() {
			return getRuleContext(N2Context.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 22, RULE_sum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(SUMO);
			setState(159);
			match(PAR_OPEN);
			setState(160);
			n3();
			setState(161);
			match(COLON);
			setState(162);
			n2();
			setState(163);
			match(PAR_CLOSE);
			setState(164);
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
	public static class EqualContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(gramaticaParser.EQUAL, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<N2Context> n2() {
			return getRuleContexts(N2Context.class);
		}
		public N2Context n2(int i) {
			return getRuleContext(N2Context.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 24, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(EQUAL);
			setState(167);
			match(PAR_OPEN);
			setState(168);
			n2();
			setState(169);
			match(COLON);
			setState(170);
			n2();
			setState(171);
			match(PAR_CLOSE);
			setState(172);
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
	public static class GreaterContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(gramaticaParser.GREATER, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<N2Context> n2() {
			return getRuleContexts(N2Context.class);
		}
		public N2Context n2(int i) {
			return getRuleContext(N2Context.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 26, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(GREATER);
			setState(175);
			match(PAR_OPEN);
			setState(176);
			n2();
			setState(177);
			match(COLON);
			setState(178);
			n2();
			setState(179);
			match(PAR_CLOSE);
			setState(180);
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
	public static class SmallerContext extends ParserRuleContext {
		public TerminalNode SMALLER() { return getToken(gramaticaParser.SMALLER, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<N2Context> n2() {
			return getRuleContexts(N2Context.class);
		}
		public N2Context n2(int i) {
			return getRuleContext(N2Context.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 28, RULE_smaller);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(SMALLER);
			setState(183);
			match(PAR_OPEN);
			setState(184);
			n2();
			setState(185);
			match(COLON);
			setState(186);
			n2();
			setState(187);
			match(PAR_CLOSE);
			setState(188);
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
	public static class RandomContext extends ParserRuleContext {
		public TerminalNode RANDOM() { return getToken(gramaticaParser.RANDOM, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public N3Context n3() {
			return getRuleContext(N3Context.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 30, RULE_random);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(RANDOM);
			setState(191);
			match(PAR_OPEN);
			setState(192);
			n3();
			setState(193);
			match(PAR_CLOSE);
			setState(194);
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
	public static class MultContext extends ParserRuleContext {
		public TerminalNode MULTO() { return getToken(gramaticaParser.MULTO, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public N3Context n3() {
			return getRuleContext(N3Context.class,0);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public N2Context n2() {
			return getRuleContext(N2Context.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 32, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(MULTO);
			setState(197);
			match(PAR_OPEN);
			setState(198);
			n3();
			setState(199);
			match(COLON);
			setState(200);
			n2();
			setState(201);
			match(PAR_CLOSE);
			setState(202);
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
	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIVO() { return getToken(gramaticaParser.DIVO, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public N3Context n3() {
			return getRuleContext(N3Context.class,0);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public N2Context n2() {
			return getRuleContext(N2Context.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 34, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(DIVO);
			setState(205);
			match(PAR_OPEN);
			setState(206);
			n3();
			setState(207);
			match(COLON);
			setState(208);
			n2();
			setState(209);
			match(PAR_CLOSE);
			setState(210);
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
	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(gramaticaParser.AND, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<N4Context> n4() {
			return getRuleContexts(N4Context.class);
		}
		public N4Context n4(int i) {
			return getRuleContext(N4Context.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 36, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(AND);
			setState(213);
			match(PAR_OPEN);
			setState(214);
			n4();
			setState(215);
			match(COLON);
			setState(216);
			n4();
			setState(217);
			match(PAR_CLOSE);
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
	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(gramaticaParser.OR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<N4Context> n4() {
			return getRuleContexts(N4Context.class);
		}
		public N4Context n4(int i) {
			return getRuleContext(N4Context.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 38, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(OR);
			setState(221);
			match(PAR_OPEN);
			setState(222);
			n4();
			setState(223);
			match(COLON);
			setState(224);
			n4();
			setState(225);
			match(PAR_CLOSE);
			setState(226);
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
		public N1Context n1() {
			return getRuleContext(N1Context.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 40, RULE_put);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(PUT);
			setState(229);
			match(PAR_OPEN);
			setState(230);
			match(ID);
			setState(231);
			match(COLON);
			setState(232);
			n1();
			setState(233);
			match(PAR_CLOSE);
			setState(234);
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
	public static class ContinueupContext extends ParserRuleContext {
		public TerminalNode CUP() { return getToken(gramaticaParser.CUP, 0); }
		public N2Context n2() {
			return getRuleContext(N2Context.class,0);
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
		enterRule(_localctx, 42, RULE_continueup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(CUP);
			setState(237);
			n2();
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
	public static class ContinuedownContext extends ParserRuleContext {
		public TerminalNode CDOWN() { return getToken(gramaticaParser.CDOWN, 0); }
		public N2Context n2() {
			return getRuleContext(N2Context.class,0);
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
		enterRule(_localctx, 44, RULE_continuedown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(CDOWN);
			setState(241);
			n2();
			setState(242);
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
		public N2Context n2() {
			return getRuleContext(N2Context.class,0);
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
		enterRule(_localctx, 46, RULE_continueright);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(CRIGHT);
			setState(245);
			n2();
			setState(246);
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
		public N2Context n2() {
			return getRuleContext(N2Context.class,0);
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
		enterRule(_localctx, 48, RULE_continueleft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(CLEFT);
			setState(249);
			n2();
			setState(250);
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
		public List<N2Context> n2() {
			return getRuleContexts(N2Context.class);
		}
		public N2Context n2(int i) {
			return getRuleContext(N2Context.class,i);
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
		enterRule(_localctx, 50, RULE_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(POS);
			setState(253);
			match(PAR_OPEN);
			setState(254);
			n2();
			setState(255);
			match(COLON);
			setState(256);
			n2();
			setState(257);
			match(PAR_CLOSE);
			setState(258);
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
		public N2Context n2() {
			return getRuleContext(N2Context.class,0);
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
		enterRule(_localctx, 52, RULE_posx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(POSX);
			setState(261);
			n2();
			setState(262);
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
		public N2Context n2() {
			return getRuleContext(N2Context.class,0);
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
		enterRule(_localctx, 54, RULE_posy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(POSY);
			setState(265);
			n2();
			setState(266);
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
		enterRule(_localctx, 56, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(COLOR);
			setState(269);
			match(NUMBER);
			setState(270);
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
		enterRule(_localctx, 58, RULE_down);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(DOWN);
			setState(273);
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
		enterRule(_localctx, 60, RULE_up);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(UP);
			setState(276);
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
		enterRule(_localctx, 62, RULE_beggining);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(BEG);
			setState(279);
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
	public static class SentenciaContext extends ParserRuleContext {
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public PutContext put() {
			return getRuleContext(PutContext.class,0);
		}
		public ContinueupContext continueup() {
			return getRuleContext(ContinueupContext.class,0);
		}
		public ContinuedownContext continuedown() {
			return getRuleContext(ContinuedownContext.class,0);
		}
		public ContinueleftContext continueleft() {
			return getRuleContext(ContinueleftContext.class,0);
		}
		public ContinuerightContext continueright() {
			return getRuleContext(ContinuerightContext.class,0);
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
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sentencia);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDO:
			case MULTO:
			case DIVO:
			case SUMO:
			case EQUAL:
			case AND:
			case OR:
			case GREATER:
			case SMALLER:
			case SUBSTR:
			case RANDOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				operacion();
				}
				break;
			case PUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				put();
				}
				break;
			case CUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				continueup();
				}
				break;
			case CDOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				continuedown();
				}
				break;
			case CLEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				continueleft();
				}
				break;
			case CRIGHT:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				continueright();
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				pos();
				}
				break;
			case POSX:
				enterOuterAlt(_localctx, 8);
				{
				setState(288);
				posx();
				}
				break;
			case POSY:
				enterOuterAlt(_localctx, 9);
				{
				setState(289);
				posy();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(290);
				color();
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 11);
				{
				setState(291);
				down();
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 12);
				{
				setState(292);
				up();
				}
				break;
			case BEG:
				enterOuterAlt(_localctx, 13);
				{
				setState(293);
				beggining();
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
	public static class ForloopsContext extends ParserRuleContext {
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
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ForloopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterForloops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitForloops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitForloops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopsContext forloops() throws RecognitionException {
		ForloopsContext _localctx = new ForloopsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forloops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(FOR);
			setState(297);
			match(ID);
			setState(298);
			match(PAR_OPEN);
			setState(299);
			match(NUMBER);
			setState(300);
			match(TO);
			setState(301);
			match(NUMBER);
			setState(302);
			match(PAR_CLOSE);
			setState(303);
			match(LOOP);
			setState(304);
			match(P_OPEN);
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305);
				sentencia();
				}
				}
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17454780644864L) != 0) );
			setState(310);
			match(P_CLOSE);
			setState(311);
			match(END);
			setState(312);
			match(LOOP);
			setState(313);
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
		public N2Context n2() {
			return getRuleContext(N2Context.class,0);
		}
		public List<TerminalNode> P_CLOSE() { return getTokens(gramaticaParser.P_CLOSE); }
		public TerminalNode P_CLOSE(int i) {
			return getToken(gramaticaParser.P_CLOSE, i);
		}
		public TerminalNode WHEND() { return getToken(gramaticaParser.WHEND, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
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
		enterRule(_localctx, 68, RULE_whiles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(WHILE);
			setState(316);
			match(P_OPEN);
			setState(317);
			n2();
			setState(318);
			match(P_CLOSE);
			setState(319);
			match(P_OPEN);
			setState(321); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(320);
				sentencia();
				}
				}
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17454780644864L) != 0) );
			setState(325);
			match(P_CLOSE);
			setState(326);
			match(WHEND);
			setState(327);
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
	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(gramaticaParser.REPEAT, 0); }
		public TerminalNode P_OPEN() { return getToken(gramaticaParser.P_OPEN, 0); }
		public List<TerminalNode> P_CLOSE() { return getTokens(gramaticaParser.P_CLOSE); }
		public TerminalNode P_CLOSE(int i) {
			return getToken(gramaticaParser.P_CLOSE, i);
		}
		public TerminalNode UNTIL() { return getToken(gramaticaParser.UNTIL, 0); }
		public N2Context n2() {
			return getRuleContext(N2Context.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
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
		enterRule(_localctx, 70, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(REPEAT);
			setState(330);
			match(P_OPEN);
			setState(332); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(331);
				sentencia();
				}
				}
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17454780644864L) != 0) );
			setState(336);
			match(P_CLOSE);
			setState(337);
			match(UNTIL);
			setState(338);
			match(P_CLOSE);
			setState(339);
			n2();
			setState(340);
			match(P_CLOSE);
			setState(341);
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
	public static class CicaseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(gramaticaParser.WHEN, 0); }
		public N6Context n6() {
			return getRuleContext(N6Context.class,0);
		}
		public TerminalNode THEN() { return getToken(gramaticaParser.THEN, 0); }
		public TerminalNode P_OPEN() { return getToken(gramaticaParser.P_OPEN, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode P_CLOSE() { return getToken(gramaticaParser.P_CLOSE, 0); }
		public CicaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCicase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCicase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCicase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicaseContext cicase() throws RecognitionException {
		CicaseContext _localctx = new CicaseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cicase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(WHEN);
			setState(344);
			n6();
			setState(345);
			match(THEN);
			setState(346);
			match(P_OPEN);
			setState(347);
			sentencia();
			setState(348);
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
	public static class CaseStatementContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(gramaticaParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(gramaticaParser.CASE, i);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode END() { return getToken(gramaticaParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public List<CicaseContext> cicase() {
			return getRuleContexts(CicaseContext.class);
		}
		public CicaseContext cicase(int i) {
			return getRuleContext(CicaseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(gramaticaParser.ELSE, 0); }
		public TerminalNode P_OPEN() { return getToken(gramaticaParser.P_OPEN, 0); }
		public TerminalNode P_CLOSE() { return getToken(gramaticaParser.P_CLOSE, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_caseStatement);
		int _la;
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(CASE);
				setState(351);
				match(ID);
				setState(353); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(352);
					cicase();
					}
					}
					setState(355); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(357);
				match(END);
				setState(358);
				match(CASE);
				setState(359);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(CASE);
				setState(362);
				match(ID);
				setState(364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(363);
					cicase();
					}
					}
					setState(366); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(368);
				match(ELSE);
				setState(369);
				match(P_OPEN);
				setState(371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(370);
					sentencia();
					}
					}
					setState(373); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17454780644864L) != 0) );
				setState(375);
				match(P_CLOSE);
				setState(376);
				match(END);
				setState(377);
				match(CASE);
				setState(378);
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
	public static class ListparContext extends ParserRuleContext {
		public List<N5Context> n5() {
			return getRuleContexts(N5Context.class);
		}
		public N5Context n5(int i) {
			return getRuleContext(N5Context.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(gramaticaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(gramaticaParser.COLON, i);
		}
		public ListparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listpar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListpar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListparContext listpar() throws RecognitionException {
		ListparContext _localctx = new ListparContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_listpar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			n5();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(383);
				match(COLON);
				setState(384);
				n5();
				}
				}
				setState(389);
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
	public static class ListinstContext extends ParserRuleContext {
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public ForloopsContext forloops() {
			return getRuleContext(ForloopsContext.class,0);
		}
		public WhilesContext whiles() {
			return getRuleContext(WhilesContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public ListinstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listinst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListinst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListinst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListinst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListinstContext listinst() throws RecognitionException {
		ListinstContext _localctx = new ListinstContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_listinst);
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				define();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				operacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				sentencia();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				forloops();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(394);
				whiles();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(395);
				caseStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(396);
				repeat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(397);
				procedure();
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
	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROC() { return getToken(gramaticaParser.PROC, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode P_OPEN() { return getToken(gramaticaParser.P_OPEN, 0); }
		public TerminalNode P_CLOSE() { return getToken(gramaticaParser.P_CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public TerminalNode END() { return getToken(gramaticaParser.END, 0); }
		public ListparContext listpar() {
			return getRuleContext(ListparContext.class,0);
		}
		public List<ListinstContext> listinst() {
			return getRuleContexts(ListinstContext.class);
		}
		public ListinstContext listinst(int i) {
			return getRuleContext(ListinstContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(PROC);
			setState(401);
			match(ID);
			setState(402);
			match(PAR_OPEN);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 7L) != 0)) {
				{
				setState(403);
				listpar();
				}
			}

			setState(406);
			match(PAR_CLOSE);
			setState(407);
			match(P_OPEN);
			setState(409); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(408);
				listinst();
				}
				}
				setState(411); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17498300743440L) != 0) );
			setState(413);
			match(P_CLOSE);
			setState(414);
			match(SEMICOLON);
			setState(415);
			match(END);
			setState(416);
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(gramaticaParser.MAIN, 0); }
		public List<TerminalNode> PAR_OPEN() { return getTokens(gramaticaParser.PAR_OPEN); }
		public TerminalNode PAR_OPEN(int i) {
			return getToken(gramaticaParser.PAR_OPEN, i);
		}
		public List<TerminalNode> PAR_CLOSE() { return getTokens(gramaticaParser.PAR_CLOSE); }
		public TerminalNode PAR_CLOSE(int i) {
			return getToken(gramaticaParser.PAR_CLOSE, i);
		}
		public TerminalNode P_OPEN() { return getToken(gramaticaParser.P_OPEN, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode P_CLOSE() { return getToken(gramaticaParser.P_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode END() { return getToken(gramaticaParser.END, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(MAIN);
			setState(419);
			match(PAR_OPEN);
			setState(420);
			match(PAR_CLOSE);
			setState(421);
			match(P_OPEN);
			setState(422);
			match(ID);
			setState(423);
			match(PAR_OPEN);
			setState(424);
			match(PAR_CLOSE);
			setState(425);
			match(P_CLOSE);
			setState(426);
			match(SEMICOLON);
			setState(427);
			match(END);
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
	public static class CommentsContext extends ParserRuleContext {
		public TerminalNode COM() { return getToken(gramaticaParser.COM, 0); }
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitComments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_comments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(COM);
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
	public static class ProcedureSectionContext extends ParserRuleContext {
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public List<CommentsContext> comments() {
			return getRuleContexts(CommentsContext.class);
		}
		public CommentsContext comments(int i) {
			return getRuleContext(CommentsContext.class,i);
		}
		public ProcedureSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProcedureSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProcedureSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProcedureSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureSectionContext procedureSection() throws RecognitionException {
		ProcedureSectionContext _localctx = new ProcedureSectionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_procedureSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COM) {
					{
					setState(431);
					comments();
					}
				}

				setState(434);
				procedure();
				}
				}
				setState(437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROC || _la==COM );
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
	public static class ProgramContext extends ParserRuleContext {
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public ProcedureSectionContext procedureSection() {
			return getRuleContext(ProcedureSectionContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
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
		enterRule(_localctx, 88, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			comments();
			setState(440);
			procedureSection();
			setState(441);
			main();
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
		"\u0004\u0001B\u01bc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002h\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003m\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005u\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0086\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0095\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0127\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0004!\u0133\b!\u000b!\f!\u0134\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0004"+
		"\"\u0142\b\"\u000b\"\f\"\u0143\u0001\"\u0001\"\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0001#\u0004#\u014d\b#\u000b#\f#\u014e\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0004%\u0162\b%\u000b%\f%\u0163\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0004%\u016d\b%\u000b%\f%\u016e\u0001%\u0001"+
		"%\u0001%\u0004%\u0174\b%\u000b%\f%\u0175\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u017d\b%\u0001&\u0001&\u0001&\u0005&\u0182\b&\n&\f&\u0185\t&"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u018f\b\'\u0001(\u0001(\u0001(\u0001(\u0003(\u0195\b(\u0001(\u0001"+
		"(\u0001(\u0004(\u019a\b(\u000b(\f(\u019b\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001+\u0003+\u01b1\b+\u0001+\u0004+\u01b4\b+\u000b"+
		"+\f+\u01b5\u0001,\u0001,\u0001,\u0001,\u0001,\u0000\u0000-\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVX\u0000\u0003\u0002\u0000??AA\u0001\u0000"+
		"@A\u0001\u0000?A\u01bf\u0000Z\u0001\u0000\u0000\u0000\u0002b\u0001\u0000"+
		"\u0000\u0000\u0004g\u0001\u0000\u0000\u0000\u0006l\u0001\u0000\u0000\u0000"+
		"\bn\u0001\u0000\u0000\u0000\nt\u0001\u0000\u0000\u0000\fv\u0001\u0000"+
		"\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010\u0085\u0001\u0000\u0000"+
		"\u0000\u0012\u0094\u0001\u0000\u0000\u0000\u0014\u0096\u0001\u0000\u0000"+
		"\u0000\u0016\u009e\u0001\u0000\u0000\u0000\u0018\u00a6\u0001\u0000\u0000"+
		"\u0000\u001a\u00ae\u0001\u0000\u0000\u0000\u001c\u00b6\u0001\u0000\u0000"+
		"\u0000\u001e\u00be\u0001\u0000\u0000\u0000 \u00c4\u0001\u0000\u0000\u0000"+
		"\"\u00cc\u0001\u0000\u0000\u0000$\u00d4\u0001\u0000\u0000\u0000&\u00dc"+
		"\u0001\u0000\u0000\u0000(\u00e4\u0001\u0000\u0000\u0000*\u00ec\u0001\u0000"+
		"\u0000\u0000,\u00f0\u0001\u0000\u0000\u0000.\u00f4\u0001\u0000\u0000\u0000"+
		"0\u00f8\u0001\u0000\u0000\u00002\u00fc\u0001\u0000\u0000\u00004\u0104"+
		"\u0001\u0000\u0000\u00006\u0108\u0001\u0000\u0000\u00008\u010c\u0001\u0000"+
		"\u0000\u0000:\u0110\u0001\u0000\u0000\u0000<\u0113\u0001\u0000\u0000\u0000"+
		">\u0116\u0001\u0000\u0000\u0000@\u0126\u0001\u0000\u0000\u0000B\u0128"+
		"\u0001\u0000\u0000\u0000D\u013b\u0001\u0000\u0000\u0000F\u0149\u0001\u0000"+
		"\u0000\u0000H\u0157\u0001\u0000\u0000\u0000J\u017c\u0001\u0000\u0000\u0000"+
		"L\u017e\u0001\u0000\u0000\u0000N\u018e\u0001\u0000\u0000\u0000P\u0190"+
		"\u0001\u0000\u0000\u0000R\u01a2\u0001\u0000\u0000\u0000T\u01ad\u0001\u0000"+
		"\u0000\u0000V\u01b3\u0001\u0000\u0000\u0000X\u01b7\u0001\u0000\u0000\u0000"+
		"Z[\u0005\b\u0000\u0000[\\\u00059\u0000\u0000\\]\u0005@\u0000\u0000]^\u0005"+
		">\u0000\u0000^_\u0003\u0002\u0001\u0000_`\u0005:\u0000\u0000`a\u0005="+
		"\u0000\u0000a\u0001\u0001\u0000\u0000\u0000bc\u0007\u0000\u0000\u0000"+
		"c\u0003\u0001\u0000\u0000\u0000dh\u0005A\u0000\u0000eh\u0003\u0010\b\u0000"+
		"fh\u0005?\u0000\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"gf\u0001\u0000\u0000\u0000h\u0005\u0001\u0000\u0000\u0000im\u0005A\u0000"+
		"\u0000jm\u0003\u0010\b\u0000km\u0005@\u0000\u0000li\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m\u0007\u0001"+
		"\u0000\u0000\u0000no\u0007\u0001\u0000\u0000o\t\u0001\u0000\u0000\u0000"+
		"pu\u0005A\u0000\u0000qu\u0003\u0010\b\u0000ru\u0005@\u0000\u0000su\u0005"+
		"?\u0000\u0000tp\u0001\u0000\u0000\u0000tq\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000u\u000b\u0001\u0000\u0000"+
		"\u0000vw\u0007\u0002\u0000\u0000w\r\u0001\u0000\u0000\u0000xy\u0007\u0000"+
		"\u0000\u0000y\u000f\u0001\u0000\u0000\u0000z\u0086\u0003\u0012\t\u0000"+
		"{\u0086\u0003\u0014\n\u0000|\u0086\u0003\u0018\f\u0000}\u0086\u0003$\u0012"+
		"\u0000~\u0086\u0003&\u0013\u0000\u007f\u0086\u0003\u001a\r\u0000\u0080"+
		"\u0086\u0003\u001c\u000e\u0000\u0081\u0086\u0003\u001e\u000f\u0000\u0082"+
		"\u0086\u0003 \u0010\u0000\u0083\u0086\u0003\"\u0011\u0000\u0084\u0086"+
		"\u0003\u0016\u000b\u0000\u0085z\u0001\u0000\u0000\u0000\u0085{\u0001\u0000"+
		"\u0000\u0000\u0085|\u0001\u0000\u0000\u0000\u0085}\u0001\u0000\u0000\u0000"+
		"\u0085~\u0001\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085"+
		"\u0080\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0085"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0011\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005\n\u0000\u0000\u0088\u0089\u00059\u0000\u0000\u0089\u008a"+
		"\u0005@\u0000\u0000\u008a\u008b\u0005:\u0000\u0000\u008b\u0095\u0005="+
		"\u0000\u0000\u008c\u008d\u0005\n\u0000\u0000\u008d\u008e\u00059\u0000"+
		"\u0000\u008e\u008f\u0005@\u0000\u0000\u008f\u0090\u0005>\u0000\u0000\u0090"+
		"\u0091\u0003\u0006\u0003\u0000\u0091\u0092\u0005:\u0000\u0000\u0092\u0093"+
		"\u0005=\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0087\u0001"+
		"\u0000\u0000\u0000\u0094\u008c\u0001\u0000\u0000\u0000\u0095\u0013\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005*\u0000\u0000\u0097\u0098\u00059\u0000"+
		"\u0000\u0098\u0099\u0003\b\u0004\u0000\u0099\u009a\u0005>\u0000\u0000"+
		"\u009a\u009b\u0003\u0006\u0003\u0000\u009b\u009c\u0005:\u0000\u0000\u009c"+
		"\u009d\u0005=\u0000\u0000\u009d\u0015\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\r\u0000\u0000\u009f\u00a0\u00059\u0000\u0000\u00a0\u00a1\u0003"+
		"\b\u0004\u0000\u00a1\u00a2\u0005>\u0000\u0000\u00a2\u00a3\u0003\u0006"+
		"\u0003\u0000\u00a3\u00a4\u0005:\u0000\u0000\u00a4\u00a5\u0005=\u0000\u0000"+
		"\u00a5\u0017\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005%\u0000\u0000\u00a7"+
		"\u00a8\u00059\u0000\u0000\u00a8\u00a9\u0003\u0006\u0003\u0000\u00a9\u00aa"+
		"\u0005>\u0000\u0000\u00aa\u00ab\u0003\u0006\u0003\u0000\u00ab\u00ac\u0005"+
		":\u0000\u0000\u00ac\u00ad\u0005=\u0000\u0000\u00ad\u0019\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005(\u0000\u0000\u00af\u00b0\u00059\u0000\u0000\u00b0"+
		"\u00b1\u0003\u0006\u0003\u0000\u00b1\u00b2\u0005>\u0000\u0000\u00b2\u00b3"+
		"\u0003\u0006\u0003\u0000\u00b3\u00b4\u0005:\u0000\u0000\u00b4\u00b5\u0005"+
		"=\u0000\u0000\u00b5\u001b\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005)\u0000"+
		"\u0000\u00b7\u00b8\u00059\u0000\u0000\u00b8\u00b9\u0003\u0006\u0003\u0000"+
		"\u00b9\u00ba\u0005>\u0000\u0000\u00ba\u00bb\u0003\u0006\u0003\u0000\u00bb"+
		"\u00bc\u0005:\u0000\u0000\u00bc\u00bd\u0005=\u0000\u0000\u00bd\u001d\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005+\u0000\u0000\u00bf\u00c0\u00059\u0000"+
		"\u0000\u00c0\u00c1\u0003\b\u0004\u0000\u00c1\u00c2\u0005:\u0000\u0000"+
		"\u00c2\u00c3\u0005=\u0000\u0000\u00c3\u001f\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0005\u000b\u0000\u0000\u00c5\u00c6\u00059\u0000\u0000\u00c6\u00c7"+
		"\u0003\b\u0004\u0000\u00c7\u00c8\u0005>\u0000\u0000\u00c8\u00c9\u0003"+
		"\u0006\u0003\u0000\u00c9\u00ca\u0005:\u0000\u0000\u00ca\u00cb\u0005=\u0000"+
		"\u0000\u00cb!\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\f\u0000\u0000"+
		"\u00cd\u00ce\u00059\u0000\u0000\u00ce\u00cf\u0003\b\u0004\u0000\u00cf"+
		"\u00d0\u0005>\u0000\u0000\u00d0\u00d1\u0003\u0006\u0003\u0000\u00d1\u00d2"+
		"\u0005:\u0000\u0000\u00d2\u00d3\u0005=\u0000\u0000\u00d3#\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005&\u0000\u0000\u00d5\u00d6\u00059\u0000\u0000"+
		"\u00d6\u00d7\u0003\n\u0005\u0000\u00d7\u00d8\u0005>\u0000\u0000\u00d8"+
		"\u00d9\u0003\n\u0005\u0000\u00d9\u00da\u0005:\u0000\u0000\u00da\u00db"+
		"\u0005=\u0000\u0000\u00db%\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\'"+
		"\u0000\u0000\u00dd\u00de\u00059\u0000\u0000\u00de\u00df\u0003\n\u0005"+
		"\u0000\u00df\u00e0\u0005>\u0000\u0000\u00e0\u00e1\u0003\n\u0005\u0000"+
		"\u00e1\u00e2\u0005:\u0000\u0000\u00e2\u00e3\u0005=\u0000\u0000\u00e3\'"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\t\u0000\u0000\u00e5\u00e6\u0005"+
		"9\u0000\u0000\u00e6\u00e7\u0005@\u0000\u0000\u00e7\u00e8\u0005>\u0000"+
		"\u0000\u00e8\u00e9\u0003\u0004\u0002\u0000\u00e9\u00ea\u0005:\u0000\u0000"+
		"\u00ea\u00eb\u0005=\u0000\u0000\u00eb)\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0005\u000e\u0000\u0000\u00ed\u00ee\u0003\u0006\u0003\u0000\u00ee\u00ef"+
		"\u0005=\u0000\u0000\u00ef+\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u000f"+
		"\u0000\u0000\u00f1\u00f2\u0003\u0006\u0003\u0000\u00f2\u00f3\u0005=\u0000"+
		"\u0000\u00f3-\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0010\u0000\u0000"+
		"\u00f5\u00f6\u0003\u0006\u0003\u0000\u00f6\u00f7\u0005=\u0000\u0000\u00f7"+
		"/\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0011\u0000\u0000\u00f9\u00fa"+
		"\u0003\u0006\u0003\u0000\u00fa\u00fb\u0005=\u0000\u0000\u00fb1\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0005\u0012\u0000\u0000\u00fd\u00fe\u00059\u0000"+
		"\u0000\u00fe\u00ff\u0003\u0006\u0003\u0000\u00ff\u0100\u0005>\u0000\u0000"+
		"\u0100\u0101\u0003\u0006\u0003\u0000\u0101\u0102\u0005:\u0000\u0000\u0102"+
		"\u0103\u0005=\u0000\u0000\u01033\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"\u0013\u0000\u0000\u0105\u0106\u0003\u0006\u0003\u0000\u0106\u0107\u0005"+
		"=\u0000\u0000\u01075\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0014\u0000"+
		"\u0000\u0109\u010a\u0003\u0006\u0003\u0000\u010a\u010b\u0005=\u0000\u0000"+
		"\u010b7\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0015\u0000\u0000\u010d"+
		"\u010e\u0005A\u0000\u0000\u010e\u010f\u0005=\u0000\u0000\u010f9\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0005\u0016\u0000\u0000\u0111\u0112\u0005"+
		"=\u0000\u0000\u0112;\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0017\u0000"+
		"\u0000\u0114\u0115\u0005=\u0000\u0000\u0115=\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0005\u0018\u0000\u0000\u0117\u0118\u0005=\u0000\u0000\u0118?\u0001"+
		"\u0000\u0000\u0000\u0119\u0127\u0003\u0010\b\u0000\u011a\u0127\u0003("+
		"\u0014\u0000\u011b\u0127\u0003*\u0015\u0000\u011c\u0127\u0003,\u0016\u0000"+
		"\u011d\u0127\u00030\u0018\u0000\u011e\u0127\u0003.\u0017\u0000\u011f\u0127"+
		"\u00032\u0019\u0000\u0120\u0127\u00034\u001a\u0000\u0121\u0127\u00036"+
		"\u001b\u0000\u0122\u0127\u00038\u001c\u0000\u0123\u0127\u0003:\u001d\u0000"+
		"\u0124\u0127\u0003<\u001e\u0000\u0125\u0127\u0003>\u001f\u0000\u0126\u0119"+
		"\u0001\u0000\u0000\u0000\u0126\u011a\u0001\u0000\u0000\u0000\u0126\u011b"+
		"\u0001\u0000\u0000\u0000\u0126\u011c\u0001\u0000\u0000\u0000\u0126\u011d"+
		"\u0001\u0000\u0000\u0000\u0126\u011e\u0001\u0000\u0000\u0000\u0126\u011f"+
		"\u0001\u0000\u0000\u0000\u0126\u0120\u0001\u0000\u0000\u0000\u0126\u0121"+
		"\u0001\u0000\u0000\u0000\u0126\u0122\u0001\u0000\u0000\u0000\u0126\u0123"+
		"\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125"+
		"\u0001\u0000\u0000\u0000\u0127A\u0001\u0000\u0000\u0000\u0128\u0129\u0005"+
		"\u0019\u0000\u0000\u0129\u012a\u0005@\u0000\u0000\u012a\u012b\u00059\u0000"+
		"\u0000\u012b\u012c\u0005A\u0000\u0000\u012c\u012d\u0005\u001c\u0000\u0000"+
		"\u012d\u012e\u0005A\u0000\u0000\u012e\u012f\u0005:\u0000\u0000\u012f\u0130"+
		"\u0005\u001a\u0000\u0000\u0130\u0132\u0005;\u0000\u0000\u0131\u0133\u0003"+
		"@ \u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0005<\u0000\u0000"+
		"\u0137\u0138\u0005\u001b\u0000\u0000\u0138\u0139\u0005\u001a\u0000\u0000"+
		"\u0139\u013a\u0005=\u0000\u0000\u013aC\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0005#\u0000\u0000\u013c\u013d\u0005;\u0000\u0000\u013d\u013e\u0003\u0006"+
		"\u0003\u0000\u013e\u013f\u0005<\u0000\u0000\u013f\u0141\u0005;\u0000\u0000"+
		"\u0140\u0142\u0003@ \u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0005<\u0000\u0000\u0146\u0147\u0005$\u0000\u0000\u0147\u0148\u0005="+
		"\u0000\u0000\u0148E\u0001\u0000\u0000\u0000\u0149\u014a\u0005!\u0000\u0000"+
		"\u014a\u014c\u0005;\u0000\u0000\u014b\u014d\u0003@ \u0000\u014c\u014b"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014c"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0005<\u0000\u0000\u0151\u0152\u0005"+
		"\"\u0000\u0000\u0152\u0153\u0005<\u0000\u0000\u0153\u0154\u0003\u0006"+
		"\u0003\u0000\u0154\u0155\u0005<\u0000\u0000\u0155\u0156\u0005=\u0000\u0000"+
		"\u0156G\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u001e\u0000\u0000\u0158"+
		"\u0159\u0003\u000e\u0007\u0000\u0159\u015a\u0005\u001f\u0000\u0000\u015a"+
		"\u015b\u0005;\u0000\u0000\u015b\u015c\u0003@ \u0000\u015c\u015d\u0005"+
		"<\u0000\u0000\u015dI\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u001d\u0000"+
		"\u0000\u015f\u0161\u0005@\u0000\u0000\u0160\u0162\u0003H$\u0000\u0161"+
		"\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u001b\u0000\u0000\u0166"+
		"\u0167\u0005\u001d\u0000\u0000\u0167\u0168\u0005=\u0000\u0000\u0168\u017d"+
		"\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u001d\u0000\u0000\u016a\u016c"+
		"\u0005@\u0000\u0000\u016b\u016d\u0003H$\u0000\u016c\u016b\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0005 \u0000\u0000\u0171\u0173\u0005;\u0000\u0000"+
		"\u0172\u0174\u0003@ \u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0005<\u0000\u0000\u0178\u0179\u0005\u001b\u0000\u0000\u0179\u017a\u0005"+
		"\u001d\u0000\u0000\u017a\u017b\u0005=\u0000\u0000\u017b\u017d\u0001\u0000"+
		"\u0000\u0000\u017c\u015e\u0001\u0000\u0000\u0000\u017c\u0169\u0001\u0000"+
		"\u0000\u0000\u017dK\u0001\u0000\u0000\u0000\u017e\u0183\u0003\f\u0006"+
		"\u0000\u017f\u0180\u0005>\u0000\u0000\u0180\u0182\u0003\f\u0006\u0000"+
		"\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000\u0000\u0000"+
		"\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000"+
		"\u0184M\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186"+
		"\u018f\u0003\u0000\u0000\u0000\u0187\u018f\u0003\u0010\b\u0000\u0188\u018f"+
		"\u0003@ \u0000\u0189\u018f\u0003B!\u0000\u018a\u018f\u0003D\"\u0000\u018b"+
		"\u018f\u0003J%\u0000\u018c\u018f\u0003F#\u0000\u018d\u018f\u0003P(\u0000"+
		"\u018e\u0186\u0001\u0000\u0000\u0000\u018e\u0187\u0001\u0000\u0000\u0000"+
		"\u018e\u0188\u0001\u0000\u0000\u0000\u018e\u0189\u0001\u0000\u0000\u0000"+
		"\u018e\u018a\u0001\u0000\u0000\u0000\u018e\u018b\u0001\u0000\u0000\u0000"+
		"\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000"+
		"\u018fO\u0001\u0000\u0000\u0000\u0190\u0191\u0005\u0004\u0000\u0000\u0191"+
		"\u0192\u0005@\u0000\u0000\u0192\u0194\u00059\u0000\u0000\u0193\u0195\u0003"+
		"L&\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0197\u0005:\u0000\u0000"+
		"\u0197\u0199\u0005;\u0000\u0000\u0198\u019a\u0003N\'\u0000\u0199\u0198"+
		"\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u0199"+
		"\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d"+
		"\u0001\u0000\u0000\u0000\u019d\u019e\u0005<\u0000\u0000\u019e\u019f\u0005"+
		"=\u0000\u0000\u019f\u01a0\u0005\u001b\u0000\u0000\u01a0\u01a1\u0005=\u0000"+
		"\u0000\u01a1Q\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\u0001\u0000\u0000"+
		"\u01a3\u01a4\u00059\u0000\u0000\u01a4\u01a5\u0005:\u0000\u0000\u01a5\u01a6"+
		"\u0005;\u0000\u0000\u01a6\u01a7\u0005@\u0000\u0000\u01a7\u01a8\u00059"+
		"\u0000\u0000\u01a8\u01a9\u0005:\u0000\u0000\u01a9\u01aa\u0005<\u0000\u0000"+
		"\u01aa\u01ab\u0005=\u0000\u0000\u01ab\u01ac\u0005\u001b\u0000\u0000\u01ac"+
		"S\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005\u0005\u0000\u0000\u01aeU\u0001"+
		"\u0000\u0000\u0000\u01af\u01b1\u0003T*\u0000\u01b0\u01af\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b4\u0003P(\u0000\u01b3\u01b0\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b6W\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0003T*\u0000\u01b8\u01b9\u0003V+\u0000\u01b9\u01ba\u0003R)\u0000\u01ba"+
		"Y\u0001\u0000\u0000\u0000\u0013glt\u0085\u0094\u0126\u0134\u0143\u014e"+
		"\u0163\u016e\u0175\u017c\u0183\u018e\u0194\u019b\u01b0\u01b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}