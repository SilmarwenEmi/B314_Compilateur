package be.unamur.info.b314.compiler.main;

import java.util.ArrayList;

/**
 * Extension of the type class representing array
 * @specfield dimension: int // Dimension of the array
 */
public class TypeArray extends Type {

    private int dimension;
    private ArrayList<Integer> taille;

    /**
     * Parametrisation of the construction of the new array.
     * @param name: Name of the array
     * @param dimension: Dimension of the array
     */
    public TypeArray(String name, int dimension, ArrayList<Integer> tailleDimension) {
        super(name);
        this.dimension = dimension;
        this.taille = tailleDimension;
    }

    /**
     * Give the dimension of the array
     * @return Dimension of the array
     */
    public int getDimension() {
        return dimension;
    }

    public ArrayList<Integer> getTaille() {
        return this.taille;
    }

}
