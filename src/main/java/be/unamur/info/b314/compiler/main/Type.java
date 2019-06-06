package be.unamur.info.b314.compiler.main;

/**
 * Represent a type (for variables and functions)
 * @specfield name: String // Name of the type
 */
public class Type {
    private String name;

    /**
     * Construct a default type
     */
    public Type(){
        this.name="";
    }

    /**
     * Constructor for a 1 parameter Type class using name
     * @param name: Name of the type
     */

    public Type(String name){
        this.name = name;
    }

    /**
     * Give the name of Type
     * @return Name of this
     */
    public String getTypeName() {
        return name;
    }
}
