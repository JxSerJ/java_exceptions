package s03.Exceptions;

public class PhoneException extends NumberFormatException {
    public PhoneException() {
        super("Incorrect phone number");
    }
}
