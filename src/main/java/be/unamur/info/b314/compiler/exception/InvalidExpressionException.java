package be.unamur.info.b314.compiler.exception;

/**
 * Runtime Exception to throw when the expression usage is bad
 * like: affect int right expression wrong var type
 * @author Guillaume Maitre
 */
public class InvalidExpressionException extends RuntimeException {
    public InvalidExpressionException(String message) {
        super(message);
    }
    public InvalidExpressionException(String message, Exception cause) {
        super(message, cause);
    }
}
