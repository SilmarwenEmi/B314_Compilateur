package be.unamur.info.b314.compiler.main;

import java.util.ArrayList;

/**
 * Represent a scope, namely the region of the program.
 * @specfield name: String // Name of the scope
 * @specfield symbols: ArrayList<Symbol> // Symbols present in the scope
 */
public class Scope {

    private String name;
    private ArrayList<Symbol> symbols;
    /**
     * Construct the scope object with a given name without any symbols
     * @param scopeName: Name of the new scope
     */
    public Scope(String scopeName){
        this.name = scopeName;
        this.symbols = new ArrayList<>();
    }

    /**
     * Give the name of the Scope
     * @return Name of this
     */
    public String getScopeName(){
        return this.name;
    }

    /**
     * Give all symbols of the scope
     * @return All symbols of this
     */
    public ArrayList<Symbol> getSymbols() {
        return symbols;
    }

    /**
     * Insert symbol into the scope
     * @param symbol: Symbol to insert into this
     * @modifies this.symbols
     * @effect this.symbols_post = {this.symbols U symbol}
     */
    public void insertSymbol(Symbol symbol){
        this.symbols.add(symbol);
    }

    /**
     * Give all symbols name
     * @return All symbols name
     */
    public ArrayList<String> getSymbolsName(){

        ArrayList<String> list = new ArrayList<>();
        for (Symbol sym : symbols) {
            list.add(sym.getSymbolName());
        }
        return list;
    }
}
