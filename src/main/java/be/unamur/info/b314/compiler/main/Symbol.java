package be.unamur.info.b314.compiler.main;


/**
 * Represent a symbol that can be a variable or a function
 * @specfield name: String // Name of the symbol (id)
 * @specfield type: Type // Type of the symbol
 */
public class Symbol {
    private String name;
    private Type type;
    private int context;
    private int address;

    /**
     * Construct a default symbol
     */
    public Symbol(){
        this.name = "";
        this.type = new Type();
        this.context = 0;
    }

    /**
     * Constructor for a 2parameters Symbol class using Name and Type of the symbol.
     * @param name: Name of the symbol.
     * @param type: Type of the symbol.
     * @param context: Context of the symbol.
     */
    public Symbol(String name, Type type, int context, int address){
        this.name = name;
        this.type = type;
        this.context = context;
        this.address = address;
    }

    /**
     * Give the name of the symbol.
     * @return Name of this
     */
    public String getSymbolName() {
        return this.name;
    }

    /**
     * Give type of the Symbol.
     * @return Type of this
     */
    public Type getSymbolType(){ return this.type; }

    /**
     * Give context of the Symbol.
     * @return context of this
     */
    public int getContext(){
        return this.context;
    }

    public int getAddress() {
        return address;
    }

    @Override
    public String toString()
    {
        return " Symbole : " + name + "- Type: "+getSymbolType().getTypeName()+".";
    }

}
