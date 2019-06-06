package be.unamur.info.b314.compiler;

import be.unamur.info.b314.compiler.exception.*;
import be.unamur.info.b314.compiler.main.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;


/**
 * Extension of the B314BaseVisitor that raises an exception when an error is found
 * @specfield tab: SymbolTable // The symbol table we are working with
 * @specfield LOG: Logger // Allows to display different kinds of logs
 */
public class B314VisitorImpl extends B314BaseVisitor<Void> {

    private SymbolTable tab = new SymbolTable();
    private static final Logger LOG = LoggerFactory.getLogger(B314VisitorImpl.class);
    private ArrayList<Integer> tailleDimension;

    @Override
    public Void visitVarDecl(B314Parser.VarDeclContext ctx) throws VarAlreadyExistException, ReservedWordException {

        tailleDimension = new ArrayList<>();

        visitChildren(ctx);

        tab.printSymbolTable();

        //get id and type of the declared variable
        String id = ctx.ID().getText();
        String type = ctx.type().getText();

        ArrayList<Scope> scopesList = tab.getScopes();

        //generate an exception if the reserved word arena is used
        if(!type.equals("square") && id.equals("arena")){
            throw new ReservedWordException("arena cannot be used as variable declaration");
        }

        //check whether the id already exist in the current scope
        for (Scope scope : scopesList) {
            ArrayList<Symbol> symbolList = scope.getSymbols();

            if(scope.getScopeName().equals(tab.getWorkingScope())){
                for(Symbol symbol : symbolList){
                    if(symbol.getSymbolName().equals(id)){
                        throw new VarAlreadyExistException("Id "+symbol.getSymbolName()+" already exist" );
                    }
                }
            }

        }


        //add variable in the scope
        for (Scope scope : tab.getScopes()){
            if(scope.getScopeName().equals(tab.getWorkingScope())){
                //find the dimension if it is an array
                Type monType;
                if (type.contains("[")) {
                    int dim;
                    if (type.contains(",")) {
                        dim = 2;
                    } else {
                        dim = 1;
                    }
                    monType = new TypeArray(type.split("\\[")[0], dim, tailleDimension);
                } else {
                    monType = new Type(type);
                }

                scope.insertSymbol(new Symbol(id, monType, 1, scope.getSymbols().size()));
            }
        }

        //tailleDimension = null;

        return null;
    }

    @Override
    public Void visitVarFctDecl(B314Parser.VarFctDeclContext ctx){

        //get id of the declared function
        String id = ctx.ID().getSymbol().getText();

        for(Scope scope : tab.getScopes()){
            //raise an exception if the function name already exist
            if (scope.getScopeName().equals(id)){
                throw new FunctionAlreadyExistException("function name " + id + " already exist");
            }

            //check whether the current scope does not contain that id
            if(scope.getScopeName().equals(tab.getWorkingScope())){
                //if the scope contains at least 1 symbol
                if(scope.getSymbols().size() > 0){
                    for(Symbol symbol: scope.getSymbols()){
                        if(symbol.getSymbolName().equals(id)){
                            throw new VarAlreadyExistException("this id is already used by a global variable");
                        }
                    }
                }

            }
        }

        //on add new scope in symbol table and define it as working scope
        Scope newScope = new Scope(id);
        tab.insertNewScope(newScope);
        tab.setWorkingScope(id);

        //find the type of the function defined with its return type
        Type functionType;
        if(ctx.scalar().getText().equals("")){
            functionType = new Type("void");
        } else if(ctx.scalar().getText().equals("boolean")){
            functionType = new Type("boolean");
        } else if(ctx.scalar().getText().equals("square")) {
            functionType = new Type("square");
        } else if (ctx.scalar().getText().equals("integer")){
            functionType = new Type("integer");
        } else if (ctx.scalar().getText().equals("void")){
            functionType = new Type("void");
        } else {
            throw new WrongDefinitionFunctionException("function type is not int, bool, square or void");
        }

        //Create the function and add it into symbol table in the working scope
        Function function = new Function(id, functionType, ctx.varDecl().size(), 2, newScope.getSymbols().size());
        for(Scope scope : tab.getScopes()){
            if (scope.getScopeName().equals(id)){
                scope.insertSymbol(function);

                //check function parameters by visiting visitVarDecl
                for(B314Parser.VarDeclContext var : ctx.varDecl()){
                    tab.setWorkingScope(newScope.getScopeName());
                    visitChildren(var);

                }
            }
        }

        visitChildren(ctx);
        tab.setWorkingScope("global");

        return null;

    }

    @Override
    public Void visitVarSet(B314Parser.VarSetContext ctx) throws InvalidExpressionException{

        //get type of right and left expression
        Symbol exprD = foundExprD(ctx);
        String typeExprD = exprD.getSymbolType().getTypeName() ;
        String typeExprG = getTypeExpG(ctx.exprG());

        if(!typeExprG.equals(typeExprD) && !typeExprD.equals("")){
            throw new InvalidExpressionException("left and right expression does not have same type");
        }

        visitChildren(ctx);

        return null;
    }

    /**
     * Give symbol of left expression
     * @param ctx: Context where we are working
     * @return Symbol of left expression
     */
    public Symbol foundExprG(B314Parser.VarSetContext ctx) {

        //get id of the left expression
        String val="";
        if(ctx.exprG() instanceof B314Parser.ValIdContext) {
            val = ((B314Parser.ValIdContext) ctx.exprG()).ID().getText();
        }
        else if( ctx.exprG() instanceof  B314Parser.ValExprContext ){
            val =  ((B314Parser.ValExprContext) ctx.exprG()).ID().getText();
        }

        //check if symbol is in symbol table (first in working scope and if not in the global scope) and give information of it
        Symbol typeVal = new Symbol();
        ArrayList<Scope> scopes = tab.getScopes();
        for(Scope scope: scopes) {
            if (scope.getScopeName().equals(tab.getWorkingScope())) {
                if(!scope.getSymbolsName().contains(val)){
                    for(Scope s : scopes){
                        if(s.getScopeName().equals("global")){
                            if(!s.getSymbolsName().contains(val)){
                                //raise an exception if left expression does not exist in working scope AND in global scope
                                throw new VarAlreadyExistException("this variable does not exist : "+val);
                            }
                        } else {
                            for (Symbol symbol : s.getSymbols()) {
                                if (symbol.getSymbolName().equals(val)) {
                                    typeVal = symbol;

                                }
                            }
                        }
                    }
                } else {
                    for (Symbol symbol : scope.getSymbols()) {
                        if (symbol.getSymbolName().equals(val)) {
                            typeVal = symbol;
                        }
                    }
                }
            }
        }

        return typeVal;
    }

    /**
     * Give the symbol of right expression
     * @param ctx: Context where we are working
     * @return Symbol of right expression
     */
    public Symbol foundExprD(B314Parser.VarSetContext ctx) {

        Symbol val = new Symbol();
        if(ctx.exprD() instanceof B314Parser.ValExprGContext) {
            val = foundExprG(ctx);

        } else if( ctx.exprD() instanceof  B314Parser.ValExprEntContext ){
            val = new Symbol("", new Type("integer"),-1, -1);

        } else if( ctx.exprD() instanceof B314Parser.ValExprBoolContext) {
            val = new Symbol("", new Type("boolean"), -1, -1);

        } else if (ctx.exprD() instanceof B314Parser.ValExprCaseContext) {
            val = new Symbol("", new Type("square"), -1, -1);
        }

        return val;

    }

    @Override
    public Void visitValExrpEntPar(B314Parser.ValExrpEntParContext ctx) {
        visitChildren(ctx);
        return null;
    }


    @Override
    public Void visitValFctBool(B314Parser.ValFctBoolContext ctx) {
        visitChildren(ctx);

        String id = ctx.ID().getSymbol().getText();

        checkFunctionExistAndParameters(id, ctx.exprD().size());
        return null;
    }

    @Override
    public Void visitValFctCase(B314Parser.ValFctCaseContext ctx) {
        visitChildren(ctx);

        String id = ctx.ID().getSymbol().getText();

        checkFunctionExistAndParameters(id, ctx.exprD().size());

        return null;
    }

    @Override
    public Void visitValExprBoolG(B314Parser.ValExprBoolGContext ctx) {
        visitChildren(ctx);
        return null;
    }

    //#######################################################################################################################
    //                                   STOP CLEAN CODE 1
    //#######################################################################################################################

    /**
     * Check whether a symbol (variable or function exist)
     * @param id: Name of the symbol to check
     */
    public void checkSymbolIdExist(String id){
        ArrayList<Scope> scopes = tab.getScopes();
        for (Scope scope : scopes) {
            if (scope.getScopeName().equals(tab.getWorkingScope()) ) {
                if (!scope.getSymbolsName().contains(id)) {
                    for(Scope s : scopes){
                        if(s.getScopeName().equals("global")){
                            if(!s.getSymbolsName().contains(id)){
                                throw new VarAlreadyExistException("this variable does not exist val id " + id + " in scope " + tab.getWorkingScope());
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Check if a given function exist and have good number of parameters
     * @param id: Name of the function
     * @param nbParameters: Number of parameters of the function we check
     */
    public void checkFunctionExistAndParameters(String id, int nbParameters){
        //check if the function id is in the symbol table else exception
        ArrayList<String> scopesName = tab.getScopesName();
        if(!scopesName.contains(id)){
            throw new NotAnExistingFunction("the function does not exist");
        }

        checkFunctionParametersNumber(id, nbParameters);
    }

    public void checkFunctionParametersNumber(String id, int nbParameters){
        for(Scope scope:tab.getScopes()){
            if(scope.getScopeName().equals(id)){
                for(Symbol symbol:scope.getSymbols()){
                    if(symbol instanceof Function){
                        if(((Function) symbol).getParameters() != nbParameters){
                            throw new InvalidExpressionException("the function does not have good parameters number");
                        }
                    }
                }
            }
        }
    }


    @Override
    public Void visitValId(B314Parser.ValIdContext ctx){
        visitChildren(ctx);

        String id = ctx.ID().getSymbol().getText();
        checkSymbolIdExist(id);

        return null;
    }

    @Override
    public Void visitValExpr(B314Parser.ValExprContext ctx) {

        String id = ctx.ID().getText();
        int paramNumber = ctx.exprEnt().size();

        //check whether each index is an integer
        for(B314Parser.ExprEntContext expr : ctx.exprEnt()){
            String type = getTypeExprEnt(expr);
            if(!type.equals("integer")){
                throw new InvalidExpressionException("one of the function index is not an integer");
            }
        }

        checkFunctionParametersNumber(id, paramNumber);

        //#######################################################################################################################
        //                                   STOP CLEAN CODE 2
        //#######################################################################################################################

        ArrayList<Scope> scopes = tab.getScopes();
        for (Scope scope : scopes) {
            if (scope.getScopeName().equals(tab.getWorkingScope())) {

                //raise exception if id does not exit
                if (!scope.getSymbolsName().contains(id)) {
                    for(Scope s : scopes){
                        if(s.getScopeName().equals("global")){
                            if(!s.getSymbolsName().contains(id)){
                                throw new VarAlreadyExistException("this variable does not exist");
                            } else {
                                //search array dimension in symbol table
                                int dimSymbol = 0;
                                for (Symbol symbol : s.getSymbols()) {

                                    if (symbol.getSymbolName().equals(id)) {
                                        if (symbol.getSymbolType() instanceof TypeArray) {
                                            dimSymbol = ((TypeArray) symbol.getSymbolType()).getDimension();
                                        }
                                    }
                                }

                                //search context array dimension
                                int dimCtx;
                                if (ctx.COMMA() != null) {
                                    dimCtx = 2;
                                } else {
                                    dimCtx = 1;
                                }

                                //check if context dimension is the same of dimension stored in symbol table
                                if (dimCtx != dimSymbol) {
                                    throw new TypeException("wrong array dimension");
                                }
                            }
                        }
                    }

                } else {
                    //search array dimension in symbol table
                    int dimSymbol = 0;
                    for (Symbol symbol : scope.getSymbols()) {

                        if (symbol.getSymbolName().equals(id)) {
                            if (symbol.getSymbolType() instanceof TypeArray) {
                                dimSymbol = ((TypeArray) symbol.getSymbolType()).getDimension();
                            }
                        }
                    }

                    //search context array dimension
                    int dimCtx;
                    if (ctx.COMMA() != null) {
                        dimCtx = 2;
                    } else {
                        dimCtx = 1;
                    }

                    //check if context dimension is the same of dimension stored in symbol table
                    if (dimCtx != dimSymbol) {
                        throw new TypeException("wrong array dimension");
                    }
                }
            }

        }


        visitChildren(ctx);

        return null;
    }

    //#######################################################################################################################
    //                                   STOP CLEAN CODE 3
    //#######################################################################################################################

    @Override
    public Void visitValExprG(B314Parser.ValExprGContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitValFunct(B314Parser.ValFunctContext ctx) {
        visitChildren(ctx);

        String id = ctx.ID().getSymbol().getText();

        //check if the function id is in the symbol table else exception
        ArrayList<String> scopesName = tab.getScopesName();

        if(!scopesName.contains(id)){
            throw new NotAnExistingFunction("the function doessn't exist - visitValFunct");
        }

        //find the symbol Function with name id
        for(Scope scope:tab.getScopes()){
            if(scope.getScopeName().equals(id)){
                for(Symbol symbol:scope.getSymbols()){
                    if(symbol instanceof Function){
                        //check number of parameters if symbol in symbol table have same than function used
                        if(((Function) symbol).getParameters() != ctx.exprD().size()){
                            throw new InvalidExpressionException("not the good number of parameters");
                        }
                    }
                }
            }
        }

        return null;
    }

    @Override
    public Void visitValExprEnt(B314Parser.ValExprEntContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitValExprBool(B314Parser.ValExprBoolContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitValExprCase(B314Parser.ValExprCaseContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitValExprCaseG(B314Parser.ValExprCaseGContext ctx){
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitVarCompute(B314Parser.VarComputeContext ctx){
        visitChildren(ctx);

        String type = getTypeExprD(ctx.exprD());

        switch (type) {
            case "integer":
                return null;
            case "boolean":
                return null;
            case "square":
                return null;
            case "void":
                return null;
        }
        throw new TypeException("Compute condition is not integer or boolean or square");
    }

    @Override
    public Void visitVarNext(B314Parser.VarNextContext ctx){
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitValExprBoolCase(B314Parser.ValExprBoolCaseContext ctx){

        String type1 = getTypeExpCase(ctx.exprCase(0));
        String type2 = getTypeExpCase(ctx.exprCase(1));

        if(!type1.equals(type2)){
            throw new TypeException("the case expression does not have same type on both sides");
        }

        visitChildren(ctx);

        return null;
    }

    @Override
    public Void visitValNumber(B314Parser.ValNumberContext ctx){

        visitChildren(ctx);
        String type1 = getTypeExprEnt(ctx.exprEnt(0));
        String type2 = getTypeExprEnt(ctx.exprEnt(1));

        // check if the type is the same on both sides
        if(!type1.equals(type2) && !type2.equals("")) {
            throw new InvalidExpressionException("it is not the same type on both sides");
        }
        return null;
    }

    @Override
    public Void visitValFct(B314Parser.ValFctContext ctx){
        visitChildren(ctx);

        String id = ctx.ID().getSymbol().getText();

        //check if the function id is in the symbol table else exception
        ArrayList<String> scopesName = tab.getScopesName();
        if(!scopesName.contains(id)){
            throw new NotAnExistingFunction("the function doessn't exist fct");
        }

        for(Scope scope:tab.getScopes()){
            if(scope.getScopeName().equals(id)){
                for(Symbol symbol:scope.getSymbols()){
                    if(symbol instanceof Function){
                        if(((Function) symbol).getParameters() != ctx.exprD().size()){
                            throw new InvalidExpressionException("not the good number of parameters - valFct");
                        }
                    }
                }
            }
        }

        return null;
    }

    @Override
    public Void visitValExprEntG(B314Parser.ValExprEntGContext ctx){
        visitChildren(ctx);

        return null;
    }


    @Override
    public Void visitTypeScalar(B314Parser.TypeScalarContext ctx){
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitTypeArray(B314Parser.TypeArrayContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitScalarBool(B314Parser.ScalarBoolContext ctx) {
        return super.visitScalarBool(ctx);
    }

    @Override
    public Void visitScalarInt(B314Parser.ScalarIntContext ctx) {
        return super.visitScalarInt(ctx);
    }

    @Override
    public Void visitScalarSquare(B314Parser.ScalarSquareContext ctx) {
        return super.visitScalarSquare(ctx);
    }

    @Override
    public Void visitValArray(B314Parser.ValArrayContext ctx) {
        visitChildren(ctx);

        for(TerminalNode number : ctx.NUMBER()){
            //debug(""+new Integer(number.getSymbol().getText()));
            tailleDimension.add(new Integer(number.getSymbol().getText()));
        }

        return null;
    }

    @Override
    public Void visitValArena(B314Parser.ValArenaContext ctx) {

        if(ctx.exprG()!= null) {
            for (B314Parser.ExprGContext exprGContext : ctx.exprG()) {
                String type = getTypeExpG(exprGContext);
                if(! type.equals("integer")){
                    throw new InvalidExpressionException("dimension in arena not an integer");
                }
            }
        }

        visitChildren(ctx);

        return null;
    }

    @Override
    public Void visitValItemR(B314Parser.ValItemRContext ctx) { return super.visitValItemR(ctx); }

    @Override
    public Void visitValItemM(B314Parser.ValItemMContext ctx) {
        return super.visitValItemM(ctx);
    }

    @Override
    public Void visitValItemG(B314Parser.ValItemGContext ctx) {
        return super.visitValItemG(ctx);
    }

    @Override
    public Void visitValItemS(B314Parser.ValItemSContext ctx) {
        return super.visitValItemS(ctx);
    }

    @Override
    public Void visitValItemF(B314Parser.ValItemFContext ctx) {
        return super.visitValItemF(ctx);
    }

    @Override
    public Void visitValExprCasePar(B314Parser.ValExprCaseParContext ctx) {
        return super.visitValExprCasePar(ctx);
    }

    @Override
    public Void visitValSquare(B314Parser.ValSquareContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitVarSkip(B314Parser.VarSkipContext ctx) {
        return super.visitVarSkip(ctx);
    }

    @Override
    public Void visitVarMove(B314Parser.VarMoveContext ctx) { return super.visitVarMove(ctx); }

    @Override
    public Void visitVarShoot(B314Parser.VarShootContext ctx) {
        return super.visitVarShoot(ctx);
    }

    @Override
    public Void visitVarUse(B314Parser.VarUseContext ctx) {
        return super.visitVarUse(ctx);
    }

    @Override
    public Void visitVarDoNothing(B314Parser.VarDoNothingContext ctx) {
        return super.visitVarDoNothing(ctx);
    }

    @Override
    public Void visitVarFileDecl(B314Parser.VarFileDeclContext ctx) { return super.visitVarFileDecl(ctx); }

    @Override
    public Void visitVarProgramWorld(B314Parser.VarProgramWorldContext ctx) {

        if(ctx.arena().size() > 1){
            throw new InvalidExpressionException("only one arena");
        }

        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitVarDeclLocal(B314Parser.VarDeclLocalContext ctx){
        visitChildren(ctx);
        return null;
    }
    @Override
    public Void visitVarClauseDefault(B314Parser.VarClauseDefaultContext ctx) {
        //create new scope named default and add it into symbol table
        Scope newScope = new Scope("default");
        tab.insertNewScope(newScope);

        //set the working scope to that scope
        tab.setWorkingScope(newScope.getScopeName());
        visitChildren(ctx);

        //when all instructions in the default clause are executed we delete that scope
        tab.deleteWorkingScope("default");
        tab.setWorkingScope("global");
        return null;
    }

    @Override
    public Void visitVarProgramStrat(B314Parser.VarProgramStratContext ctx) {

        if(ctx.impDecl().size() > 1){
            throw new InvalidExpressionException("only one import");
        }
        if(ctx.arena().size() > 1){
            throw new InvalidExpressionException("only one arena");
        }

        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitVarWhen(B314Parser.VarWhenContext ctx) {

        String type = getTypeExprBool(ctx.exprBool());

        if(!type.equals("boolean") && !type.equals("")){
            throw new TypeException("when condition not boolean");
        }

        //create a new scope named when for the when clause, add it into symbol table and set as working scope
        Scope newScope = new Scope("when");
        tab.insertNewScope(newScope);
        tab.setWorkingScope(newScope.getScopeName());

        visitChildren(ctx);

        //when all instructions are executed, delete that scope and set working scope to global
        tab.deleteWorkingScope("when");
        tab.setWorkingScope("global");

        return null;
    }

    //#######################################################################################################################
    //                                   STOP CLEAN CODE 4
    //#######################################################################################################################

    @Override
    public Void visitVarCommentaire(B314Parser.VarCommentaireContext ctx) {
        return super.visitVarCommentaire(ctx);
    }

    @Override
    public Void visitVarProgram(B314Parser.VarProgramContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitValExpBoolPar(B314Parser.ValExpBoolParContext ctx){
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitValExpBoolEnt(B314Parser.ValExpBoolEntContext ctx){
        visitChildren(ctx);
        String type1 = getTypeExprEnt(ctx.exprEnt(0));
        String type2 = getTypeExprEnt(ctx.exprEnt(1));

        if(!type1.equals(type2) && !type2.equals("") && !type1.equals("") ){
            throw new TypeException("types are not 2 integers");
        }
        return null;
    }

    @Override
    public Void visitValExpBoolBool(B314Parser.ValExpBoolBoolContext ctx){

        String type1 = getTypeExprBool(ctx.exprBool(0));
        String type2 = getTypeExprBool(ctx.exprBool(1));

        if(!type1.equals(type2)){
            throw new TypeException("types are not 2 booleans");
        }
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitVarIf(B314Parser.VarIfContext ctx) {

        String type1 = getTypeExprD(ctx.exprD());

        if(!type1.equals("boolean")){
            throw new TypeException("If condition not boolean ");
        }

        visitChildren(ctx);

        return null;
    }

    @Override
    public Void visitVarIfElse(B314Parser.VarIfElseContext ctx){
        visitChildren(ctx);

        String type = getTypeExprD(ctx.exprD());
        if(!type.equals("boolean")){
            throw new TypeException("If-else condition not Boolean ");
        }

        return null;
    }



    @Override
    public Void visitVarImpDecl(B314Parser.VarImpDeclContext ctx){
        visitChildren(ctx);
        return null;
    }

    // recursive on ExprBool valExprBoolCase

    /**
     * Give the type of a case expression
     * @param ctx
     * @return Type of the case expression
     */
    public String getTypeExpCase(B314Parser.ExprCaseContext ctx){
        if(ctx instanceof B314Parser.ValExprCaseGContext){
            return getTypeExpG(((B314Parser.ValExprCaseGContext) ctx).exprG());

        } else if (ctx instanceof B314Parser.ValExprCaseParContext){
            return getTypeExpCase(((B314Parser.ValExprCaseParContext) ctx).exprCase());

        } else if (ctx instanceof B314Parser.ValSquareContext){
            return "square";

        } else if (ctx instanceof B314Parser.ValFctCaseContext){
            //if case expression is a function
            for(Scope scope : tab.getScopes()){
                if(scope.getScopeName().equals(((B314Parser.ValFctCaseContext) ctx).ID().getText())){
                    for(Symbol symbol : scope.getSymbols()){
                        if(symbol.getSymbolName().equals(((B314Parser.ValFctCaseContext) ctx).ID().getText())){
                            return symbol.getSymbolType().getTypeName();
                        }
                    }
                }
            }
        }

        throw new InvalidExpressionException("it is not a cas expression");
    }

    //#######################################################################################################################
    //                                   STOP CLEAN CODE 5
    //#######################################################################################################################

    @Override
    public Void visitVarWhileDo(B314Parser.VarWhileDoContext ctx){
        visitChildren(ctx);
        String type = getTypeExprD(ctx.exprD());

        if(!type.equals("boolean")){
            throw new TypeException("While condition not Boolean ");
        }

        return null;
    }


    /**
     * Give the type on a left expression
     * @param ctx
     * @return Type of the left expression
     */
    public String getTypeExpG(B314Parser.ExprGContext ctx){
        String val="";

        if(ctx instanceof B314Parser.ValIdContext){
            val=((B314Parser.ValIdContext) ctx).ID().getSymbol().getText();
        } else if (ctx instanceof B314Parser.ValExprContext){
            val=((B314Parser.ValExprContext) ctx).ID().getSymbol().getText();
        }

        String typeVal = "";
        ArrayList<Scope> scopes = tab.getScopes();
        for(Scope scope: scopes) {
            if (scope.getScopeName().equals(tab.getWorkingScope())) {

                for(Scope s : tab.getScopes()){
                    if(s.getScopeName().equals("global")){
                        //if id is not in symbol table --> exception
                        if(!scope.getSymbolsName().contains(val) && !s.getSymbolsName().contains(val)){
                            throw new VarAlreadyExistException("this variable does not exist type exp G");
                        } else {
                            //if id is in symbol table, search its dimension stored into symbol table
                            if(scope.getSymbolsName().contains(val)){
                                for (Symbol symbol : scope.getSymbols()) {
                                    // check if val = symbol name
                                    if (symbol.getSymbolName().equals(val)) {
                                        //search symbol and its type
                                        typeVal = symbol.getSymbolType().getTypeName();

                                    }
                                }
                            } else if(s.getSymbolsName().contains(val)){
                                for (Symbol symbol : s.getSymbols()) {
                                    // check if val = symbol name
                                    if (symbol.getSymbolName().equals(val)) {
                                        //search symbol and its type
                                        typeVal = symbol.getSymbolType().getTypeName();

                                    }
                                }
                            }

                        }
                    }
                }


            }
        }

        return typeVal;

    }


    /**
     * Give type of an integer expression
     * @param ctx
     * @return Type of integer expression
     */
    public String getTypeExprEnt(B314Parser.ExprEntContext ctx){
        String val="";

        if(ctx instanceof B314Parser.ValNumberContext){
            return "integer";

        } else if (ctx instanceof B314Parser.ValExrpEntParContext){
            return getTypeExprEnt(((B314Parser.ValExrpEntParContext) ctx).exprEnt());

        } else if (ctx instanceof B314Parser.ValExprEntGContext){
            return getTypeExpG(((B314Parser.ValExprEntGContext) ctx).exprG());
        }


        Symbol typeVal = new Symbol();

        ArrayList<Scope> scopes = tab.getScopes();
        for(Scope scope: scopes) {
            if (scope.getScopeName().equals(tab.getWorkingScope())) {
                if (scope.getSymbolsName().contains(val)) {

                    //search symbol corresponding to val
                    for (Symbol symbol : scope.getSymbols()) {
                        if (symbol.getSymbolName().equals(val)) {
                            typeVal =  symbol;

                        }
                    }

                }
            }
        }

        return typeVal.getSymbolType().getTypeName();


    }


    /**
     * Give type of a boolean expression
     * @param ctx
     * @return Type of the boolean expression
     */
    public String getTypeExprBool(B314Parser.ExprBoolContext ctx) {
        String val = "";

        if (ctx instanceof B314Parser.ValExpBoolParContext) {
            return "boolean";

        } else if (ctx instanceof B314Parser.ValExprBoolCaseContext) {
            return "boolean";

        } else if (ctx instanceof B314Parser.ValExpBoolEntContext) {
            return "boolean";

        } else if (ctx instanceof B314Parser.ValExpBoolBoolContext) {
            return "boolean";

        } else if (ctx instanceof B314Parser.ValExprBoolGContext) {
            return getTypeExpG(((B314Parser.ValExprBoolGContext) ctx).exprG());

        } else if (ctx instanceof B314Parser.ValFctBoolContext){
            for(Scope scope : tab.getScopes()){
                if(scope.getScopeName().equals(((B314Parser.ValFctBoolContext) ctx).ID().getText())){
                    for(Symbol sym : scope.getSymbols()){
                        if(sym.getSymbolName().equals(((B314Parser.ValFctBoolContext) ctx).ID().getText())) {
                            return sym.getSymbolType().getTypeName();
                        }
                    }
                }
            }
        }

        Symbol typeVal = new Symbol();
        ArrayList<Scope> scopes = tab.getScopes();
        for(Scope scope: scopes) {
            if (scope.getScopeName().equals(tab.getWorkingScope())) {
                if (scope.getSymbolsName().contains(val)) {

                    //search symbol corresponding to val
                    for (Symbol symbol : scope.getSymbols()) {
                        if (symbol.getSymbolName().equals(val)) {
                            typeVal = symbol;

                        }
                    }

                }
            }
        }

        return typeVal.getSymbolType().getTypeName();

    }

    //#######################################################################################################################
    //                                   STOP CLEAN CODE 6
    //#######################################################################################################################

    /**
     * Give the type of a right expression
     * @param ctx
     * @return Type of the right expression
     */
    public String getTypeExprD(B314Parser.ExprDContext ctx) {

        if(ctx instanceof B314Parser.ValExprGContext){
            return getTypeExpG(((B314Parser.ValExprGContext) ctx).exprG());

        } else if (ctx instanceof B314Parser.ValExprEntContext) {
            return getTypeExprEnt(((B314Parser.ValExprEntContext) ctx).exprEnt());

        } else if (ctx instanceof B314Parser.ValExprBoolContext) {
            return getTypeExprBool(((B314Parser.ValExprBoolContext) ctx).exprBool());

        } else if (ctx instanceof B314Parser.ValExprCaseContext) {
            return getTypeExpCase(((B314Parser.ValExprCaseContext) ctx).exprCase());

        }  else if (ctx instanceof B314Parser.ValFunctContext) {

            ArrayList<Scope> scopeList = tab.getScopes();
            for(Scope scope : scopeList){
                String id = ((B314Parser.ValFunctContext) ctx).ID().getText();
                if (scope.getScopeName().equals(id)){
                    ArrayList<Symbol> symbolsList = scope.getSymbols();
                    for(Symbol symbol: symbolsList){
                        if(symbol.getSymbolName().equals(id)){
                            return symbol.getSymbolType().getTypeName();
                        }
                    }
                }
            }
        }

        throw new InvalidExpressionException("Ce n'est pas un Type Exp D");

    }

    @Override
    public Void visitVarSetArena(B314Parser.VarSetArenaContext ctx){

        if(ctx.exprG()!= null) {
            for (B314Parser.ExprGContext exprGContext : ctx.exprG()) {
                String type = getTypeExpG(exprGContext);
                if(! type.equals("integer")){
                    throw new InvalidExpressionException("dimension in arena not an integer");
                }
            }
        }

        visitChildren(ctx);

        return null;
    }

    //getter method
    public SymbolTable getTab(){
        return this.tab;
    }
}
