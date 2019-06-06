package be.unamur.info.b314.compiler.main;

import be.unamur.info.b314.compiler.B314BaseVisitor;
import be.unamur.info.b314.compiler.B314VisitorImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;


/**
 * @overview Extension of B314BaseVisitor, represent the Symbol Table
 * A symbol table is mutable.
 * @specfield workingScope: String // The name of the scope we are currently working with
 * @specfiel scopes: ArrayList<Scope> // A list of all scope existing
 */


public class SymbolTable extends B314BaseVisitor{

    private String workingScope;
    private ArrayList<Scope> scopes;
    private static final Logger LOG = LoggerFactory.getLogger(B314VisitorImpl.class);

    /**
     * Construct the default SymbolTable object without any scope and the default working scope (as global)
     */
    public SymbolTable(){
        this.scopes = new ArrayList<>();
        this.workingScope = "global";
        scopes.add(new Scope("global"));
    }

    /**
     * Give all scopes present in the symbol table
     * @return List of all scopes
     */
    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    /**
     * Insert a new scope into the list of all scopes
     * @param scope: Scope to insert into symbol table
     */
    public void insertNewScope(Scope scope){
        this.scopes.add(scope);
    }

    /**
     * Give the working scope
     * @return the name of the working scope
     */
    public String getWorkingScope() {
        return workingScope;
    }

    /**
     * Set at the current scope
     * @param scope: Name of the scope where we are working
     */
    public void setWorkingScope(String scope){
        this.workingScope = scope;
    }

    /**
     * Give all scopes name
     * @return List containing all scopes name
     */
    public ArrayList<String> getScopesName(){

        ArrayList<String> list = new ArrayList<>();
        for (Scope sc : scopes) {
            list.add(sc.getScopeName());
        }
        return list;
    }

    /**
     * Print symbol table
     */
    public void printSymbolTable() {
        for (Scope scope: scopes) {
            System.out.println("SCOPE: "+scope.getScopeName()+"\n");
            for (Symbol sym: scope.getSymbols()) {
                System.out.println(" SYM "+sym.toString()+"\n");
            }
        }
    }

    /**
     * Delete a given scope in the symbol table
     * @param scopeName: Name of the scope to delete
     */
    public void deleteWorkingScope(String scopeName) {

      int i ;
        for ( i = 0; i < scopes.size(); i++) {
            if(scopes.get(i).getScopeName().equals(workingScope)){
                break;
            }
        }
      if(workingScope.equals(scopeName))
          scopes.remove(i);
    }

    public int getNumberVars(){
        int number = 0;
        for(Scope scope : scopes){
            if(!scope.getScopeName().equals("when") && !scope.getScopeName().equals("default")) {
                LOG.debug("nom du scope + taille " + scope.getScopeName() + " --------" + scope.getSymbols().size());
                number += scope.getSymbols().size();
            }
        }
        LOG.debug("get nbvars " + number);
        return number;
    }
}
