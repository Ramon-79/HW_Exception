package base.exceptions;

public class FullNameContainsDigitException extends RuntimeException{
    public FullNameContainsDigitException() {
        super("Numbers are not allowed!");
    }
}