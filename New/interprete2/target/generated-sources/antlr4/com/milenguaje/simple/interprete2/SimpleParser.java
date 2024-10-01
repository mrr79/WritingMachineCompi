// Generated from Simple.g4 by ANTLR 4.4
package com.milenguaje.simple.interprete2;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.milenguaje.simple.interprete2.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, PRINTLN=2, COM=3, DEF=4, PUT=5, ADDO=6, MULTO=7, DIVO=8, SUMO=9, 
		CUP=10, CDOWN=11, CRIGHT=12, CLEFT=13, POS=14, POSX=15, POSY=16, COLOR=17, 
		DOWN=18, UP=19, BEG=20, FOR=21, LOOP=22, END=23, TO=24, CASE=25, WHEN=26, 
		THEN=27, ELSE=28, REPEAT=29, UNTIL=30, WHILE=31, WHEND=32, EQUAL=33, AND=34, 
		OR=35, GREATER=36, SMALLER=37, SUBSTR=38, RANDOM=39, PLUS=40, MINUS=41, 
		MULT=42, DIV=43, GT=44, LT=45, GEQ=46, LEQ=47, EQ=48, NEQ=49, ASSIGN=50, 
		BRACKET_OPEN=51, BRACKET_CLOSE=52, PAR_OPEN=53, PAR_CLOSE=54, P_OPEN=55, 
		P_CLOSE=56, SEMICOLON=57, COLON=58, BOOLEAN=59, ID=60, NUMBER=61, WS=62;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'println'", "'//'", "'Def'", "'Put'", "'Add'", 
		"'Mult'", "'Div'", "'Sum'", "'ContinueUp'", "'ContinueDown'", "'ContinueRight'", 
		"'ContinueLeft'", "'Pos'", "'PosX'", "'PosY'", "'UseColor'", "'Down'", 
		"'Up'", "'Beginning'", "'For'", "'Loop'", "'End'", "'to'", "'Case'", "'When'", 
		"'Then'", "'Else'", "'Repeat'", "'Until'", "'While'", "'Whend'", "'Equal'", 
		"'And'", "'Or'", "'Greater'", "'Smaller'", "'Substr'", "'Random'", "'+'", 
		"'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", 
		"'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "','", "BOOLEAN", "ID", 
		"NUMBER", "WS"
	};
	public static final int
		RULE_program = 0, RULE_comments = 1, RULE_sentence = 2, RULE_operation = 3, 
		RULE_logical = 4, RULE_define = 5, RULE_put = 6, RULE_add = 7, RULE_continueup = 8, 
		RULE_continuedown = 9, RULE_continueright = 10, RULE_continueleft = 11, 
		RULE_pos = 12, RULE_posx = 13, RULE_posy = 14, RULE_color = 15, RULE_down = 16, 
		RULE_up = 17, RULE_beggining = 18, RULE_fory = 19, RULE_cases = 20, RULE_when = 21, 
		RULE_elses = 22, RULE_repeat = 23, RULE_whiles = 24, RULE_repeadtcond = 25, 
		RULE_cond = 26, RULE_equations = 27, RULE_equal = 28, RULE_and = 29, RULE_or = 30, 
		RULE_greater = 31, RULE_smaller = 32, RULE_values = 33, RULE_substr = 34, 
		RULE_mult = 35, RULE_div = 36, RULE_sum = 37, RULE_random = 38, RULE_expression = 39, 
		RULE_factor = 40, RULE_term = 41, RULE_logic = 42, RULE_num = 43;
	public static final String[] ruleNames = {
		"program", "comments", "sentence", "operation", "logical", "define", "put", 
		"add", "continueup", "continuedown", "continueright", "continueleft", 
		"pos", "posx", "posy", "color", "down", "up", "beggining", "fory", "cases", 
		"when", "elses", "repeat", "whiles", "repeadtcond", "cond", "equations", 
		"equal", "and", "or", "greater", "smaller", "values", "substr", "mult", 
		"div", "sum", "random", "expression", "factor", "term", "logic", "num"
	};

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> symbolTable = new HashMap<String, Object>();

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(SimpleParser.BRACKET_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(SimpleParser.BRACKET_OPEN, 0); }
		public TerminalNode MAIN() { return getToken(SimpleParser.MAIN, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(MAIN);
			setState(89); match(PAR_OPEN);
			setState(90); match(PAR_CLOSE);
			setState(91); match(BRACKET_OPEN);
			setState(92); comments();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COM) | (1L << DEF) | (1L << PUT) | (1L << ADDO) | (1L << CUP) | (1L << CDOWN) | (1L << CRIGHT) | (1L << CLEFT) | (1L << POS) | (1L << POSX) | (1L << POSY) | (1L << COLOR) | (1L << DOWN) | (1L << UP) | (1L << BEG) | (1L << FOR) | (1L << CASE) | (1L << REPEAT) | (1L << WHILE))) != 0)) {
				{
				{
				setState(93); sentence();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99); match(BRACKET_CLOSE);
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

	public static class CommentsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimpleParser.ID); }
		public TerminalNode COM() { return getToken(SimpleParser.COM, 0); }
		public TerminalNode ID(int i) {
			return getToken(SimpleParser.ID, i);
		}
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitComments(this);
		}
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(COM);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(102); match(ID);
				}
				}
				setState(107);
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

	public static class SentenceContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public PutContext put() {
			return getRuleContext(PutContext.class,0);
		}
		public ForyContext fory() {
			return getRuleContext(ForyContext.class,0);
		}
		public ContinuedownContext continuedown() {
			return getRuleContext(ContinuedownContext.class,0);
		}
		public ContinuerightContext continueright() {
			return getRuleContext(ContinuerightContext.class,0);
		}
		public UpContext up() {
			return getRuleContext(UpContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public BegginingContext beggining() {
			return getRuleContext(BegginingContext.class,0);
		}
		public ContinueleftContext continueleft() {
			return getRuleContext(ContinueleftContext.class,0);
		}
		public PosyContext posy() {
			return getRuleContext(PosyContext.class,0);
		}
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public PosContext pos() {
			return getRuleContext(PosContext.class,0);
		}
		public PosxContext posx() {
			return getRuleContext(PosxContext.class,0);
		}
		public ContinueupContext continueup() {
			return getRuleContext(ContinueupContext.class,0);
		}
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public DownContext down() {
			return getRuleContext(DownContext.class,0);
		}
		public WhilesContext whiles() {
			return getRuleContext(WhilesContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			setState(127);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(108); define();
				}
				break;
			case PUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); put();
				}
				break;
			case ADDO:
				enterOuterAlt(_localctx, 3);
				{
				setState(110); add();
				}
				break;
			case CUP:
				enterOuterAlt(_localctx, 4);
				{
				setState(111); continueup();
				}
				break;
			case CDOWN:
				enterOuterAlt(_localctx, 5);
				{
				setState(112); continuedown();
				}
				break;
			case CRIGHT:
				enterOuterAlt(_localctx, 6);
				{
				setState(113); continueright();
				}
				break;
			case CLEFT:
				enterOuterAlt(_localctx, 7);
				{
				setState(114); continueleft();
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 8);
				{
				setState(115); pos();
				}
				break;
			case POSX:
				enterOuterAlt(_localctx, 9);
				{
				setState(116); posx();
				}
				break;
			case POSY:
				enterOuterAlt(_localctx, 10);
				{
				setState(117); posy();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 11);
				{
				setState(118); color();
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 12);
				{
				setState(119); down();
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 13);
				{
				setState(120); up();
				}
				break;
			case BEG:
				enterOuterAlt(_localctx, 14);
				{
				setState(121); beggining();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 15);
				{
				setState(122); fory();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 16);
				{
				setState(123); cases();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 17);
				{
				setState(124); repeat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 18);
				{
				setState(125); whiles();
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 19);
				{
				setState(126); comments();
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

	public static class OperationContext extends ParserRuleContext {
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public SubstrContext substr() {
			return getRuleContext(SubstrContext.class,0);
		}
		public RandomContext random() {
			return getRuleContext(RandomContext.class,0);
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
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operation);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case EQUAL:
			case AND:
			case OR:
			case GREATER:
			case SMALLER:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); logical();
				}
				break;
			case SUBSTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(130); substr();
				}
				break;
			case RANDOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(131); random();
				}
				break;
			case MULTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(132); mult();
				}
				break;
			case DIVO:
				enterOuterAlt(_localctx, 5);
				{
				setState(133); div();
				}
				break;
			case SUMO:
				enterOuterAlt(_localctx, 6);
				{
				setState(134); sum();
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

	public static class LogicalContext extends ParserRuleContext {
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public SmallerContext smaller() {
			return getRuleContext(SmallerContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitLogical(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logical);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); equal();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); and();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(139); or();
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 4);
				{
				setState(140); greater();
				}
				break;
			case SMALLER:
				enterOuterAlt(_localctx, 5);
				{
				setState(141); smaller();
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

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode DEF() { return getToken(SimpleParser.DEF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDefine(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(DEF);
			setState(145); match(PAR_OPEN);
			setState(146); match(ID);
			setState(147); match(COLON);
			setState(148); logic();
			setState(149); match(PAR_CLOSE);
			setState(150); match(SEMICOLON);
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

	public static class PutContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode PUT() { return getToken(SimpleParser.PUT, 0); }
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
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPut(this);
		}
	}

	public final PutContext put() throws RecognitionException {
		PutContext _localctx = new PutContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_put);
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); match(PUT);
				setState(153); match(PAR_OPEN);
				setState(154); match(ID);
				setState(155); match(COLON);
				setState(156); logic();
				setState(157); match(PAR_CLOSE);
				setState(158); match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160); match(PUT);
				setState(161); match(PAR_OPEN);
				setState(162); match(ID);
				setState(163); match(COLON);
				setState(164); operation();
				setState(165); match(PAR_CLOSE);
				setState(166); match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168); match(PUT);
				setState(169); match(PAR_OPEN);
				setState(170); match(ID);
				setState(171); match(COLON);
				setState(172); expression();
				setState(173); match(PAR_CLOSE);
				setState(174); match(SEMICOLON);
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

	public static class AddContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public TerminalNode ADDO() { return getToken(SimpleParser.ADDO, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_add);
		try {
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178); match(ADDO);
				setState(179); match(PAR_OPEN);
				setState(180); match(ID);
				setState(181); match(PAR_CLOSE);
				setState(182); match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); match(ADDO);
				setState(184); match(PAR_OPEN);
				setState(185); match(ID);
				setState(186); match(COLON);
				setState(187); values();
				setState(188); match(PAR_CLOSE);
				setState(189); match(SEMICOLON);
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

	public static class ContinueupContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode CUP() { return getToken(SimpleParser.CUP, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ContinueupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterContinueup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitContinueup(this);
		}
	}

	public final ContinueupContext continueup() throws RecognitionException {
		ContinueupContext _localctx = new ContinueupContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_continueup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(CUP);
			setState(194); values();
			setState(195); match(SEMICOLON);
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

	public static class ContinuedownContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode CDOWN() { return getToken(SimpleParser.CDOWN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ContinuedownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuedown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterContinuedown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitContinuedown(this);
		}
	}

	public final ContinuedownContext continuedown() throws RecognitionException {
		ContinuedownContext _localctx = new ContinuedownContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_continuedown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(CDOWN);
			setState(198); values();
			setState(199); match(SEMICOLON);
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

	public static class ContinuerightContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode CRIGHT() { return getToken(SimpleParser.CRIGHT, 0); }
		public ContinuerightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueright; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterContinueright(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitContinueright(this);
		}
	}

	public final ContinuerightContext continueright() throws RecognitionException {
		ContinuerightContext _localctx = new ContinuerightContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_continueright);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(CRIGHT);
			setState(202); values();
			setState(203); match(SEMICOLON);
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

	public static class ContinueleftContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode CLEFT() { return getToken(SimpleParser.CLEFT, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ContinueleftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueleft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterContinueleft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitContinueleft(this);
		}
	}

	public final ContinueleftContext continueleft() throws RecognitionException {
		ContinueleftContext _localctx = new ContinueleftContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_continueleft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(CLEFT);
			setState(206); values();
			setState(207); match(SEMICOLON);
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

	public static class PosContext extends ParserRuleContext {
		public ExpressionContext t1;
		public ExpressionContext t2;
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode POS() { return getToken(SimpleParser.POS, 0); }
		public PosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPos(this);
		}
	}

	public final PosContext pos() throws RecognitionException {
		PosContext _localctx = new PosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(POS);
			setState(210); match(PAR_OPEN);
			setState(211); ((PosContext)_localctx).t1 = expression();
			setState(212); match(COLON);
			setState(213); ((PosContext)_localctx).t2 = expression();
			setState(214); match(PAR_CLOSE);
			setState(215); match(SEMICOLON);
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

	public static class PosxContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode POSX() { return getToken(SimpleParser.POSX, 0); }
		public PosxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPosx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPosx(this);
		}
	}

	public final PosxContext posx() throws RecognitionException {
		PosxContext _localctx = new PosxContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_posx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(POSX);
			setState(218); expression();
			setState(219); match(SEMICOLON);
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

	public static class PosyContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode POSY() { return getToken(SimpleParser.POSY, 0); }
		public PosyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPosy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPosy(this);
		}
	}

	public final PosyContext posy() throws RecognitionException {
		PosyContext _localctx = new PosyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_posy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(POSY);
			setState(222); expression();
			setState(223); match(SEMICOLON);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(SimpleParser.COLOR, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(COLOR);
			setState(226); match(NUMBER);
			setState(227); match(SEMICOLON);
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

	public static class DownContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode DOWN() { return getToken(SimpleParser.DOWN, 0); }
		public DownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_down; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDown(this);
		}
	}

	public final DownContext down() throws RecognitionException {
		DownContext _localctx = new DownContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_down);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(DOWN);
			setState(230); match(SEMICOLON);
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

	public static class UpContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode UP() { return getToken(SimpleParser.UP, 0); }
		public UpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_up; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitUp(this);
		}
	}

	public final UpContext up() throws RecognitionException {
		UpContext _localctx = new UpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_up);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); match(UP);
			setState(233); match(SEMICOLON);
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

	public static class BegginingContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode BEG() { return getToken(SimpleParser.BEG, 0); }
		public BegginingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beggining; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterBeggining(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitBeggining(this);
		}
	}

	public final BegginingContext beggining() throws RecognitionException {
		BegginingContext _localctx = new BegginingContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_beggining);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); match(BEG);
			setState(236); match(SEMICOLON);
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

	public static class ForyContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(SimpleParser.NUMBER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode FOR() { return getToken(SimpleParser.FOR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode TO() { return getToken(SimpleParser.TO, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public List<TerminalNode> LOOP() { return getTokens(SimpleParser.LOOP); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode P_CLOSE() { return getToken(SimpleParser.P_CLOSE, 0); }
		public TerminalNode END() { return getToken(SimpleParser.END, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(SimpleParser.NUMBER); }
		public TerminalNode LOOP(int i) {
			return getToken(SimpleParser.LOOP, i);
		}
		public TerminalNode P_OPEN() { return getToken(SimpleParser.P_OPEN, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ForyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFory(this);
		}
	}

	public final ForyContext fory() throws RecognitionException {
		ForyContext _localctx = new ForyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(FOR);
			setState(239); match(ID);
			setState(240); match(PAR_OPEN);
			setState(241); match(NUMBER);
			setState(242); match(TO);
			setState(243); match(NUMBER);
			setState(244); match(PAR_CLOSE);
			setState(245); match(LOOP);
			setState(246); match(P_OPEN);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COM) | (1L << DEF) | (1L << PUT) | (1L << ADDO) | (1L << CUP) | (1L << CDOWN) | (1L << CRIGHT) | (1L << CLEFT) | (1L << POS) | (1L << POSX) | (1L << POSY) | (1L << COLOR) | (1L << DOWN) | (1L << UP) | (1L << BEG) | (1L << FOR) | (1L << CASE) | (1L << REPEAT) | (1L << WHILE))) != 0)) {
				{
				{
				setState(247); sentence();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253); match(P_CLOSE);
			setState(254); match(END);
			setState(255); match(LOOP);
			setState(256); match(SEMICOLON);
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

	public static class CasesContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(SimpleParser.CASE); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public List<WhenContext> when() {
			return getRuleContexts(WhenContext.class);
		}
		public List<ElsesContext> elses() {
			return getRuleContexts(ElsesContext.class);
		}
		public WhenContext when(int i) {
			return getRuleContext(WhenContext.class,i);
		}
		public ElsesContext elses(int i) {
			return getRuleContext(ElsesContext.class,i);
		}
		public TerminalNode END() { return getToken(SimpleParser.END, 0); }
		public TerminalNode CASE(int i) {
			return getToken(SimpleParser.CASE, i);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitCases(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(CASE);
			setState(259); match(ID);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(260); when();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(266); elses();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272); match(END);
			setState(273); match(CASE);
			setState(274); match(SEMICOLON);
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

	public static class WhenContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(SimpleParser.THEN, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode WHEN() { return getToken(SimpleParser.WHEN, 0); }
		public TerminalNode P_CLOSE() { return getToken(SimpleParser.P_CLOSE, 0); }
		public TerminalNode P_OPEN() { return getToken(SimpleParser.P_OPEN, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitWhen(this);
		}
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(WHEN);
			setState(277); logic();
			setState(278); match(THEN);
			setState(279); match(P_OPEN);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COM) | (1L << DEF) | (1L << PUT) | (1L << ADDO) | (1L << CUP) | (1L << CDOWN) | (1L << CRIGHT) | (1L << CLEFT) | (1L << POS) | (1L << POSX) | (1L << POSY) | (1L << COLOR) | (1L << DOWN) | (1L << UP) | (1L << BEG) | (1L << FOR) | (1L << CASE) | (1L << REPEAT) | (1L << WHILE))) != 0)) {
				{
				{
				setState(280); sentence();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286); match(P_CLOSE);
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

	public static class ElsesContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SimpleParser.ELSE, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode P_CLOSE() { return getToken(SimpleParser.P_CLOSE, 0); }
		public TerminalNode P_OPEN() { return getToken(SimpleParser.P_OPEN, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ElsesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterElses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitElses(this);
		}
	}

	public final ElsesContext elses() throws RecognitionException {
		ElsesContext _localctx = new ElsesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); match(ELSE);
			setState(289); match(P_OPEN);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COM) | (1L << DEF) | (1L << PUT) | (1L << ADDO) | (1L << CUP) | (1L << CDOWN) | (1L << CRIGHT) | (1L << CLEFT) | (1L << POS) | (1L << POSX) | (1L << POSY) | (1L << COLOR) | (1L << DOWN) | (1L << UP) | (1L << BEG) | (1L << FOR) | (1L << CASE) | (1L << REPEAT) | (1L << WHILE))) != 0)) {
				{
				{
				setState(290); sentence();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296); match(P_CLOSE);
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

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode P_CLOSE(int i) {
			return getToken(SimpleParser.P_CLOSE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public RepeadtcondContext repeadtcond() {
			return getRuleContext(RepeadtcondContext.class,0);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> P_CLOSE() { return getTokens(SimpleParser.P_CLOSE); }
		public TerminalNode UNTIL() { return getToken(SimpleParser.UNTIL, 0); }
		public TerminalNode REPEAT() { return getToken(SimpleParser.REPEAT, 0); }
		public List<TerminalNode> P_OPEN() { return getTokens(SimpleParser.P_OPEN); }
		public TerminalNode P_OPEN(int i) {
			return getToken(SimpleParser.P_OPEN, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitRepeat(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); match(REPEAT);
			setState(299); match(P_OPEN);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COM) | (1L << DEF) | (1L << PUT) | (1L << ADDO) | (1L << CUP) | (1L << CDOWN) | (1L << CRIGHT) | (1L << CLEFT) | (1L << POS) | (1L << POSX) | (1L << POSY) | (1L << COLOR) | (1L << DOWN) | (1L << UP) | (1L << BEG) | (1L << FOR) | (1L << CASE) | (1L << REPEAT) | (1L << WHILE))) != 0)) {
				{
				{
				setState(300); sentence();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306); match(P_CLOSE);
			setState(307); match(UNTIL);
			setState(308); match(P_OPEN);
			setState(309); repeadtcond();
			setState(310); match(P_CLOSE);
			setState(311); match(SEMICOLON);
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

	public static class WhilesContext extends ParserRuleContext {
		public TerminalNode P_CLOSE(int i) {
			return getToken(SimpleParser.P_CLOSE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public RepeadtcondContext repeadtcond() {
			return getRuleContext(RepeadtcondContext.class,0);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> P_CLOSE() { return getTokens(SimpleParser.P_CLOSE); }
		public TerminalNode WHILE() { return getToken(SimpleParser.WHILE, 0); }
		public List<TerminalNode> P_OPEN() { return getTokens(SimpleParser.P_OPEN); }
		public TerminalNode WHEND() { return getToken(SimpleParser.WHEND, 0); }
		public TerminalNode P_OPEN(int i) {
			return getToken(SimpleParser.P_OPEN, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public WhilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterWhiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitWhiles(this);
		}
	}

	public final WhilesContext whiles() throws RecognitionException {
		WhilesContext _localctx = new WhilesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whiles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(WHILE);
			setState(314); match(P_OPEN);
			setState(315); repeadtcond();
			setState(316); match(P_CLOSE);
			setState(317); match(P_OPEN);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COM) | (1L << DEF) | (1L << PUT) | (1L << ADDO) | (1L << CUP) | (1L << CDOWN) | (1L << CRIGHT) | (1L << CLEFT) | (1L << POS) | (1L << POSX) | (1L << POSY) | (1L << COLOR) | (1L << DOWN) | (1L << UP) | (1L << BEG) | (1L << FOR) | (1L << CASE) | (1L << REPEAT) | (1L << WHILE))) != 0)) {
				{
				{
				setState(318); sentence();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324); match(P_CLOSE);
			setState(325); match(WHEND);
			setState(326); match(SEMICOLON);
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

	public static class RepeadtcondContext extends ParserRuleContext {
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public EquationsContext equations() {
			return getRuleContext(EquationsContext.class,0);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public RepeadtcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeadtcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterRepeadtcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitRepeadtcond(this);
		}
	}

	public final RepeadtcondContext repeadtcond() throws RecognitionException {
		RepeadtcondContext _localctx = new RepeadtcondContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_repeadtcond);
		try {
			setState(333);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(328); num();
				setState(329); equations();
				setState(330); num();
				}
				break;
			case EQUAL:
			case AND:
			case OR:
			case GREATER:
			case SMALLER:
				enterOuterAlt(_localctx, 2);
				{
				setState(332); logical();
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

	public static class CondContext extends ParserRuleContext {
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public EquationsContext equations() {
			return getRuleContext(EquationsContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(SimpleParser.BOOLEAN, 0); }
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cond);
		try {
			setState(343);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336); num();
				setState(337); equations();
				setState(338); num();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340); logical();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341); match(BOOLEAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(342); match(ID);
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

	public static class EquationsContext extends ParserRuleContext {
		public TerminalNode GEQ() { return getToken(SimpleParser.GEQ, 0); }
		public TerminalNode NEQ() { return getToken(SimpleParser.NEQ, 0); }
		public TerminalNode LEQ() { return getToken(SimpleParser.LEQ, 0); }
		public TerminalNode LT() { return getToken(SimpleParser.LT, 0); }
		public TerminalNode GT() { return getToken(SimpleParser.GT, 0); }
		public TerminalNode EQ() { return getToken(SimpleParser.EQ, 0); }
		public EquationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterEquations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitEquations(this);
		}
	}

	public final EquationsContext equations() throws RecognitionException {
		EquationsContext _localctx = new EquationsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_equations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class EqualContext extends ParserRuleContext {
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(SimpleParser.EQUAL, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(EQUAL);
			setState(348); match(PAR_OPEN);
			setState(349); values();
			setState(350); match(COLON);
			setState(351); values();
			setState(352); match(PAR_CLOSE);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(353); match(SEMICOLON);
				}
				}
				setState(358);
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

	public static class AndContext extends ParserRuleContext {
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public TerminalNode AND() { return getToken(SimpleParser.AND, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(AND);
			setState(360); match(PAR_OPEN);
			setState(361); cond();
			setState(362); match(COLON);
			setState(363); cond();
			setState(364); match(PAR_CLOSE);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(365); match(SEMICOLON);
				}
				}
				setState(370);
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

	public static class OrContext extends ParserRuleContext {
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode OR() { return getToken(SimpleParser.OR, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); match(OR);
			setState(372); match(PAR_OPEN);
			setState(373); cond();
			setState(374); match(COLON);
			setState(375); cond();
			setState(376); match(PAR_CLOSE);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(377); match(SEMICOLON);
				}
				}
				setState(382);
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

	public static class GreaterContext extends ParserRuleContext {
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode GREATER() { return getToken(SimpleParser.GREATER, 0); }
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitGreater(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_greater);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); match(GREATER);
			setState(384); match(PAR_OPEN);
			setState(385); values();
			setState(386); match(COLON);
			setState(387); values();
			setState(388); match(PAR_CLOSE);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(389); match(SEMICOLON);
				}
				}
				setState(394);
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

	public static class SmallerContext extends ParserRuleContext {
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode SMALLER() { return getToken(SimpleParser.SMALLER, 0); }
		public SmallerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smaller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSmaller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSmaller(this);
		}
	}

	public final SmallerContext smaller() throws RecognitionException {
		SmallerContext _localctx = new SmallerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_smaller);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395); match(SMALLER);
			setState(396); match(PAR_OPEN);
			setState(397); values();
			setState(398); match(COLON);
			setState(399); values();
			setState(400); match(PAR_CLOSE);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(401); match(SEMICOLON);
				}
				}
				setState(406);
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

	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitValues(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_values);
		try {
			setState(409);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(407); expression();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(408); match(ID);
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

	public static class SubstrContext extends ParserRuleContext {
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode SUBSTR() { return getToken(SimpleParser.SUBSTR, 0); }
		public SubstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSubstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSubstr(this);
		}
	}

	public final SubstrContext substr() throws RecognitionException {
		SubstrContext _localctx = new SubstrContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_substr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); match(SUBSTR);
			setState(412); match(PAR_OPEN);
			setState(413); values();
			setState(414); match(COLON);
			setState(415); values();
			setState(416); match(PAR_CLOSE);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(417); match(SEMICOLON);
				}
				}
				setState(422);
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

	public static class MultContext extends ParserRuleContext {
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode MULTO() { return getToken(SimpleParser.MULTO, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); match(MULTO);
			setState(424); match(PAR_OPEN);
			setState(425); values();
			setState(426); match(COLON);
			setState(427); values();
			setState(428); match(PAR_CLOSE);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(429); match(SEMICOLON);
				}
				}
				setState(434);
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

	public static class DivContext extends ParserRuleContext {
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode DIVO() { return getToken(SimpleParser.DIVO, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(DIVO);
			setState(436); match(PAR_OPEN);
			setState(437); values();
			setState(438); match(COLON);
			setState(439); values();
			setState(440); match(PAR_CLOSE);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(441); match(SEMICOLON);
				}
				}
				setState(446);
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

	public static class SumContext extends ParserRuleContext {
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode SUMO() { return getToken(SimpleParser.SUMO, 0); }
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSum(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); match(SUMO);
			setState(448); match(PAR_OPEN);
			setState(449); values();
			setState(450); match(COLON);
			setState(451); values();
			setState(452); match(PAR_CLOSE);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(453); match(SEMICOLON);
				}
				}
				setState(458);
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

	public static class RandomContext extends ParserRuleContext {
		public TerminalNode RANDOM() { return getToken(SimpleParser.RANDOM, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RandomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterRandom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitRandom(this);
		}
	}

	public final RandomContext random() throws RecognitionException {
		RandomContext _localctx = new RandomContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_random);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); match(RANDOM);
			setState(460); match(PAR_OPEN);
			setState(461); expression();
			setState(462); match(PAR_CLOSE);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(463); match(SEMICOLON);
				}
				}
				setState(468);
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

	public static class ExpressionContext extends ParserRuleContext {
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public TerminalNode MINUS(int i) {
			return getToken(SimpleParser.MINUS, i);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimpleParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(SimpleParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimpleParser.PLUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expression);
		int _la;
		try {
			setState(499);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469); factor();
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(470); match(PLUS);
					setState(471); factor();
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(477); match(MINUS);
					setState(478); ((ExpressionContext)_localctx).t2 = factor();
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484); factor();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(485); match(MINUS);
					setState(486); ((ExpressionContext)_localctx).t2 = factor();
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(492); match(PLUS);
					setState(493); factor();
					}
					}
					setState(498);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode MULT(int i) {
			return getToken(SimpleParser.MULT, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SimpleParser.MULT); }
		public List<TerminalNode> DIV() { return getTokens(SimpleParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(SimpleParser.DIV, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_factor);
		int _la;
		try {
			setState(531);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501); term();
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT) {
					{
					{
					setState(502); match(MULT);
					setState(503); term();
					}
					}
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(509); match(DIV);
					setState(510); term();
					}
					}
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516); term();
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(517); match(DIV);
					setState(518); term();
					}
					}
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT) {
					{
					{
					setState(524); match(MULT);
					setState(525); term();
					}
					}
					setState(530);
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); match(NUMBER);
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

	public static class LogicContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimpleParser.BOOLEAN, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitLogic(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimpleParser.BOOLEAN, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << ID) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u021e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\7\2a\n\2\f\2\16\2d\13\2\3\2\3\2\3\3"+
		"\3\3\7\3j\n\3\f\3\16\3m\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u008a\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0091\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b3\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c2\n\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00fb\n\25\f\25\16\25\u00fe\13"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u0108\n\26\f\26\16\26"+
		"\u010b\13\26\3\26\7\26\u010e\n\26\f\26\16\26\u0111\13\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u011c\n\27\f\27\16\27\u011f\13\27"+
		"\3\27\3\27\3\30\3\30\3\30\7\30\u0126\n\30\f\30\16\30\u0129\13\30\3\30"+
		"\3\30\3\31\3\31\3\31\7\31\u0130\n\31\f\31\16\31\u0133\13\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0142\n\32"+
		"\f\32\16\32\u0145\13\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u0150\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u015a\n\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0165\n\36\f\36\16"+
		"\36\u0168\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0171\n\37\f\37"+
		"\16\37\u0174\13\37\3 \3 \3 \3 \3 \3 \3 \7 \u017d\n \f \16 \u0180\13 \3"+
		"!\3!\3!\3!\3!\3!\3!\7!\u0189\n!\f!\16!\u018c\13!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\7\"\u0195\n\"\f\"\16\"\u0198\13\"\3#\3#\5#\u019c\n#\3$\3$\3$\3"+
		"$\3$\3$\3$\7$\u01a5\n$\f$\16$\u01a8\13$\3%\3%\3%\3%\3%\3%\3%\7%\u01b1"+
		"\n%\f%\16%\u01b4\13%\3&\3&\3&\3&\3&\3&\3&\7&\u01bd\n&\f&\16&\u01c0\13"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01c9\n\'\f\'\16\'\u01cc\13\'\3(\3("+
		"\3(\3(\3(\7(\u01d3\n(\f(\16(\u01d6\13(\3)\3)\3)\7)\u01db\n)\f)\16)\u01de"+
		"\13)\3)\3)\7)\u01e2\n)\f)\16)\u01e5\13)\3)\3)\3)\7)\u01ea\n)\f)\16)\u01ed"+
		"\13)\3)\3)\7)\u01f1\n)\f)\16)\u01f4\13)\5)\u01f6\n)\3*\3*\3*\7*\u01fb"+
		"\n*\f*\16*\u01fe\13*\3*\3*\7*\u0202\n*\f*\16*\u0205\13*\3*\3*\3*\7*\u020a"+
		"\n*\f*\16*\u020d\13*\3*\3*\7*\u0211\n*\f*\16*\u0214\13*\5*\u0216\n*\3"+
		"+\3+\3,\3,\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\5\3\2.\63\4\2==??\3\2=?\u0232\2Z\3"+
		"\2\2\2\4g\3\2\2\2\6\u0081\3\2\2\2\b\u0089\3\2\2\2\n\u0090\3\2\2\2\f\u0092"+
		"\3\2\2\2\16\u00b2\3\2\2\2\20\u00c1\3\2\2\2\22\u00c3\3\2\2\2\24\u00c7\3"+
		"\2\2\2\26\u00cb\3\2\2\2\30\u00cf\3\2\2\2\32\u00d3\3\2\2\2\34\u00db\3\2"+
		"\2\2\36\u00df\3\2\2\2 \u00e3\3\2\2\2\"\u00e7\3\2\2\2$\u00ea\3\2\2\2&\u00ed"+
		"\3\2\2\2(\u00f0\3\2\2\2*\u0104\3\2\2\2,\u0116\3\2\2\2.\u0122\3\2\2\2\60"+
		"\u012c\3\2\2\2\62\u013b\3\2\2\2\64\u014f\3\2\2\2\66\u0159\3\2\2\28\u015b"+
		"\3\2\2\2:\u015d\3\2\2\2<\u0169\3\2\2\2>\u0175\3\2\2\2@\u0181\3\2\2\2B"+
		"\u018d\3\2\2\2D\u019b\3\2\2\2F\u019d\3\2\2\2H\u01a9\3\2\2\2J\u01b5\3\2"+
		"\2\2L\u01c1\3\2\2\2N\u01cd\3\2\2\2P\u01f5\3\2\2\2R\u0215\3\2\2\2T\u0217"+
		"\3\2\2\2V\u0219\3\2\2\2X\u021b\3\2\2\2Z[\7\3\2\2[\\\7\67\2\2\\]\78\2\2"+
		"]^\7\65\2\2^b\5\4\3\2_a\5\6\4\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2"+
		"\2ce\3\2\2\2db\3\2\2\2ef\7\66\2\2f\3\3\2\2\2gk\7\5\2\2hj\7>\2\2ih\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\5\3\2\2\2mk\3\2\2\2n\u0082\5\f\7\2"+
		"o\u0082\5\16\b\2p\u0082\5\20\t\2q\u0082\5\22\n\2r\u0082\5\24\13\2s\u0082"+
		"\5\26\f\2t\u0082\5\30\r\2u\u0082\5\32\16\2v\u0082\5\34\17\2w\u0082\5\36"+
		"\20\2x\u0082\5 \21\2y\u0082\5\"\22\2z\u0082\5$\23\2{\u0082\5&\24\2|\u0082"+
		"\5(\25\2}\u0082\5*\26\2~\u0082\5\60\31\2\177\u0082\5\62\32\2\u0080\u0082"+
		"\5\4\3\2\u0081n\3\2\2\2\u0081o\3\2\2\2\u0081p\3\2\2\2\u0081q\3\2\2\2\u0081"+
		"r\3\2\2\2\u0081s\3\2\2\2\u0081t\3\2\2\2\u0081u\3\2\2\2\u0081v\3\2\2\2"+
		"\u0081w\3\2\2\2\u0081x\3\2\2\2\u0081y\3\2\2\2\u0081z\3\2\2\2\u0081{\3"+
		"\2\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0081\u0080\3\2\2\2\u0082\7\3\2\2\2\u0083\u008a\5\n\6\2\u0084\u008a\5"+
		"F$\2\u0085\u008a\5N(\2\u0086\u008a\5H%\2\u0087\u008a\5J&\2\u0088\u008a"+
		"\5L\'\2\u0089\u0083\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u0085\3\2\2\2\u0089"+
		"\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\t\3\2\2\2"+
		"\u008b\u0091\5:\36\2\u008c\u0091\5<\37\2\u008d\u0091\5> \2\u008e\u0091"+
		"\5@!\2\u008f\u0091\5B\"\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0090"+
		"\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\13\3\2\2"+
		"\2\u0092\u0093\7\6\2\2\u0093\u0094\7\67\2\2\u0094\u0095\7>\2\2\u0095\u0096"+
		"\7<\2\2\u0096\u0097\5V,\2\u0097\u0098\78\2\2\u0098\u0099\7;\2\2\u0099"+
		"\r\3\2\2\2\u009a\u009b\7\7\2\2\u009b\u009c\7\67\2\2\u009c\u009d\7>\2\2"+
		"\u009d\u009e\7<\2\2\u009e\u009f\5V,\2\u009f\u00a0\78\2\2\u00a0\u00a1\7"+
		";\2\2\u00a1\u00b3\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\7\67\2\2\u00a4"+
		"\u00a5\7>\2\2\u00a5\u00a6\7<\2\2\u00a6\u00a7\5\b\5\2\u00a7\u00a8\78\2"+
		"\2\u00a8\u00a9\7;\2\2\u00a9\u00b3\3\2\2\2\u00aa\u00ab\7\7\2\2\u00ab\u00ac"+
		"\7\67\2\2\u00ac\u00ad\7>\2\2\u00ad\u00ae\7<\2\2\u00ae\u00af\5P)\2\u00af"+
		"\u00b0\78\2\2\u00b0\u00b1\7;\2\2\u00b1\u00b3\3\2\2\2\u00b2\u009a\3\2\2"+
		"\2\u00b2\u00a2\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b3\17\3\2\2\2\u00b4\u00b5"+
		"\7\b\2\2\u00b5\u00b6\7\67\2\2\u00b6\u00b7\7>\2\2\u00b7\u00b8\78\2\2\u00b8"+
		"\u00c2\7;\2\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb\7\67\2\2\u00bb\u00bc\7>"+
		"\2\2\u00bc\u00bd\7<\2\2\u00bd\u00be\5D#\2\u00be\u00bf\78\2\2\u00bf\u00c0"+
		"\7;\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b4\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c2"+
		"\21\3\2\2\2\u00c3\u00c4\7\f\2\2\u00c4\u00c5\5D#\2\u00c5\u00c6\7;\2\2\u00c6"+
		"\23\3\2\2\2\u00c7\u00c8\7\r\2\2\u00c8\u00c9\5D#\2\u00c9\u00ca\7;\2\2\u00ca"+
		"\25\3\2\2\2\u00cb\u00cc\7\16\2\2\u00cc\u00cd\5D#\2\u00cd\u00ce\7;\2\2"+
		"\u00ce\27\3\2\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d1\5D#\2\u00d1\u00d2\7"+
		";\2\2\u00d2\31\3\2\2\2\u00d3\u00d4\7\20\2\2\u00d4\u00d5\7\67\2\2\u00d5"+
		"\u00d6\5P)\2\u00d6\u00d7\7<\2\2\u00d7\u00d8\5P)\2\u00d8\u00d9\78\2\2\u00d9"+
		"\u00da\7;\2\2\u00da\33\3\2\2\2\u00db\u00dc\7\21\2\2\u00dc\u00dd\5P)\2"+
		"\u00dd\u00de\7;\2\2\u00de\35\3\2\2\2\u00df\u00e0\7\22\2\2\u00e0\u00e1"+
		"\5P)\2\u00e1\u00e2\7;\2\2\u00e2\37\3\2\2\2\u00e3\u00e4\7\23\2\2\u00e4"+
		"\u00e5\7?\2\2\u00e5\u00e6\7;\2\2\u00e6!\3\2\2\2\u00e7\u00e8\7\24\2\2\u00e8"+
		"\u00e9\7;\2\2\u00e9#\3\2\2\2\u00ea\u00eb\7\25\2\2\u00eb\u00ec\7;\2\2\u00ec"+
		"%\3\2\2\2\u00ed\u00ee\7\26\2\2\u00ee\u00ef\7;\2\2\u00ef\'\3\2\2\2\u00f0"+
		"\u00f1\7\27\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3\7\67\2\2\u00f3\u00f4\7"+
		"?\2\2\u00f4\u00f5\7\32\2\2\u00f5\u00f6\7?\2\2\u00f6\u00f7\78\2\2\u00f7"+
		"\u00f8\7\30\2\2\u00f8\u00fc\79\2\2\u00f9\u00fb\5\6\4\2\u00fa\u00f9\3\2"+
		"\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7:\2\2\u0100\u0101\7\31"+
		"\2\2\u0101\u0102\7\30\2\2\u0102\u0103\7;\2\2\u0103)\3\2\2\2\u0104\u0105"+
		"\7\33\2\2\u0105\u0109\7>\2\2\u0106\u0108\5,\27\2\u0107\u0106\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010f\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010c\u010e\5.\30\2\u010d\u010c\3\2\2\2\u010e"+
		"\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7\31\2\2\u0113\u0114\7\33\2\2\u0114"+
		"\u0115\7;\2\2\u0115+\3\2\2\2\u0116\u0117\7\34\2\2\u0117\u0118\5V,\2\u0118"+
		"\u0119\7\35\2\2\u0119\u011d\79\2\2\u011a\u011c\5\6\4\2\u011b\u011a\3\2"+
		"\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7:\2\2\u0121-\3\2\2\2\u0122"+
		"\u0123\7\36\2\2\u0123\u0127\79\2\2\u0124\u0126\5\6\4\2\u0125\u0124\3\2"+
		"\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7:\2\2\u012b/\3\2\2\2\u012c"+
		"\u012d\7\37\2\2\u012d\u0131\79\2\2\u012e\u0130\5\6\4\2\u012f\u012e\3\2"+
		"\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7:\2\2\u0135\u0136\7 \2"+
		"\2\u0136\u0137\79\2\2\u0137\u0138\5\64\33\2\u0138\u0139\7:\2\2\u0139\u013a"+
		"\7;\2\2\u013a\61\3\2\2\2\u013b\u013c\7!\2\2\u013c\u013d\79\2\2\u013d\u013e"+
		"\5\64\33\2\u013e\u013f\7:\2\2\u013f\u0143\79\2\2\u0140\u0142\5\6\4\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7:\2\2\u0147"+
		"\u0148\7\"\2\2\u0148\u0149\7;\2\2\u0149\63\3\2\2\2\u014a\u014b\5X-\2\u014b"+
		"\u014c\58\35\2\u014c\u014d\5X-\2\u014d\u0150\3\2\2\2\u014e\u0150\5\n\6"+
		"\2\u014f\u014a\3\2\2\2\u014f\u014e\3\2\2\2\u0150\65\3\2\2\2\u0151\u015a"+
		"\3\2\2\2\u0152\u0153\5X-\2\u0153\u0154\58\35\2\u0154\u0155\5X-\2\u0155"+
		"\u015a\3\2\2\2\u0156\u015a\5\n\6\2\u0157\u015a\7=\2\2\u0158\u015a\7>\2"+
		"\2\u0159\u0151\3\2\2\2\u0159\u0152\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u0158\3\2\2\2\u015a\67\3\2\2\2\u015b\u015c\t\2\2\2\u015c"+
		"9\3\2\2\2\u015d\u015e\7#\2\2\u015e\u015f\7\67\2\2\u015f\u0160\5D#\2\u0160"+
		"\u0161\7<\2\2\u0161\u0162\5D#\2\u0162\u0166\78\2\2\u0163\u0165\7;\2\2"+
		"\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167;\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7$\2\2\u016a\u016b"+
		"\7\67\2\2\u016b\u016c\5\66\34\2\u016c\u016d\7<\2\2\u016d\u016e\5\66\34"+
		"\2\u016e\u0172\78\2\2\u016f\u0171\7;\2\2\u0170\u016f\3\2\2\2\u0171\u0174"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173=\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0176\7%\2\2\u0176\u0177\7\67\2\2\u0177\u0178\5\66"+
		"\34\2\u0178\u0179\7<\2\2\u0179\u017a\5\66\34\2\u017a\u017e\78\2\2\u017b"+
		"\u017d\7;\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2"+
		"\2\2\u017e\u017f\3\2\2\2\u017f?\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182"+
		"\7&\2\2\u0182\u0183\7\67\2\2\u0183\u0184\5D#\2\u0184\u0185\7<\2\2\u0185"+
		"\u0186\5D#\2\u0186\u018a\78\2\2\u0187\u0189\7;\2\2\u0188\u0187\3\2\2\2"+
		"\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018bA\3"+
		"\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7\'\2\2\u018e\u018f\7\67\2\2\u018f"+
		"\u0190\5D#\2\u0190\u0191\7<\2\2\u0191\u0192\5D#\2\u0192\u0196\78\2\2\u0193"+
		"\u0195\7;\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197C\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019c"+
		"\5P)\2\u019a\u019c\7>\2\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c"+
		"E\3\2\2\2\u019d\u019e\7(\2\2\u019e\u019f\7\67\2\2\u019f\u01a0\5D#\2\u01a0"+
		"\u01a1\7<\2\2\u01a1\u01a2\5D#\2\u01a2\u01a6\78\2\2\u01a3\u01a5\7;\2\2"+
		"\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7G\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7\t\2\2\u01aa"+
		"\u01ab\7\67\2\2\u01ab\u01ac\5D#\2\u01ac\u01ad\7<\2\2\u01ad\u01ae\5D#\2"+
		"\u01ae\u01b2\78\2\2\u01af\u01b1\7;\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b4"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3I\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b5\u01b6\7\n\2\2\u01b6\u01b7\7\67\2\2\u01b7\u01b8\5"+
		"D#\2\u01b8\u01b9\7<\2\2\u01b9\u01ba\5D#\2\u01ba\u01be\78\2\2\u01bb\u01bd"+
		"\7;\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bfK\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7\13\2\2"+
		"\u01c2\u01c3\7\67\2\2\u01c3\u01c4\5D#\2\u01c4\u01c5\7<\2\2\u01c5\u01c6"+
		"\5D#\2\u01c6\u01ca\78\2\2\u01c7\u01c9\7;\2\2\u01c8\u01c7\3\2\2\2\u01c9"+
		"\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cbM\3\2\2\2"+
		"\u01cc\u01ca\3\2\2\2\u01cd\u01ce\7)\2\2\u01ce\u01cf\7\67\2\2\u01cf\u01d0"+
		"\5P)\2\u01d0\u01d4\78\2\2\u01d1\u01d3\7;\2\2\u01d2\u01d1\3\2\2\2\u01d3"+
		"\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5O\3\2\2\2"+
		"\u01d6\u01d4\3\2\2\2\u01d7\u01dc\5R*\2\u01d8\u01d9\7*\2\2\u01d9\u01db"+
		"\5R*\2\u01da\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01e3\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\7+"+
		"\2\2\u01e0\u01e2\5R*\2\u01e1\u01df\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01f6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6"+
		"\u01eb\5R*\2\u01e7\u01e8\7+\2\2\u01e8\u01ea\5R*\2\u01e9\u01e7\3\2\2\2"+
		"\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01f2"+
		"\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7*\2\2\u01ef\u01f1\5R*\2\u01f0"+
		"\u01ee\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2"+
		"\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01d7\3\2\2\2\u01f5"+
		"\u01e6\3\2\2\2\u01f6Q\3\2\2\2\u01f7\u01fc\5T+\2\u01f8\u01f9\7,\2\2\u01f9"+
		"\u01fb\5T+\2\u01fa\u01f8\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2"+
		"\2\u01fc\u01fd\3\2\2\2\u01fd\u0203\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200"+
		"\7-\2\2\u0200\u0202\5T+\2\u0201\u01ff\3\2\2\2\u0202\u0205\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0216\3\2\2\2\u0205\u0203\3\2"+
		"\2\2\u0206\u020b\5T+\2\u0207\u0208\7-\2\2\u0208\u020a\5T+\2\u0209\u0207"+
		"\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u0212\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f\7,\2\2\u020f\u0211\5T+"+
		"\2\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u01f7\3\2\2\2\u0215"+
		"\u0206\3\2\2\2\u0216S\3\2\2\2\u0217\u0218\7?\2\2\u0218U\3\2\2\2\u0219"+
		"\u021a\t\3\2\2\u021aW\3\2\2\2\u021b\u021c\t\4\2\2\u021cY\3\2\2\2\'bk\u0081"+
		"\u0089\u0090\u00b2\u00c1\u00fc\u0109\u010f\u011d\u0127\u0131\u0143\u014f"+
		"\u0159\u0166\u0172\u017e\u018a\u0196\u019b\u01a6\u01b2\u01be\u01ca\u01d4"+
		"\u01dc\u01e3\u01eb\u01f2\u01f5\u01fc\u0203\u020b\u0212\u0215";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}