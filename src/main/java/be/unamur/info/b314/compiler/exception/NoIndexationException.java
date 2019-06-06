package be.unamur.info.b314.compiler.exception;

/**
 * extension of Runtime Exception to throw error when their is no Index error
 * @author Guillaume Maitre
 */
public class NoIndexationException extends RuntimeException{
    public NoIndexationException(String msg) {
        super(msg);
    }
    public NoIndexationException(String msg, Exception cause) {
        super(msg, cause);
    }
}
