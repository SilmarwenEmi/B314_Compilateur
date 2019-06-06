package be.unamur.info.b314.compiler.exception;

/**
 * Runtime Exception enabling control of global variable to avoid.
 * two variables with the same name and type.
 * Created by emlauren on 04/04/18.
 * @author Emilie Laurent
 */
public class FunctionAlreadyExistException extends RuntimeException {
    public FunctionAlreadyExistException(String message) {
        super(message);
    }
    public FunctionAlreadyExistException(String message, Exception cause) {
        super(message, cause);
    }
}