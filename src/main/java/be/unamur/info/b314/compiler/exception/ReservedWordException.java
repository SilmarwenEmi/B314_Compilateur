package be.unamur.info.b314.compiler.exception;

public class ReservedWordException extends RuntimeException {

    public ReservedWordException(String message) {
        super(message);
    }

    public ReservedWordException(String message, Exception cause) {
        super(message, cause);
    }
}
