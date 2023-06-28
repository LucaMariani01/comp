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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, FINAl=6, WS=7, FINAL=8;
	public static final int
		RULE_start = 0, RULE_iniz = 1, RULE_list = 2, RULE_list1 = 3, RULE_alfa = 4, 
		RULE_clini = 5, RULE_expr = 6, RULE_epxr2 = 7, RULE_expr1 = 8, RULE_expr3 = 9, 
		RULE_possibilita = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "iniz", "list", "list1", "alfa", "clini", "expr", "epxr2", "expr1", 
			"expr3", "possibilita"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'*'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "FINAl", "WS", "FINAL"
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
			setState(22);
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
			setState(24);
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
			setState(26);
			alfa();
			setState(27);
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
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new NuovoElementoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__0);
				setState(30);
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
		public CliniContext clini() {
			return getRuleContext(CliniContext.class,0);
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
	public static class FineContext extends AlfaContext {
		public TerminalNode FINAl() { return getToken(ProvaParser.FINAl, 0); }
		public FineContext(AlfaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterFine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitFine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitFine(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NuovaEspressioneContext extends AlfaContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CliniContext clini() {
			return getRuleContext(CliniContext.class,0);
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
	@SuppressWarnings("CheckReturnValue")
	public static class FineSenzaFinalContext extends AlfaContext {
		public FineSenzaFinalContext(AlfaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterFineSenzaFinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitFineSenzaFinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitFineSenzaFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlfaContext alfa() throws RecognitionException {
		AlfaContext _localctx = new AlfaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alfa);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new NuovaEspressionePContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(T__1);
				setState(35);
				expr();
				setState(36);
				match(T__2);
				setState(37);
				clini();
				setState(38);
				alfa();
				}
				break;
			case 2:
				_localctx = new NuovaEspressioneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				expr();
				setState(41);
				clini();
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(42);
					alfa();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new FineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(FINAl);
				}
				break;
			case 4:
				_localctx = new FineSenzaFinalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
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
	public static class CliniContext extends ParserRuleContext {
		public CliniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clini; }
	 
		public CliniContext() { }
		public void copyFrom(CliniContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CliniNOContext extends CliniContext {
		public CliniNOContext(CliniContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterCliniNO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitCliniNO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitCliniNO(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CliniSiContext extends CliniContext {
		public CliniSiContext(CliniContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterCliniSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitCliniSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitCliniSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CliniContext clini() throws RecognitionException {
		CliniContext _localctx = new CliniContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_clini);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new CliniSiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new CliniNOContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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
	public static class PerContext extends ExprContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Epxr2Context epxr2() {
			return getRuleContext(Epxr2Context.class,0);
		}
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
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			_localctx = new PerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			expr1();
			setState(54);
			epxr2();
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
	public static class Epxr2Context extends ParserRuleContext {
		public TerminalNode FINAl() { return getToken(ProvaParser.FINAl, 0); }
		public Epxr2Context epxr2() {
			return getRuleContext(Epxr2Context.class,0);
		}
		public Epxr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epxr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterEpxr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitEpxr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitEpxr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Epxr2Context epxr2() throws RecognitionException {
		Epxr2Context _localctx = new Epxr2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_epxr2);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(FINAl);
				setState(57);
				epxr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class PiuContext extends Expr1Context {
		public TerminalNode FINAl() { return getToken(ProvaParser.FINAl, 0); }
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
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
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr1);
		try {
			_localctx = new PiuContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(FINAl);
			setState(62);
			expr3();
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
	public static class Expr3Context extends ParserRuleContext {
		public PossibilitaContext possibilita() {
			return getRuleContext(PossibilitaContext.class,0);
		}
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitExpr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr3);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__4);
				setState(65);
				possibilita();
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case FINAl:
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
	public static class PossibilitaContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(ProvaParser.FINAL, 0); }
		public AlfaContext alfa() {
			return getRuleContext(AlfaContext.class,0);
		}
		public PossibilitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possibilita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterPossibilita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitPossibilita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitPossibilita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossibilitaContext possibilita() throws RecognitionException {
		PossibilitaContext _localctx = new PossibilitaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_possibilita);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(FINAL);
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case FINAl:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				alfa();
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
		"\u0004\u0001\bJ\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003!\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004,\b\u0004\u0001\u0004\u0001\u0004\u0003\u00040\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u00054\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007<\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\tD\b\t\u0001\n"+
		"\u0001\n\u0003\nH\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000G\u0000\u0016\u0001\u0000\u0000"+
		"\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004\u001a\u0001\u0000\u0000"+
		"\u0000\u0006 \u0001\u0000\u0000\u0000\b/\u0001\u0000\u0000\u0000\n3\u0001"+
		"\u0000\u0000\u0000\f5\u0001\u0000\u0000\u0000\u000e;\u0001\u0000\u0000"+
		"\u0000\u0010=\u0001\u0000\u0000\u0000\u0012C\u0001\u0000\u0000\u0000\u0014"+
		"G\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0001"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0004\u0002\u0000\u0019\u0003"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0003\b\u0004\u0000\u001b\u001c\u0003"+
		"\u0006\u0003\u0000\u001c\u0005\u0001\u0000\u0000\u0000\u001d\u001e\u0005"+
		"\u0001\u0000\u0000\u001e!\u0003\u0004\u0002\u0000\u001f!\u0001\u0000\u0000"+
		"\u0000 \u001d\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!"+
		"\u0007\u0001\u0000\u0000\u0000\"#\u0005\u0002\u0000\u0000#$\u0003\f\u0006"+
		"\u0000$%\u0005\u0003\u0000\u0000%&\u0003\n\u0005\u0000&\'\u0003\b\u0004"+
		"\u0000\'0\u0001\u0000\u0000\u0000()\u0003\f\u0006\u0000)+\u0003\n\u0005"+
		"\u0000*,\u0003\b\u0004\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,0\u0001\u0000\u0000\u0000-0\u0005\u0006\u0000\u0000.0\u0001\u0000"+
		"\u0000\u0000/\"\u0001\u0000\u0000\u0000/(\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u0000/.\u0001\u0000\u0000\u00000\t\u0001\u0000\u0000\u0000"+
		"14\u0005\u0004\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000032\u0001\u0000\u0000\u00004\u000b\u0001\u0000\u0000\u000056\u0003"+
		"\u0010\b\u000067\u0003\u000e\u0007\u00007\r\u0001\u0000\u0000\u000089"+
		"\u0005\u0006\u0000\u00009<\u0003\u000e\u0007\u0000:<\u0001\u0000\u0000"+
		"\u0000;8\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<\u000f\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0006\u0000\u0000>?\u0003\u0012\t\u0000?\u0011"+
		"\u0001\u0000\u0000\u0000@A\u0005\u0005\u0000\u0000AD\u0003\u0014\n\u0000"+
		"BD\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000"+
		"\u0000D\u0013\u0001\u0000\u0000\u0000EH\u0005\b\u0000\u0000FH\u0003\b"+
		"\u0004\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\u0015"+
		"\u0001\u0000\u0000\u0000\u0007 +/3;CG";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}