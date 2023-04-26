package base.exceptions;

public class CheckSexException extends RuntimeException{
    public CheckSexException() {
        super("Sex value is empty!");
    }
}