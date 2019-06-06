// Generated from /home/users/100/cedelhay/IdeaProjects/1718_INFOB314_COMPILATEUR_GROUPE04/src/main/antlr4/be/unamur/info/b314/compiler/B314.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link B314Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface B314Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link B314Parser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(B314Parser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeScalar}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeScalar(B314Parser.TypeScalarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeArray}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArray(B314Parser.TypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarBool}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarBool(B314Parser.ScalarBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarInt}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarInt(B314Parser.ScalarIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarSquare}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarSquare(B314Parser.ScalarSquareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valArray}
	 * labeled alternative in {@link B314Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValArray(B314Parser.ValArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(B314Parser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valArena}
	 * labeled alternative in {@link B314Parser#arena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValArena(B314Parser.ValArenaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valItemR}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValItemR(B314Parser.ValItemRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valItemM}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValItemM(B314Parser.ValItemMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valItemG}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValItemG(B314Parser.ValItemGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valItemS}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValItemS(B314Parser.ValItemSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valItemF}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValItemF(B314Parser.ValItemFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExprG}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExprG(B314Parser.ValExprGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valFunct}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValFunct(B314Parser.ValFunctContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExprEnt}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExprEnt(B314Parser.ValExprEntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExprBool}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExprBool(B314Parser.ValExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExprCase}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExprCase(B314Parser.ValExprCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valAdd}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValAdd(B314Parser.ValAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valLong}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValLong(B314Parser.ValLongContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valLife}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValLife(B314Parser.ValLifeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valMult}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValMult(B314Parser.ValMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valMinus}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValMinus(B314Parser.ValMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valNumber}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValNumber(B314Parser.ValNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valFct}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValFct(B314Parser.ValFctContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExprEntG}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExprEntG(B314Parser.ValExprEntGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valDiv}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValDiv(B314Parser.ValDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valCount}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValCount(B314Parser.ValCountContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExrpEntPar}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExrpEntPar(B314Parser.ValExrpEntParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valLat}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValLat(B314Parser.ValLatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valGrid}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValGrid(B314Parser.ValGridContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExprBoolCase}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExprBoolCase(B314Parser.ValExprBoolCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExprBoolG}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExprBoolG(B314Parser.ValExprBoolGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExpBoolPar}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExpBoolPar(B314Parser.ValExpBoolParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valFctBool}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValFctBool(B314Parser.ValFctBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExprCasePar}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExprCasePar(B314Parser.ValExprCaseParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valSquare}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValSquare(B314Parser.ValSquareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valNearby}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValNearby(B314Parser.ValNearbyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExprCaseG}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExprCaseG(B314Parser.ValExprCaseGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valId}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValId(B314Parser.ValIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExpr}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExpr(B314Parser.ValExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valGExpr}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValGExpr(B314Parser.ValGExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varSkip}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSkip(B314Parser.VarSkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varIf}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIf(B314Parser.VarIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varIfElse}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIfElse(B314Parser.VarIfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varWhileDo}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarWhileDo(B314Parser.VarWhileDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varSet}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSet(B314Parser.VarSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varCompute}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarCompute(B314Parser.VarComputeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varNext}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarNext(B314Parser.VarNextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varMove}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarMove(B314Parser.VarMoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varShoot}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarShoot(B314Parser.VarShootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varUse}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarUse(B314Parser.VarUseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDoNothing}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDoNothing(B314Parser.VarDoNothingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varFctDecl}
	 * labeled alternative in {@link B314Parser#fctDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarFctDecl(B314Parser.VarFctDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varImpDecl}
	 * labeled alternative in {@link B314Parser#impDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarImpDecl(B314Parser.VarImpDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varFileDecl}
	 * labeled alternative in {@link B314Parser#fileDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarFileDecl(B314Parser.VarFileDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varFileName}
	 * labeled alternative in {@link B314Parser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarFileName(B314Parser.VarFileNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varProgramWorld}
	 * labeled alternative in {@link B314Parser#programWorld}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarProgramWorld(B314Parser.VarProgramWorldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varClauseDefault}
	 * labeled alternative in {@link B314Parser#clauseDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarClauseDefault(B314Parser.VarClauseDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varProgramStrat}
	 * labeled alternative in {@link B314Parser#programStrat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarProgramStrat(B314Parser.VarProgramStratContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varWhen}
	 * labeled alternative in {@link B314Parser#clauseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarWhen(B314Parser.VarWhenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varCommentaire}
	 * labeled alternative in {@link B314Parser#commentaire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarCommentaire(B314Parser.VarCommentaireContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varProgram}
	 * labeled alternative in {@link B314Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarProgram(B314Parser.VarProgramContext ctx);
}