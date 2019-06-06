grammar B314;

import B314Words;

root: program;
type: scalar #typeScalar | array #typeArray;
scalar: BOOLEAN #scalarBool| INTEGER #scalarInt| SQUARE #scalarSquare | VOID #scalarVoid;
array: scalar LBR (NUMBER) ( COMMA (NUMBER) )? RBR #valArray;
varDecl: ID AS type;
arena: ARENA AS SQUARE LBR (NUMBER | exprG)+ COMMA (NUMBER | exprG)+ RBR #valArena;
item: RADIO #valItemR
    | MAP #valItemM
    | GRAAL #valItemG
    | SODA #valItemS
    | FRUITS #valItemF;

exprD:  exprG #valExprG
        | ID LPAR (exprD (COMMA exprD)*)? RPAR #valFunct
        | exprEnt #valExprEnt
        | exprBool #valExprBool
        | exprCase #valExprCase;


exprEnt: (MINUS)? NUMBER #valNumber
        | LPAR exprEnt RPAR #valExrpEntPar
        | LATITUDE #valNumber
        | LONGITUDE #valNumber
        | GRID SIZE #valNumber
        | (MAP | RADIO | FRUITS | SODA | AMMO) COUNT #valNumber
        | LIFE #valNumber
        | exprEnt PLUS exprEnt #valNumber
        | exprEnt MINUS exprEnt #valNumber
        | exprEnt MULT exprEnt #valNumber
        | exprEnt DIV exprEnt #valNumber
        | exprEnt MOD exprEnt #valNumber
        | ID LPAR (exprD ( COMMA exprD)*)? RPAR #valFct
        | exprG #valExprEntG;


exprBool: LPAR exprBool RPAR #valExpBoolPar
        | TRUE #valExpBoolPar
        | FALSE #valExpBoolPar
        | ENNEMI IS (NORTH | SOUTH | EAST | WEST) #valExpBoolPar
        | GRAAL IS (NORTH | SOUTH | EAST | WEST) #valExpBoolPar
        | ID LPAR (exprD ( COMMA exprD)*)? RPAR  #valFctBool
        | exprCase EQUAL exprCase #valExprBoolCase
        | exprEnt (INF | SUP | EQUAL ) exprEnt #valExpBoolEnt
        | exprBool (AND | OR | EQUAL) exprBool #valExpBoolBool
        | NOT exprBool #valExpBoolPar
        | exprG #valExprBoolG;

exprCase: LPAR exprCase RPAR #valExprCasePar
        | ID LPAR (exprD ( COMMA exprD)*)? RPAR  #valFctCase
        | DIRT #valSquare
        | ROCK #valSquare
        | VINES #valSquare
        | ZOMBIE #valSquare
        | PLAYER #valSquare
        | ENNEMI #valSquare
        | MAP #valSquare
        | RADIO #valSquare
        | AMMO #valSquare
        | FRUITS #valSquare
        | SODA #valSquare
        | GRAAL #valSquare
        | NEARBY LBR exprEnt COMMA exprEnt RBR #valSquare
        | exprG #valExprCaseG;

exprG: ID #valId
     | ID LBR exprEnt (COMMA exprEnt)? RBR #valExpr
     ;

instruction: SKIPP #varSkip
            | IF exprD THEN instruction+ DONE #varIf
            | IF exprD THEN instruction+ ELSE instruction+ DONE #varIfElse
            | WHILE exprD DO instruction+ DONE #varWhileDo
            | SET exprG TO LPAR? exprD RPAR? #varSet
            | SET ARENA LBR (NUMBER  | exprG)+ COMMA (NUMBER  | exprG)+ RBR TO exprCase #varSetArena
            | COMPUTE exprD #varCompute
            | NEXT action #varNext;

action: MOVE (NORTH | SOUTH | EAST | WEST) #varMove
      | SHOOT (NORTH | SOUTH | EAST | WEST) #varShoot
      | USE (MAP | RADIO | FRUITS | SODA) #varUse
      | DO NOTHING #varDoNothing;

declLocal: DECLARE LOCAL (varDecl SCOL)+ #varDeclLocal;

fctDecl: ID AS FUNCTION LPAR (varDecl (COMMA varDecl)*)? RPAR DPT (scalar | VOID)?
        (declLocal)?
         DO (instruction) + (RETURN (exprD | VOID) (SCOL)?) DONE #varFctDecl;

impDecl: IMPORT fileDecl #varImpDecl;

fileDecl: ID (DOT)? WLD #varFileDecl;

//fileName: LETTER (NUMBER | LETTER)* #varFileName; //sert plus, remplacé par ID dans fileDecl

programWorld: DECLARE AND RETAIN
                (varDecl SCOL | fctDecl | arena SCOL)*
                WHEN YOUR TURN
                (instruction )* clauseDefault #varProgramWorld;

clauseDefault: BY DEFAULT
                (DECLARE LOCAL (varDecl SCOL)+)?
                 DO (instruction)+ DONE #varClauseDefault;

programStrat: DECLARE AND RETAIN
            (varDecl SCOL | fctDecl | impDecl  | arena SCOL)*
             WHEN YOUR TURN
               (clauseWhen)* clauseDefault #varProgramStrat;

clauseWhen: WHEN exprBool
            (DECLARE LOCAL (varDecl SCOL)+)?
            DO (instruction)+ DONE #varWhen;

commentaire: COML (NUMBER | LETTER)* COMR #varCommentaire;

program: (programStrat | programWorld) EOF #varProgram;

