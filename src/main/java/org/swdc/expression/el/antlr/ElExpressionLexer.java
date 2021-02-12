package org.swdc.expression.el.antlr;
// Generated from ElExpression.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ElExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, WORD=2, NUM=3, DOT=4, DQUOT=5, QUOT=6, PLUS=7, REDC=8, MULT=9, DEV=10, 
		EVAL=11, BL=12, BR=13, AL=14, AR=15, SL=16, SR=17, OR=18, AND=19, NOR=20, 
		EQ=21, GT=22, GTEQ=23, LT=24, LTEQ=25, NOTEQ=26, TRUE=27, FALSE=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "WORD", "NUM", "DOT", "DQUOT", "QUOT", "PLUS", "REDC", "MULT", 
			"DEV", "EVAL", "BL", "BR", "AL", "AR", "SL", "SR", "OR", "AND", "NOR", 
			"EQ", "GT", "GTEQ", "LT", "LTEQ", "NOTEQ", "TRUE", "FALSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'.'", "'\"'", "'''", "'+'", "'-'", null, null, 
			"'$'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'|'", "'&'", "'!'", 
			"'=='", "'>'", "'>='", "'<'", "'<='", "'!='", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "WORD", "NUM", "DOT", "DQUOT", "QUOT", "PLUS", "REDC", "MULT", 
			"DEV", "EVAL", "BL", "BR", "AL", "AR", "SL", "SR", "OR", "AND", "NOR", 
			"EQ", "GT", "GTEQ", "LT", "LTEQ", "NOTEQ", "TRUE", "FALSE"
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


	public ElExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ElExpression.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\5\2=\n\2\3\2\3\2\3\3"+
		"\6\3B\n\3\r\3\16\3C\3\4\6\4G\n\4\r\4\16\4H\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\2\2\36\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\7\5\2\13\f\17"+
		"\17\"\"\4\2C\\c|\3\2\62;\4\2,,\u00d9\u00d9\4\2\61\61\u00f9\u00f9\2\u0088"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3<\3"+
		"\2\2\2\5A\3\2\2\2\7F\3\2\2\2\tJ\3\2\2\2\13L\3\2\2\2\rN\3\2\2\2\17P\3\2"+
		"\2\2\21R\3\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31Z\3\2\2\2\33\\"+
		"\3\2\2\2\35^\3\2\2\2\37`\3\2\2\2!b\3\2\2\2#d\3\2\2\2%f\3\2\2\2\'h\3\2"+
		"\2\2)j\3\2\2\2+l\3\2\2\2-o\3\2\2\2/q\3\2\2\2\61t\3\2\2\2\63v\3\2\2\2\65"+
		"y\3\2\2\2\67|\3\2\2\29\u0081\3\2\2\2;=\t\2\2\2<;\3\2\2\2=>\3\2\2\2>?\b"+
		"\2\2\2?\4\3\2\2\2@B\t\3\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\6"+
		"\3\2\2\2EG\t\4\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\b\3\2\2\2"+
		"JK\7\60\2\2K\n\3\2\2\2LM\7$\2\2M\f\3\2\2\2NO\7)\2\2O\16\3\2\2\2PQ\7-\2"+
		"\2Q\20\3\2\2\2RS\7/\2\2S\22\3\2\2\2TU\t\5\2\2U\24\3\2\2\2VW\t\6\2\2W\26"+
		"\3\2\2\2XY\7&\2\2Y\30\3\2\2\2Z[\7}\2\2[\32\3\2\2\2\\]\7\177\2\2]\34\3"+
		"\2\2\2^_\7]\2\2_\36\3\2\2\2`a\7_\2\2a \3\2\2\2bc\7*\2\2c\"\3\2\2\2de\7"+
		"+\2\2e$\3\2\2\2fg\7~\2\2g&\3\2\2\2hi\7(\2\2i(\3\2\2\2jk\7#\2\2k*\3\2\2"+
		"\2lm\7?\2\2mn\7?\2\2n,\3\2\2\2op\7@\2\2p.\3\2\2\2qr\7@\2\2rs\7?\2\2s\60"+
		"\3\2\2\2tu\7>\2\2u\62\3\2\2\2vw\7>\2\2wx\7?\2\2x\64\3\2\2\2yz\7#\2\2z"+
		"{\7?\2\2{\66\3\2\2\2|}\7v\2\2}~\7t\2\2~\177\7w\2\2\177\u0080\7g\2\2\u0080"+
		"8\3\2\2\2\u0081\u0082\7h\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7u\2\2\u0085\u0086\7g\2\2\u0086:\3\2\2\2\7\2<ACH\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}