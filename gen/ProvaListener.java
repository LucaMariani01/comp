// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProvaParser}.
 */
public interface ProvaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code liste}
	 * labeled alternative in {@link ProvaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterListe(ProvaParser.ListeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code liste}
	 * labeled alternative in {@link ProvaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitListe(ProvaParser.ListeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nuovaEspressioneParantesi}
	 * labeled alternative in {@link ProvaParser#generatore}.
	 * @param ctx the parse tree
	 */
	void enterNuovaEspressioneParantesi(ProvaParser.NuovaEspressioneParantesiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nuovaEspressioneParantesi}
	 * labeled alternative in {@link ProvaParser#generatore}.
	 * @param ctx the parse tree
	 */
	void exitNuovaEspressioneParantesi(ProvaParser.NuovaEspressioneParantesiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nuovaEspressione}
	 * labeled alternative in {@link ProvaParser#generatore}.
	 * @param ctx the parse tree
	 */
	void enterNuovaEspressione(ProvaParser.NuovaEspressioneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nuovaEspressione}
	 * labeled alternative in {@link ProvaParser#generatore}.
	 * @param ctx the parse tree
	 */
	void exitNuovaEspressione(ProvaParser.NuovaEspressioneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rigenera}
	 * labeled alternative in {@link ProvaParser#gen1}.
	 * @param ctx the parse tree
	 */
	void enterRigenera(ProvaParser.RigeneraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rigenera}
	 * labeled alternative in {@link ProvaParser#gen1}.
	 * @param ctx the parse tree
	 */
	void exitRigenera(ProvaParser.RigeneraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code somma}
	 * labeled alternative in {@link ProvaParser#gen1}.
	 * @param ctx the parse tree
	 */
	void enterSomma(ProvaParser.SommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code somma}
	 * labeled alternative in {@link ProvaParser#gen1}.
	 * @param ctx the parse tree
	 */
	void exitSomma(ProvaParser.SommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stellaSi}
	 * labeled alternative in {@link ProvaParser#stella}.
	 * @param ctx the parse tree
	 */
	void enterStellaSi(ProvaParser.StellaSiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stellaSi}
	 * labeled alternative in {@link ProvaParser#stella}.
	 * @param ctx the parse tree
	 */
	void exitStellaSi(ProvaParser.StellaSiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stellaNO}
	 * labeled alternative in {@link ProvaParser#stella}.
	 * @param ctx the parse tree
	 */
	void enterStellaNO(ProvaParser.StellaNOContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stellaNO}
	 * labeled alternative in {@link ProvaParser#stella}.
	 * @param ctx the parse tree
	 */
	void exitStellaNO(ProvaParser.StellaNOContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conct}
	 * labeled alternative in {@link ProvaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConct(ProvaParser.ConctContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conct}
	 * labeled alternative in {@link ProvaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConct(ProvaParser.ConctContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chiudo}
	 * labeled alternative in {@link ProvaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterChiudo(ProvaParser.ChiudoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chiudo}
	 * labeled alternative in {@link ProvaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitChiudo(ProvaParser.ChiudoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sommaParentesi}
	 * labeled alternative in {@link ProvaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSommaParentesi(ProvaParser.SommaParentesiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sommaParentesi}
	 * labeled alternative in {@link ProvaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSommaParentesi(ProvaParser.SommaParentesiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link ProvaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterOr(ProvaParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link ProvaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitOr(ProvaParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rigenero}
	 * labeled alternative in {@link ProvaParser#possibilita}.
	 * @param ctx the parse tree
	 */
	void enterRigenero(ProvaParser.RigeneroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rigenero}
	 * labeled alternative in {@link ProvaParser#possibilita}.
	 * @param ctx the parse tree
	 */
	void exitRigenero(ProvaParser.RigeneroContext ctx);
}