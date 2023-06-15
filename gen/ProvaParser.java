// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProvaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, FINAl=5, WS=6;
	public static final int
		RULE_start = 0, RULE_iniz = 1, RULE_list = 2, RULE_list1 = 3, RULE_alfa = 4, 
		RULE_expr = 5, RULE_expr1 = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "iniz", "list", "list1", "alfa", "expr", "expr1"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "FINAl", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProvaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public InizContext iniz() {
			return getRuleContext(InizContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			iniz();
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
	public static class InizContext extends ParserRuleContext {
		public InizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iniz; }
	 
		public InizContext() { }
		public void copyFrom(InizContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneratoreDiListeContext extends InizContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public GeneratoreDiListeContext(InizContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterGeneratoreDiListe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitGeneratoreDiListe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitGeneratoreDiListe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InizContext iniz() throws RecognitionException {
		InizContext _localctx = new InizContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_iniz);
		try {
			_localctx = new GeneratoreDiListeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			list();
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
	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	 
		public ListContext() { }
		public void copyFrom(ListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuccessivoContext extends ListContext {
		public AlfaContext alfa() {
			return getRuleContext(AlfaContext.class,0);
		}
		public List1Context list1() {
			return getRuleContext(List1Context.class,0);
		}
		public SuccessivoContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterSuccessivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitSuccessivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitSuccessivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		try {
			_localctx = new SuccessivoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			alfa();
			setState(19);
			list1();
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
	public static class List1Context extends ParserRuleContext {
		public List1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list1; }
	 
		public List1Context() { }
		public void copyFrom(List1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NuovoElementoContext extends List1Context {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public NuovoElementoContext(List1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterNuovoElemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitNuovoElemento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitNuovoElemento(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VuotoContext extends List1Context {
		public VuotoContext(List1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterVuoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitVuoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitVuoto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List1Context list1() throws RecognitionException {
		List1Context _localctx = new List1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_list1);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new NuovoElementoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(T__0);
				setState(22);
				list();
				}
				break;
			case EOF:
				_localctx = new VuotoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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
	public static class AlfaContext extends ParserRuleContext {
		public AlfaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alfa; }
	 
		public AlfaContext() { }
		public void copyFrom(AlfaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NuovaEspressionePContext extends AlfaContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AlfaContext alfa() {
			return getRuleContext(AlfaContext.class,0);
		}
		public NuovaEspressionePContext(AlfaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterNuovaEspressioneP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitNuovaEspressioneP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitNuovaEspressioneP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NuovaEspressioneContext extends AlfaContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AlfaContext alfa() {
			return getRuleContext(AlfaContext.class,0);
		}
		public NuovaEspressioneContext(AlfaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterNuovaEspressione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitNuovaEspressione(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitNuovaEspressione(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlfaContext alfa() throws RecognitionException {
		AlfaContext _localctx = new AlfaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alfa);
		int _la;
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new NuovaEspressionePContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(T__1);
				setState(27);
				expr(0);
				setState(28);
				match(T__2);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==FINAl) {
					{
					setState(29);
					alfa();
					}
				}

				}
				break;
			case FINAl:
				_localctx = new NuovaEspressioneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				expr(0);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==FINAl) {
					{
					setState(33);
					alfa();
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PassoContext extends ExprContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public PassoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterPasso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitPasso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitPasso(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PerContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FINAl() { return getToken(ProvaParser.FINAl, 0); }
		public PerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterPer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitPer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitPer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PassoContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(39);
			expr1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PerContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(41);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(42);
					match(FINAl);
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FinalContext extends Expr1Context {
		public TerminalNode FINAl() { return getToken(ProvaParser.FINAl, 0); }
		public FinalContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterFinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitFinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitFinal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PiuContext extends Expr1Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode FINAl() { return getToken(ProvaParser.FINAl, 0); }
		public PiuContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterPiu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitPiu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitPiu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		return expr1(0);
	}

	private Expr1Context expr1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr1Context _localctx = new Expr1Context(_ctx, _parentState);
		Expr1Context _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FinalContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(49);
			match(FINAl);
			}
			_ctx.stop = _input.LT(-1);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PiuContext(new Expr1Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr1);
					setState(51);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(52);
					match(T__3);
					setState(53);
					match(FINAl);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 6:
			return expr1_sempred((Expr1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr1_sempred(Expr1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0006<\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0019\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u001f\b\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004#\b\u0004\u0003\u0004%\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005,\b\u0005\n\u0005\f\u0005/\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u00067\b\u0006\n\u0006\f\u0006:\t\u0006\u0001\u0006\u0000\u0002"+
		"\n\f\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000:\u0000\u000e\u0001"+
		"\u0000\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000\u0004\u0012\u0001"+
		"\u0000\u0000\u0000\u0006\u0018\u0001\u0000\u0000\u0000\b$\u0001\u0000"+
		"\u0000\u0000\n&\u0001\u0000\u0000\u0000\f0\u0001\u0000\u0000\u0000\u000e"+
		"\u000f\u0003\u0002\u0001\u0000\u000f\u0001\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0003\u0004\u0002\u0000\u0011\u0003\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0003\b\u0004\u0000\u0013\u0014\u0003\u0006\u0003\u0000\u0014\u0005"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0001\u0000\u0000\u0016\u0019"+
		"\u0003\u0004\u0002\u0000\u0017\u0019\u0001\u0000\u0000\u0000\u0018\u0015"+
		"\u0001\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u0007"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0002\u0000\u0000\u001b\u001c"+
		"\u0003\n\u0005\u0000\u001c\u001e\u0005\u0003\u0000\u0000\u001d\u001f\u0003"+
		"\b\u0004\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f%\u0001\u0000\u0000\u0000 \"\u0003\n\u0005\u0000!#\u0003"+
		"\b\u0004\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#"+
		"%\u0001\u0000\u0000\u0000$\u001a\u0001\u0000\u0000\u0000$ \u0001\u0000"+
		"\u0000\u0000%\t\u0001\u0000\u0000\u0000&\'\u0006\u0005\uffff\uffff\u0000"+
		"\'(\u0003\f\u0006\u0000(-\u0001\u0000\u0000\u0000)*\n\u0002\u0000\u0000"+
		"*,\u0005\u0005\u0000\u0000+)\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u000b\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0006\u0006\uffff\uffff"+
		"\u000012\u0005\u0005\u0000\u000028\u0001\u0000\u0000\u000034\n\u0002\u0000"+
		"\u000045\u0005\u0004\u0000\u000057\u0005\u0005\u0000\u000063\u0001\u0000"+
		"\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009\r\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		"\u0006\u0018\u001e\"$-8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}