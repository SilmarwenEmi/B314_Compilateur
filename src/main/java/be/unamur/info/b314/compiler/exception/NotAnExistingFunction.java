package be.unamur.info.b314.compiler.exception;

public class NotAnExistingFunction extends RuntimeException {

    public NotAnExistingFunction(String message) {
        super(message);
    }

    public NotAnExistingFunction(String message, Exception cause) {
        super(message, cause);
    }
}
