package s03.Exceptions;

public class FullNameException extends RuntimeException {
    public FullNameException() {
        super("Incorrect input of Full name");
    }
}
