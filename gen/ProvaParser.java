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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, FINAl=6, WS=7;
	public static final int
		RULE_start = 0, RULE_generatore = 1, RULE_gen1 = 2, RULE_stella = 3, RULE_expr = 4, 
		RULE_expr1 = 5, RULE_expr3 = 6, RULE_possibilita = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "generatore", "gen1", "stella", "expr", "expr1", "expr3", "possibilita"
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
			null, null, null, null, null, null, "FINAl", "WS"
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
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListeContext extends StartContext {
		public List<GeneratoreContext> generatore() {
			return getRuleContexts(GeneratoreContext.class);
		}
		public GeneratoreContext generatore(int i) {
			return getRuleContext(GeneratoreContext.class,i);
		}
		public ListeContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterListe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitListe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitListe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			_localctx = new ListeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			generatore();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(17);
				match(T__0);
				setState(18);
				generatore();
				}
				}
				setState(23);
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
	public static class GeneratoreContext extends ParserRuleContext {
		public GeneratoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatore; }
	 
		public GeneratoreContext() { }
		public void copyFrom(GeneratoreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NuovaEspressioneContext extends GeneratoreContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StellaContext stella() {
			return getRuleContext(StellaContext.class,0);
		}
		public Gen1Context gen1() {
			return getRuleContext(Gen1Context.class,0);
		}
		public NuovaEspressioneContext(GeneratoreContext ctx) { copyFrom(ctx); }
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
	public static class NuovaEspressioneParantesiContext extends GeneratoreContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StellaContext stella() {
			return getRuleContext(StellaContext.class,0);
		}
		public Gen1Context gen1() {
			return getRuleContext(Gen1Context.class,0);
		}
		public NuovaEspressioneParantesiContext(GeneratoreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterNuovaEspressioneParantesi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitNuovaEspressioneParantesi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitNuovaEspressioneParantesi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratoreContext generatore() throws RecognitionException {
		GeneratoreContext _localctx = new GeneratoreContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_generatore);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new NuovaEspressioneParantesiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(T__1);
				setState(25);
				expr();
				setState(26);
				match(T__2);
				setState(27);
				stella();
				setState(29);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(28);
					gen1();
					}
					break;
				}
				}
				break;
			case FINAl:
				_localctx = new NuovaEspressioneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				expr();
				setState(32);
				stella();
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(33);
					gen1();
					}
					break;
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
	public static class Gen1Context extends ParserRuleContext {
		public Gen1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen1; }
	 
		public Gen1Context() { }
		public void copyFrom(Gen1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RigeneraContext extends Gen1Context {
		public GeneratoreContext generatore() {
			return getRuleContext(GeneratoreContext.class,0);
		}
		public RigeneraContext(Gen1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterRigenera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitRigenera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitRigenera(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SommaContext extends Gen1Context {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public SommaContext(Gen1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterSomma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitSomma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitSomma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gen1Context gen1() throws RecognitionException {
		Gen1Context _localctx = new Gen1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_gen1);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case FINAl:
				_localctx = new RigeneraContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				generatore();
				}
				break;
			case T__4:
				_localctx = new SommaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				expr3();
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
	public static class StellaContext extends ParserRuleContext {
		public StellaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stella; }
	 
		public StellaContext() { }
		public void copyFrom(StellaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StellaSiContext extends StellaContext {
		public StellaSiContext(StellaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterStellaSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitStellaSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitStellaSi(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StellaNOContext extends StellaContext {
		public StellaNOContext(StellaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterStellaNO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitStellaNO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitStellaNO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StellaContext stella() throws RecognitionException {
		StellaContext _localctx = new StellaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stella);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new StellaSiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new StellaNOContext(_localctx);
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
	public static class ConctContext extends ExprContext {
		public TerminalNode FINAl() { return getToken(ProvaParser.FINAl, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ConctContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterConct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitConct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitConct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			_localctx = new ConctContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(FINAl);
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(47);
				expr1();
				}
				break;
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
	public static class ChiudoContext extends Expr1Context {
		public TerminalNode FINAl() { return getToken(ProvaParser.FINAl, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ChiudoContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterChiudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitChiudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitChiudo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SommaParentesiContext extends Expr1Context {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public SommaParentesiContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterSommaParentesi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitSommaParentesi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitSommaParentesi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr1);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAl:
				_localctx = new ChiudoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(FINAl);
				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(51);
					expr1();
					}
					break;
				}
				}
				break;
			case T__4:
				_localctx = new SommaParentesiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				expr3();
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
	public static class Expr3Context extends ParserRuleContext {
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
	 
		public Expr3Context() { }
		public void copyFrom(Expr3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends Expr3Context {
		public PossibilitaContext possibilita() {
			return getRuleContext(PossibilitaContext.class,0);
		}
		public OrContext(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr3);
		try {
			_localctx = new OrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__4);
			setState(58);
			possibilita();
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
		public PossibilitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possibilita; }
	 
		public PossibilitaContext() { }
		public void copyFrom(PossibilitaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RigeneroContext extends PossibilitaContext {
		public GeneratoreContext generatore() {
			return getRuleContext(GeneratoreContext.class,0);
		}
		public RigeneroContext(PossibilitaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).enterRigenero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProvaListener ) ((ProvaListener)listener).exitRigenero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProvaVisitor ) return ((ProvaVisitor<? extends T>)visitor).visitRigenero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossibilitaContext possibilita() throws RecognitionException {
		PossibilitaContext _localctx = new PossibilitaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_possibilita);
		try {
			_localctx = new RigeneroContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			generatore();
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
		"\u0004\u0001\u0007?\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000"+
		"\u0017\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001e\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"#\b\u0001\u0003\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002)\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003-\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u00041\b\u0004\u0001\u0005\u0001\u0005\u0003\u00055\b\u0005"+
		"\u0001\u0005\u0003\u00058\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0000\u0000?\u0000\u0010\u0001\u0000\u0000\u0000\u0002$\u0001"+
		"\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000"+
		"\u0000\b.\u0001\u0000\u0000\u0000\n7\u0001\u0000\u0000\u0000\f9\u0001"+
		"\u0000\u0000\u0000\u000e<\u0001\u0000\u0000\u0000\u0010\u0015\u0003\u0002"+
		"\u0001\u0000\u0011\u0012\u0005\u0001\u0000\u0000\u0012\u0014\u0003\u0002"+
		"\u0001\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000"+
		"\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000"+
		"\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001a\u0003\b\u0004"+
		"\u0000\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u001d\u0003\u0006\u0003"+
		"\u0000\u001c\u001e\u0003\u0004\u0002\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e%\u0001\u0000\u0000\u0000"+
		"\u001f \u0003\b\u0004\u0000 \"\u0003\u0006\u0003\u0000!#\u0003\u0004\u0002"+
		"\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000"+
		"\u0000\u0000$\u0018\u0001\u0000\u0000\u0000$\u001f\u0001\u0000\u0000\u0000"+
		"%\u0003\u0001\u0000\u0000\u0000&)\u0003\u0002\u0001\u0000\')\u0003\f\u0006"+
		"\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0005\u0001"+
		"\u0000\u0000\u0000*-\u0005\u0004\u0000\u0000+-\u0001\u0000\u0000\u0000"+
		",*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-\u0007\u0001\u0000"+
		"\u0000\u0000.0\u0005\u0006\u0000\u0000/1\u0003\n\u0005\u00000/\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u00001\t\u0001\u0000\u0000\u000024\u0005"+
		"\u0006\u0000\u000035\u0003\n\u0005\u000043\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000058\u0001\u0000\u0000\u000068\u0003\f\u0006\u000072\u0001"+
		"\u0000\u0000\u000076\u0001\u0000\u0000\u00008\u000b\u0001\u0000\u0000"+
		"\u00009:\u0005\u0005\u0000\u0000:;\u0003\u000e\u0007\u0000;\r\u0001\u0000"+
		"\u0000\u0000<=\u0003\u0002\u0001\u0000=\u000f\u0001\u0000\u0000\u0000"+
		"\t\u0015\u001d\"$(,047";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}