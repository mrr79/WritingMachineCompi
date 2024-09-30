// Generated from com\milenguaje\simple\interprete2\Simple.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_temporal = 2, RULE_operation = 3, 
		RULE_logical = 4, RULE_println = 5, RULE_define = 6, RULE_put = 7, RULE_add = 8, 
		RULE_continueup = 9, RULE_continuedown = 10, RULE_continueright = 11, 
		RULE_continueleft = 12, RULE_pos = 13, RULE_posx = 14, RULE_posy = 15, 
		RULE_color = 16, RULE_down = 17, RULE_up = 18, RULE_beggining = 19, RULE_fory = 20, 
		RULE_cases = 21, RULE_when = 22, RULE_elses = 23, RULE_repeat = 24, RULE_whiles = 25, 
		RULE_cond = 26, RULE_equations = 27, RULE_equal = 28, RULE_and = 29, RULE_or = 30, 
		RULE_greater = 31, RULE_smaller = 32, RULE_values = 33, RULE_substr = 34, 
		RULE_mult = 35, RULE_div = 36, RULE_sum = 37, RULE_random = 38, RULE_expression = 39, 
		RULE_factor = 40, RULE_term = 41, RULE_logic = 42, RULE_num = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentence", "temporal", "operation", "logical", "println", 
			"define", "put", "add", "continueup", "continuedown", "continueright", 
			"continueleft", "pos", "posx", "posy", "color", "down", "up", "beggining", 
			"fory", "cases", "when", "elses", "repeat", "whiles", "cond", "equations", 
			"equal", "and", "or", "greater", "smaller", "values", "substr", "mult", 
			"div", "sum", "random", "expression", "factor", "term", "logic", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'println'", "'//'", "'Def'", "'Put'", "'Add'", "'Mult'", 
			"'Div'", "'Sum'", "'ContinueUp'", "'ContinueDown'", "'ContinueRight'", 
			"'ContinueLeft'", "'Pos'", "'PosX'", "'PosY'", "'UseColor'", "'Down'", 
			"'Up'", "'Beginning'", "'For'", "'Loop'", "'End'", "'to'", "'Case'", 
			"'When'", "'Then'", "'Else'", "'Repeat'", "'Until'", "'While'", "'Whend'", 
			"'Equal'", "'And'", "'Or'", "'Greater'", "'Smaller'", "'Substr'", "'Random'", 
			"'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'='", "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "PRINTLN", "COM", "DEF", "PUT", "ADDO", "MULTO", "DIVO", 
			"SUMO", "CUP", "CDOWN", "CRIGHT", "CLEFT", "POS", "POSX", "POSY", "COLOR", 
			"DOWN", "UP", "BEG", "FOR", "LOOP", "END", "TO", "CASE", "WHEN", "THEN", 
			"ELSE", "REPEAT", "UNTIL", "WHILE", "WHEND", "EQUAL", "AND", "OR", "GREATER", 
			"SMALLER", "SUBSTR", "RANDOM", "PLUS", "MINUS", "MULT", "DIV", "GT", 
			"LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", 
			"PAR_OPEN", "PAR_CLOSE", "P_OPEN", "P_CLOSE", "SEMICOLON", "COLON", "BOOLEAN", 
			"ID", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Simple.g4"; }

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
		public SentenceContext sentence;
		public TerminalNode MAIN() { return getToken(SimpleParser.MAIN, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(SimpleParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(SimpleParser.BRACKET_CLOSE, 0); }
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
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(88);
			match(MAIN);
			setState(89);
			match(PAR_OPEN);
			setState(90);
			match(PAR_CLOSE);
			setState(91);
			match(BRACKET_OPEN);

							List<ASTNode> body = new ArrayList<ASTNode>();
						
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << DEF) | (1L << PUT) | (1L << ADDO) | (1L << CUP) | (1L << CDOWN) | (1L << CRIGHT) | (1L << CLEFT) | (1L << POS) | (1L << POSX) | (1L << POSY) | (1L << COLOR) | (1L << DOWN) | (1L << UP) | (1L << BEG))) != 0)) {
				{
				{
				setState(93);
				((ProgramContext)_localctx).sentence = sentence();
				body.add(((ProgramContext)_localctx).sentence.node);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(BRACKET_CLOSE);
			 
							for(ASTNode n : body) {
								n.execute(symbolTable);
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
		public ASTNode node;
		public DefineContext define;
		public PutContext put;
		public PrintlnContext println;
		public AddContext add;
		public ContinueupContext continueup;
		public ContinuedownContext continuedown;
		public ContinuerightContext continueright;
		public ContinueleftContext continueleft;
		public PosContext pos;
		public PosxContext posx;
		public PosyContext posy;
		public ColorContext color;
		public DownContext down;
		public UpContext up;
		public BegginingContext beggining;
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public PutContext put() {
			return getRuleContext(PutContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				((SentenceContext)_localctx).define = define();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).define.node;
				}
				break;
			case PUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				((SentenceContext)_localctx).put = put();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).put.node;
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				((SentenceContext)_localctx).println = println();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).println.node;
				}
				break;
			case ADDO:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				((SentenceContext)_localctx).add = add();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).add.node;
				}
				break;
			case CUP:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				((SentenceContext)_localctx).continueup = continueup();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).continueup.node;
				}
				break;
			case CDOWN:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				((SentenceContext)_localctx).continuedown = continuedown();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).continuedown.node;
				}
				break;
			case CRIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				((SentenceContext)_localctx).continueright = continueright();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).continueright.node;
				}
				break;
			case CLEFT:
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				((SentenceContext)_localctx).continueleft = continueleft();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).continueleft.node;
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 9);
				{
				setState(128);
				((SentenceContext)_localctx).pos = pos();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).pos.node;
				}
				break;
			case POSX:
				enterOuterAlt(_localctx, 10);
				{
				setState(131);
				((SentenceContext)_localctx).posx = posx();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).posx.node;
				}
				break;
			case POSY:
				enterOuterAlt(_localctx, 11);
				{
				setState(134);
				((SentenceContext)_localctx).posy = posy();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).posy.node;
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 12);
				{
				setState(137);
				((SentenceContext)_localctx).color = color();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).color.node;
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 13);
				{
				setState(140);
				((SentenceContext)_localctx).down = down();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).down.node;
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 14);
				{
				setState(143);
				((SentenceContext)_localctx).up = up();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).up.node;
				}
				break;
			case BEG:
				enterOuterAlt(_localctx, 15);
				{
				setState(146);
				((SentenceContext)_localctx).beggining = beggining();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).beggining.node;
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

	public static class TemporalContext extends ParserRuleContext {
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
		public TemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitTemporal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemporalContext temporal() throws RecognitionException {
		TemporalContext _localctx = new TemporalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_temporal);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				fory();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				cases();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				repeat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				whiles();
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
		public ASTNode node;
		public LogicalContext logical;
		public SubstrContext substr;
		public RandomContext random;
		public MultContext mult;
		public DivContext div;
		public SumContext sum;
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
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operation);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
			case AND:
			case OR:
			case GREATER:
			case SMALLER:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((OperationContext)_localctx).logical = logical();
				((OperationContext)_localctx).node =  ((OperationContext)_localctx).logical.node;
				}
				break;
			case SUBSTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				((OperationContext)_localctx).substr = substr();
				((OperationContext)_localctx).node =  ((OperationContext)_localctx).substr.node;
				}
				break;
			case RANDOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				((OperationContext)_localctx).random = random();
				((OperationContext)_localctx).node =  ((OperationContext)_localctx).random.node;
				}
				break;
			case MULTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				((OperationContext)_localctx).mult = mult();
				((OperationContext)_localctx).node =  ((OperationContext)_localctx).mult.node;
				}
				break;
			case DIVO:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				((OperationContext)_localctx).div = div();
				((OperationContext)_localctx).node =  ((OperationContext)_localctx).div.node;
				}
				break;
			case SUMO:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				((OperationContext)_localctx).sum = sum();
				((OperationContext)_localctx).node =  ((OperationContext)_localctx).sum.node;
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
		public ASTNode node;
		public EqualContext equal;
		public AndContext and;
		public OrContext or;
		public GreaterContext greater;
		public SmallerContext smaller;
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
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logical);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				((LogicalContext)_localctx).equal = equal();
				((LogicalContext)_localctx).node =  ((LogicalContext)_localctx).equal.node;
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				((LogicalContext)_localctx).and = and();
				((LogicalContext)_localctx).node =  ((LogicalContext)_localctx).and.node;
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				((LogicalContext)_localctx).or = or();
				((LogicalContext)_localctx).node =  ((LogicalContext)_localctx).or.node;
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				((LogicalContext)_localctx).greater = greater();
				((LogicalContext)_localctx).node =  ((LogicalContext)_localctx).greater.node;
				}
				break;
			case SMALLER:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				((LogicalContext)_localctx).smaller = smaller();
				((LogicalContext)_localctx).node =  ((LogicalContext)_localctx).smaller.node;
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

	public static class PrintlnContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public AndContext and;
		public TerminalNode PRINTLN() { return getToken(SimpleParser.PRINTLN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_println);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(PRINTLN);
				setState(195);
				((PrintlnContext)_localctx).expression = expression();
				setState(196);
				match(SEMICOLON);
				((PrintlnContext)_localctx).node =  new Println(((PrintlnContext)_localctx).expression.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(PRINTLN);
				setState(200);
				((PrintlnContext)_localctx).and = and();
				setState(201);
				match(SEMICOLON);
				((PrintlnContext)_localctx).node =  new Println(((PrintlnContext)_localctx).and.node);
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

	public static class DefineContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public LogicContext logic;
		public TerminalNode DEF() { return getToken(SimpleParser.DEF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(DEF);
			setState(207);
			match(PAR_OPEN);
			setState(208);
			((DefineContext)_localctx).ID = match(ID);
			setState(209);
			match(COLON);
			setState(210);
			((DefineContext)_localctx).logic = logic();
			setState(211);
			match(PAR_CLOSE);
			setState(212);
			match(SEMICOLON);
			((DefineContext)_localctx).node =  new VarAssign((((DefineContext)_localctx).ID!=null?((DefineContext)_localctx).ID.getText():null), ((DefineContext)_localctx).logic.node);
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
		public ASTNode node;
		public Token ID;
		public LogicContext logic;
		public OperationContext operation;
		public ExpressionContext expression;
		public TerminalNode PUT() { return getToken(SimpleParser.PUT, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitPut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutContext put() throws RecognitionException {
		PutContext _localctx = new PutContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_put);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(PUT);
				setState(216);
				match(PAR_OPEN);
				setState(217);
				((PutContext)_localctx).ID = match(ID);
				setState(218);
				match(COLON);
				setState(219);
				((PutContext)_localctx).logic = logic();
				setState(220);
				match(PAR_CLOSE);
				setState(221);
				match(SEMICOLON);
				((PutContext)_localctx).node =  new VarAssign((((PutContext)_localctx).ID!=null?((PutContext)_localctx).ID.getText():null), ((PutContext)_localctx).logic.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(PUT);
				setState(225);
				match(PAR_OPEN);
				setState(226);
				((PutContext)_localctx).ID = match(ID);
				setState(227);
				match(COLON);
				setState(228);
				((PutContext)_localctx).operation = operation();
				setState(229);
				match(PAR_CLOSE);
				setState(230);
				match(SEMICOLON);
				((PutContext)_localctx).node =  new VarAssign((((PutContext)_localctx).ID!=null?((PutContext)_localctx).ID.getText():null), ((PutContext)_localctx).operation.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(PUT);
				setState(234);
				match(PAR_OPEN);
				setState(235);
				((PutContext)_localctx).ID = match(ID);
				setState(236);
				match(COLON);
				setState(237);
				((PutContext)_localctx).expression = expression();
				setState(238);
				match(PAR_CLOSE);
				setState(239);
				match(SEMICOLON);
				((PutContext)_localctx).node =  new VarAssign((((PutContext)_localctx).ID!=null?((PutContext)_localctx).ID.getText():null), ((PutContext)_localctx).expression.node);
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
		public ASTNode node;
		public Token ID;
		public ValuesContext values;
		public TerminalNode ADDO() { return getToken(SimpleParser.ADDO, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_add);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(ADDO);
				setState(245);
				match(PAR_OPEN);
				setState(246);
				((AddContext)_localctx).ID = match(ID);
				setState(247);
				match(PAR_CLOSE);
				setState(248);
				match(SEMICOLON);
				((AddContext)_localctx).node =  new VarAssign((((AddContext)_localctx).ID!=null?((AddContext)_localctx).ID.getText():null), new Addition(new VarRef((((AddContext)_localctx).ID!=null?((AddContext)_localctx).ID.getText():null)), new Constant(1)));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(ADDO);
				setState(251);
				match(PAR_OPEN);
				setState(252);
				((AddContext)_localctx).ID = match(ID);
				setState(253);
				match(COLON);
				setState(254);
				((AddContext)_localctx).values = values();
				setState(255);
				match(PAR_CLOSE);
				setState(256);
				match(SEMICOLON);
				((AddContext)_localctx).node =  new VarAssign((((AddContext)_localctx).ID!=null?((AddContext)_localctx).ID.getText():null), new Addition(new VarRef((((AddContext)_localctx).ID!=null?((AddContext)_localctx).ID.getText():null)), ((AddContext)_localctx).values.node));
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
		public ASTNode node;
		public ValuesContext values;
		public TerminalNode CUP() { return getToken(SimpleParser.CUP, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitContinueup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueupContext continueup() throws RecognitionException {
		ContinueupContext _localctx = new ContinueupContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_continueup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(CUP);
			setState(262);
			((ContinueupContext)_localctx).values = values();
			setState(263);
			match(SEMICOLON);
			((ContinueupContext)_localctx).node =  new Continue(((ContinueupContext)_localctx).values.node, new Constant(1));
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
		public ASTNode node;
		public ValuesContext values;
		public TerminalNode CDOWN() { return getToken(SimpleParser.CDOWN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitContinuedown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuedownContext continuedown() throws RecognitionException {
		ContinuedownContext _localctx = new ContinuedownContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_continuedown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(CDOWN);
			setState(267);
			((ContinuedownContext)_localctx).values = values();
			setState(268);
			match(SEMICOLON);
			((ContinuedownContext)_localctx).node =  new Continue(((ContinuedownContext)_localctx).values.node, new Constant(2));
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
		public ASTNode node;
		public ValuesContext values;
		public TerminalNode CRIGHT() { return getToken(SimpleParser.CRIGHT, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitContinueright(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuerightContext continueright() throws RecognitionException {
		ContinuerightContext _localctx = new ContinuerightContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_continueright);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(CRIGHT);
			setState(272);
			((ContinuerightContext)_localctx).values = values();
			setState(273);
			match(SEMICOLON);
			((ContinuerightContext)_localctx).node =  new Continue(((ContinuerightContext)_localctx).values.node, new Constant(3));
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
		public ASTNode node;
		public ValuesContext values;
		public TerminalNode CLEFT() { return getToken(SimpleParser.CLEFT, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitContinueleft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueleftContext continueleft() throws RecognitionException {
		ContinueleftContext _localctx = new ContinueleftContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_continueleft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(CLEFT);
			setState(277);
			((ContinueleftContext)_localctx).values = values();
			setState(278);
			match(SEMICOLON);
			((ContinueleftContext)_localctx).node =  new Continue(((ContinueleftContext)_localctx).values.node, new Constant(4));
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
		public ASTNode node;
		public ExpressionContext t1;
		public ExpressionContext t2;
		public TerminalNode POS() { return getToken(SimpleParser.POS, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitPos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosContext pos() throws RecognitionException {
		PosContext _localctx = new PosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(POS);
			setState(282);
			match(PAR_OPEN);
			setState(283);
			((PosContext)_localctx).t1 = expression();
			setState(284);
			match(COLON);
			setState(285);
			((PosContext)_localctx).t2 = expression();
			setState(286);
			match(PAR_CLOSE);
			setState(287);
			match(SEMICOLON);
			((PosContext)_localctx).node =  new Pos(((PosContext)_localctx).t1.node, ((PosContext)_localctx).t2.node, new Constant(1));
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
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode POSX() { return getToken(SimpleParser.POSX, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitPosx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosxContext posx() throws RecognitionException {
		PosxContext _localctx = new PosxContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_posx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(POSX);
			setState(291);
			((PosxContext)_localctx).expression = expression();
			setState(292);
			match(SEMICOLON);
			((PosxContext)_localctx).node =  new Pos(((PosxContext)_localctx).expression.node, new Constant(0), new Constant(2));
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
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode POSY() { return getToken(SimpleParser.POSY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitPosy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosyContext posy() throws RecognitionException {
		PosyContext _localctx = new PosyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_posy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(POSY);
			setState(296);
			((PosyContext)_localctx).expression = expression();
			setState(297);
			match(SEMICOLON);
			((PosyContext)_localctx).node =  new Pos(new Constant(0), ((PosyContext)_localctx).expression.node, new Constant(3));
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
		public ASTNode node;
		public Token NUMBER;
		public TerminalNode COLOR() { return getToken(SimpleParser.COLOR, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(COLOR);
			setState(301);
			((ColorContext)_localctx).NUMBER = match(NUMBER);
			setState(302);
			match(SEMICOLON);
			((ColorContext)_localctx).node =  new Color(new Constant(Integer.parseInt((((ColorContext)_localctx).NUMBER!=null?((ColorContext)_localctx).NUMBER.getText():null))));
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
		public ASTNode node;
		public TerminalNode DOWN() { return getToken(SimpleParser.DOWN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitDown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DownContext down() throws RecognitionException {
		DownContext _localctx = new DownContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_down);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(DOWN);
			setState(306);
			match(SEMICOLON);
			((DownContext)_localctx).node =  new Move(new Constant(1));
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
		public ASTNode node;
		public TerminalNode UP() { return getToken(SimpleParser.UP, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitUp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpContext up() throws RecognitionException {
		UpContext _localctx = new UpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_up);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(UP);
			setState(310);
			match(SEMICOLON);
			((UpContext)_localctx).node =  new Move(new Constant(2));
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
		public ASTNode node;
		public TerminalNode BEG() { return getToken(SimpleParser.BEG, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitBeggining(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BegginingContext beggining() throws RecognitionException {
		BegginingContext _localctx = new BegginingContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_beggining);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(BEG);
			setState(314);
			match(SEMICOLON);
			((BegginingContext)_localctx).node =  new Pos(new Constant(0), new Constant(0), new Constant(1));
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
		public TerminalNode FOR() { return getToken(SimpleParser.FOR, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(SimpleParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SimpleParser.NUMBER, i);
		}
		public TerminalNode TO() { return getToken(SimpleParser.TO, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<TerminalNode> LOOP() { return getTokens(SimpleParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(SimpleParser.LOOP, i);
		}
		public TerminalNode P_OPEN() { return getToken(SimpleParser.P_OPEN, 0); }
		public TerminalNode P_CLOSE() { return getToken(SimpleParser.P_CLOSE, 0); }
		public TerminalNode END() { return getToken(SimpleParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForyContext fory() throws RecognitionException {
		ForyContext _localctx = new ForyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(FOR);
			setState(318);
			match(ID);
			setState(319);
			match(PAR_OPEN);
			setState(320);
			match(NUMBER);
			setState(321);
			match(TO);
			setState(322);
			match(NUMBER);
			setState(323);
			match(PAR_CLOSE);
			setState(324);
			match(LOOP);
			setState(325);
			match(P_OPEN);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << DEF) | (1L << PUT) | (1L << ADDO) | (1L << CUP) | (1L << CDOWN) | (1L << CRIGHT) | (1L << CLEFT) | (1L << POS) | (1L << POSX) | (1L << POSY) | (1L << COLOR) | (1L << DOWN) | (1L << UP) | (1L << BEG))) != 0)) {
				{
				{
				setState(326);
				sentence();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			match(P_CLOSE);
			setState(333);
			match(END);
			setState(334);
			match(LOOP);
			setState(335);
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

	public static class CasesContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(SimpleParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(SimpleParser.CASE, i);
		}
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode END() { return getToken(SimpleParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitCases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(CASE);
			setState(338);
			match(ID);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(339);
				when();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(345);
				elses();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(END);
			setState(352);
			match(CASE);
			setState(353);
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

	public static class WhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(SimpleParser.WHEN, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SimpleParser.THEN, 0); }
		public TerminalNode P_OPEN() { return getToken(SimpleParser.P_OPEN, 0); }
		public TerminalNode P_CLOSE() { return getToken(SimpleParser.P_CLOSE, 0); }
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
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(WHEN);
			setState(356);
			logic();
			setState(357);
			match(THEN);
			setState(358);
			match(P_OPEN);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << DEF) | (1L << PUT) | (1L << ADDO) | (1L << CUP) | (1L << CDOWN) | (1L << CRIGHT) | (1L << CLEFT) | (1L << POS) | (1L << POSX) | (1L << POSY) | (1L << COLOR) | (1L << DOWN) | (1L << UP) | (1L << BEG))) != 0)) {
				{
				{
				setState(359);
				sentence();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
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

	public static class ElsesContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SimpleParser.ELSE, 0); }
		public TerminalNode P_OPEN() { return getToken(SimpleParser.P_OPEN, 0); }
		public TerminalNode P_CLOSE() { return getToken(SimpleParser.P_CLOSE, 0); }
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
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterElses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitElses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitElses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsesContext elses() throws RecognitionException {
		ElsesContext _localctx = new ElsesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(ELSE);
			setState(368);
			match(P_OPEN);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << DEF) | (1L << PUT) | (1L << ADDO) | (1L << CUP) | (1L << CDOWN) | (1L << CRIGHT) | (1L << CLEFT) | (1L << POS) | (1L << POSX) | (1L << POSY) | (1L << COLOR) | (1L << DOWN) | (1L << UP) | (1L << BEG))) != 0)) {
				{
				{
				setState(369);
				sentence();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
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

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(SimpleParser.REPEAT, 0); }
		public List<TerminalNode> P_OPEN() { return getTokens(SimpleParser.P_OPEN); }
		public TerminalNode P_OPEN(int i) {
			return getToken(SimpleParser.P_OPEN, i);
		}
		public List<TerminalNode> P_CLOSE() { return getTokens(SimpleParser.P_CLOSE); }
		public TerminalNode P_CLOSE(int i) {
			return getToken(SimpleParser.P_CLOSE, i);
		}
		public TerminalNode UNTIL() { return getToken(SimpleParser.UNTIL, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(REPEAT);
			setState(378);
			match(P_OPEN);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << DEF) | (1L << PUT) | (1L << ADDO) | (1L << CUP) | (1L << CDOWN) | (1L << CRIGHT) | (1L << CLEFT) | (1L << POS) | (1L << POSX) | (1L << POSY) | (1L << COLOR) | (1L << DOWN) | (1L << UP) | (1L << BEG))) != 0)) {
				{
				{
				setState(379);
				sentence();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
			match(P_CLOSE);
			setState(386);
			match(UNTIL);
			setState(387);
			match(P_OPEN);
			setState(388);
			cond();
			setState(389);
			match(P_CLOSE);
			setState(390);
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

	public static class WhilesContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SimpleParser.WHILE, 0); }
		public List<TerminalNode> P_OPEN() { return getTokens(SimpleParser.P_OPEN); }
		public TerminalNode P_OPEN(int i) {
			return getToken(SimpleParser.P_OPEN, i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> P_CLOSE() { return getTokens(SimpleParser.P_CLOSE); }
		public TerminalNode P_CLOSE(int i) {
			return getToken(SimpleParser.P_CLOSE, i);
		}
		public TerminalNode WHEND() { return getToken(SimpleParser.WHEND, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
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
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterWhiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitWhiles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitWhiles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilesContext whiles() throws RecognitionException {
		WhilesContext _localctx = new WhilesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whiles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(WHILE);
			setState(393);
			match(P_OPEN);
			setState(394);
			cond();
			setState(395);
			match(P_CLOSE);
			setState(396);
			match(P_OPEN);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << DEF) | (1L << PUT) | (1L << ADDO) | (1L << CUP) | (1L << CDOWN) | (1L << CRIGHT) | (1L << CLEFT) | (1L << POS) | (1L << POSX) | (1L << POSY) | (1L << COLOR) | (1L << DOWN) | (1L << UP) | (1L << BEG))) != 0)) {
				{
				{
				setState(397);
				sentence();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
			match(P_CLOSE);
			setState(404);
			match(WHEND);
			setState(405);
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

	public static class CondContext extends ParserRuleContext {
		public ASTNode node;
		public NumContext t1;
		public EquationsContext equations;
		public NumContext t2;
		public LogicalContext logical;
		public Token BOOLEAN;
		public Token ID;
		public EquationsContext equations() {
			return getRuleContext(EquationsContext.class,0);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(SimpleParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cond);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				((CondContext)_localctx).t1 = num();
				setState(409);
				((CondContext)_localctx).equations = equations();
				setState(410);
				((CondContext)_localctx).t2 = num();
				((CondContext)_localctx).node =  new Logical(((CondContext)_localctx).t1.node, ((CondContext)_localctx).t2.node, ((CondContext)_localctx).equations.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				((CondContext)_localctx).logical = logical();
				((CondContext)_localctx).node =  ((CondContext)_localctx).logical.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				((CondContext)_localctx).BOOLEAN = match(BOOLEAN);
				((CondContext)_localctx).node =  new Constant(Boolean.parseBoolean((((CondContext)_localctx).BOOLEAN!=null?((CondContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				((CondContext)_localctx).ID = match(ID);
				((CondContext)_localctx).node =  new VarRef((((CondContext)_localctx).ID!=null?((CondContext)_localctx).ID.getText():null));
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
		public ASTNode node;
		public TerminalNode GT() { return getToken(SimpleParser.GT, 0); }
		public TerminalNode LT() { return getToken(SimpleParser.LT, 0); }
		public TerminalNode GEQ() { return getToken(SimpleParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(SimpleParser.LEQ, 0); }
		public TerminalNode EQ() { return getToken(SimpleParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SimpleParser.NEQ, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitEquations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationsContext equations() throws RecognitionException {
		EquationsContext _localctx = new EquationsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_equations);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(GT);
				((EquationsContext)_localctx).node =  new Constant(1);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(LT);
				((EquationsContext)_localctx).node =  new Constant(2);
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(GEQ);
				((EquationsContext)_localctx).node =  new Constant(3);
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				match(LEQ);
				((EquationsContext)_localctx).node =  new Constant(4);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(430);
				match(EQ);
				((EquationsContext)_localctx).node =  new Constant(5);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(432);
				match(NEQ);
				((EquationsContext)_localctx).node =  new Constant(6);
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

	public static class EqualContext extends ParserRuleContext {
		public ASTNode node;
		public ValuesContext t1;
		public ValuesContext t2;
		public TerminalNode EQUAL() { return getToken(SimpleParser.EQUAL, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(EQUAL);
			setState(437);
			match(PAR_OPEN);
			setState(438);
			((EqualContext)_localctx).t1 = values();
			setState(439);
			match(COLON);
			setState(440);
			((EqualContext)_localctx).t2 = values();
			setState(441);
			match(PAR_CLOSE);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(442);
				match(SEMICOLON);
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((EqualContext)_localctx).node =  new Logical(((EqualContext)_localctx).t1.node, ((EqualContext)_localctx).t1.node, new Constant(5));
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
		public ASTNode node;
		public CondContext t1;
		public CondContext t2;
		public TerminalNode AND() { return getToken(SimpleParser.AND, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_and);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(AND);
			setState(451);
			match(PAR_OPEN);
			setState(452);
			((AndContext)_localctx).t1 = cond();
			setState(453);
			match(COLON);
			setState(454);
			((AndContext)_localctx).t2 = cond();
			setState(455);
			match(PAR_CLOSE);
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(456);
					match(SEMICOLON);
					}
					} 
				}
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			((AndContext)_localctx).node =  new And(((AndContext)_localctx).t1.node, ((AndContext)_localctx).t2.node);
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
		public ASTNode node;
		public CondContext t1;
		public CondContext t2;
		public TerminalNode OR() { return getToken(SimpleParser.OR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(OR);
			setState(465);
			match(PAR_OPEN);
			setState(466);
			((OrContext)_localctx).t1 = cond();
			setState(467);
			match(COLON);
			setState(468);
			((OrContext)_localctx).t2 = cond();
			setState(469);
			match(PAR_CLOSE);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(470);
				match(SEMICOLON);
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((OrContext)_localctx).node =  new Or(((OrContext)_localctx).t1.node, ((OrContext)_localctx).t2.node);
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
		public ASTNode node;
		public ValuesContext t1;
		public ValuesContext t2;
		public TerminalNode GREATER() { return getToken(SimpleParser.GREATER, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_greater);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(GREATER);
			setState(479);
			match(PAR_OPEN);
			setState(480);
			((GreaterContext)_localctx).t1 = values();
			setState(481);
			match(COLON);
			setState(482);
			((GreaterContext)_localctx).t2 = values();
			setState(483);
			match(PAR_CLOSE);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(484);
				match(SEMICOLON);
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((GreaterContext)_localctx).node =  new Logical(((GreaterContext)_localctx).t1.node, ((GreaterContext)_localctx).t1.node, new Constant(1));
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
		public ASTNode node;
		public ValuesContext t1;
		public ValuesContext t2;
		public TerminalNode SMALLER() { return getToken(SimpleParser.SMALLER, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSmaller(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmallerContext smaller() throws RecognitionException {
		SmallerContext _localctx = new SmallerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_smaller);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(SMALLER);
			setState(493);
			match(PAR_OPEN);
			setState(494);
			((SmallerContext)_localctx).t1 = values();
			setState(495);
			match(COLON);
			setState(496);
			((SmallerContext)_localctx).t2 = values();
			setState(497);
			match(PAR_CLOSE);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(498);
				match(SEMICOLON);
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((SmallerContext)_localctx).node =  new Logical(((SmallerContext)_localctx).t1.node, ((SmallerContext)_localctx).t1.node, new Constant(2));
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
		public ASTNode node;
		public ExpressionContext expression;
		public Token ID;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_values);
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				((ValuesContext)_localctx).expression = expression();
				((ValuesContext)_localctx).node =  ((ValuesContext)_localctx).expression.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				((ValuesContext)_localctx).ID = match(ID);
				((ValuesContext)_localctx).node =  new VarRef((((ValuesContext)_localctx).ID!=null?((ValuesContext)_localctx).ID.getText():null));
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
		public ASTNode node;
		public ValuesContext t1;
		public ValuesContext t2;
		public TerminalNode SUBSTR() { return getToken(SimpleParser.SUBSTR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSubstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstrContext substr() throws RecognitionException {
		SubstrContext _localctx = new SubstrContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_substr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(SUBSTR);
			setState(514);
			match(PAR_OPEN);
			setState(515);
			((SubstrContext)_localctx).t1 = values();
			setState(516);
			match(COLON);
			setState(517);
			((SubstrContext)_localctx).t2 = values();
			setState(518);
			match(PAR_CLOSE);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(519);
				match(SEMICOLON);
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((SubstrContext)_localctx).node =  new Subtraction(((SubstrContext)_localctx).t1.node,((SubstrContext)_localctx).t2.node);
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
		public ASTNode node;
		public ValuesContext t1;
		public ValuesContext t2;
		public TerminalNode MULTO() { return getToken(SimpleParser.MULTO, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(MULTO);
			setState(528);
			match(PAR_OPEN);
			setState(529);
			((MultContext)_localctx).t1 = values();
			setState(530);
			match(COLON);
			setState(531);
			((MultContext)_localctx).t2 = values();
			setState(532);
			match(PAR_CLOSE);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(533);
				match(SEMICOLON);
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((MultContext)_localctx).node =  new Multiplication(((MultContext)_localctx).t1.node,((MultContext)_localctx).t2.node);
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
		public ASTNode node;
		public ValuesContext t1;
		public ValuesContext t2;
		public TerminalNode DIVO() { return getToken(SimpleParser.DIVO, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(DIVO);
			setState(542);
			match(PAR_OPEN);
			setState(543);
			((DivContext)_localctx).t1 = values();
			setState(544);
			match(COLON);
			setState(545);
			((DivContext)_localctx).t2 = values();
			setState(546);
			match(PAR_CLOSE);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(547);
				match(SEMICOLON);
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((DivContext)_localctx).node =  new Division(((DivContext)_localctx).t1.node,((DivContext)_localctx).t2.node);
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
		public ASTNode node;
		public ValuesContext t1;
		public ValuesContext t2;
		public TerminalNode SUMO() { return getToken(SimpleParser.SUMO, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public TerminalNode COLON() { return getToken(SimpleParser.COLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(SUMO);
			setState(556);
			match(PAR_OPEN);
			setState(557);
			((SumContext)_localctx).t1 = values();
			setState(558);
			match(COLON);
			setState(559);
			((SumContext)_localctx).t2 = values();
			setState(560);
			match(PAR_CLOSE);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(561);
				match(SEMICOLON);
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((SumContext)_localctx).node =  new Division(((SumContext)_localctx).t1.node,((SumContext)_localctx).t2.node);
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
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode RANDOM() { return getToken(SimpleParser.RANDOM, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleParser.SEMICOLON, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitRandom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RandomContext random() throws RecognitionException {
		RandomContext _localctx = new RandomContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_random);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(RANDOM);
			setState(570);
			match(PAR_OPEN);
			setState(571);
			((RandomContext)_localctx).expression = expression();
			setState(572);
			match(PAR_CLOSE);
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(573);
				match(SEMICOLON);
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((RandomContext)_localctx).node =  new Random(((RandomContext)_localctx).expression.node);
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
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimpleParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimpleParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SimpleParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SimpleParser.MINUS, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expression);
		int _la;
		try {
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				((ExpressionContext)_localctx).t1 = factor();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).t1.node;
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(583);
					match(PLUS);
					setState(584);
					((ExpressionContext)_localctx).t2 = factor();
					((ExpressionContext)_localctx).node =  new Addition(_localctx.node, ((ExpressionContext)_localctx).t2.node);
					}
					}
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				((ExpressionContext)_localctx).t1 = factor();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).t1.node;
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(594);
					match(MINUS);
					setState(595);
					((ExpressionContext)_localctx).t2 = factor();
					((ExpressionContext)_localctx).node =  new Subtraction(_localctx.node, ((ExpressionContext)_localctx).t2.node);
					}
					}
					setState(602);
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
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SimpleParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SimpleParser.MULT, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_factor);
		int _la;
		try {
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				((FactorContext)_localctx).t1 = term();
				((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT) {
					{
					{
					setState(607);
					match(MULT);
					setState(608);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Multiplication(_localctx.node, ((FactorContext)_localctx).t2.node);
					}
					}
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				((FactorContext)_localctx).t1 = term();
				((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(618);
					match(DIV);
					setState(619);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Division(_localctx.node, ((FactorContext)_localctx).t2.node);
					}
					}
					setState(626);
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
		public ASTNode node;
		public Token NUMBER;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			((TermContext)_localctx).NUMBER = match(NUMBER);
			((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
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
		public ASTNode node;
		public Token NUMBER;
		public Token BOOLEAN;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_logic);
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				((LogicContext)_localctx).NUMBER = match(NUMBER);
				((LogicContext)_localctx).node =  new Constant(Integer.parseInt((((LogicContext)_localctx).NUMBER!=null?((LogicContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				((LogicContext)_localctx).BOOLEAN = match(BOOLEAN);
				((LogicContext)_localctx).node =  new Constant(Boolean.parseBoolean((((LogicContext)_localctx).BOOLEAN!=null?((LogicContext)_localctx).BOOLEAN.getText():null)));
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

	public static class NumContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public Token BOOLEAN;
		public Token ID;
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimpleParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_num);
		try {
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				((NumContext)_localctx).NUMBER = match(NUMBER);
				((NumContext)_localctx).node =  new Constant(Integer.parseInt((((NumContext)_localctx).NUMBER!=null?((NumContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				((NumContext)_localctx).BOOLEAN = match(BOOLEAN);
				((NumContext)_localctx).node =  new Constant(Boolean.parseBoolean((((NumContext)_localctx).BOOLEAN!=null?((NumContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				((NumContext)_localctx).ID = match(ID);
				((NumContext)_localctx).node =  new VarRef((((NumContext)_localctx).ID!=null?((NumContext)_localctx).ID.getText():null));
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0289\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2c\n\2\f\2\16\2f\13\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0098\n\3\3\4\3\4"+
		"\3\4\3\4\5\4\u009e\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b2\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c3\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u00cf\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f5\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0106\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\7\26\u014a\n\26\f\26\16\26\u014d\13\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\7\27\u0157\n\27\f\27\16\27\u015a\13\27\3"+
		"\27\7\27\u015d\n\27\f\27\16\27\u0160\13\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\7\30\u016b\n\30\f\30\16\30\u016e\13\30\3\30\3\30\3"+
		"\31\3\31\3\31\7\31\u0175\n\31\f\31\16\31\u0178\13\31\3\31\3\31\3\32\3"+
		"\32\3\32\7\32\u017f\n\32\f\32\16\32\u0182\13\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0191\n\33\f\33\16\33"+
		"\u0194\13\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\5\34\u01a7\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01b5\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\7\36\u01be\n\36\f\36\16\36\u01c1\13\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01cc\n\37\f\37\16\37\u01cf\13\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \7 \u01da\n \f \16 \u01dd\13 \3 \3 \3!"+
		"\3!\3!\3!\3!\3!\3!\7!\u01e8\n!\f!\16!\u01eb\13!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\7\"\u01f6\n\"\f\"\16\"\u01f9\13\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\5#\u0202\n#\3$\3$\3$\3$\3$\3$\3$\7$\u020b\n$\f$\16$\u020e\13$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\7%\u0219\n%\f%\16%\u021c\13%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\7&\u0227\n&\f&\16&\u022a\13&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\7\'\u0235\n\'\f\'\16\'\u0238\13\'\3\'\3\'\3(\3(\3(\3(\3(\7(\u0241\n("+
		"\f(\16(\u0244\13(\3(\3(\3)\3)\3)\3)\3)\3)\7)\u024e\n)\f)\16)\u0251\13"+
		")\3)\3)\3)\3)\3)\3)\7)\u0259\n)\f)\16)\u025c\13)\5)\u025e\n)\3*\3*\3*"+
		"\3*\3*\3*\7*\u0266\n*\f*\16*\u0269\13*\3*\3*\3*\3*\3*\3*\7*\u0271\n*\f"+
		"*\16*\u0274\13*\5*\u0276\n*\3+\3+\3+\3,\3,\3,\3,\5,\u027f\n,\3-\3-\3-"+
		"\3-\3-\3-\5-\u0287\n-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\2\2\u029f\2Z\3\2\2\2\4\u0097\3"+
		"\2\2\2\6\u009d\3\2\2\2\b\u00b1\3\2\2\2\n\u00c2\3\2\2\2\f\u00ce\3\2\2\2"+
		"\16\u00d0\3\2\2\2\20\u00f4\3\2\2\2\22\u0105\3\2\2\2\24\u0107\3\2\2\2\26"+
		"\u010c\3\2\2\2\30\u0111\3\2\2\2\32\u0116\3\2\2\2\34\u011b\3\2\2\2\36\u0124"+
		"\3\2\2\2 \u0129\3\2\2\2\"\u012e\3\2\2\2$\u0133\3\2\2\2&\u0137\3\2\2\2"+
		"(\u013b\3\2\2\2*\u013f\3\2\2\2,\u0153\3\2\2\2.\u0165\3\2\2\2\60\u0171"+
		"\3\2\2\2\62\u017b\3\2\2\2\64\u018a\3\2\2\2\66\u01a6\3\2\2\28\u01b4\3\2"+
		"\2\2:\u01b6\3\2\2\2<\u01c4\3\2\2\2>\u01d2\3\2\2\2@\u01e0\3\2\2\2B\u01ee"+
		"\3\2\2\2D\u0201\3\2\2\2F\u0203\3\2\2\2H\u0211\3\2\2\2J\u021f\3\2\2\2L"+
		"\u022d\3\2\2\2N\u023b\3\2\2\2P\u025d\3\2\2\2R\u0275\3\2\2\2T\u0277\3\2"+
		"\2\2V\u027e\3\2\2\2X\u0286\3\2\2\2Z[\7\3\2\2[\\\7\67\2\2\\]\78\2\2]^\7"+
		"\65\2\2^d\b\2\1\2_`\5\4\3\2`a\b\2\1\2ac\3\2\2\2b_\3\2\2\2cf\3\2\2\2db"+
		"\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\66\2\2hi\b\2\1\2i\3\3\2\2\2"+
		"jk\5\16\b\2kl\b\3\1\2l\u0098\3\2\2\2mn\5\20\t\2no\b\3\1\2o\u0098\3\2\2"+
		"\2pq\5\f\7\2qr\b\3\1\2r\u0098\3\2\2\2st\5\22\n\2tu\b\3\1\2u\u0098\3\2"+
		"\2\2vw\5\24\13\2wx\b\3\1\2x\u0098\3\2\2\2yz\5\26\f\2z{\b\3\1\2{\u0098"+
		"\3\2\2\2|}\5\30\r\2}~\b\3\1\2~\u0098\3\2\2\2\177\u0080\5\32\16\2\u0080"+
		"\u0081\b\3\1\2\u0081\u0098\3\2\2\2\u0082\u0083\5\34\17\2\u0083\u0084\b"+
		"\3\1\2\u0084\u0098\3\2\2\2\u0085\u0086\5\36\20\2\u0086\u0087\b\3\1\2\u0087"+
		"\u0098\3\2\2\2\u0088\u0089\5 \21\2\u0089\u008a\b\3\1\2\u008a\u0098\3\2"+
		"\2\2\u008b\u008c\5\"\22\2\u008c\u008d\b\3\1\2\u008d\u0098\3\2\2\2\u008e"+
		"\u008f\5$\23\2\u008f\u0090\b\3\1\2\u0090\u0098\3\2\2\2\u0091\u0092\5&"+
		"\24\2\u0092\u0093\b\3\1\2\u0093\u0098\3\2\2\2\u0094\u0095\5(\25\2\u0095"+
		"\u0096\b\3\1\2\u0096\u0098\3\2\2\2\u0097j\3\2\2\2\u0097m\3\2\2\2\u0097"+
		"p\3\2\2\2\u0097s\3\2\2\2\u0097v\3\2\2\2\u0097y\3\2\2\2\u0097|\3\2\2\2"+
		"\u0097\177\3\2\2\2\u0097\u0082\3\2\2\2\u0097\u0085\3\2\2\2\u0097\u0088"+
		"\3\2\2\2\u0097\u008b\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u0091\3\2\2\2\u0097"+
		"\u0094\3\2\2\2\u0098\5\3\2\2\2\u0099\u009e\5*\26\2\u009a\u009e\5,\27\2"+
		"\u009b\u009e\5\62\32\2\u009c\u009e\5\64\33\2\u009d\u0099\3\2\2\2\u009d"+
		"\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\7\3\2\2\2"+
		"\u009f\u00a0\5\n\6\2\u00a0\u00a1\b\5\1\2\u00a1\u00b2\3\2\2\2\u00a2\u00a3"+
		"\5F$\2\u00a3\u00a4\b\5\1\2\u00a4\u00b2\3\2\2\2\u00a5\u00a6\5N(\2\u00a6"+
		"\u00a7\b\5\1\2\u00a7\u00b2\3\2\2\2\u00a8\u00a9\5H%\2\u00a9\u00aa\b\5\1"+
		"\2\u00aa\u00b2\3\2\2\2\u00ab\u00ac\5J&\2\u00ac\u00ad\b\5\1\2\u00ad\u00b2"+
		"\3\2\2\2\u00ae\u00af\5L\'\2\u00af\u00b0\b\5\1\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u009f\3\2\2\2\u00b1\u00a2\3\2\2\2\u00b1\u00a5\3\2\2\2\u00b1\u00a8\3\2"+
		"\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\t\3\2\2\2\u00b3\u00b4"+
		"\5:\36\2\u00b4\u00b5\b\6\1\2\u00b5\u00c3\3\2\2\2\u00b6\u00b7\5<\37\2\u00b7"+
		"\u00b8\b\6\1\2\u00b8\u00c3\3\2\2\2\u00b9\u00ba\5> \2\u00ba\u00bb\b\6\1"+
		"\2\u00bb\u00c3\3\2\2\2\u00bc\u00bd\5@!\2\u00bd\u00be\b\6\1\2\u00be\u00c3"+
		"\3\2\2\2\u00bf\u00c0\5B\"\2\u00c0\u00c1\b\6\1\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00b3\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00bc\3\2"+
		"\2\2\u00c2\u00bf\3\2\2\2\u00c3\13\3\2\2\2\u00c4\u00c5\7\4\2\2\u00c5\u00c6"+
		"\5P)\2\u00c6\u00c7\7;\2\2\u00c7\u00c8\b\7\1\2\u00c8\u00cf\3\2\2\2\u00c9"+
		"\u00ca\7\4\2\2\u00ca\u00cb\5<\37\2\u00cb\u00cc\7;\2\2\u00cc\u00cd\b\7"+
		"\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00c4\3\2\2\2\u00ce\u00c9\3\2\2\2\u00cf"+
		"\r\3\2\2\2\u00d0\u00d1\7\6\2\2\u00d1\u00d2\7\67\2\2\u00d2\u00d3\7>\2\2"+
		"\u00d3\u00d4\7<\2\2\u00d4\u00d5\5V,\2\u00d5\u00d6\78\2\2\u00d6\u00d7\7"+
		";\2\2\u00d7\u00d8\b\b\1\2\u00d8\17\3\2\2\2\u00d9\u00da\7\7\2\2\u00da\u00db"+
		"\7\67\2\2\u00db\u00dc\7>\2\2\u00dc\u00dd\7<\2\2\u00dd\u00de\5V,\2\u00de"+
		"\u00df\78\2\2\u00df\u00e0\7;\2\2\u00e0\u00e1\b\t\1\2\u00e1\u00f5\3\2\2"+
		"\2\u00e2\u00e3\7\7\2\2\u00e3\u00e4\7\67\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6"+
		"\7<\2\2\u00e6\u00e7\5\b\5\2\u00e7\u00e8\78\2\2\u00e8\u00e9\7;\2\2\u00e9"+
		"\u00ea\b\t\1\2\u00ea\u00f5\3\2\2\2\u00eb\u00ec\7\7\2\2\u00ec\u00ed\7\67"+
		"\2\2\u00ed\u00ee\7>\2\2\u00ee\u00ef\7<\2\2\u00ef\u00f0\5P)\2\u00f0\u00f1"+
		"\78\2\2\u00f1\u00f2\7;\2\2\u00f2\u00f3\b\t\1\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00d9\3\2\2\2\u00f4\u00e2\3\2\2\2\u00f4\u00eb\3\2\2\2\u00f5\21\3\2\2"+
		"\2\u00f6\u00f7\7\b\2\2\u00f7\u00f8\7\67\2\2\u00f8\u00f9\7>\2\2\u00f9\u00fa"+
		"\78\2\2\u00fa\u00fb\7;\2\2\u00fb\u0106\b\n\1\2\u00fc\u00fd\7\b\2\2\u00fd"+
		"\u00fe\7\67\2\2\u00fe\u00ff\7>\2\2\u00ff\u0100\7<\2\2\u0100\u0101\5D#"+
		"\2\u0101\u0102\78\2\2\u0102\u0103\7;\2\2\u0103\u0104\b\n\1\2\u0104\u0106"+
		"\3\2\2\2\u0105\u00f6\3\2\2\2\u0105\u00fc\3\2\2\2\u0106\23\3\2\2\2\u0107"+
		"\u0108\7\f\2\2\u0108\u0109\5D#\2\u0109\u010a\7;\2\2\u010a\u010b\b\13\1"+
		"\2\u010b\25\3\2\2\2\u010c\u010d\7\r\2\2\u010d\u010e\5D#\2\u010e\u010f"+
		"\7;\2\2\u010f\u0110\b\f\1\2\u0110\27\3\2\2\2\u0111\u0112\7\16\2\2\u0112"+
		"\u0113\5D#\2\u0113\u0114\7;\2\2\u0114\u0115\b\r\1\2\u0115\31\3\2\2\2\u0116"+
		"\u0117\7\17\2\2\u0117\u0118\5D#\2\u0118\u0119\7;\2\2\u0119\u011a\b\16"+
		"\1\2\u011a\33\3\2\2\2\u011b\u011c\7\20\2\2\u011c\u011d\7\67\2\2\u011d"+
		"\u011e\5P)\2\u011e\u011f\7<\2\2\u011f\u0120\5P)\2\u0120\u0121\78\2\2\u0121"+
		"\u0122\7;\2\2\u0122\u0123\b\17\1\2\u0123\35\3\2\2\2\u0124\u0125\7\21\2"+
		"\2\u0125\u0126\5P)\2\u0126\u0127\7;\2\2\u0127\u0128\b\20\1\2\u0128\37"+
		"\3\2\2\2\u0129\u012a\7\22\2\2\u012a\u012b\5P)\2\u012b\u012c\7;\2\2\u012c"+
		"\u012d\b\21\1\2\u012d!\3\2\2\2\u012e\u012f\7\23\2\2\u012f\u0130\7?\2\2"+
		"\u0130\u0131\7;\2\2\u0131\u0132\b\22\1\2\u0132#\3\2\2\2\u0133\u0134\7"+
		"\24\2\2\u0134\u0135\7;\2\2\u0135\u0136\b\23\1\2\u0136%\3\2\2\2\u0137\u0138"+
		"\7\25\2\2\u0138\u0139\7;\2\2\u0139\u013a\b\24\1\2\u013a\'\3\2\2\2\u013b"+
		"\u013c\7\26\2\2\u013c\u013d\7;\2\2\u013d\u013e\b\25\1\2\u013e)\3\2\2\2"+
		"\u013f\u0140\7\27\2\2\u0140\u0141\7>\2\2\u0141\u0142\7\67\2\2\u0142\u0143"+
		"\7?\2\2\u0143\u0144\7\32\2\2\u0144\u0145\7?\2\2\u0145\u0146\78\2\2\u0146"+
		"\u0147\7\30\2\2\u0147\u014b\79\2\2\u0148\u014a\5\4\3\2\u0149\u0148\3\2"+
		"\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7:\2\2\u014f\u0150\7\31"+
		"\2\2\u0150\u0151\7\30\2\2\u0151\u0152\7;\2\2\u0152+\3\2\2\2\u0153\u0154"+
		"\7\33\2\2\u0154\u0158\7>\2\2\u0155\u0157\5.\30\2\u0156\u0155\3\2\2\2\u0157"+
		"\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015e\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015b\u015d\5\60\31\2\u015c\u015b\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\31\2\2\u0162\u0163\7\33\2\2\u0163"+
		"\u0164\7;\2\2\u0164-\3\2\2\2\u0165\u0166\7\34\2\2\u0166\u0167\5V,\2\u0167"+
		"\u0168\7\35\2\2\u0168\u016c\79\2\2\u0169\u016b\5\4\3\2\u016a\u0169\3\2"+
		"\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7:\2\2\u0170/\3\2\2\2\u0171"+
		"\u0172\7\36\2\2\u0172\u0176\79\2\2\u0173\u0175\5\4\3\2\u0174\u0173\3\2"+
		"\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7:\2\2\u017a\61\3\2\2\2"+
		"\u017b\u017c\7\37\2\2\u017c\u0180\79\2\2\u017d\u017f\5\4\3\2\u017e\u017d"+
		"\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7:\2\2\u0184\u0185\7 \2"+
		"\2\u0185\u0186\79\2\2\u0186\u0187\5\66\34\2\u0187\u0188\7:\2\2\u0188\u0189"+
		"\7;\2\2\u0189\63\3\2\2\2\u018a\u018b\7!\2\2\u018b\u018c\79\2\2\u018c\u018d"+
		"\5\66\34\2\u018d\u018e\7:\2\2\u018e\u0192\79\2\2\u018f\u0191\5\4\3\2\u0190"+
		"\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7:\2\2\u0196"+
		"\u0197\7\"\2\2\u0197\u0198\7;\2\2\u0198\65\3\2\2\2\u0199\u01a7\3\2\2\2"+
		"\u019a\u019b\5X-\2\u019b\u019c\58\35\2\u019c\u019d\5X-\2\u019d\u019e\b"+
		"\34\1\2\u019e\u01a7\3\2\2\2\u019f\u01a0\5\n\6\2\u01a0\u01a1\b\34\1\2\u01a1"+
		"\u01a7\3\2\2\2\u01a2\u01a3\7=\2\2\u01a3\u01a7\b\34\1\2\u01a4\u01a5\7>"+
		"\2\2\u01a5\u01a7\b\34\1\2\u01a6\u0199\3\2\2\2\u01a6\u019a\3\2\2\2\u01a6"+
		"\u019f\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\67\3\2\2"+
		"\2\u01a8\u01a9\7.\2\2\u01a9\u01b5\b\35\1\2\u01aa\u01ab\7/\2\2\u01ab\u01b5"+
		"\b\35\1\2\u01ac\u01ad\7\60\2\2\u01ad\u01b5\b\35\1\2\u01ae\u01af\7\61\2"+
		"\2\u01af\u01b5\b\35\1\2\u01b0\u01b1\7\62\2\2\u01b1\u01b5\b\35\1\2\u01b2"+
		"\u01b3\7\63\2\2\u01b3\u01b5\b\35\1\2\u01b4\u01a8\3\2\2\2\u01b4\u01aa\3"+
		"\2\2\2\u01b4\u01ac\3\2\2\2\u01b4\u01ae\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b59\3\2\2\2\u01b6\u01b7\7#\2\2\u01b7\u01b8\7\67\2\2"+
		"\u01b8\u01b9\5D#\2\u01b9\u01ba\7<\2\2\u01ba\u01bb\5D#\2\u01bb\u01bf\7"+
		"8\2\2\u01bc\u01be\7;\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c2\u01c3\b\36\1\2\u01c3;\3\2\2\2\u01c4\u01c5\7$\2\2\u01c5\u01c6"+
		"\7\67\2\2\u01c6\u01c7\5\66\34\2\u01c7\u01c8\7<\2\2\u01c8\u01c9\5\66\34"+
		"\2\u01c9\u01cd\78\2\2\u01ca\u01cc\7;\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf"+
		"\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01d0\u01d1\b\37\1\2\u01d1=\3\2\2\2\u01d2\u01d3\7%\2\2"+
		"\u01d3\u01d4\7\67\2\2\u01d4\u01d5\5\66\34\2\u01d5\u01d6\7<\2\2\u01d6\u01d7"+
		"\5\66\34\2\u01d7\u01db\78\2\2\u01d8\u01da\7;\2\2\u01d9\u01d8\3\2\2\2\u01da"+
		"\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2"+
		"\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\b \1\2\u01df?\3\2\2\2\u01e0\u01e1"+
		"\7&\2\2\u01e1\u01e2\7\67\2\2\u01e2\u01e3\5D#\2\u01e3\u01e4\7<\2\2\u01e4"+
		"\u01e5\5D#\2\u01e5\u01e9\78\2\2\u01e6\u01e8\7;\2\2\u01e7\u01e6\3\2\2\2"+
		"\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec"+
		"\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\b!\1\2\u01edA\3\2\2\2\u01ee\u01ef"+
		"\7\'\2\2\u01ef\u01f0\7\67\2\2\u01f0\u01f1\5D#\2\u01f1\u01f2\7<\2\2\u01f2"+
		"\u01f3\5D#\2\u01f3\u01f7\78\2\2\u01f4\u01f6\7;\2\2\u01f5\u01f4\3\2\2\2"+
		"\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa"+
		"\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\b\"\1\2\u01fbC\3\2\2\2\u01fc"+
		"\u01fd\5P)\2\u01fd\u01fe\b#\1\2\u01fe\u0202\3\2\2\2\u01ff\u0200\7>\2\2"+
		"\u0200\u0202\b#\1\2\u0201\u01fc\3\2\2\2\u0201\u01ff\3\2\2\2\u0202E\3\2"+
		"\2\2\u0203\u0204\7(\2\2\u0204\u0205\7\67\2\2\u0205\u0206\5D#\2\u0206\u0207"+
		"\7<\2\2\u0207\u0208\5D#\2\u0208\u020c\78\2\2\u0209\u020b\7;\2\2\u020a"+
		"\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2"+
		"\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\b$\1\2\u0210"+
		"G\3\2\2\2\u0211\u0212\7\t\2\2\u0212\u0213\7\67\2\2\u0213\u0214\5D#\2\u0214"+
		"\u0215\7<\2\2\u0215\u0216\5D#\2\u0216\u021a\78\2\2\u0217\u0219\7;\2\2"+
		"\u0218\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b"+
		"\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\b%\1\2\u021e"+
		"I\3\2\2\2\u021f\u0220\7\n\2\2\u0220\u0221\7\67\2\2\u0221\u0222\5D#\2\u0222"+
		"\u0223\7<\2\2\u0223\u0224\5D#\2\u0224\u0228\78\2\2\u0225\u0227\7;\2\2"+
		"\u0226\u0225\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022c\b&\1\2\u022c"+
		"K\3\2\2\2\u022d\u022e\7\13\2\2\u022e\u022f\7\67\2\2\u022f\u0230\5D#\2"+
		"\u0230\u0231\7<\2\2\u0231\u0232\5D#\2\u0232\u0236\78\2\2\u0233\u0235\7"+
		";\2\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\b\'"+
		"\1\2\u023aM\3\2\2\2\u023b\u023c\7)\2\2\u023c\u023d\7\67\2\2\u023d\u023e"+
		"\5P)\2\u023e\u0242\78\2\2\u023f\u0241\7;\2\2\u0240\u023f\3\2\2\2\u0241"+
		"\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2"+
		"\2\2\u0244\u0242\3\2\2\2\u0245\u0246\b(\1\2\u0246O\3\2\2\2\u0247\u0248"+
		"\5R*\2\u0248\u024f\b)\1\2\u0249\u024a\7*\2\2\u024a\u024b\5R*\2\u024b\u024c"+
		"\b)\1\2\u024c\u024e\3\2\2\2\u024d\u0249\3\2\2\2\u024e\u0251\3\2\2\2\u024f"+
		"\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u025e\3\2\2\2\u0251\u024f\3\2"+
		"\2\2\u0252\u0253\5R*\2\u0253\u025a\b)\1\2\u0254\u0255\7+\2\2\u0255\u0256"+
		"\5R*\2\u0256\u0257\b)\1\2\u0257\u0259\3\2\2\2\u0258\u0254\3\2\2\2\u0259"+
		"\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025e\3\2"+
		"\2\2\u025c\u025a\3\2\2\2\u025d\u0247\3\2\2\2\u025d\u0252\3\2\2\2\u025e"+
		"Q\3\2\2\2\u025f\u0260\5T+\2\u0260\u0267\b*\1\2\u0261\u0262\7,\2\2\u0262"+
		"\u0263\5T+\2\u0263\u0264\b*\1\2\u0264\u0266\3\2\2\2\u0265\u0261\3\2\2"+
		"\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0276"+
		"\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026b\5T+\2\u026b\u0272\b*\1\2\u026c"+
		"\u026d\7-\2\2\u026d\u026e\5T+\2\u026e\u026f\b*\1\2\u026f\u0271\3\2\2\2"+
		"\u0270\u026c\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273"+
		"\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u025f\3\2\2\2\u0275"+
		"\u026a\3\2\2\2\u0276S\3\2\2\2\u0277\u0278\7?\2\2\u0278\u0279\b+\1\2\u0279"+
		"U\3\2\2\2\u027a\u027b\7?\2\2\u027b\u027f\b,\1\2\u027c\u027d\7=\2\2\u027d"+
		"\u027f\b,\1\2\u027e\u027a\3\2\2\2\u027e\u027c\3\2\2\2\u027fW\3\2\2\2\u0280"+
		"\u0281\7?\2\2\u0281\u0287\b-\1\2\u0282\u0283\7=\2\2\u0283\u0287\b-\1\2"+
		"\u0284\u0285\7>\2\2\u0285\u0287\b-\1\2\u0286\u0280\3\2\2\2\u0286\u0282"+
		"\3\2\2\2\u0286\u0284\3\2\2\2\u0287Y\3\2\2\2&d\u0097\u009d\u00b1\u00c2"+
		"\u00ce\u00f4\u0105\u014b\u0158\u015e\u016c\u0176\u0180\u0192\u01a6\u01b4"+
		"\u01bf\u01cd\u01db\u01e9\u01f7\u0201\u020c\u021a\u0228\u0236\u0242\u024f"+
		"\u025a\u025d\u0267\u0272\u0275\u027e\u0286";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}