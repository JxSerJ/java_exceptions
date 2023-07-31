package s03.Exceptions;

public class GeneralException extends RuntimeException {
    public GeneralException() {
        super("Incorrect input data");
    }
}
