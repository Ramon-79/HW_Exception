package base.exceptions;

public class FullNameEmptyValueException extends RuntimeException{
    public FullNameEmptyValueException() {
        super("One or more values in the name are empty!");
    }
}