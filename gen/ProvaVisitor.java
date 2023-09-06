// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProvaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProvaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code liste}
	 * labeled alternative in {@link ProvaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListe(ProvaParser.ListeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nuovaEspressioneParantesi}
	 * labeled alternative in {@link ProvaParser#generatore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNuovaEspressioneParantesi(ProvaParser.NuovaEspressioneParantesiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nuovaEspressione}
	 * labeled alternative in {@link ProvaParser#generatore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNuovaEspressione(ProvaParser.NuovaEspressioneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rigenera}
	 * labeled alternative in {@link ProvaParser#gen1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRigenera(ProvaParser.RigeneraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code somma}
	 * labeled alternative in {@link ProvaParser#gen1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomma(ProvaParser.SommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stellaSi}
	 * labeled alternative in {@link ProvaParser#stella}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStellaSi(ProvaParser.StellaSiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stellaNO}
	 * labeled alternative in {@link ProvaParser#stella}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStellaNO(ProvaParser.StellaNOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conct}
	 * labeled alternative in {@link ProvaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConct(ProvaParser.ConctContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chiudo}
	 * labeled alternative in {@link ProvaParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChiudo(ProvaParser.ChiudoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sommaParentesi}
	 * labeled alternative in {@link ProvaParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSommaParentesi(ProvaParser.SommaParentesiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link ProvaParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ProvaParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rigenero}
	 * labeled alternative in {@link ProvaParser#possibilita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRigenero(ProvaParser.RigeneroContext ctx);
}