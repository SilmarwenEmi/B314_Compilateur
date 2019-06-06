package be.unamur.info.b314.compiler.exception;

/**
 * Runtime Exception enabling control of global variable to avoid.
 * two variables with the same name and type.
 * Created by cedelhay on 16/03/18.
 * @author Celine Delhay
 */
public class VarAlreadyExistException extends RuntimeException {
    public VarAlreadyExistException(String message) {
        super(message);
    }
    public VarAlreadyExistException(String message, Exception cause) {
        super(message, cause);
    }
}
