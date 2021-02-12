package org.swdc.expression.el.antlr;
// Generated from ElExpression.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ElExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, WORD=2, NUM=3, DOT=4, DQUOT=5, QUOT=6, PLUS=7, REDC=8, MULT=9, DEV=10, 
		EVAL=11, BL=12, BR=13, AL=14, AR=15, SL=16, SR=17, OR=18, AND=19, NOR=20, 
		EQ=21, GT=22, GTEQ=23, LT=24, LTEQ=25, NOTEQ=26, TRUE=27, FALSE=28;
	public static final int
		RULE_var = 0, RULE_varUnit = 1, RULE_nums = 2, RULE_bool = 3, RULE_arrayIndexed = 4, 
		RULE_objectProperty = 5, RULE_objectVar = 6, RULE_basicCalcuteExpr = 7, 
		RULE_calcutable = 8, RULE_basicWithScope = 9, RULE_logicCompare = 10, 
		RULE_logicalcutable = 11, RULE_logicExpr = 12, RULE_evalable = 13, RULE_evalablePart = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"var", "varUnit", "nums", "bool", "arrayIndexed", "objectProperty", "objectVar", 
			"basicCalcuteExpr", "calcutable", "basicWithScope", "logicCompare", "logicalcutable", 
			"logicExpr", "evalable", "evalablePart"
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

	@Override
	public String getGrammarFileName() { return "ElExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ElExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class VarContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(ElExpressionParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ElExpressionParser.WORD, i);
		}
		public List<TerminalNode> NUM() { return getTokens(ElExpressionParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ElExpressionParser.NUM, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(WORD);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD || _la==NUM) {
				{
				{
				setState(31);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(36);
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

	public static class VarUnitContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<TerminalNode> DQUOT() { return getTokens(ElExpressionParser.DQUOT); }
		public TerminalNode DQUOT(int i) {
			return getToken(ElExpressionParser.DQUOT, i);
		}
		public List<TerminalNode> QUOT() { return getTokens(ElExpressionParser.QUOT); }
		public TerminalNode QUOT(int i) {
			return getToken(ElExpressionParser.QUOT, i);
		}
		public VarUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterVarUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitVarUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitVarUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarUnitContext varUnit() throws RecognitionException {
		VarUnitContext _localctx = new VarUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varUnit);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				var();
				}
				break;
			case DQUOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(DQUOT);
				setState(39);
				var();
				setState(40);
				match(DQUOT);
				}
				break;
			case QUOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(QUOT);
				setState(43);
				var();
				setState(44);
				match(QUOT);
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

	public static class NumsContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(ElExpressionParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ElExpressionParser.NUM, i);
		}
		public TerminalNode DOT() { return getToken(ElExpressionParser.DOT, 0); }
		public NumsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nums; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterNums(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitNums(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitNums(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumsContext nums() throws RecognitionException {
		NumsContext _localctx = new NumsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nums);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(NUM);
				{
				setState(50);
				match(DOT);
				setState(51);
				match(NUM);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ElExpressionParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ElExpressionParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class ArrayIndexedContext extends ParserRuleContext {
		public TerminalNode AL() { return getToken(ElExpressionParser.AL, 0); }
		public NumsContext nums() {
			return getRuleContext(NumsContext.class,0);
		}
		public TerminalNode AR() { return getToken(ElExpressionParser.AR, 0); }
		public ArrayIndexedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndexed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterArrayIndexed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitArrayIndexed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitArrayIndexed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexedContext arrayIndexed() throws RecognitionException {
		ArrayIndexedContext _localctx = new ArrayIndexedContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayIndexed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(AL);
			setState(57);
			nums();
			setState(58);
			match(AR);
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

	public static class ObjectPropertyContext extends ParserRuleContext {
		public TerminalNode AL() { return getToken(ElExpressionParser.AL, 0); }
		public VarUnitContext varUnit() {
			return getRuleContext(VarUnitContext.class,0);
		}
		public TerminalNode AR() { return getToken(ElExpressionParser.AR, 0); }
		public TerminalNode DOT() { return getToken(ElExpressionParser.DOT, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitObjectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objectProperty);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AL:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(AL);
				setState(61);
				varUnit();
				setState(62);
				match(AR);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(DOT);
				setState(65);
				var();
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

	public static class ObjectVarContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<ArrayIndexedContext> arrayIndexed() {
			return getRuleContexts(ArrayIndexedContext.class);
		}
		public ArrayIndexedContext arrayIndexed(int i) {
			return getRuleContext(ArrayIndexedContext.class,i);
		}
		public ObjectVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterObjectVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitObjectVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitObjectVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectVarContext objectVar() throws RecognitionException {
		ObjectVarContext _localctx = new ObjectVarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_objectVar);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				var();
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(70);
						objectProperty();
						}
						break;
					case 2:
						{
						setState(71);
						arrayIndexed();
						}
						break;
					}
					}
					setState(74); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT || _la==AL );
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

	public static class BasicCalcuteExprContext extends ParserRuleContext {
		public Token op;
		public List<BasicWithScopeContext> basicWithScope() {
			return getRuleContexts(BasicWithScopeContext.class);
		}
		public BasicWithScopeContext basicWithScope(int i) {
			return getRuleContext(BasicWithScopeContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(ElExpressionParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(ElExpressionParser.MULT, i);
		}
		public List<TerminalNode> DEV() { return getTokens(ElExpressionParser.DEV); }
		public TerminalNode DEV(int i) {
			return getToken(ElExpressionParser.DEV, i);
		}
		public BasicCalcuteExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicCalcuteExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterBasicCalcuteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitBasicCalcuteExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitBasicCalcuteExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicCalcuteExprContext basicCalcuteExpr() throws RecognitionException {
		BasicCalcuteExprContext _localctx = new BasicCalcuteExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_basicCalcuteExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			basicWithScope();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DEV) {
				{
				{
				setState(79);
				((BasicCalcuteExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DEV) ) {
					((BasicCalcuteExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(80);
				basicWithScope();
				}
				}
				setState(85);
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

	public static class CalcutableContext extends ParserRuleContext {
		public Token op;
		public List<BasicCalcuteExprContext> basicCalcuteExpr() {
			return getRuleContexts(BasicCalcuteExprContext.class);
		}
		public BasicCalcuteExprContext basicCalcuteExpr(int i) {
			return getRuleContext(BasicCalcuteExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ElExpressionParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ElExpressionParser.PLUS, i);
		}
		public List<TerminalNode> REDC() { return getTokens(ElExpressionParser.REDC); }
		public TerminalNode REDC(int i) {
			return getToken(ElExpressionParser.REDC, i);
		}
		public CalcutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcutable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterCalcutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitCalcutable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitCalcutable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcutableContext calcutable() throws RecognitionException {
		CalcutableContext _localctx = new CalcutableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_calcutable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			basicCalcuteExpr();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==REDC) {
				{
				{
				setState(87);
				((CalcutableContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==REDC) ) {
					((CalcutableContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(88);
				basicCalcuteExpr();
				}
				}
				setState(93);
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

	public static class BasicWithScopeContext extends ParserRuleContext {
		public TerminalNode SL() { return getToken(ElExpressionParser.SL, 0); }
		public CalcutableContext calcutable() {
			return getRuleContext(CalcutableContext.class,0);
		}
		public TerminalNode SR() { return getToken(ElExpressionParser.SR, 0); }
		public NumsContext nums() {
			return getRuleContext(NumsContext.class,0);
		}
		public ObjectVarContext objectVar() {
			return getRuleContext(ObjectVarContext.class,0);
		}
		public BasicWithScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicWithScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterBasicWithScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitBasicWithScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitBasicWithScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicWithScopeContext basicWithScope() throws RecognitionException {
		BasicWithScopeContext _localctx = new BasicWithScopeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_basicWithScope);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SL:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(SL);
				setState(95);
				calcutable();
				setState(96);
				match(SR);
				}
				break;
			case WORD:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
					{
					setState(98);
					nums();
					}
					break;
				case WORD:
					{
					setState(99);
					objectVar();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class LogicCompareContext extends ParserRuleContext {
		public Token op;
		public List<CalcutableContext> calcutable() {
			return getRuleContexts(CalcutableContext.class);
		}
		public CalcutableContext calcutable(int i) {
			return getRuleContext(CalcutableContext.class,i);
		}
		public TerminalNode GT() { return getToken(ElExpressionParser.GT, 0); }
		public TerminalNode GTEQ() { return getToken(ElExpressionParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(ElExpressionParser.LT, 0); }
		public TerminalNode LTEQ() { return getToken(ElExpressionParser.LTEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(ElExpressionParser.NOTEQ, 0); }
		public TerminalNode EQ() { return getToken(ElExpressionParser.EQ, 0); }
		public LogicCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterLogicCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitLogicCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitLogicCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicCompareContext logicCompare() throws RecognitionException {
		LogicCompareContext _localctx = new LogicCompareContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logicCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			calcutable();
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				{
				setState(105);
				((LogicCompareContext)_localctx).op = match(EQ);
				}
				break;
			case GT:
				{
				setState(106);
				match(GT);
				}
				break;
			case GTEQ:
				{
				setState(107);
				match(GTEQ);
				}
				break;
			case LT:
				{
				setState(108);
				match(LT);
				}
				break;
			case LTEQ:
				{
				setState(109);
				match(LTEQ);
				}
				break;
			case NOTEQ:
				{
				setState(110);
				match(NOTEQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
			calcutable();
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

	public static class LogicalcutableContext extends ParserRuleContext {
		public Token op;
		public List<LogicExprContext> logicExpr() {
			return getRuleContexts(LogicExprContext.class);
		}
		public LogicExprContext logicExpr(int i) {
			return getRuleContext(LogicExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ElExpressionParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ElExpressionParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(ElExpressionParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ElExpressionParser.AND, i);
		}
		public TerminalNode NOR() { return getToken(ElExpressionParser.NOR, 0); }
		public LogicalcutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalcutable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterLogicalcutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitLogicalcutable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitLogicalcutable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalcutableContext logicalcutable() throws RecognitionException {
		LogicalcutableContext _localctx = new LogicalcutableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicalcutable);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
			case NUM:
			case SL:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(115);
				logicExpr();
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR || _la==AND) {
					{
					{
					setState(116);
					((LogicalcutableContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
						((LogicalcutableContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					{
					setState(117);
					logicExpr();
					}
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(NOR);
				setState(124);
				logicExpr();
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

	public static class LogicExprContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ObjectVarContext objectVar() {
			return getRuleContext(ObjectVarContext.class,0);
		}
		public LogicCompareContext logicCompare() {
			return getRuleContext(LogicCompareContext.class,0);
		}
		public TerminalNode SL() { return getToken(ElExpressionParser.SL, 0); }
		public LogicalcutableContext logicalcutable() {
			return getRuleContext(LogicalcutableContext.class,0);
		}
		public TerminalNode SR() { return getToken(ElExpressionParser.SR, 0); }
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logicExpr);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				objectVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				logicCompare();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(SL);
				setState(131);
				logicalcutable();
				setState(132);
				match(SR);
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

	public static class EvalableContext extends ParserRuleContext {
		public CalcutableContext calcutable() {
			return getRuleContext(CalcutableContext.class,0);
		}
		public LogicalcutableContext logicalcutable() {
			return getRuleContext(LogicalcutableContext.class,0);
		}
		public EvalableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterEvalable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitEvalable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitEvalable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalableContext evalable() throws RecognitionException {
		EvalableContext _localctx = new EvalableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_evalable);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				calcutable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				logicalcutable();
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

	public static class EvalablePartContext extends ParserRuleContext {
		public TerminalNode EVAL() { return getToken(ElExpressionParser.EVAL, 0); }
		public TerminalNode BL() { return getToken(ElExpressionParser.BL, 0); }
		public EvalableContext evalable() {
			return getRuleContext(EvalableContext.class,0);
		}
		public TerminalNode BR() { return getToken(ElExpressionParser.BR, 0); }
		public EvalablePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalablePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).enterEvalablePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElExpressionListener ) ((ElExpressionListener)listener).exitEvalablePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElExpressionVisitor ) return ((ElExpressionVisitor<? extends T>)visitor).visitEvalablePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalablePartContext evalablePart() throws RecognitionException {
		EvalablePartContext _localctx = new EvalablePartContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_evalablePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(EVAL);
			setState(141);
			match(BL);
			setState(142);
			evalable();
			setState(143);
			match(BR);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0094\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3"+
		"\4\3\4\5\4\67\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"E\n\7\3\b\3\b\3\b\3\b\6\bK\n\b\r\b\16\bL\5\bO\n\b\3\t\3\t\3\t\7\tT\n\t"+
		"\f\t\16\tW\13\t\3\n\3\n\3\n\7\n\\\n\n\f\n\16\n_\13\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13g\n\13\5\13i\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fr\n"+
		"\f\3\f\3\f\3\r\3\r\3\r\7\ry\n\r\f\r\16\r|\13\r\3\r\3\r\5\r\u0080\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0089\n\16\3\17\3\17\5\17\u008d"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36\2\7\3\2\4\5\3\2\35\36\3\2\13\f\3\2\t\n\3\2\24\25\2\u009b"+
		"\2 \3\2\2\2\4\60\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\n:\3\2\2\2\fD\3\2\2\2"+
		"\16N\3\2\2\2\20P\3\2\2\2\22X\3\2\2\2\24h\3\2\2\2\26j\3\2\2\2\30\177\3"+
		"\2\2\2\32\u0088\3\2\2\2\34\u008c\3\2\2\2\36\u008e\3\2\2\2 $\7\4\2\2!#"+
		"\t\2\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&$\3\2\2"+
		"\2\'\61\5\2\2\2()\7\7\2\2)*\5\2\2\2*+\7\7\2\2+\61\3\2\2\2,-\7\b\2\2-."+
		"\5\2\2\2./\7\b\2\2/\61\3\2\2\2\60\'\3\2\2\2\60(\3\2\2\2\60,\3\2\2\2\61"+
		"\5\3\2\2\2\62\67\7\5\2\2\63\64\7\5\2\2\64\65\7\6\2\2\65\67\7\5\2\2\66"+
		"\62\3\2\2\2\66\63\3\2\2\2\67\7\3\2\2\289\t\3\2\29\t\3\2\2\2:;\7\20\2\2"+
		";<\5\6\4\2<=\7\21\2\2=\13\3\2\2\2>?\7\20\2\2?@\5\4\3\2@A\7\21\2\2AE\3"+
		"\2\2\2BC\7\6\2\2CE\5\2\2\2D>\3\2\2\2DB\3\2\2\2E\r\3\2\2\2FO\5\2\2\2GJ"+
		"\5\2\2\2HK\5\f\7\2IK\5\n\6\2JH\3\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2L"+
		"M\3\2\2\2MO\3\2\2\2NF\3\2\2\2NG\3\2\2\2O\17\3\2\2\2PU\5\24\13\2QR\t\4"+
		"\2\2RT\5\24\13\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\21\3\2\2\2W"+
		"U\3\2\2\2X]\5\20\t\2YZ\t\5\2\2Z\\\5\20\t\2[Y\3\2\2\2\\_\3\2\2\2][\3\2"+
		"\2\2]^\3\2\2\2^\23\3\2\2\2_]\3\2\2\2`a\7\22\2\2ab\5\22\n\2bc\7\23\2\2"+
		"ci\3\2\2\2dg\5\6\4\2eg\5\16\b\2fd\3\2\2\2fe\3\2\2\2gi\3\2\2\2h`\3\2\2"+
		"\2hf\3\2\2\2i\25\3\2\2\2jq\5\22\n\2kr\7\27\2\2lr\7\30\2\2mr\7\31\2\2n"+
		"r\7\32\2\2or\7\33\2\2pr\7\34\2\2qk\3\2\2\2ql\3\2\2\2qm\3\2\2\2qn\3\2\2"+
		"\2qo\3\2\2\2qp\3\2\2\2rs\3\2\2\2st\5\22\n\2t\27\3\2\2\2uz\5\32\16\2vw"+
		"\t\6\2\2wy\5\32\16\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0080\3"+
		"\2\2\2|z\3\2\2\2}~\7\26\2\2~\u0080\5\32\16\2\177u\3\2\2\2\177}\3\2\2\2"+
		"\u0080\31\3\2\2\2\u0081\u0089\5\b\5\2\u0082\u0089\5\16\b\2\u0083\u0089"+
		"\5\26\f\2\u0084\u0085\7\22\2\2\u0085\u0086\5\30\r\2\u0086\u0087\7\23\2"+
		"\2\u0087\u0089\3\2\2\2\u0088\u0081\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0083"+
		"\3\2\2\2\u0088\u0084\3\2\2\2\u0089\33\3\2\2\2\u008a\u008d\5\22\n\2\u008b"+
		"\u008d\5\30\r\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\35\3\2\2"+
		"\2\u008e\u008f\7\r\2\2\u008f\u0090\7\16\2\2\u0090\u0091\5\34\17\2\u0091"+
		"\u0092\7\17\2\2\u0092\37\3\2\2\2\22$\60\66DJLNU]fhqz\177\u0088\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}