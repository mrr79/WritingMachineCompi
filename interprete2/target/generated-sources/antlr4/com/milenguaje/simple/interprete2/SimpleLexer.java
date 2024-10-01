// Generated from com\milenguaje\simple\interprete2\Simple.g4 by ANTLR 4.9.2
package com.milenguaje.simple.interprete2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "PRINTLN", "COM", "DEF", "PUT", "ADDO", "MULTO", "DIVO", "SUMO", 
			"CUP", "CDOWN", "CRIGHT", "CLEFT", "POS", "POSX", "POSY", "COLOR", "DOWN", 
			"UP", "BEG", "FOR", "LOOP", "END", "TO", "CASE", "WHEN", "THEN", "ELSE", 
			"REPEAT", "UNTIL", "WHILE", "WHEND", "EQUAL", "AND", "OR", "GREATER", 
			"SMALLER", "SUBSTR", "RANDOM", "PLUS", "MINUS", "MULT", "DIV", "GT", 
			"LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", 
			"PAR_OPEN", "PAR_CLOSE", "P_OPEN", "P_CLOSE", "SEMICOLON", "COLON", "BOOLEAN", 
			"ID", "NUMBER", "WS"
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


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u01b4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3"+
		":\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u01a0\n<\3=\3=\7=\u01a4\n=\f=\16"+
		"=\u01a7\13=\3>\6>\u01aa\n>\r>\16>\u01ab\3?\6?\u01af\n?\r?\16?\u01b0\3"+
		"?\3?\2\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2"+
		"\13\f\17\17\"\"\2\u01b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u0084\3\2\2"+
		"\2\7\u008c\3\2\2\2\t\u008f\3\2\2\2\13\u0093\3\2\2\2\r\u0097\3\2\2\2\17"+
		"\u009b\3\2\2\2\21\u00a0\3\2\2\2\23\u00a4\3\2\2\2\25\u00a8\3\2\2\2\27\u00b3"+
		"\3\2\2\2\31\u00c0\3\2\2\2\33\u00ce\3\2\2\2\35\u00db\3\2\2\2\37\u00df\3"+
		"\2\2\2!\u00e4\3\2\2\2#\u00e9\3\2\2\2%\u00f2\3\2\2\2\'\u00f7\3\2\2\2)\u00fa"+
		"\3\2\2\2+\u0104\3\2\2\2-\u0108\3\2\2\2/\u010d\3\2\2\2\61\u0111\3\2\2\2"+
		"\63\u0114\3\2\2\2\65\u0119\3\2\2\2\67\u011e\3\2\2\29\u0123\3\2\2\2;\u0128"+
		"\3\2\2\2=\u012f\3\2\2\2?\u0135\3\2\2\2A\u013b\3\2\2\2C\u0141\3\2\2\2E"+
		"\u0147\3\2\2\2G\u014b\3\2\2\2I\u014e\3\2\2\2K\u0156\3\2\2\2M\u015e\3\2"+
		"\2\2O\u0165\3\2\2\2Q\u016c\3\2\2\2S\u016e\3\2\2\2U\u0170\3\2\2\2W\u0172"+
		"\3\2\2\2Y\u0174\3\2\2\2[\u0176\3\2\2\2]\u0178\3\2\2\2_\u017b\3\2\2\2a"+
		"\u017e\3\2\2\2c\u0181\3\2\2\2e\u0184\3\2\2\2g\u0186\3\2\2\2i\u0188\3\2"+
		"\2\2k\u018a\3\2\2\2m\u018c\3\2\2\2o\u018e\3\2\2\2q\u0190\3\2\2\2s\u0192"+
		"\3\2\2\2u\u0194\3\2\2\2w\u019f\3\2\2\2y\u01a1\3\2\2\2{\u01a9\3\2\2\2}"+
		"\u01ae\3\2\2\2\177\u0080\7o\2\2\u0080\u0081\7c\2\2\u0081\u0082\7k\2\2"+
		"\u0082\u0083\7p\2\2\u0083\4\3\2\2\2\u0084\u0085\7r\2\2\u0085\u0086\7t"+
		"\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7v\2\2\u0089\u008a"+
		"\7n\2\2\u008a\u008b\7p\2\2\u008b\6\3\2\2\2\u008c\u008d\7\61\2\2\u008d"+
		"\u008e\7\61\2\2\u008e\b\3\2\2\2\u008f\u0090\7F\2\2\u0090\u0091\7g\2\2"+
		"\u0091\u0092\7h\2\2\u0092\n\3\2\2\2\u0093\u0094\7R\2\2\u0094\u0095\7w"+
		"\2\2\u0095\u0096\7v\2\2\u0096\f\3\2\2\2\u0097\u0098\7C\2\2\u0098\u0099"+
		"\7f\2\2\u0099\u009a\7f\2\2\u009a\16\3\2\2\2\u009b\u009c\7O\2\2\u009c\u009d"+
		"\7w\2\2\u009d\u009e\7n\2\2\u009e\u009f\7v\2\2\u009f\20\3\2\2\2\u00a0\u00a1"+
		"\7F\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7x\2\2\u00a3\22\3\2\2\2\u00a4\u00a5"+
		"\7U\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7o\2\2\u00a7\24\3\2\2\2\u00a8\u00a9"+
		"\7E\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7g\2\2"+
		"\u00b0\u00b1\7W\2\2\u00b1\u00b2\7r\2\2\u00b2\26\3\2\2\2\u00b3\u00b4\7"+
		"E\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7F\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7y\2\2\u00be\u00bf\7p\2\2"+
		"\u00bf\30\3\2\2\2\u00c0\u00c1\7E\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7"+
		"p\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7"+
		"\7w\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7T\2\2\u00c9\u00ca\7k\2\2\u00ca"+
		"\u00cb\7i\2\2\u00cb\u00cc\7j\2\2\u00cc\u00cd\7v\2\2\u00cd\32\3\2\2\2\u00ce"+
		"\u00cf\7E\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2"+
		"\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6"+
		"\7g\2\2\u00d6\u00d7\7N\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7h\2\2\u00d9"+
		"\u00da\7v\2\2\u00da\34\3\2\2\2\u00db\u00dc\7R\2\2\u00dc\u00dd\7q\2\2\u00dd"+
		"\u00de\7u\2\2\u00de\36\3\2\2\2\u00df\u00e0\7R\2\2\u00e0\u00e1\7q\2\2\u00e1"+
		"\u00e2\7u\2\2\u00e2\u00e3\7Z\2\2\u00e3 \3\2\2\2\u00e4\u00e5\7R\2\2\u00e5"+
		"\u00e6\7q\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7[\2\2\u00e8\"\3\2\2\2\u00e9"+
		"\u00ea\7W\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7E\2\2"+
		"\u00ed\u00ee\7q\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1"+
		"\7t\2\2\u00f1$\3\2\2\2\u00f2\u00f3\7F\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5"+
		"\7y\2\2\u00f5\u00f6\7p\2\2\u00f6&\3\2\2\2\u00f7\u00f8\7W\2\2\u00f8\u00f9"+
		"\7r\2\2\u00f9(\3\2\2\2\u00fa\u00fb\7D\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd"+
		"\7i\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7p\2\2\u0100"+
		"\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7i\2\2\u0103*\3\2\2\2\u0104"+
		"\u0105\7H\2\2\u0105\u0106\7q\2\2\u0106\u0107\7t\2\2\u0107,\3\2\2\2\u0108"+
		"\u0109\7N\2\2\u0109\u010a\7q\2\2\u010a\u010b\7q\2\2\u010b\u010c\7r\2\2"+
		"\u010c.\3\2\2\2\u010d\u010e\7G\2\2\u010e\u010f\7p\2\2\u010f\u0110\7f\2"+
		"\2\u0110\60\3\2\2\2\u0111\u0112\7v\2\2\u0112\u0113\7q\2\2\u0113\62\3\2"+
		"\2\2\u0114\u0115\7E\2\2\u0115\u0116\7c\2\2\u0116\u0117\7u\2\2\u0117\u0118"+
		"\7g\2\2\u0118\64\3\2\2\2\u0119\u011a\7Y\2\2\u011a\u011b\7j\2\2\u011b\u011c"+
		"\7g\2\2\u011c\u011d\7p\2\2\u011d\66\3\2\2\2\u011e\u011f\7V\2\2\u011f\u0120"+
		"\7j\2\2\u0120\u0121\7g\2\2\u0121\u0122\7p\2\2\u01228\3\2\2\2\u0123\u0124"+
		"\7G\2\2\u0124\u0125\7n\2\2\u0125\u0126\7u\2\2\u0126\u0127\7g\2\2\u0127"+
		":\3\2\2\2\u0128\u0129\7T\2\2\u0129\u012a\7g\2\2\u012a\u012b\7r\2\2\u012b"+
		"\u012c\7g\2\2\u012c\u012d\7c\2\2\u012d\u012e\7v\2\2\u012e<\3\2\2\2\u012f"+
		"\u0130\7W\2\2\u0130\u0131\7p\2\2\u0131\u0132\7v\2\2\u0132\u0133\7k\2\2"+
		"\u0133\u0134\7n\2\2\u0134>\3\2\2\2\u0135\u0136\7Y\2\2\u0136\u0137\7j\2"+
		"\2\u0137\u0138\7k\2\2\u0138\u0139\7n\2\2\u0139\u013a\7g\2\2\u013a@\3\2"+
		"\2\2\u013b\u013c\7Y\2\2\u013c\u013d\7j\2\2\u013d\u013e\7g\2\2\u013e\u013f"+
		"\7p\2\2\u013f\u0140\7f\2\2\u0140B\3\2\2\2\u0141\u0142\7G\2\2\u0142\u0143"+
		"\7s\2\2\u0143\u0144\7w\2\2\u0144\u0145\7c\2\2\u0145\u0146\7n\2\2\u0146"+
		"D\3\2\2\2\u0147\u0148\7C\2\2\u0148\u0149\7p\2\2\u0149\u014a\7f\2\2\u014a"+
		"F\3\2\2\2\u014b\u014c\7Q\2\2\u014c\u014d\7t\2\2\u014dH\3\2\2\2\u014e\u014f"+
		"\7I\2\2\u014f\u0150\7t\2\2\u0150\u0151\7g\2\2\u0151\u0152\7c\2\2\u0152"+
		"\u0153\7v\2\2\u0153\u0154\7g\2\2\u0154\u0155\7t\2\2\u0155J\3\2\2\2\u0156"+
		"\u0157\7U\2\2\u0157\u0158\7o\2\2\u0158\u0159\7c\2\2\u0159\u015a\7n\2\2"+
		"\u015a\u015b\7n\2\2\u015b\u015c\7g\2\2\u015c\u015d\7t\2\2\u015dL\3\2\2"+
		"\2\u015e\u015f\7U\2\2\u015f\u0160\7w\2\2\u0160\u0161\7d\2\2\u0161\u0162"+
		"\7u\2\2\u0162\u0163\7v\2\2\u0163\u0164\7t\2\2\u0164N\3\2\2\2\u0165\u0166"+
		"\7T\2\2\u0166\u0167\7c\2\2\u0167\u0168\7p\2\2\u0168\u0169\7f\2\2\u0169"+
		"\u016a\7q\2\2\u016a\u016b\7o\2\2\u016bP\3\2\2\2\u016c\u016d\7-\2\2\u016d"+
		"R\3\2\2\2\u016e\u016f\7/\2\2\u016fT\3\2\2\2\u0170\u0171\7,\2\2\u0171V"+
		"\3\2\2\2\u0172\u0173\7\61\2\2\u0173X\3\2\2\2\u0174\u0175\7@\2\2\u0175"+
		"Z\3\2\2\2\u0176\u0177\7>\2\2\u0177\\\3\2\2\2\u0178\u0179\7@\2\2\u0179"+
		"\u017a\7?\2\2\u017a^\3\2\2\2\u017b\u017c\7>\2\2\u017c\u017d\7?\2\2\u017d"+
		"`\3\2\2\2\u017e\u017f\7?\2\2\u017f\u0180\7?\2\2\u0180b\3\2\2\2\u0181\u0182"+
		"\7#\2\2\u0182\u0183\7?\2\2\u0183d\3\2\2\2\u0184\u0185\7?\2\2\u0185f\3"+
		"\2\2\2\u0186\u0187\7}\2\2\u0187h\3\2\2\2\u0188\u0189\7\177\2\2\u0189j"+
		"\3\2\2\2\u018a\u018b\7*\2\2\u018bl\3\2\2\2\u018c\u018d\7+\2\2\u018dn\3"+
		"\2\2\2\u018e\u018f\7]\2\2\u018fp\3\2\2\2\u0190\u0191\7_\2\2\u0191r\3\2"+
		"\2\2\u0192\u0193\7=\2\2\u0193t\3\2\2\2\u0194\u0195\7.\2\2\u0195v\3\2\2"+
		"\2\u0196\u0197\7v\2\2\u0197\u0198\7t\2\2\u0198\u0199\7w\2\2\u0199\u01a0"+
		"\7g\2\2\u019a\u019b\7h\2\2\u019b\u019c\7c\2\2\u019c\u019d\7n\2\2\u019d"+
		"\u019e\7u\2\2\u019e\u01a0\7g\2\2\u019f\u0196\3\2\2\2\u019f\u019a\3\2\2"+
		"\2\u01a0x\3\2\2\2\u01a1\u01a5\t\2\2\2\u01a2\u01a4\t\3\2\2\u01a3\u01a2"+
		"\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"z\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01aa\t\4\2\2\u01a9\u01a8\3\2\2\2"+
		"\u01aa\u01ab\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac|\3"+
		"\2\2\2\u01ad\u01af\t\5\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\b?"+
		"\2\2\u01b3~\3\2\2\2\7\2\u019f\u01a5\u01ab\u01b0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}