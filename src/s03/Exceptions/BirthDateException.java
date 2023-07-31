package s03.Exceptions;

public class BirthDateException extends NumberFormatException {
    public BirthDateException() {
        super("Incorrect birth date format");
    }
}
