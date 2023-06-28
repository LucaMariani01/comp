// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProvaParser}.
 */
public interface ProvaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProvaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ProvaParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProvaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ProvaParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generatoreDiListe}
	 * labeled alternative in {@link ProvaParser#iniz}.
	 * @param ctx the parse tree
	 */
	void enterGeneratoreDiListe(ProvaParser.GeneratoreDiListeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generatoreDiListe}
	 * labeled alternative in {@link ProvaParser#iniz}.
	 * @param ctx the parse tree
	 */
	void exitGeneratoreDiListe(ProvaParser.GeneratoreDiListeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code successivo}
	 * labeled alternative in {@link ProvaParser#list}.
	 * @param ctx the parse tree
	 */
	void enterSuccessivo(ProvaParser.SuccessivoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code successivo}
	 * labeled alternative in {@link ProvaParser#list}.
	 * @param ctx the parse tree
	 */
	void exitSuccessivo(ProvaParser.SuccessivoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nuovoElemento}
	 * labeled alternative in {@link ProvaParser#list1}.
	 * @param ctx the parse tree
	 */
	void enterNuovoElemento(ProvaParser.NuovoElementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nuovoElemento}
	 * labeled alternative in {@link ProvaParser#list1}.
	 * @param ctx the parse tree
	 */
	void exitNuovoElemento(ProvaParser.NuovoElementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vuoto}
	 * labeled alternative in {@link ProvaParser#list1}.
	 * @param ctx the parse tree
	 */
	void enterVuoto(ProvaParser.VuotoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vuoto}
	 * labeled alternative in {@link ProvaParser#list1}.
	 * @param ctx the parse tree
	 */
	void exitVuoto(ProvaParser.VuotoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nuovaEspressioneP}
	 * labeled alternative in {@link ProvaParser#alfa}.
	 * @param ctx the parse tree
	 */
	void enterNuovaEspressioneP(ProvaParser.NuovaEspressionePContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nuovaEspressioneP}
	 * labeled alternative in {@link ProvaParser#alfa}.
	 * @param ctx the parse tree
	 */
	void exitNuovaEspressioneP(ProvaParser.NuovaEspressionePContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nuovaEspressione}
	 * labeled alternative in {@link ProvaParser#alfa}.
	 * @param ctx the parse tree
	 */
	void enterNuovaEspressione(ProvaParser.NuovaEspressioneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nuovaEspressione}
	 * labeled alternative in {@link ProvaParser#alfa}.
	 * @param ctx the parse tree
	 */
	void exitNuovaEspressione(ProvaParser.NuovaEspressioneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fine}
	 * labeled alternative in {@link ProvaParser#alfa}.
	 * @param ctx the parse tree
	 */
	void enterFine(ProvaParser.FineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fine}
	 * labeled alternative in {@link ProvaParser#alfa}.
	 * @param ctx the parse tree
	 */
	void exitFine(ProvaParser.FineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fineSenzaFinal}
	 * labeled alternative in {@link ProvaParser#alfa}.
	 * @param ctx the parse tree
	 */
	void enterFineSenzaFinal(ProvaParser.FineSenzaFinalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fineSenzaFinal}
	 * labeled alternative in {@link ProvaParser#alfa}.
	 * @param ctx the parse tree
	 */
	void exitFineSenzaFinal(ProvaParser.FineSenzaFinalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cliniSi}
	 * labeled alternative in {@link ProvaParser#clini}.
	 * @param ctx the parse tree
	 */
	void enterCliniSi(ProvaParser.CliniSiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cliniSi}
	 * labeled alternative in {@link ProvaParser#clini}.
	 * @param ctx the parse tree
	 */
	void exitCliniSi(ProvaParser.CliniSiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cliniNO}
	 * labeled alternative in {@link ProvaParser#clini}.
	 * @param ctx the parse tree
	 */
	void enterCliniNO(ProvaParser.CliniNOContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cliniNO}
	 * labeled alternative in {@link ProvaParser#clini}.
	 * @param ctx the parse tree
	 */
	void exitCliniNO(ProvaParser.CliniNOContext ctx);
	/**
	 * Enter a parse tree produced by the {@code per}
	 * labeled alternative in {@link ProvaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPer(ProvaParser.PerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code per}
	 * labeled alternative in {@link ProvaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPer(ProvaParser.PerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProvaParser#epxr2}.
	 * @param ctx the parse tree
	 */
	void enterEpxr2(ProvaParser.Epxr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ProvaParser#epxr2}.
	 * @param ctx the parse tree
	 */
	void exitEpxr2(ProvaParser.Epxr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code piu}
	 * labeled alternative in {@link ProvaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterPiu(ProvaParser.PiuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code piu}
	 * labeled alternative in {@link ProvaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitPiu(ProvaParser.PiuContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProvaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr3(ProvaParser.Expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ProvaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr3(ProvaParser.Expr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ProvaParser#possibilita}.
	 * @param ctx the parse tree
	 */
	void enterPossibilita(ProvaParser.PossibilitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProvaParser#possibilita}.
	 * @param ctx the parse tree
	 */
	void exitPossibilita(ProvaParser.PossibilitaContext ctx);
}