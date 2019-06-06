// Generated from /home/users/100/cedelhay/IdeaProjects/1718_INFOB314_COMPILATEUR_GROUPE04/src/main/antlr4/be/unamur/info/b314/compiler/B314.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link B314Parser}.
 */
public interface B314Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link B314Parser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(B314Parser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(B314Parser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeScalar}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeScalar(B314Parser.TypeScalarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeScalar}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeScalar(B314Parser.TypeScalarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeArray}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeArray(B314Parser.TypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeArray}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeArray(B314Parser.TypeArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarBool}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalarBool(B314Parser.ScalarBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarBool}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalarBool(B314Parser.ScalarBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarInt}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalarInt(B314Parser.ScalarIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarInt}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalarInt(B314Parser.ScalarIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarSquare}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalarSquare(B314Parser.ScalarSquareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarSquare}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalarSquare(B314Parser.ScalarSquareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valArray}
	 * labeled alternative in {@link B314Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterValArray(B314Parser.ValArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valArray}
	 * labeled alternative in {@link B314Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitValArray(B314Parser.ValArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(B314Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(B314Parser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valArena}
	 * labeled alternative in {@link B314Parser#arena}.
	 * @param ctx the parse tree
	 */
	void enterValArena(B314Parser.ValArenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valArena}
	 * labeled alternative in {@link B314Parser#arena}.
	 * @param ctx the parse tree
	 */
	void exitValArena(B314Parser.ValArenaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valItemR}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 */
	void enterValItemR(B314Parser.ValItemRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valItemR}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 */
	void exitValItemR(B314Parser.ValItemRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valItemM}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 */
	void enterValItemM(B314Parser.ValItemMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valItemM}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 */
	void exitValItemM(B314Parser.ValItemMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valItemG}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 */
	void enterValItemG(B314Parser.ValItemGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valItemG}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 */
	void exitValItemG(B314Parser.ValItemGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valItemS}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 */
	void enterValItemS(B314Parser.ValItemSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valItemS}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 */
	void exitValItemS(B314Parser.ValItemSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valItemF}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 */
	void enterValItemF(B314Parser.ValItemFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valItemF}
	 * labeled alternative in {@link B314Parser#item}.
	 * @param ctx the parse tree
	 */
	void exitValItemF(B314Parser.ValItemFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExprG}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterValExprG(B314Parser.ValExprGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExprG}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitValExprG(B314Parser.ValExprGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valFunct}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterValFunct(B314Parser.ValFunctContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valFunct}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitValFunct(B314Parser.ValFunctContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExprEnt}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterValExprEnt(B314Parser.ValExprEntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExprEnt}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitValExprEnt(B314Parser.ValExprEntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExprBool}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterValExprBool(B314Parser.ValExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExprBool}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitValExprBool(B314Parser.ValExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExprCase}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterValExprCase(B314Parser.ValExprCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExprCase}
	 * labeled alternative in {@link B314Parser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitValExprCase(B314Parser.ValExprCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valAdd}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterValAdd(B314Parser.ValAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valAdd}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitValAdd(B314Parser.ValAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valLong}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterValLong(B314Parser.ValLongContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valLong}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitValLong(B314Parser.ValLongContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valLife}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterValLife(B314Parser.ValLifeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valLife}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitValLife(B314Parser.ValLifeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valMult}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterValMult(B314Parser.ValMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valMult}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitValMult(B314Parser.ValMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valMinus}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterValMinus(B314Parser.ValMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valMinus}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitValMinus(B314Parser.ValMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valNumber}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterValNumber(B314Parser.ValNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valNumber}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitValNumber(B314Parser.ValNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valFct}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterValFct(B314Parser.ValFctContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valFct}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitValFct(B314Parser.ValFctContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExprEntG}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterValExprEntG(B314Parser.ValExprEntGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExprEntG}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitValExprEntG(B314Parser.ValExprEntGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valDiv}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterValDiv(B314Parser.ValDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valDiv}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitValDiv(B314Parser.ValDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valCount}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterValCount(B314Parser.ValCountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valCount}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitValCount(B314Parser.ValCountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExrpEntPar}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterValExrpEntPar(B314Parser.ValExrpEntParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExrpEntPar}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitValExrpEntPar(B314Parser.ValExrpEntParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valLat}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterValLat(B314Parser.ValLatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valLat}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitValLat(B314Parser.ValLatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valGrid}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterValGrid(B314Parser.ValGridContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valGrid}
	 * labeled alternative in {@link B314Parser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitValGrid(B314Parser.ValGridContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExprBoolCase}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterValExprBoolCase(B314Parser.ValExprBoolCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExprBoolCase}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitValExprBoolCase(B314Parser.ValExprBoolCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExprBoolG}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterValExprBoolG(B314Parser.ValExprBoolGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExprBoolG}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitValExprBoolG(B314Parser.ValExprBoolGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExpBoolPar}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterValExpBoolPar(B314Parser.ValExpBoolParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExpBoolPar}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitValExpBoolPar(B314Parser.ValExpBoolParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valFctBool}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterValFctBool(B314Parser.ValFctBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valFctBool}
	 * labeled alternative in {@link B314Parser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitValFctBool(B314Parser.ValFctBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExprCasePar}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterValExprCasePar(B314Parser.ValExprCaseParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExprCasePar}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitValExprCasePar(B314Parser.ValExprCaseParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valSquare}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterValSquare(B314Parser.ValSquareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valSquare}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitValSquare(B314Parser.ValSquareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valNearby}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterValNearby(B314Parser.ValNearbyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valNearby}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitValNearby(B314Parser.ValNearbyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExprCaseG}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterValExprCaseG(B314Parser.ValExprCaseGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExprCaseG}
	 * labeled alternative in {@link B314Parser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitValExprCaseG(B314Parser.ValExprCaseGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valId}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterValId(B314Parser.ValIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valId}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitValId(B314Parser.ValIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExpr}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterValExpr(B314Parser.ValExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExpr}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitValExpr(B314Parser.ValExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valGExpr}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterValGExpr(B314Parser.ValGExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valGExpr}
	 * labeled alternative in {@link B314Parser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitValGExpr(B314Parser.ValGExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varSkip}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVarSkip(B314Parser.VarSkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varSkip}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVarSkip(B314Parser.VarSkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varIf}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVarIf(B314Parser.VarIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varIf}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVarIf(B314Parser.VarIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varIfElse}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVarIfElse(B314Parser.VarIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varIfElse}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVarIfElse(B314Parser.VarIfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varWhileDo}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVarWhileDo(B314Parser.VarWhileDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varWhileDo}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVarWhileDo(B314Parser.VarWhileDoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varSet}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVarSet(B314Parser.VarSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varSet}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVarSet(B314Parser.VarSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varCompute}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVarCompute(B314Parser.VarComputeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varCompute}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVarCompute(B314Parser.VarComputeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varNext}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVarNext(B314Parser.VarNextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varNext}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVarNext(B314Parser.VarNextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varMove}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterVarMove(B314Parser.VarMoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varMove}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitVarMove(B314Parser.VarMoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varShoot}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterVarShoot(B314Parser.VarShootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varShoot}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitVarShoot(B314Parser.VarShootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varUse}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterVarUse(B314Parser.VarUseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varUse}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitVarUse(B314Parser.VarUseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDoNothing}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterVarDoNothing(B314Parser.VarDoNothingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDoNothing}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitVarDoNothing(B314Parser.VarDoNothingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varFctDecl}
	 * labeled alternative in {@link B314Parser#fctDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarFctDecl(B314Parser.VarFctDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varFctDecl}
	 * labeled alternative in {@link B314Parser#fctDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarFctDecl(B314Parser.VarFctDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varImpDecl}
	 * labeled alternative in {@link B314Parser#impDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarImpDecl(B314Parser.VarImpDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varImpDecl}
	 * labeled alternative in {@link B314Parser#impDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarImpDecl(B314Parser.VarImpDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varFileDecl}
	 * labeled alternative in {@link B314Parser#fileDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarFileDecl(B314Parser.VarFileDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varFileDecl}
	 * labeled alternative in {@link B314Parser#fileDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarFileDecl(B314Parser.VarFileDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varFileName}
	 * labeled alternative in {@link B314Parser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterVarFileName(B314Parser.VarFileNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varFileName}
	 * labeled alternative in {@link B314Parser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitVarFileName(B314Parser.VarFileNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varProgramWorld}
	 * labeled alternative in {@link B314Parser#programWorld}.
	 * @param ctx the parse tree
	 */
	void enterVarProgramWorld(B314Parser.VarProgramWorldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varProgramWorld}
	 * labeled alternative in {@link B314Parser#programWorld}.
	 * @param ctx the parse tree
	 */
	void exitVarProgramWorld(B314Parser.VarProgramWorldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varClauseDefault}
	 * labeled alternative in {@link B314Parser#clauseDefault}.
	 * @param ctx the parse tree
	 */
	void enterVarClauseDefault(B314Parser.VarClauseDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varClauseDefault}
	 * labeled alternative in {@link B314Parser#clauseDefault}.
	 * @param ctx the parse tree
	 */
	void exitVarClauseDefault(B314Parser.VarClauseDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varProgramStrat}
	 * labeled alternative in {@link B314Parser#programStrat}.
	 * @param ctx the parse tree
	 */
	void enterVarProgramStrat(B314Parser.VarProgramStratContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varProgramStrat}
	 * labeled alternative in {@link B314Parser#programStrat}.
	 * @param ctx the parse tree
	 */
	void exitVarProgramStrat(B314Parser.VarProgramStratContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varWhen}
	 * labeled alternative in {@link B314Parser#clauseWhen}.
	 * @param ctx the parse tree
	 */
	void enterVarWhen(B314Parser.VarWhenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varWhen}
	 * labeled alternative in {@link B314Parser#clauseWhen}.
	 * @param ctx the parse tree
	 */
	void exitVarWhen(B314Parser.VarWhenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varCommentaire}
	 * labeled alternative in {@link B314Parser#commentaire}.
	 * @param ctx the parse tree
	 */
	void enterVarCommentaire(B314Parser.VarCommentaireContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varCommentaire}
	 * labeled alternative in {@link B314Parser#commentaire}.
	 * @param ctx the parse tree
	 */
	void exitVarCommentaire(B314Parser.VarCommentaireContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varProgram}
	 * labeled alternative in {@link B314Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterVarProgram(B314Parser.VarProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varProgram}
	 * labeled alternative in {@link B314Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitVarProgram(B314Parser.VarProgramContext ctx);
}