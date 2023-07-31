package s03.Exceptions;

public class GenderException extends NumberFormatException {
    public GenderException() {
        super("Incorrect gender format");
    }
}
