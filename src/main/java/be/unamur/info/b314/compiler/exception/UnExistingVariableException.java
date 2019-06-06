package be.unamur.info.b314.compiler.exception;

/**
 * extension of Runtime Exception to throw error when their is an Un-Existing Variable Exception
 * It's throw if the person try to use a variable that doesn't not exist
 * @author Guillaume Maitre
 */
public class UnExistingVariableException extends RuntimeException {
    public UnExistingVariableException(String message) {
        super(message);
    }
    public UnExistingVariableException(String message, Exception cause) {
        super(message, cause);
    }
}
