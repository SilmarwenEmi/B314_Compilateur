package be.unamur.info.b314.compiler.exception;

/**
 * Runtime Exception TO throw when the user don't use the correct type,... in a function
 * like: error when using a "or" and put the wrong type with it
 * @author Guillaume Maitre
 */
public class WrongDefinitionFunctionException extends RuntimeException {
    public WrongDefinitionFunctionException(String message) {
        super(message);
    }
    public WrongDefinitionFunctionException(String message, Exception cause) {
        super(message, cause);
    }
}
