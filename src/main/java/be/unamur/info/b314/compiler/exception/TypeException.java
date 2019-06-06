package be.unamur.info.b314.compiler.exception;

public class TypeException extends RuntimeException{

    public TypeException(String message) {
        super(message);
    }

    public TypeException(String message, Exception cause) {
        super(message, cause);
    }

}
