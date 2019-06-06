package be.unamur.info.b314.compiler.main;

/**
 * Extension of the Symbol class representing a function
 * @specfield parameters: int // Number of parameters of the function
 */
public class Function extends Symbol{

    private int parameters;

    /**
     * Construct the Function object
     * @param name: Name of this
     * @param type: Type of this
     * @param param: Number of parameters of this
     */
    public Function(String name, Type type, int param, int context, int address){
        super(name, type, context, address);
        this.parameters = param;
    }

    /**
     * Give the number of parameters of a function
     * @return Number of parameters of this
     */
    public int getParameters(){
        return this.parameters;
    }
}
