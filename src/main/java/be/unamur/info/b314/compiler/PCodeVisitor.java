package be.unamur.info.b314.compiler;

import be.unamur.info.b314.compiler.main.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PCodeVisitor extends B314BaseVisitor {
    private static final Logger LOG = LoggerFactory.getLogger(PCodeVisitor.class);
    private final PCodePrinter printer;
    private int numberVars;
    private int nbrIf;
    private int nbrWhile;
    private SymbolTable symTable;
    private int context;
    private int valRetour;
    private boolean hasWhenClause;

    /**
     * initialisation du PCodeVisitor
     * @param printer
     * @param sym
     */
    public PCodeVisitor(PCodePrinter printer, SymbolTable sym){
        this.printer = printer;
        this.numberVars = sym.getNumberVars();
        this.symTable = sym;
        this.context = 0;
        hasWhenClause = false;
    }


    /**
     * Charge les variables de l'environement et les met en mémoire
     */
    private void chargeVariables(){

        printer.printComments("Init");
        printer.printComments("Init numbervars " + numberVars);
        printer.printSetStackPointer(numberVars+1);
        int i = 1;

        String type = "";

        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0);
        printer.printStore(PCodePrinter.PCodeTypes.Int);


        for(Scope scope : symTable.getScopes()){
            if(scope.getScopeName().equals(symTable.getWorkingScope())){
                for(Symbol symbol : scope.getSymbols()){

                    type = symbol.getSymbolType().getTypeName();
                    switch (type){
                        case "boolean":
                            printer.printLoadAdress(PCodePrinter.PCodeTypes.Bool, 0, i);
                            printer.printLoadConstant(PCodePrinter.PCodeTypes.Bool, 1);
                            printer.printStore(PCodePrinter.PCodeTypes.Bool);
                            break;
                        case "integer":
                            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, i);
                            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 2);
                            printer.printStore(PCodePrinter.PCodeTypes.Int);
                            break;
                        case "square":
                            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, i);
                            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 3);
                            printer.printStore(PCodePrinter.PCodeTypes.Int);
                            break;
                    }
                    i = i +1;
                }
            }


        }
        /*
        for(int i = 0; i < numberVars ; i++){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, i);
            printer.printRead();
            printer.printStore(PCodePrinter.PCodeTypes.Int);
        }
        */

        printer.printComments("Fin charge variable");
    }


    @Override
    public Object visitRoot(B314Parser.RootContext ctx) {

        chargeVariables();
        printer.printComments("Start program");
        //super.visitRoot(ctx);

        /*printer.printSetStackPointer(numberVars+1);
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, numberVars);*/

        visitChildren(ctx);
        //TODO tester un syteme de var global qui prend la var de retour final
        /*
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
        printer.printPrin();
        */
        //TODO retire le prin ici pour le mettre en direct dans les instrution
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, valRetour);
        printer.printPrin();
        printer.printComments("End program");
        printer.printStop();

        return null;
    }

    @Override
    public Object visitTypeScalar(B314Parser.TypeScalarContext ctx) {
        return super.visitTypeScalar(ctx);
    }

    @Override
    public Object visitTypeArray(B314Parser.TypeArrayContext ctx) {
        return super.visitTypeArray(ctx);
    }

    @Override
    public Object visitScalarBool(B314Parser.ScalarBoolContext ctx) {
        return super.visitScalarBool(ctx);
    }

    @Override
    public Object visitScalarInt(B314Parser.ScalarIntContext ctx) {
        return super.visitScalarInt(ctx);
    }

    @Override
    public Object visitScalarSquare(B314Parser.ScalarSquareContext ctx) {
        return super.visitScalarSquare(ctx);
    }

    @Override
    public Object visitScalarVoid(B314Parser.ScalarVoidContext ctx) {
        return super.visitScalarVoid(ctx);
    }

    @Override
    public Object visitValArray(B314Parser.ValArrayContext ctx) {
        return super.visitValArray(ctx);
    }

    @Override
    public Object visitVarDecl(B314Parser.VarDeclContext ctx) {

        String varName = ctx.ID().getText();
        String type = "";
        Symbol sym = null;

        for(Scope scope : symTable.getScopes()){
            if(scope.getScopeName().equals(symTable.getWorkingScope())){
                for(Symbol symbol : scope.getSymbols()){
                    if(symbol.getSymbolName().equals(varName)){
                        sym = symbol;
                        type = symbol.getSymbolType().getTypeName();
                    }
                }
            }

        }

        int dim = 0;
        assert type != null;
        if (type.contains("[")) {
            if (type.contains(",")) {
                dim = 2;
            } else {
                dim = 1;
            }
        }

        if(dim == 0){
            switch (type) {
                //TODO rajout du +1 pour décaler le tout pour garder le 0 free :3
                case "boolean":
                    printer.printLoadAdress(PCodePrinter.PCodeTypes.Bool, 0, sym.getAddress()+1);
                    printer.printLoadConstant(PCodePrinter.PCodeTypes.Bool, 1);
                    printer.printStore(PCodePrinter.PCodeTypes.Bool);
                    break;
                case "integer":
                    printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, sym.getAddress()+1);
                    printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 2);
                    printer.printStore(PCodePrinter.PCodeTypes.Int);
                    break;
                case "square":
                    printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, sym.getAddress()+1);
                    printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 3);
                    printer.printStore(PCodePrinter.PCodeTypes.Int);
                    break;
            }
        } else {
            int total = 1;
            total *= ((TypeArray) sym.getSymbolType() ).getDimension();
            switch (type){
                case "boolean":
                    for(int i = 0; i < total; i++){
                        printer.printLoadAdress(PCodePrinter.PCodeTypes.Bool, 0, sym.getAddress()+i);
                        printer.printLoadConstant(PCodePrinter.PCodeTypes.Bool, 1);
                        printer.printStore(PCodePrinter.PCodeTypes.Bool);
                    }
                    break;

                case "integer":
                    for(int i = 0; i < total; i++){
                        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, sym.getAddress()+i);
                        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 2);
                        printer.printStore(PCodePrinter.PCodeTypes.Int);
                    }
                    break;

                case "square":
                    for(int i = 0; i < total; i++){
                        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, sym.getAddress()+i);
                        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 3);
                        printer.printStore(PCodePrinter.PCodeTypes.Int);
                    }
                    break;
            }
        }

        return null;
        //return super.visitVarDecl(ctx);
    }

    @Override
    public Object visitValArena(B314Parser.ValArenaContext ctx) {

        printer.printSetStackPointer(numberVars+99);
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, numberVars);

        visitChildren(ctx);
        /*
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0); //do nothing
        printer.printStore(PCodePrinter.PCodeTypes.Int);
        printer.printPrin();
        */
        return null;

        //return super.visitValArena(ctx);
    }

    @Override
    public Object visitValItemR(B314Parser.ValItemRContext ctx) {
        return super.visitValItemR(ctx);
    }

    @Override
    public Object visitValItemM(B314Parser.ValItemMContext ctx) {
        return super.visitValItemM(ctx);
    }

    @Override
    public Object visitValItemG(B314Parser.ValItemGContext ctx) {
        return super.visitValItemG(ctx);
    }

    @Override
    public Object visitValItemS(B314Parser.ValItemSContext ctx) {
        return super.visitValItemS(ctx);
    }

    @Override
    public Object visitValItemF(B314Parser.ValItemFContext ctx) {
        return super.visitValItemF(ctx);
    }

    @Override
    public Object visitValExprG(B314Parser.ValExprGContext ctx) {
        return super.visitValExprG(ctx);
    }

    @Override
    public Object visitValFunct(B314Parser.ValFunctContext ctx) {
        return super.visitValFunct(ctx);
    }

    @Override
    public Object visitValExprEnt(B314Parser.ValExprEntContext ctx) {
        return super.visitValExprEnt(ctx);
    }

    @Override
    public Object visitValExprBool(B314Parser.ValExprBoolContext ctx) {
        return super.visitValExprBool(ctx);
    }

    /**
     * fonction renvoyant a la bonne gestion des exprbool
     * @param ctx Boolean Expression Context.
     */
    private void calculeExprBool(B314Parser.ExprBoolContext ctx) {
        if(ctx instanceof B314Parser.ValExpBoolParContext){
            visitValExpBoolPar((B314Parser.ValExpBoolParContext) ctx);
        }
        if(ctx instanceof B314Parser.ValExprBoolCaseContext){
            visitValExprBoolCase((B314Parser.ValExprBoolCaseContext) ctx);
        }
        if(ctx instanceof B314Parser.ValFctBoolContext){
            visitValFctBool((B314Parser.ValFctBoolContext) ctx);
        }
        if(ctx instanceof B314Parser.ValExpBoolEntContext){
            visitValExpBoolEnt((B314Parser.ValExpBoolEntContext) ctx);
        }
        if(ctx instanceof B314Parser.ValExpBoolBoolContext){
            visitValExpBoolBool((B314Parser.ValExpBoolBoolContext) ctx);
        }
        if(ctx instanceof B314Parser.ValExprBoolGContext){
            visitValExprBoolG((B314Parser.ValExprBoolGContext) ctx);
        }
    }


    @Override
    public Object visitValExprCase(B314Parser.ValExprCaseContext ctx) {
        return super.visitValExprCase(ctx);
    }

    /**
     * send to the good place of exprcase.
     * @param ctx Square Expression Context
     */
    private void calculeExprCase(B314Parser.ExprCaseContext ctx){

        if(ctx instanceof B314Parser.ValExprCaseParContext){
            B314Parser.ValExprCaseParContext ctx_temp = (B314Parser.ValExprCaseParContext) ctx;
            calculeExprCase(ctx_temp.exprCase());
        }
        if(ctx instanceof B314Parser.ValFctCaseContext){
            visitValFctCase((B314Parser.ValFctCaseContext) ctx);
        }
        if(ctx instanceof B314Parser.ValSquareContext){
            visitValSquare((B314Parser.ValSquareContext) ctx);
        }
        if(ctx instanceof B314Parser.ValExprCaseGContext){
            visitValExprCaseG((B314Parser.ValExprCaseGContext) ctx);
        }
    }

    @Override
    public Object visitValNumber(B314Parser.ValNumberContext ctx) {
        if(ctx.NUMBER() != null){
            int number = Integer.parseInt(ctx.NUMBER().getText());
            if(ctx.MINUS() != null){
                printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, number*(-1));
            } else {
                printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, number);
            }

            //TODO remplace le diff par 0 à la place de context
            //TODO rajout des printLoadConstant pour charger un int dans la mem
            //essayer de recup les ctonstante de latitude,....
            //TODO lat, soda à 0
            super.visitValNumber(ctx);
        } else if(ctx.LATITUDE() != null){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0,numberVars+1);
            printer.printLoad(PCodePrinter.PCodeTypes.Int, 0, numberVars+1);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,  0);
            super.visitValNumber(ctx);

        } else if(ctx.LONGITUDE() != null) {

            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0,numberVars+1);
            printer.printLoad(PCodePrinter.PCodeTypes.Int, 0, numberVars+1);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,  1);
            super.visitValNumber(ctx);

        } else if(ctx.GRID() != null) {
            //consider it is grid size
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0,numberVars+1);
            printer.printLoad(PCodePrinter.PCodeTypes.Int, 0, numberVars+1);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,  1);
            super.visitValNumber(ctx);

        } else if(ctx.MAP() != null){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0,numberVars+1);
            printer.printLoad(PCodePrinter.PCodeTypes.Int,0,numberVars+1);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,  1);
            super.visitValNumber(ctx);

        } else if(ctx.RADIO() != null){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0,numberVars+1);
            printer.printLoad(PCodePrinter.PCodeTypes.Int,0,numberVars+1);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,  1);
            super.visitValNumber(ctx);

        } else if(ctx.AMMO() != null){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0,numberVars+1);
            printer.printLoad(PCodePrinter.PCodeTypes.Int,0,numberVars+1);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,  1);
            super.visitValNumber(ctx);

        } else if(ctx.FRUITS() != null){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0,numberVars+1);
            printer.printLoad(PCodePrinter.PCodeTypes.Int,0,numberVars+1);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
            super.visitValNumber(ctx);

        } else if(ctx.SODA() != null){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0,numberVars+1);
            printer.printLoad(PCodePrinter.PCodeTypes.Int,0,numberVars+1);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,  0);
            super.visitValNumber(ctx);

        } else if(ctx.LIFE() != null){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0,numberVars+1);
            printer.printLoad(PCodePrinter.PCodeTypes.Int,0,numberVars+1);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,  1);
            super.visitValNumber(ctx);

        } else if(ctx.PLUS() != null){
            super.visitValNumber(ctx);
            printer.printAdd(PCodePrinter.PCodeTypes.Int);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,  10);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,  5);
            valRetour = 0;


        } else if(ctx.MINUS() != null){
            super.visitValNumber(ctx);
            printer.printSub(PCodePrinter.PCodeTypes.Int);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,  10);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,  5);
            valRetour = 0;

        } else if(ctx.MULT() != null){
            super.visitValNumber(ctx);
            printer.printMul(PCodePrinter.PCodeTypes.Int);
            valRetour = 0;

        } else if(ctx.DIV() != null){
            super.visitValNumber(ctx);
            printer.printDiv(PCodePrinter.PCodeTypes.Int);
            valRetour = 0;

        } else if(ctx.MOD() != null){
            super.visitValNumber(ctx);
            printer.printMod(PCodePrinter.PCodeTypes.Int);
            valRetour = 0;
        }
        //TODO ((grid+2)%(Lat+42))-i  recup les résultats pour les réuse
        //TODO var global
        valRetour = 0;
        return null;

        //return super.visitValNumber(ctx);
    }

    @Override
    public Object visitValFct(B314Parser.ValFctContext ctx) {

        /*printer.printMarkStack(context-1);
        super.visitValFct(ctx);
        String type = null;
        String varName = ctx.ID().getText();
        HashMap<String, Symbol> map = this.visitor.getSymTable();
        if(map.containsKey(varName)){
            type = map.get(varName).getSymbolType().getTypeName();
        }
        assert(type != null);
        if(type.equals("void")){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0);
        }
        return null;*/

        return super.visitValFct(ctx);
    }

    @Override
    public Object visitValExprEntG(B314Parser.ValExprEntGContext ctx) {
        return super.visitValExprEntG(ctx);
    }

    /**
     * renvois dans la bonne partie de exprEnt
     * @param ctx Integer Expression Context
     */
    private void calculeExprEnt(B314Parser.ExprEntContext ctx) {
        if(ctx instanceof B314Parser.ValNumberContext){
            visitValNumber((B314Parser.ValNumberContext) ctx);
        }
        if(ctx instanceof B314Parser.ValExrpEntParContext){
            visitValExrpEntPar((B314Parser.ValExrpEntParContext) ctx);
        }
        if(ctx instanceof B314Parser.ValFctContext){
            visitValFct((B314Parser.ValFctContext) ctx);
        }
        if(ctx instanceof B314Parser.ValExprEntGContext){
            visitValExprEntG((B314Parser.ValExprEntGContext) ctx);
        }
    }


    @Override
    public Object visitValExrpEntPar(B314Parser.ValExrpEntParContext ctx) {
        /*super.visitValExrpEntPar(ctx);
        return null;*/
        return super.visitValExrpEntPar(ctx);
    }

    @Override
    public Object visitValExprBoolCase(B314Parser.ValExprBoolCaseContext ctx) {
        /*calculeExprCase(ctx.exprCase(0));
        calculeExprCase(ctx.exprCase(1));
        printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
        return null;*/
        return super.visitValExprBoolCase(ctx);
    }

    @Override
    public Object visitValExpBoolBool(B314Parser.ValExpBoolBoolContext ctx) {
        /*calculeExprBool(ctx.exprBool(0));
        calculeExprBool(ctx.exprBool(1));
        if (ctx.EQUAL() != null){
            printer.printEqualsValues(PCodePrinter.PCodeTypes.Bool);
        }
        if (ctx.AND() != null){
            printer.printAnd();
        }
        if (ctx.OR() != null){
            printer.printOr();
        }
        return null;*/
        return super.visitValExpBoolBool(ctx);
    }

    @Override
    public Object visitValExpBoolEnt(B314Parser.ValExpBoolEntContext ctx) {
        /*if(ctx.INF() != null){
            calculeExprEnt(ctx.exprEnt(0));
            calculeExprEnt(ctx.exprEnt(1));
            printer.printLess(PCodePrinter.PCodeTypes.Int);
        }
        if(ctx.SUP() != null){
            calculeExprEnt(ctx.exprEnt(0));
            calculeExprEnt(ctx.exprEnt(1));
            printer.printGreather(PCodePrinter.PCodeTypes.Int);
        }
        if(ctx.EQUAL()!= null){
            calculeExprEnt(ctx.exprEnt(0));
            calculeExprEnt(ctx.exprEnt(1));
            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
        }
        return null;*/
        return super.visitValExpBoolEnt(ctx);
    }

    @Override
    public Object visitValExprBoolG(B314Parser.ValExprBoolGContext ctx) {
        return super.visitValExprBoolG(ctx);
    }

    @Override
    public Object visitValExpBoolPar(B314Parser.ValExpBoolParContext ctx) {
        /*calculeExprBool(ctx.exprBool());
        return null;*/

        return super.visitValExpBoolPar(ctx);

        //TODO on a les meme # pour des chose différentes
        //il faut tester les si on a un true,...
        //TODO regarder à ennemi pour les diff:
        /*
        if(ctx.TRUE() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
        }
        if(ctx.FALSE()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
        }
        if(ctx.NOT()!= null){
            B314Parser.ValExpBoolParContext ctx_temp = ctx;
            calculeExprBool(ctx_temp.exprBool());
            printer.printNot();
            return null;
        }
        if(ctx.ENNEMI() != null){
            if(ctx.NORTH() != null){
                printer.printLoad(PCodePrinter.PCodeTypes.Int, 0, 9);
                printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
                printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
            }
            if(ctx.EAST() != null){
                printer.printLoad(PCodePrinter.PCodeTypes.Int, 0, 10);
                printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
                printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
            }
            if(ctx.SOUTH() != null){
                printer.printLoad(PCodePrinter.PCodeTypes.Int, 0, 11);
                printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
                printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
            }
            if(ctx.WEST() != null){
                printer.printLoad(PCodePrinter.PCodeTypes.Int, 0, 12);
                printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
                printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
            }
            return null;
        }
        if (ctx.GRAAL() != null){
            if(ctx.NORTH() != null){
                printer.printLoad(PCodePrinter.PCodeTypes.Int, 0, 13);
                printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
                printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
            }
            if(ctx.EAST() != null){
                printer.printLoad(PCodePrinter.PCodeTypes.Int, 0, 14);
                printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
                printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
            }
            if(ctx.SOUTH() != null){
                printer.printLoad(PCodePrinter.PCodeTypes.Int, 0, 15);
                printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
                printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
            }
            if(ctx.WEST() != null){
                printer.printLoad(PCodePrinter.PCodeTypes.Int, 0, 16);
                printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
                printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
            }
            return null;
        } */
        //return super.visitValExpBoolPar(ctx);
    }

    @Override
    public Object visitValFctBool(B314Parser.ValFctBoolContext ctx) {
        return super.visitValFctBool(ctx);
    }

    @Override
    public Object visitValExprCasePar(B314Parser.ValExprCaseParContext ctx) {
        return super.visitValExprCasePar(ctx);
    }

    @Override
    public Object visitValFctCase(B314Parser.ValFctCaseContext ctx) {
        return super.visitValFctCase(ctx);
    }

    @Override
    public Object visitValSquare(B314Parser.ValSquareContext ctx) {
        //return super.visitValSquare(ctx);


        if(ctx.DIRT() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
            super.visitValSquare(ctx);
        } else if(ctx.ROCK() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,1);

            super.visitValSquare(ctx);
        } else if (ctx.VINES() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,2);

            super.visitValSquare(ctx);
        } else if(ctx.ZOMBIE() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,3);

            super.visitValSquare(ctx);
        } else if(ctx.ENNEMI() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,4);

            super.visitValSquare(ctx);
        } else if (ctx.PLAYER() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,5);

            super.visitValSquare(ctx);
        } else if (ctx.MAP() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,6);

            super.visitValSquare(ctx);
        } else if (ctx.RADIO() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,7);

            super.visitValSquare(ctx);
        } else if (ctx.AMMO() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,8);

            super.visitValSquare(ctx);
        } else if (ctx.FRUITS() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,9);

            super.visitValSquare(ctx);
        } else if (ctx.SODA() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,10);

            super.visitValSquare(ctx);
        } /*else if (ctx.GRAAL() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,?);
            super.visitValSquare(ctx);
        }*/

        return null;

    }

    @Override
    public Object visitValExprCaseG(B314Parser.ValExprCaseGContext ctx) {
        return super.visitValExprCaseG(ctx);
    }

    @Override
    public Object visitValId(B314Parser.ValIdContext ctx) {
        //return super.visitValId(ctx);

        //TODO: ajout des 4 lignes ci-dessous
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0,8);
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,  2);
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 2);
        return null;

    }

    @Override
    public Object visitValExpr(B314Parser.ValExprContext ctx) {
        return super.visitValExpr(ctx);
    }

    /**
     * Gestion des différentes branche d'instruction
     * permet de call cette fonction et d'ensuite gérer les différents cas plus facillement
     * @param ctx Instruction Context
     */
    private void visitInstruction(B314Parser.InstructionContext ctx) {

        if(ctx instanceof B314Parser.VarSkipContext){
            visitVarSkip((B314Parser.VarSkipContext) ctx);
        }
        if(ctx instanceof B314Parser.VarIfContext){
            visitVarIf((B314Parser.VarIfContext) ctx);
        }
        if(ctx instanceof B314Parser.VarIfElseContext){
            visitVarIfElse((B314Parser.VarIfElseContext) ctx);
        }
        if(ctx instanceof B314Parser.VarWhileDoContext){
            visitVarWhileDo((B314Parser.VarWhileDoContext) ctx);
        }
        if(ctx instanceof B314Parser.VarSetContext){
            visitVarSet((B314Parser.VarSetContext) ctx);
        }
        if(ctx instanceof B314Parser.VarComputeContext){
            visitVarCompute((B314Parser.VarComputeContext) ctx);
        }
        if(ctx instanceof B314Parser.VarNextContext){
            visitVarNext((B314Parser.VarNextContext) ctx);
        }
    }

    private void visitAction(B314Parser.ActionContext ctx) {

        if(ctx instanceof B314Parser.VarMoveContext){
            visitVarMove((B314Parser.VarMoveContext) ctx);
        }
        if(ctx instanceof B314Parser.VarShootContext){
            visitVarShoot((B314Parser.VarShootContext) ctx);
        }
        if(ctx instanceof B314Parser.VarUseContext){
            visitVarUse((B314Parser.VarUseContext) ctx);
        }
        if(ctx instanceof B314Parser.VarDoNothingContext){
            visitVarDoNothing((B314Parser.VarDoNothingContext) ctx);
        }

    }

    @Override
    public Object visitVarSkip(B314Parser.VarSkipContext ctx) {
        //return super.visitVarSkip(ctx);
        //visitChildren(ctx);
        writeZero();
        return null;

    }

    @Override
    public Object visitVarIf(B314Parser.VarIfContext ctx) {
        /*//this.nbrIf++;
        //int n = this.nbrIf;
        // TODO probleme avec le exprBool qu'il ne prend pas
        // calculeExprBool(ctx.ExprBool());
        // printer.printFalseJump("endIf"+ctx.exprbool().getText()+String.valueOf(n));
        super.visitVarIf(ctx);
        // printer.printDefineLabel("endIf"+ctx.exprbool().getText()+String.valueOf(n));
        return null;*/
        //return super.visitVarIf(ctx);

        nbrIf = nbrIf+1;
        printer.printDefineLabel("IF:"+ nbrIf);

        visitChildren(ctx);

        for(B314Parser.InstructionContext instr: ctx.instruction()){
            visitInstruction(instr);
        }
        valRetour = 0;
        return null;

    }

    @Override
    public Object visitVarIfElse(B314Parser.VarIfElseContext ctx) {
        //return super.visitVarIfElse(ctx);
        nbrIf = nbrIf+1;
        printer.printDefineLabel("IFElse:"+ nbrIf);

        visitChildren(ctx);

        for(B314Parser.InstructionContext instr: ctx.instruction()){
            visitInstruction(instr);
        }

        valRetour = 0;
        return null;

    }

    /**
     * Renvois au bonne endroit quand on rentre dans une exprDroite
     * @param ctx
     */
    private void calculeExprD(B314Parser.ExprDContext ctx) {
        if(ctx instanceof B314Parser.ValExprGContext){
            visitValExprG((B314Parser.ValExprGContext) ctx);
        }
        if(ctx instanceof B314Parser.ValFunctContext){
            visitValFunct((B314Parser.ValFunctContext) ctx);
        }
        if(ctx instanceof B314Parser.ValExprEntContext){
            visitValExprEnt((B314Parser.ValExprEntContext) ctx);
        }
        if(ctx instanceof B314Parser.ValExprBoolContext){
            visitValExprBool((B314Parser.ValExprBoolContext) ctx);
        }
        if(ctx instanceof B314Parser.ValExprCaseContext){
            visitValExprCase((B314Parser.ValExprCaseContext) ctx);
        }
    }

    @Override
    public Object visitVarWhileDo(B314Parser.VarWhileDoContext ctx) {
        /*this.nbrWhile++;
        int n = this.nbrWhile;
        printer.printDefineLabel("while_"+ctx.exprD().getText()+String.valueOf(n));
        calculeExprD(ctx.exprD());
        printer.printFalseJump("endWhile_"+ctx.exprD().getText()+String.valueOf(n));
        for(int i = 0; i < ctx.instruction().size(); i++){
            visitInstruction(ctx.instruction(i));
        }
        printer.printUnconditionalJump("while_"+ctx.exprD().getText()+String.valueOf(n));
        printer.printDefineLabel("endWhile_"+ctx.exprD().getText()+String.valueOf(n));
        return null;*/
        //return super.visitVarWhileDo(ctx);
        nbrWhile = nbrWhile+1;
        printer.printDefineLabel("While:"+ nbrWhile);

        for(B314Parser.InstructionContext instr: ctx.instruction()){
            visitInstruction(instr);
        }

        return null;
    }

    @Override
    public Object visitVarSet(B314Parser.VarSetContext ctx) {
        //return super.visitVarSet(ctx);

        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitVarCompute(B314Parser.VarComputeContext ctx) {
        /*super.visitVarCompute(ctx);
        printer.printPop();
        return null;*/
        //return super.visitVarCompute(ctx);

        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitVarNext(B314Parser.VarNextContext ctx) {


        visitAction(ctx.action());

        return null;
    }

    @Override
    public Object visitVarMove(B314Parser.VarMoveContext ctx) {

        //TODO Retire tout les Print.store des fonction en venir pour test
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0,0);
        if(ctx.NORTH()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
            valRetour = 1;
            //printer.printPrin();

        }
        if(ctx.EAST()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,2);
            valRetour =2;
            //printer.printPrin();
        }
        if(ctx.SOUTH()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,3);
            //printer.printPrin();
            valRetour =3;

        }
        if(ctx.WEST()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,4);
            //printer.printPrin();
            valRetour =4;

        }
        //printer.printStore(PCodePrinter.PCodeTypes.Int);

        return null;
    }

    @Override
    public Object visitVarShoot(B314Parser.VarShootContext ctx) {


        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int,0,0);
        if(ctx.NORTH()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 5);
            //printer.printPrin();
            valRetour =5;

        }
        if(ctx.EAST()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,6);
            //printer.printPrin();
            valRetour =6;

        }
        if(ctx.SOUTH()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,7);
            //printer.printPrin();
            valRetour =7;

        }
        if(ctx.WEST()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,8);
            //printer.printPrin();
            valRetour =8;

        }
        //printer.printStore(PCodePrinter.PCodeTypes.Int);

        return null;
    }

    @Override
    public Object visitVarUse(B314Parser.VarUseContext ctx) {

        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int,0,0);
        if(ctx.MAP()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 9);
            //printer.printPrin();
            valRetour =9;
        }
        if(ctx.RADIO()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,10);
            //printer.printPrin();
            valRetour =10;

        }
        if(ctx.FRUITS()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,11);
            //printer.printPrin();
            valRetour = 11;

        }
        if(ctx.SODA()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,12);
            //printer.printPrin();
            valRetour =12;

        }
        //printer.printStore(PCodePrinter.PCodeTypes.Int);

        return null;

    }

    @Override
    public Object visitVarDoNothing(B314Parser.VarDoNothingContext ctx) {
        writeZero();

        return null;
    }

    @Override
    public Object visitVarDeclLocal(B314Parser.VarDeclLocalContext ctx) {
        return super.visitVarDeclLocal(ctx);
    }

    @Override
    public Object visitVarFctDecl(B314Parser.VarFctDeclContext ctx) {

        symTable.setWorkingScope(ctx.ID().getText());
        context = context + 2;
        printer.printDefineLabel(ctx.ID().getText());
        if(ctx.VOID() != null){
            printer.printSetStackPointer(ctx.varDecl().size()+99);
            super.visitVarFctDecl(ctx);
            //TODO retourner la valeur correcte de la function
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0);
            valRetour=0;
            printer.printReturnFromFunction();
        } else {
            printer.printSetStackPointer(ctx.varDecl().size()+99);
            for(int i = 0 ; i < ctx.instruction().size(); i++){
                visitInstruction(ctx.instruction(i));
            }
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0);
            valRetour=0;
            printer.printReturnFromFunction();
        }

        context = context - 2;
        symTable.setWorkingScope("global");
        return null;

        //return super.visitVarFctDecl(ctx);
    }

    @Override
    public Object visitVarImpDecl(B314Parser.VarImpDeclContext ctx) {

        printer.printSetStackPointer(numberVars+1);
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, numberVars);

        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0); //print 0
        printer.printStore(PCodePrinter.PCodeTypes.Int);
        //printer.printPrin();
        valRetour =0;
        return null;
    }

    @Override
    public Object visitVarFileDecl(B314Parser.VarFileDeclContext ctx) {
        return super.visitVarFileDecl(ctx);
    }


    @Override
    public Object visitVarProgramWorld(B314Parser.VarProgramWorldContext ctx) {


        //TODO init la dernière var comme un bool, pareil dans strat
        int stack_Max = numberVars+98;
        printer.printSetStackPointer(numberVars+99);

        printer.printLoadAdress(PCodePrinter.PCodeTypes.Bool, 0, stack_Max);
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Bool, 1);
        printer.printStore(PCodePrinter.PCodeTypes.Bool);


        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, numberVars+1);
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0);
        printer.printStore(PCodePrinter.PCodeTypes.Int);

        //TODO
        //chargeVariables();
        printer.printUnconditionalJump("begin");

        for(B314Parser.FctDeclContext fct : ctx.fctDecl()){
            visitVarFctDecl((B314Parser.VarFctDeclContext) fct);
        }

        printer.printDefineLabel("begin");
        for(B314Parser.VarDeclContext var: ctx.varDecl()){
            visitVarDecl(var);
        }

        for(B314Parser.ArenaContext arena : ctx.arena()){
            visitValArena((B314Parser.ValArenaContext)arena);
        }

        this.context++;

        visitVarClauseDefault((B314Parser.VarClauseDefaultContext)ctx.clauseDefault());

        printer.printDefineLabel("end");
        /*
        printer.printPrin();
        printer.printStop();
        */
        return null;

        /*printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0); //do nothing
        printer.printStore(PCodePrinter.PCodeTypes.Int);
        printer.printPrin();*/

    }

    @Override
    public Object visitVarClauseDefault(B314Parser.VarClauseDefaultContext ctx) {
        symTable.setWorkingScope("default");
        printer.printSetStackPointer(9+ctx.varDecl().size());

        //super.visitVarClauseDefault(ctx);

        if(has_noReturn(ctx.instruction())){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int,0,0);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
            valRetour = 0;
            printer.printStore(PCodePrinter.PCodeTypes.Int);
        }

        for(B314Parser.InstructionContext instr : ctx.instruction()){
            visitInstruction(instr);
        }

        //printer.printReturnFromProcedure();

        symTable.setWorkingScope("global");

        return null;
    }

    @Override
    public Object visitVarProgramStrat(B314Parser.VarProgramStratContext ctx) {

        int stack_Max = numberVars+98;
        printer.printSetStackPointer(numberVars+99);
        //TODO
        //chargeVariables();

        printer.printLoadAdress(PCodePrinter.PCodeTypes.Bool, 0, stack_Max);
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Bool, 1);
        printer.printStore(PCodePrinter.PCodeTypes.Bool);


        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, numberVars+1);
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0);
        printer.printStore(PCodePrinter.PCodeTypes.Int);

        printer.printUnconditionalJump("begin");

        for(B314Parser.ImpDeclContext impDecl : ctx.impDecl()){
            visitVarImpDecl((B314Parser.VarImpDeclContext)impDecl);
        }

        for(B314Parser.FctDeclContext fct : ctx.fctDecl()){
            visitVarFctDecl((B314Parser.VarFctDeclContext) fct);
        }

        printer.printDefineLabel("begin");
        for(B314Parser.VarDeclContext var: ctx.varDecl()){
            visitVarDecl(var);
        }

        for(B314Parser.ArenaContext arena : ctx.arena()){
            visitValArena((B314Parser.ValArenaContext)arena);
        }

        this.context++;

        for(B314Parser.ClauseWhenContext when : ctx.clauseWhen()){
            visitVarWhen((B314Parser.VarWhenContext) when);
        }

        //TODO: ajout du if
        if(!hasWhenClause){
            visitVarClauseDefault((B314Parser.VarClauseDefaultContext)ctx.clauseDefault());
        }

        printer.printDefineLabel("end");
        hasWhenClause = false;
        /*
        printer.printPrin();
        printer.printStop();
        */
        return null;
    }

    @Override
    public Object visitVarWhen(B314Parser.VarWhenContext ctx) {
        symTable.setWorkingScope("when");

        hasWhenClause = true;
        //TODO passe tout les 5+ en 9+
        printer.printFalseJump("end_"+ctx.exprBool().getText());
        printer.printDefineLabel(ctx.exprBool().getText());
        printer.printMarkStack(context-1);
        printer.printCallUserProcedure(0, ctx.exprBool().getText()+"Body");
        printer.printUnconditionalJump("end");
        printer.printDefineLabel(ctx.exprBool().getText()+"Body");
        printer.printSetStackPointer(9+ctx.varDecl().size());

        //TODO: j'ai enlevé ça et ça n'a pas fait d'erreurs en plus ni en moins ...
        //super.visitVarWhen(ctx);

        if(has_noReturn(ctx.instruction())){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int,0,0);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
            printer.printStore(PCodePrinter.PCodeTypes.Int);
            valRetour = 0;
            printer.printComments("when has no return");
        }

        printer.printComments("apres le if no return");

        for(B314Parser.InstructionContext instr : ctx.instruction()){
            visitInstruction(instr);
        }

        printer.printReturnFromProcedure();
        printer.printDefineLabel("end_"+ctx.exprBool().getText());

        symTable.setWorkingScope("global");

        return null;

        //return super.visitVarWhen(ctx);
    }

    @Override
    public Object visitVarCommentaire(B314Parser.VarCommentaireContext ctx) {
        //return super.visitVarCommentaire(ctx);
/*
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
        printer.printStore(PCodePrinter.PCodeTypes.Int);
*/
        return null;
    }

    @Override
    public Object visitVarProgram(B314Parser.VarProgramContext ctx) {
        //return super.visitVarProgram(ctx);
 /*       chargeVariables();
        printer.printComments("Start program");

        super.visitVarProgram(ctx);
        printer.printSetStackPointer(numberVars+1);
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, numberVars);
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0); //do nothing
        printer.printStore(PCodePrinter.PCodeTypes.Int);
        printer.printPrin();
        printer.printComments("End program");
        printer.printStop();
*/
        return visitChildren(ctx);
    }

    @Override
    public Object visitVarSetArena(B314Parser.VarSetArenaContext ctx){

        visitChildren(ctx);
        writeZero();
        return null;

    }

    private boolean has_noReturn(List<B314Parser.InstructionContext> list)
    {
        for (B314Parser.InstructionContext aList : list) {
            if (aList instanceof B314Parser.VarNextContext) {
                return false;
            }
        }
        return true;
    }

    private void writeZero(){
        /*
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int,0,0);
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0); //do nothing
        printer.printStore(PCodePrinter.PCodeTypes.Int);
        printer.printPrin();
        */
        //printer.printSetStackPointer(numberVars+1);
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0); //do nothing
        //printer.printPrin();
        valRetour =0;
        //printer.printStore(PCodePrinter.PCodeTypes.Int);
        //printer.printPrin();
    }
}