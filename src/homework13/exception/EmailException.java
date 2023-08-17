package homework13.exception;

public class EmailException extends RuntimeException {
    public EmailException() {
        super("Email format exception");
    }
}
