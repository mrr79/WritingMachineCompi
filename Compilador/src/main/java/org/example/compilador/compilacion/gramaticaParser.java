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
		MAIN=1, PRINTLN=2, CALL=3, PROC=4, COM=5, RIGHT=6, LEFT=7, DEF=8, PUT=9, 
		ADDO=10, MULTO=11, DIVO=12, SUMO=13, CUP=14, CDOWN=15, CRIGHT=16, CLEFT=17, 
		POS=18, POSX=19, POSY=20, COLOR=21, DOWN=22, UP=23, BEG=24, FOR=25, LOOP=26, 
		ENDMIN=27, END=28, TO=29, CASE=30, WHEN=31, THEN=32, ELSE=33, REPEAT=34, 
		UNTIL=35, WHILE=36, WHEND=37, EQUAL=38, AND=39, OR=40, GREATER=41, SMALLER=42, 
		SUBSTR=43, RANDOM=44, PLUS=45, MINUS=46, MULT=47, DIV=48, GT=49, LT=50, 
		GEQ=51, LEQ=52, EQ=53, NEQ=54, ASSIGN=55, BRACKET_OPEN=56, BRACKET_CLOSE=57, 
		PAR_OPEN=58, PAR_CLOSE=59, P_OPEN=60, P_CLOSE=61, SEMICOLON=62, COLON=63, 
		BOOLEAN=64, ID=65, NUMBER=66, WS=67;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_comments = 2, RULE_calls = 3, RULE_proc = 4, 
		RULE_varial = 5, RULE_right = 6, RULE_left = 7, RULE_sentence = 8, RULE_operation = 9, 
		RULE_logical = 10, RULE_define = 11, RULE_put = 12, RULE_add = 13, RULE_continueup = 14, 
		RULE_continuedown = 15, RULE_continueright = 16, RULE_continueleft = 17, 
		RULE_pos = 18, RULE_posx = 19, RULE_posy = 20, RULE_color = 21, RULE_down = 22, 
		RULE_up = 23, RULE_beggining = 24, RULE_fory = 25, RULE_cases = 26, RULE_when = 27, 
		RULE_elses = 28, RULE_repeat = 29, RULE_whiles = 30, RULE_repeadtcond = 31, 
		RULE_cond = 32, RULE_equations = 33, RULE_equal = 34, RULE_and = 35, RULE_or = 36, 
		RULE_greater = 37, RULE_smaller = 38, RULE_values = 39, RULE_substr = 40, 
		RULE_mult = 41, RULE_div = 42, RULE_sum = 43, RULE_random = 44, RULE_expression = 45, 
		RULE_factor = 46, RULE_term = 47, RULE_logic = 48, RULE_num = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "comments", "calls", "proc", "varial", "right", "left", 
			"sentence", "operation", "logical", "define", "put", "add", "continueup", 
			"continuedown", "continueright", "continueleft", "pos", "posx", "posy", 
			"color", "down", "up", "beggining", "fory", "cases", "when", "elses", 
			"repeat", "whiles", "repeadtcond", "cond", "equations", "equal", "and", 
			"or", "greater", "smaller", "values", "substr", "mult", "div", "sum", 
			"random", "expression", "factor", "term", "logic", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'println'", "'call'", "'Proc'", "'//'", "'TurnRight'", 
			"'TurnLeft'", null, null, null, "'Mult'", "'Div'", "'Sum'", "'ContinueUp'", 
			"'ContinueDown'", "'ContinueRight'", "'ContinueLeft'", "'Pos'", "'PosX'", 
			"'PosY'", "'UseColor'", "'Down'", "'Up'", "'Beginning'", "'For'", "'Loop'", 
			"'end'", "'End'", "'to'", null, "'When'", "'Then'", "'Else'", "'Repeat'", 
			"'Until'", "'While'", "'Whend'", "'Equal'", "'And'", null, "'Greater'", 
			"'Smaller'", "'Substr'", "'Random'", "'+'", "'-'", "'*'", "'/'", "'>'", 
			"'<'", "'>='", "'<='", "'=='", "'!='", "'='", "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "PRINTLN", "CALL", "PROC", "COM", "RIGHT", "LEFT", "DEF", 
			"PUT", "ADDO", "MULTO", "DIVO", "SUMO", "CUP", "CDOWN", "CRIGHT", "CLEFT", 
			"POS", "POSX", "POSY", "COLOR", "DOWN", "UP", "BEG", "FOR", "LOOP", "ENDMIN", 
			"END", "TO", "CASE", "WHEN", "THEN", "ELSE", "REPEAT", "UNTIL", "WHILE", 
			"WHEND", "EQUAL", "AND", "OR", "GREATER", "SMALLER", "SUBSTR", "RANDOM", 
			"PLUS", "MINUS", "MULT", "DIV", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", 
			"ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "P_OPEN", 
			"P_CLOSE", "SEMICOLON", "COLON", "BOOLEAN", "ID", "NUMBER", "WS"
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
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686105467570170L) != 0)) {
				{
				{
				setState(100);
				sentence();
				}
				}
				setState(105);
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(gramaticaParser.MAIN, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode P_OPEN() { return getToken(gramaticaParser.P_OPEN, 0); }
		public TerminalNode P_CLOSE() { return getToken(gramaticaParser.P_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
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
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(MAIN);
			setState(107);
			match(PAR_OPEN);
			setState(108);
			match(PAR_CLOSE);
			setState(109);
			match(P_OPEN);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686105467570170L) != 0)) {
				{
				{
				setState(110);
				sentence();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
	public static class CommentsContext extends ParserRuleContext {
		public TerminalNode COM() { return getToken(gramaticaParser.COM, 0); }
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
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
		enterRule(_localctx, 4, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(COM);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(119);
				match(ID);
				}
				}
				setState(124);
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
	public static class CallsContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(gramaticaParser.CALL, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public List<VarialContext> varial() {
			return getRuleContexts(VarialContext.class);
		}
		public VarialContext varial(int i) {
			return getRuleContext(VarialContext.class,i);
		}
		public CallsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCalls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCalls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCalls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallsContext calls() throws RecognitionException {
		CallsContext _localctx = new CallsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_calls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(CALL);
			setState(126);
			match(ID);
			setState(127);
			match(PAR_OPEN);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(128);
				varial();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(PAR_CLOSE);
			setState(135);
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
	public static class ProcContext extends ParserRuleContext {
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
		public TerminalNode ENDMIN() { return getToken(gramaticaParser.ENDMIN, 0); }
		public List<VarialContext> varial() {
			return getRuleContexts(VarialContext.class);
		}
		public VarialContext varial(int i) {
			return getRuleContext(VarialContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_proc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(PROC);
			setState(138);
			match(ID);
			setState(139);
			match(PAR_OPEN);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(140);
				varial();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(PAR_CLOSE);
			setState(147);
			match(P_OPEN);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686105467570170L) != 0)) {
				{
				{
				setState(148);
				sentence();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(P_CLOSE);
			setState(155);
			match(SEMICOLON);
			setState(156);
			match(ENDMIN);
			setState(157);
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
	public static class VarialContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public VarialContext varial() {
			return getRuleContext(VarialContext.class,0);
		}
		public VarialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarialContext varial() throws RecognitionException {
		VarialContext _localctx = new VarialContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varial);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(ID);
				setState(160);
				match(COLON);
				setState(161);
				varial();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(ID);
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
	public static class RightContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(gramaticaParser.RIGHT, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_right);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(RIGHT);
				setState(166);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(RIGHT);
				setState(168);
				values();
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
	public static class LeftContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(gramaticaParser.LEFT, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public LeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_left);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(LEFT);
				setState(172);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(LEFT);
				setState(174);
				values();
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
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public CallsContext calls() {
			return getRuleContext(CallsContext.class,0);
		}
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public LeftContext left() {
			return getRuleContext(LeftContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 16, RULE_sentence);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				define();
				}
				break;
			case PUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				put();
				}
				break;
			case ADDO:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				add();
				}
				break;
			case CUP:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				continueup();
				}
				break;
			case CDOWN:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				continuedown();
				}
				break;
			case CRIGHT:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				continueright();
				}
				break;
			case CLEFT:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				continueleft();
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 8);
				{
				setState(184);
				pos();
				}
				break;
			case POSX:
				enterOuterAlt(_localctx, 9);
				{
				setState(185);
				posx();
				}
				break;
			case POSY:
				enterOuterAlt(_localctx, 10);
				{
				setState(186);
				posy();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 11);
				{
				setState(187);
				color();
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 12);
				{
				setState(188);
				down();
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 13);
				{
				setState(189);
				up();
				}
				break;
			case BEG:
				enterOuterAlt(_localctx, 14);
				{
				setState(190);
				beggining();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 15);
				{
				setState(191);
				fory();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 16);
				{
				setState(192);
				cases();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 17);
				{
				setState(193);
				repeat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 18);
				{
				setState(194);
				whiles();
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 19);
				{
				setState(195);
				comments();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 20);
				{
				setState(196);
				main();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 21);
				{
				setState(197);
				calls();
				}
				break;
			case PROC:
				enterOuterAlt(_localctx, 22);
				{
				setState(198);
				proc();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 23);
				{
				setState(199);
				right();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 24);
				{
				setState(200);
				left();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 25);
				{
				setState(201);
				match(SEMICOLON);
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
	public static class OperationContext extends ParserRuleContext {
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
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
		enterRule(_localctx, 18, RULE_operation);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
			case AND:
			case OR:
			case GREATER:
			case SMALLER:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				logical();
				}
				break;
			case SUBSTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				substr();
				}
				break;
			case RANDOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				random();
				}
				break;
			case MULTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				mult();
				}
				break;
			case DIVO:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				div();
				}
				break;
			case SUMO:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
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
		enterRule(_localctx, 20, RULE_logical);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				equal();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				and();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				or();
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				greater();
				}
				break;
			case SMALLER:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
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
		enterRule(_localctx, 22, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(DEF);
			setState(220);
			match(PAR_OPEN);
			setState(221);
			match(ID);
			setState(222);
			match(COLON);
			setState(223);
			logic();
			setState(224);
			match(PAR_CLOSE);
			setState(225);
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
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 24, RULE_put);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(PUT);
				setState(228);
				match(PAR_OPEN);
				setState(229);
				match(ID);
				setState(230);
				match(COLON);
				setState(231);
				logic();
				setState(232);
				match(PAR_CLOSE);
				setState(233);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(PUT);
				setState(236);
				match(PAR_OPEN);
				setState(237);
				match(ID);
				setState(238);
				match(COLON);
				setState(239);
				operation();
				setState(240);
				match(PAR_CLOSE);
				setState(241);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(PUT);
				setState(244);
				match(PAR_OPEN);
				setState(245);
				match(ID);
				setState(246);
				match(COLON);
				setState(247);
				expression();
				setState(248);
				match(PAR_CLOSE);
				setState(249);
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
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
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
		enterRule(_localctx, 26, RULE_add);
		try {
			int _alt;
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(ADDO);
				setState(254);
				match(PAR_OPEN);
				setState(255);
				match(ID);
				setState(256);
				match(PAR_CLOSE);
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(257);
						match(SEMICOLON);
						}
						} 
					}
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(ADDO);
				setState(264);
				match(PAR_OPEN);
				setState(265);
				match(ID);
				setState(266);
				match(COLON);
				setState(267);
				values();
				setState(268);
				match(PAR_CLOSE);
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(269);
						match(SEMICOLON);
						}
						} 
					}
					setState(274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class ContinueupContext extends ParserRuleContext {
		public TerminalNode CUP() { return getToken(gramaticaParser.CUP, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
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
		enterRule(_localctx, 28, RULE_continueup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(CUP);
			setState(278);
			values();
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
	public static class ContinuedownContext extends ParserRuleContext {
		public TerminalNode CDOWN() { return getToken(gramaticaParser.CDOWN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
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
		enterRule(_localctx, 30, RULE_continuedown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(CDOWN);
			setState(282);
			values();
			setState(283);
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
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
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
		enterRule(_localctx, 32, RULE_continueright);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(CRIGHT);
			setState(286);
			values();
			setState(287);
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
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
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
		enterRule(_localctx, 34, RULE_continueleft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(CLEFT);
			setState(290);
			values();
			setState(291);
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
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
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
		enterRule(_localctx, 36, RULE_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(POS);
			setState(294);
			match(PAR_OPEN);
			setState(295);
			values();
			setState(296);
			match(COLON);
			setState(297);
			values();
			setState(298);
			match(PAR_CLOSE);
			setState(299);
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
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
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
		enterRule(_localctx, 38, RULE_posx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(POSX);
			setState(302);
			values();
			setState(303);
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
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
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
		enterRule(_localctx, 40, RULE_posy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(POSY);
			setState(306);
			values();
			setState(307);
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
		enterRule(_localctx, 42, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(COLOR);
			setState(310);
			match(NUMBER);
			setState(311);
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
		enterRule(_localctx, 44, RULE_down);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(DOWN);
			setState(314);
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
		enterRule(_localctx, 46, RULE_up);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(UP);
			setState(317);
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
		enterRule(_localctx, 48, RULE_beggining);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(BEG);
			setState(320);
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
		enterRule(_localctx, 50, RULE_fory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(FOR);
			setState(323);
			match(ID);
			setState(324);
			match(PAR_OPEN);
			setState(325);
			match(NUMBER);
			setState(326);
			match(TO);
			setState(327);
			match(NUMBER);
			setState(328);
			match(PAR_CLOSE);
			setState(329);
			match(LOOP);
			setState(330);
			match(P_OPEN);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686105467570170L) != 0)) {
				{
				{
				setState(331);
				sentence();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			match(P_CLOSE);
			setState(338);
			match(END);
			setState(339);
			match(LOOP);
			setState(340);
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
		enterRule(_localctx, 52, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(CASE);
			setState(343);
			match(ID);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(344);
				when();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(350);
				elses();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			match(END);
			setState(357);
			match(CASE);
			setState(358);
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
		enterRule(_localctx, 54, RULE_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(WHEN);
			setState(361);
			logic();
			setState(362);
			match(THEN);
			setState(363);
			match(P_OPEN);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686105467570170L) != 0)) {
				{
				{
				setState(364);
				sentence();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
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
		enterRule(_localctx, 56, RULE_elses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(ELSE);
			setState(373);
			match(P_OPEN);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686105467570170L) != 0)) {
				{
				{
				setState(374);
				sentence();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
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
		public RepeadtcondContext repeadtcond() {
			return getRuleContext(RepeadtcondContext.class,0);
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
		enterRule(_localctx, 58, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(REPEAT);
			setState(383);
			match(P_OPEN);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686105467570170L) != 0)) {
				{
				{
				setState(384);
				sentence();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			match(P_CLOSE);
			setState(391);
			match(UNTIL);
			setState(392);
			match(P_OPEN);
			setState(393);
			repeadtcond();
			setState(394);
			match(P_CLOSE);
			setState(395);
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
		public RepeadtcondContext repeadtcond() {
			return getRuleContext(RepeadtcondContext.class,0);
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
		enterRule(_localctx, 60, RULE_whiles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(WHILE);
			setState(398);
			match(P_OPEN);
			setState(399);
			repeadtcond();
			setState(400);
			match(P_CLOSE);
			setState(401);
			match(P_OPEN);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686105467570170L) != 0)) {
				{
				{
				setState(402);
				sentence();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(P_CLOSE);
			setState(409);
			match(WHEND);
			setState(410);
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
	public static class RepeadtcondContext extends ParserRuleContext {
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public EquationsContext equations() {
			return getRuleContext(EquationsContext.class,0);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public RepeadtcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeadtcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRepeadtcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRepeadtcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRepeadtcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeadtcondContext repeadtcond() throws RecognitionException {
		RepeadtcondContext _localctx = new RepeadtcondContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_repeadtcond);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				num();
				setState(413);
				equations();
				setState(414);
				num();
				}
				break;
			case EQUAL:
			case AND:
			case OR:
			case GREATER:
			case SMALLER:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
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
	public static class CondContext extends ParserRuleContext {
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public EquationsContext equations() {
			return getRuleContext(EquationsContext.class,0);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(gramaticaParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cond);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				num();
				setState(421);
				equations();
				setState(422);
				num();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				logical();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				match(BOOLEAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
				match(ID);
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
	public static class EquationsContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(gramaticaParser.GT, 0); }
		public TerminalNode LT() { return getToken(gramaticaParser.LT, 0); }
		public TerminalNode GEQ() { return getToken(gramaticaParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(gramaticaParser.LEQ, 0); }
		public TerminalNode EQ() { return getToken(gramaticaParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(gramaticaParser.NEQ, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
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
		enterRule(_localctx, 66, RULE_equations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 71494644084506624L) != 0)) ) {
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
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
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
		enterRule(_localctx, 68, RULE_equal);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(EQUAL);
			setState(432);
			match(PAR_OPEN);
			setState(433);
			values();
			setState(434);
			match(COLON);
			setState(435);
			values();
			setState(436);
			match(PAR_CLOSE);
			setState(440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(437);
					match(SEMICOLON);
					}
					} 
				}
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(gramaticaParser.AND, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
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
		enterRule(_localctx, 70, RULE_and);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(AND);
			setState(444);
			match(PAR_OPEN);
			setState(445);
			cond();
			setState(446);
			match(COLON);
			setState(447);
			cond();
			setState(448);
			match(PAR_CLOSE);
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(449);
					match(SEMICOLON);
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
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
		enterRule(_localctx, 72, RULE_or);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(OR);
			setState(456);
			match(PAR_OPEN);
			setState(457);
			cond();
			setState(458);
			match(COLON);
			setState(459);
			cond();
			setState(460);
			match(PAR_CLOSE);
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(461);
					match(SEMICOLON);
					}
					} 
				}
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
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
		enterRule(_localctx, 74, RULE_greater);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(GREATER);
			setState(468);
			match(PAR_OPEN);
			setState(469);
			values();
			setState(470);
			match(COLON);
			setState(471);
			values();
			setState(472);
			match(PAR_CLOSE);
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(473);
					match(SEMICOLON);
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(gramaticaParser.PAR_CLOSE, 0); }
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
		enterRule(_localctx, 76, RULE_smaller);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(SMALLER);
			setState(480);
			match(PAR_OPEN);
			setState(481);
			values();
			setState(482);
			match(COLON);
			setState(483);
			values();
			setState(484);
			match(PAR_CLOSE);
			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(485);
					match(SEMICOLON);
					}
					} 
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
	public static class ValuesContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_values);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
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
	public static class SubstrContext extends ParserRuleContext {
		public TerminalNode SUBSTR() { return getToken(gramaticaParser.SUBSTR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(gramaticaParser.PAR_OPEN, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
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
		enterRule(_localctx, 80, RULE_substr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(SUBSTR);
			setState(497);
			match(PAR_OPEN);
			setState(498);
			values();
			setState(499);
			match(COLON);
			setState(500);
			values();
			setState(501);
			match(PAR_CLOSE);
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(502);
					match(SEMICOLON);
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
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
		enterRule(_localctx, 82, RULE_mult);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(MULTO);
			setState(509);
			match(PAR_OPEN);
			setState(510);
			values();
			setState(511);
			match(COLON);
			setState(512);
			values();
			setState(513);
			match(PAR_CLOSE);
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(514);
					match(SEMICOLON);
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
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
		enterRule(_localctx, 84, RULE_div);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(DIVO);
			setState(521);
			match(PAR_OPEN);
			setState(522);
			values();
			setState(523);
			match(COLON);
			setState(524);
			values();
			setState(525);
			match(PAR_CLOSE);
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(526);
					match(SEMICOLON);
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
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
		enterRule(_localctx, 86, RULE_sum);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(SUMO);
			setState(533);
			match(PAR_OPEN);
			setState(534);
			values();
			setState(535);
			match(COLON);
			setState(536);
			values();
			setState(537);
			match(PAR_CLOSE);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(538);
					match(SEMICOLON);
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 88, RULE_random);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(RANDOM);
			setState(545);
			match(PAR_OPEN);
			setState(546);
			expression();
			setState(547);
			match(PAR_CLOSE);
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(548);
					match(SEMICOLON);
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(gramaticaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(gramaticaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(gramaticaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(gramaticaParser.MINUS, i);
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
		enterRule(_localctx, 90, RULE_expression);
		int _la;
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				factor();
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(555);
					match(PLUS);
					setState(556);
					factor();
					}
					}
					setState(561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(562);
					match(MINUS);
					setState(563);
					((ExpressionContext)_localctx).t2 = factor();
					}
					}
					setState(568);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				factor();
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(570);
					match(MINUS);
					setState(571);
					((ExpressionContext)_localctx).t2 = factor();
					}
					}
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(577);
					match(PLUS);
					setState(578);
					factor();
					}
					}
					setState(583);
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
	public static class FactorContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(gramaticaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(gramaticaParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(gramaticaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(gramaticaParser.DIV, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_factor);
		int _la;
		try {
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				term();
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT) {
					{
					{
					setState(587);
					match(MULT);
					setState(588);
					term();
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(594);
					match(DIV);
					setState(595);
					term();
					}
					}
					setState(600);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				term();
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(602);
					match(DIV);
					setState(603);
					term();
					}
					}
					setState(608);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT) {
					{
					{
					setState(609);
					match(MULT);
					setState(610);
					term();
					}
					}
					setState(615);
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
		enterRule(_localctx, 94, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
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
		enterRule(_localctx, 96, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
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
		enterRule(_localctx, 98, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) ) {
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
		"\u0004\u0001C\u0271\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0001"+
		"\u0000\u0005\u0000f\b\u0000\n\u0000\f\u0000i\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001p\b\u0001\n\u0001"+
		"\f\u0001s\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002y\b\u0002\n\u0002\f\u0002|\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u0082\b\u0003\n\u0003\f\u0003\u0085\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u008e\b\u0004\n\u0004\f\u0004\u0091\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0096\b\u0004\n\u0004\f\u0004"+
		"\u0099\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a4\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00aa\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b0\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00cb"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d3\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00da\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00fc"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0103\b\r\n\r\f\r"+
		"\u0106\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u010f\b\r\n\r\f\r\u0112\t\r\u0003\r\u0114\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u014d\b\u0019\n\u0019\f\u0019\u0150\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u015a\b\u001a\n\u001a\f\u001a\u015d\t\u001a\u0001\u001a\u0005\u001a"+
		"\u0160\b\u001a\n\u001a\f\u001a\u0163\t\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u016e\b\u001b\n\u001b\f\u001b\u0171\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0178\b\u001c"+
		"\n\u001c\f\u001c\u017b\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u0182\b\u001d\n\u001d\f\u001d\u0185\t\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u0194\b\u001e\n\u001e\f\u001e\u0197\t\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01a2\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01ac\b \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01b7"+
		"\b\"\n\"\f\"\u01ba\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0005#\u01c3\b#\n#\f#\u01c6\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0005$\u01cf\b$\n$\f$\u01d2\t$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0005%\u01db\b%\n%\f%\u01de\t%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0005&\u01e7\b&\n&\f&\u01ea\t&\u0001\'\u0001\'"+
		"\u0001\'\u0003\'\u01ef\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0005(\u01f8\b(\n(\f(\u01fb\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0005)\u0204\b)\n)\f)\u0207\t)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0005*\u0210\b*\n*\f*\u0213\t*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0005+\u021c\b+\n+\f+\u021f\t+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0005,\u0226\b,\n,\f,\u0229\t,\u0001-\u0001-\u0001-\u0005"+
		"-\u022e\b-\n-\f-\u0231\t-\u0001-\u0001-\u0005-\u0235\b-\n-\f-\u0238\t"+
		"-\u0001-\u0001-\u0001-\u0005-\u023d\b-\n-\f-\u0240\t-\u0001-\u0001-\u0005"+
		"-\u0244\b-\n-\f-\u0247\t-\u0003-\u0249\b-\u0001.\u0001.\u0001.\u0005."+
		"\u024e\b.\n.\f.\u0251\t.\u0001.\u0001.\u0005.\u0255\b.\n.\f.\u0258\t."+
		"\u0001.\u0001.\u0001.\u0005.\u025d\b.\n.\f.\u0260\t.\u0001.\u0001.\u0005"+
		".\u0264\b.\n.\f.\u0267\t.\u0003.\u0269\b.\u0001/\u0001/\u00010\u00010"+
		"\u00011\u00011\u00011\u0000\u00002\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`b\u0000\u0004\u0001\u000017\u0001\u0000AB\u0002\u0000@@"+
		"BB\u0001\u0000@B\u028f\u0000g\u0001\u0000\u0000\u0000\u0002j\u0001\u0000"+
		"\u0000\u0000\u0004v\u0001\u0000\u0000\u0000\u0006}\u0001\u0000\u0000\u0000"+
		"\b\u0089\u0001\u0000\u0000\u0000\n\u00a3\u0001\u0000\u0000\u0000\f\u00a9"+
		"\u0001\u0000\u0000\u0000\u000e\u00af\u0001\u0000\u0000\u0000\u0010\u00ca"+
		"\u0001\u0000\u0000\u0000\u0012\u00d2\u0001\u0000\u0000\u0000\u0014\u00d9"+
		"\u0001\u0000\u0000\u0000\u0016\u00db\u0001\u0000\u0000\u0000\u0018\u00fb"+
		"\u0001\u0000\u0000\u0000\u001a\u0113\u0001\u0000\u0000\u0000\u001c\u0115"+
		"\u0001\u0000\u0000\u0000\u001e\u0119\u0001\u0000\u0000\u0000 \u011d\u0001"+
		"\u0000\u0000\u0000\"\u0121\u0001\u0000\u0000\u0000$\u0125\u0001\u0000"+
		"\u0000\u0000&\u012d\u0001\u0000\u0000\u0000(\u0131\u0001\u0000\u0000\u0000"+
		"*\u0135\u0001\u0000\u0000\u0000,\u0139\u0001\u0000\u0000\u0000.\u013c"+
		"\u0001\u0000\u0000\u00000\u013f\u0001\u0000\u0000\u00002\u0142\u0001\u0000"+
		"\u0000\u00004\u0156\u0001\u0000\u0000\u00006\u0168\u0001\u0000\u0000\u0000"+
		"8\u0174\u0001\u0000\u0000\u0000:\u017e\u0001\u0000\u0000\u0000<\u018d"+
		"\u0001\u0000\u0000\u0000>\u01a1\u0001\u0000\u0000\u0000@\u01ab\u0001\u0000"+
		"\u0000\u0000B\u01ad\u0001\u0000\u0000\u0000D\u01af\u0001\u0000\u0000\u0000"+
		"F\u01bb\u0001\u0000\u0000\u0000H\u01c7\u0001\u0000\u0000\u0000J\u01d3"+
		"\u0001\u0000\u0000\u0000L\u01df\u0001\u0000\u0000\u0000N\u01ee\u0001\u0000"+
		"\u0000\u0000P\u01f0\u0001\u0000\u0000\u0000R\u01fc\u0001\u0000\u0000\u0000"+
		"T\u0208\u0001\u0000\u0000\u0000V\u0214\u0001\u0000\u0000\u0000X\u0220"+
		"\u0001\u0000\u0000\u0000Z\u0248\u0001\u0000\u0000\u0000\\\u0268\u0001"+
		"\u0000\u0000\u0000^\u026a\u0001\u0000\u0000\u0000`\u026c\u0001\u0000\u0000"+
		"\u0000b\u026e\u0001\u0000\u0000\u0000df\u0003\u0010\b\u0000ed\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000h\u0001\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000jk\u0005\u0001\u0000\u0000kl\u0005:\u0000\u0000lm\u0005;\u0000\u0000"+
		"mq\u0005<\u0000\u0000np\u0003\u0010\b\u0000on\u0001\u0000\u0000\u0000"+
		"ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005=\u0000"+
		"\u0000u\u0003\u0001\u0000\u0000\u0000vz\u0005\u0005\u0000\u0000wy\u0005"+
		"A\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0005\u0001\u0000\u0000"+
		"\u0000|z\u0001\u0000\u0000\u0000}~\u0005\u0003\u0000\u0000~\u007f\u0005"+
		"A\u0000\u0000\u007f\u0083\u0005:\u0000\u0000\u0080\u0082\u0003\n\u0005"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005;\u0000\u0000\u0087\u0088\u0005>\u0000\u0000\u0088"+
		"\u0007\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0004\u0000\u0000\u008a"+
		"\u008b\u0005A\u0000\u0000\u008b\u008f\u0005:\u0000\u0000\u008c\u008e\u0003"+
		"\n\u0005\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005;\u0000\u0000\u0093\u0097\u0005<\u0000\u0000"+
		"\u0094\u0096\u0003\u0010\b\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005=\u0000\u0000\u009b\u009c"+
		"\u0005>\u0000\u0000\u009c\u009d\u0005\u001b\u0000\u0000\u009d\u009e\u0005"+
		">\u0000\u0000\u009e\t\u0001\u0000\u0000\u0000\u009f\u00a0\u0005A\u0000"+
		"\u0000\u00a0\u00a1\u0005?\u0000\u0000\u00a1\u00a4\u0003\n\u0005\u0000"+
		"\u00a2\u00a4\u0005A\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u000b\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0006\u0000\u0000\u00a6\u00aa\u0003\u0010\b\u0000\u00a7\u00a8"+
		"\u0005\u0006\u0000\u0000\u00a8\u00aa\u0003N\'\u0000\u00a9\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\r\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005\u0007\u0000\u0000\u00ac\u00b0\u0003\u0010"+
		"\b\u0000\u00ad\u00ae\u0005\u0007\u0000\u0000\u00ae\u00b0\u0003N\'\u0000"+
		"\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u000f\u0001\u0000\u0000\u0000\u00b1\u00cb\u0003\u0016\u000b\u0000"+
		"\u00b2\u00cb\u0003\u0018\f\u0000\u00b3\u00cb\u0003\u001a\r\u0000\u00b4"+
		"\u00cb\u0003\u001c\u000e\u0000\u00b5\u00cb\u0003\u001e\u000f\u0000\u00b6"+
		"\u00cb\u0003 \u0010\u0000\u00b7\u00cb\u0003\"\u0011\u0000\u00b8\u00cb"+
		"\u0003$\u0012\u0000\u00b9\u00cb\u0003&\u0013\u0000\u00ba\u00cb\u0003("+
		"\u0014\u0000\u00bb\u00cb\u0003*\u0015\u0000\u00bc\u00cb\u0003,\u0016\u0000"+
		"\u00bd\u00cb\u0003.\u0017\u0000\u00be\u00cb\u00030\u0018\u0000\u00bf\u00cb"+
		"\u00032\u0019\u0000\u00c0\u00cb\u00034\u001a\u0000\u00c1\u00cb\u0003:"+
		"\u001d\u0000\u00c2\u00cb\u0003<\u001e\u0000\u00c3\u00cb\u0003\u0004\u0002"+
		"\u0000\u00c4\u00cb\u0003\u0002\u0001\u0000\u00c5\u00cb\u0003\u0006\u0003"+
		"\u0000\u00c6\u00cb\u0003\b\u0004\u0000\u00c7\u00cb\u0003\f\u0006\u0000"+
		"\u00c8\u00cb\u0003\u000e\u0007\u0000\u00c9\u00cb\u0005>\u0000\u0000\u00ca"+
		"\u00b1\u0001\u0000\u0000\u0000\u00ca\u00b2\u0001\u0000\u0000\u0000\u00ca"+
		"\u00b3\u0001\u0000\u0000\u0000\u00ca\u00b4\u0001\u0000\u0000\u0000\u00ca"+
		"\u00b5\u0001\u0000\u0000\u0000\u00ca\u00b6\u0001\u0000\u0000\u0000\u00ca"+
		"\u00b7\u0001\u0000\u0000\u0000\u00ca\u00b8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00b9\u0001\u0000\u0000\u0000\u00ca\u00ba\u0001\u0000\u0000\u0000\u00ca"+
		"\u00bb\u0001\u0000\u0000\u0000\u00ca\u00bc\u0001\u0000\u0000\u0000\u00ca"+
		"\u00bd\u0001\u0000\u0000\u0000\u00ca\u00be\u0001\u0000\u0000\u0000\u00ca"+
		"\u00bf\u0001\u0000\u0000\u0000\u00ca\u00c0\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c1\u0001\u0000\u0000\u0000\u00ca\u00c2\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c3\u0001\u0000\u0000\u0000\u00ca\u00c4\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c5\u0001\u0000\u0000\u0000\u00ca\u00c6\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c7\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u0011\u0001\u0000\u0000\u0000\u00cc"+
		"\u00d3\u0003\u0014\n\u0000\u00cd\u00d3\u0003P(\u0000\u00ce\u00d3\u0003"+
		"X,\u0000\u00cf\u00d3\u0003R)\u0000\u00d0\u00d3\u0003T*\u0000\u00d1\u00d3"+
		"\u0003V+\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u0013\u0001\u0000\u0000\u0000\u00d4\u00da\u0003D\""+
		"\u0000\u00d5\u00da\u0003F#\u0000\u00d6\u00da\u0003H$\u0000\u00d7\u00da"+
		"\u0003J%\u0000\u00d8\u00da\u0003L&\u0000\u00d9\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d5\u0001\u0000\u0000\u0000\u00d9\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u0015\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\b\u0000\u0000"+
		"\u00dc\u00dd\u0005:\u0000\u0000\u00dd\u00de\u0005A\u0000\u0000\u00de\u00df"+
		"\u0005?\u0000\u0000\u00df\u00e0\u0003`0\u0000\u00e0\u00e1\u0005;\u0000"+
		"\u0000\u00e1\u00e2\u0005>\u0000\u0000\u00e2\u0017\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005\t\u0000\u0000\u00e4\u00e5\u0005:\u0000\u0000\u00e5"+
		"\u00e6\u0005A\u0000\u0000\u00e6\u00e7\u0005?\u0000\u0000\u00e7\u00e8\u0003"+
		"`0\u0000\u00e8\u00e9\u0005;\u0000\u0000\u00e9\u00ea\u0005>\u0000\u0000"+
		"\u00ea\u00fc\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\t\u0000\u0000\u00ec"+
		"\u00ed\u0005:\u0000\u0000\u00ed\u00ee\u0005A\u0000\u0000\u00ee\u00ef\u0005"+
		"?\u0000\u0000\u00ef\u00f0\u0003\u0012\t\u0000\u00f0\u00f1\u0005;\u0000"+
		"\u0000\u00f1\u00f2\u0005>\u0000\u0000\u00f2\u00fc\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0005\t\u0000\u0000\u00f4\u00f5\u0005:\u0000\u0000\u00f5"+
		"\u00f6\u0005A\u0000\u0000\u00f6\u00f7\u0005?\u0000\u0000\u00f7\u00f8\u0003"+
		"Z-\u0000\u00f8\u00f9\u0005;\u0000\u0000\u00f9\u00fa\u0005>\u0000\u0000"+
		"\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00e3\u0001\u0000\u0000\u0000"+
		"\u00fb\u00eb\u0001\u0000\u0000\u0000\u00fb\u00f3\u0001\u0000\u0000\u0000"+
		"\u00fc\u0019\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\n\u0000\u0000\u00fe"+
		"\u00ff\u0005:\u0000\u0000\u00ff\u0100\u0005A\u0000\u0000\u0100\u0104\u0005"+
		";\u0000\u0000\u0101\u0103\u0005>\u0000\u0000\u0102\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0114\u0001\u0000\u0000"+
		"\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0005\n\u0000\u0000"+
		"\u0108\u0109\u0005:\u0000\u0000\u0109\u010a\u0005A\u0000\u0000\u010a\u010b"+
		"\u0005?\u0000\u0000\u010b\u010c\u0003N\'\u0000\u010c\u0110\u0005;\u0000"+
		"\u0000\u010d\u010f\u0005>\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000"+
		"\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000"+
		"\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u00fd\u0001\u0000\u0000\u0000"+
		"\u0113\u0107\u0001\u0000\u0000\u0000\u0114\u001b\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005\u000e\u0000\u0000\u0116\u0117\u0003N\'\u0000\u0117"+
		"\u0118\u0005>\u0000\u0000\u0118\u001d\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0005\u000f\u0000\u0000\u011a\u011b\u0003N\'\u0000\u011b\u011c\u0005"+
		">\u0000\u0000\u011c\u001f\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0010"+
		"\u0000\u0000\u011e\u011f\u0003N\'\u0000\u011f\u0120\u0005>\u0000\u0000"+
		"\u0120!\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0011\u0000\u0000\u0122"+
		"\u0123\u0003N\'\u0000\u0123\u0124\u0005>\u0000\u0000\u0124#\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0005\u0012\u0000\u0000\u0126\u0127\u0005:\u0000"+
		"\u0000\u0127\u0128\u0003N\'\u0000\u0128\u0129\u0005?\u0000\u0000\u0129"+
		"\u012a\u0003N\'\u0000\u012a\u012b\u0005;\u0000\u0000\u012b\u012c\u0005"+
		">\u0000\u0000\u012c%\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0013\u0000"+
		"\u0000\u012e\u012f\u0003N\'\u0000\u012f\u0130\u0005>\u0000\u0000\u0130"+
		"\'\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u0014\u0000\u0000\u0132\u0133"+
		"\u0003N\'\u0000\u0133\u0134\u0005>\u0000\u0000\u0134)\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0005\u0015\u0000\u0000\u0136\u0137\u0005B\u0000\u0000"+
		"\u0137\u0138\u0005>\u0000\u0000\u0138+\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0005\u0016\u0000\u0000\u013a\u013b\u0005>\u0000\u0000\u013b-\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0005\u0017\u0000\u0000\u013d\u013e\u0005>\u0000"+
		"\u0000\u013e/\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0018\u0000\u0000"+
		"\u0140\u0141\u0005>\u0000\u0000\u01411\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0005\u0019\u0000\u0000\u0143\u0144\u0005A\u0000\u0000\u0144\u0145\u0005"+
		":\u0000\u0000\u0145\u0146\u0005B\u0000\u0000\u0146\u0147\u0005\u001d\u0000"+
		"\u0000\u0147\u0148\u0005B\u0000\u0000\u0148\u0149\u0005;\u0000\u0000\u0149"+
		"\u014a\u0005\u001a\u0000\u0000\u014a\u014e\u0005<\u0000\u0000\u014b\u014d"+
		"\u0003\u0010\b\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0150\u0001"+
		"\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0005=\u0000\u0000\u0152\u0153\u0005\u001c"+
		"\u0000\u0000\u0153\u0154\u0005\u001a\u0000\u0000\u0154\u0155\u0005>\u0000"+
		"\u0000\u01553\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u001e\u0000\u0000"+
		"\u0157\u015b\u0005A\u0000\u0000\u0158\u015a\u00036\u001b\u0000\u0159\u0158"+
		"\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u0161"+
		"\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0160"+
		"\u00038\u001c\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160\u0163\u0001"+
		"\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001"+
		"\u0000\u0000\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0005\u001c\u0000\u0000\u0165\u0166\u0005"+
		"\u001e\u0000\u0000\u0166\u0167\u0005>\u0000\u0000\u01675\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0005\u001f\u0000\u0000\u0169\u016a\u0003`0\u0000\u016a"+
		"\u016b\u0005 \u0000\u0000\u016b\u016f\u0005<\u0000\u0000\u016c\u016e\u0003"+
		"\u0010\b\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000"+
		"\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0005=\u0000\u0000\u01737\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0005!\u0000\u0000\u0175\u0179\u0005<\u0000\u0000\u0176\u0178"+
		"\u0003\u0010\b\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u017b\u0001"+
		"\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001"+
		"\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0179\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0005=\u0000\u0000\u017d9\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0005\"\u0000\u0000\u017f\u0183\u0005<\u0000\u0000"+
		"\u0180\u0182\u0003\u0010\b\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182"+
		"\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0001\u0000\u0000\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0186\u0187\u0005=\u0000\u0000\u0187\u0188"+
		"\u0005#\u0000\u0000\u0188\u0189\u0005<\u0000\u0000\u0189\u018a\u0003>"+
		"\u001f\u0000\u018a\u018b\u0005=\u0000\u0000\u018b\u018c\u0005>\u0000\u0000"+
		"\u018c;\u0001\u0000\u0000\u0000\u018d\u018e\u0005$\u0000\u0000\u018e\u018f"+
		"\u0005<\u0000\u0000\u018f\u0190\u0003>\u001f\u0000\u0190\u0191\u0005="+
		"\u0000\u0000\u0191\u0195\u0005<\u0000\u0000\u0192\u0194\u0003\u0010\b"+
		"\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194\u0197\u0001\u0000\u0000"+
		"\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0005=\u0000\u0000\u0199\u019a\u0005%\u0000\u0000\u019a"+
		"\u019b\u0005>\u0000\u0000\u019b=\u0001\u0000\u0000\u0000\u019c\u019d\u0003"+
		"b1\u0000\u019d\u019e\u0003B!\u0000\u019e\u019f\u0003b1\u0000\u019f\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a2\u0003\u0014\n\u0000\u01a1\u019c\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2?\u0001\u0000"+
		"\u0000\u0000\u01a3\u01ac\u0001\u0000\u0000\u0000\u01a4\u01a5\u0003b1\u0000"+
		"\u01a5\u01a6\u0003B!\u0000\u01a6\u01a7\u0003b1\u0000\u01a7\u01ac\u0001"+
		"\u0000\u0000\u0000\u01a8\u01ac\u0003\u0014\n\u0000\u01a9\u01ac\u0005@"+
		"\u0000\u0000\u01aa\u01ac\u0005A\u0000\u0000\u01ab\u01a3\u0001\u0000\u0000"+
		"\u0000\u01ab\u01a4\u0001\u0000\u0000\u0000\u01ab\u01a8\u0001\u0000\u0000"+
		"\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000"+
		"\u0000\u01acA\u0001\u0000\u0000\u0000\u01ad\u01ae\u0007\u0000\u0000\u0000"+
		"\u01aeC\u0001\u0000\u0000\u0000\u01af\u01b0\u0005&\u0000\u0000\u01b0\u01b1"+
		"\u0005:\u0000\u0000\u01b1\u01b2\u0003N\'\u0000\u01b2\u01b3\u0005?\u0000"+
		"\u0000\u01b3\u01b4\u0003N\'\u0000\u01b4\u01b8\u0005;\u0000\u0000\u01b5"+
		"\u01b7\u0005>\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7\u01ba"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b9E\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0005\'\u0000\u0000\u01bc\u01bd\u0005:"+
		"\u0000\u0000\u01bd\u01be\u0003@ \u0000\u01be\u01bf\u0005?\u0000\u0000"+
		"\u01bf\u01c0\u0003@ \u0000\u01c0\u01c4\u0005;\u0000\u0000\u01c1\u01c3"+
		"\u0005>\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c5G\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c8\u0005(\u0000\u0000\u01c8\u01c9\u0005:\u0000\u0000"+
		"\u01c9\u01ca\u0003@ \u0000\u01ca\u01cb\u0005?\u0000\u0000\u01cb\u01cc"+
		"\u0003@ \u0000\u01cc\u01d0\u0005;\u0000\u0000\u01cd\u01cf\u0005>\u0000"+
		"\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d1I\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0005)\u0000\u0000\u01d4\u01d5\u0005:\u0000\u0000\u01d5\u01d6"+
		"\u0003N\'\u0000\u01d6\u01d7\u0005?\u0000\u0000\u01d7\u01d8\u0003N\'\u0000"+
		"\u01d8\u01dc\u0005;\u0000\u0000\u01d9\u01db\u0005>\u0000\u0000\u01da\u01d9"+
		"\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da"+
		"\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01ddK\u0001"+
		"\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e0\u0005"+
		"*\u0000\u0000\u01e0\u01e1\u0005:\u0000\u0000\u01e1\u01e2\u0003N\'\u0000"+
		"\u01e2\u01e3\u0005?\u0000\u0000\u01e3\u01e4\u0003N\'\u0000\u01e4\u01e8"+
		"\u0005;\u0000\u0000\u01e5\u01e7\u0005>\u0000\u0000\u01e6\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9M\u0001\u0000\u0000"+
		"\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ef\u0003Z-\u0000\u01ec"+
		"\u01ef\u0005A\u0000\u0000\u01ed\u01ef\u0003\u0012\t\u0000\u01ee\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ed"+
		"\u0001\u0000\u0000\u0000\u01efO\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005"+
		"+\u0000\u0000\u01f1\u01f2\u0005:\u0000\u0000\u01f2\u01f3\u0003N\'\u0000"+
		"\u01f3\u01f4\u0005?\u0000\u0000\u01f4\u01f5\u0003N\'\u0000\u01f5\u01f9"+
		"\u0005;\u0000\u0000\u01f6\u01f8\u0005>\u0000\u0000\u01f7\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01faQ\u0001\u0000\u0000"+
		"\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005\u000b\u0000"+
		"\u0000\u01fd\u01fe\u0005:\u0000\u0000\u01fe\u01ff\u0003N\'\u0000\u01ff"+
		"\u0200\u0005?\u0000\u0000\u0200\u0201\u0003N\'\u0000\u0201\u0205\u0005"+
		";\u0000\u0000\u0202\u0204\u0005>\u0000\u0000\u0203\u0202\u0001\u0000\u0000"+
		"\u0000\u0204\u0207\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000"+
		"\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206S\u0001\u0000\u0000\u0000"+
		"\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u0209\u0005\f\u0000\u0000\u0209"+
		"\u020a\u0005:\u0000\u0000\u020a\u020b\u0003N\'\u0000\u020b\u020c\u0005"+
		"?\u0000\u0000\u020c\u020d\u0003N\'\u0000\u020d\u0211\u0005;\u0000\u0000"+
		"\u020e\u0210\u0005>\u0000\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u0210"+
		"\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211"+
		"\u0212\u0001\u0000\u0000\u0000\u0212U\u0001\u0000\u0000\u0000\u0213\u0211"+
		"\u0001\u0000\u0000\u0000\u0214\u0215\u0005\r\u0000\u0000\u0215\u0216\u0005"+
		":\u0000\u0000\u0216\u0217\u0003N\'\u0000\u0217\u0218\u0005?\u0000\u0000"+
		"\u0218\u0219\u0003N\'\u0000\u0219\u021d\u0005;\u0000\u0000\u021a\u021c"+
		"\u0005>\u0000\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021c\u021f\u0001"+
		"\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021e\u0001"+
		"\u0000\u0000\u0000\u021eW\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000"+
		"\u0000\u0000\u0220\u0221\u0005,\u0000\u0000\u0221\u0222\u0005:\u0000\u0000"+
		"\u0222\u0223\u0003Z-\u0000\u0223\u0227\u0005;\u0000\u0000\u0224\u0226"+
		"\u0005>\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226\u0229\u0001"+
		"\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001"+
		"\u0000\u0000\u0000\u0228Y\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000"+
		"\u0000\u0000\u022a\u022f\u0003\\.\u0000\u022b\u022c\u0005-\u0000\u0000"+
		"\u022c\u022e\u0003\\.\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022e"+
		"\u0231\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f"+
		"\u0230\u0001\u0000\u0000\u0000\u0230\u0236\u0001\u0000\u0000\u0000\u0231"+
		"\u022f\u0001\u0000\u0000\u0000\u0232\u0233\u0005.\u0000\u0000\u0233\u0235"+
		"\u0003\\.\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0235\u0238\u0001"+
		"\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0236\u0237\u0001"+
		"\u0000\u0000\u0000\u0237\u0249\u0001\u0000\u0000\u0000\u0238\u0236\u0001"+
		"\u0000\u0000\u0000\u0239\u023e\u0003\\.\u0000\u023a\u023b\u0005.\u0000"+
		"\u0000\u023b\u023d\u0003\\.\u0000\u023c\u023a\u0001\u0000\u0000\u0000"+
		"\u023d\u0240\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0245\u0001\u0000\u0000\u0000"+
		"\u0240\u023e\u0001\u0000\u0000\u0000\u0241\u0242\u0005-\u0000\u0000\u0242"+
		"\u0244\u0003\\.\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0244\u0247"+
		"\u0001\u0000\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246"+
		"\u0001\u0000\u0000\u0000\u0246\u0249\u0001\u0000\u0000\u0000\u0247\u0245"+
		"\u0001\u0000\u0000\u0000\u0248\u022a\u0001\u0000\u0000\u0000\u0248\u0239"+
		"\u0001\u0000\u0000\u0000\u0249[\u0001\u0000\u0000\u0000\u024a\u024f\u0003"+
		"^/\u0000\u024b\u024c\u0005/\u0000\u0000\u024c\u024e\u0003^/\u0000\u024d"+
		"\u024b\u0001\u0000\u0000\u0000\u024e\u0251\u0001\u0000\u0000\u0000\u024f"+
		"\u024d\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250"+
		"\u0256\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0252"+
		"\u0253\u00050\u0000\u0000\u0253\u0255\u0003^/\u0000\u0254\u0252\u0001"+
		"\u0000\u0000\u0000\u0255\u0258\u0001\u0000\u0000\u0000\u0256\u0254\u0001"+
		"\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0269\u0001"+
		"\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0259\u025e\u0003"+
		"^/\u0000\u025a\u025b\u00050\u0000\u0000\u025b\u025d\u0003^/\u0000\u025c"+
		"\u025a\u0001\u0000\u0000\u0000\u025d\u0260\u0001\u0000\u0000\u0000\u025e"+
		"\u025c\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f"+
		"\u0265\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0261"+
		"\u0262\u0005/\u0000\u0000\u0262\u0264\u0003^/\u0000\u0263\u0261\u0001"+
		"\u0000\u0000\u0000\u0264\u0267\u0001\u0000\u0000\u0000\u0265\u0263\u0001"+
		"\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0269\u0001"+
		"\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u024a\u0001"+
		"\u0000\u0000\u0000\u0268\u0259\u0001\u0000\u0000\u0000\u0269]\u0001\u0000"+
		"\u0000\u0000\u026a\u026b\u0007\u0001\u0000\u0000\u026b_\u0001\u0000\u0000"+
		"\u0000\u026c\u026d\u0007\u0002\u0000\u0000\u026da\u0001\u0000\u0000\u0000"+
		"\u026e\u026f\u0007\u0003\u0000\u0000\u026fc\u0001\u0000\u0000\u0000.g"+
		"qz\u0083\u008f\u0097\u00a3\u00a9\u00af\u00ca\u00d2\u00d9\u00fb\u0104\u0110"+
		"\u0113\u014e\u015b\u0161\u016f\u0179\u0183\u0195\u01a1\u01ab\u01b8\u01c4"+
		"\u01d0\u01dc\u01e8\u01ee\u01f9\u0205\u0211\u021d\u0227\u022f\u0236\u023e"+
		"\u0245\u0248\u024f\u0256\u025e\u0265\u0268";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}