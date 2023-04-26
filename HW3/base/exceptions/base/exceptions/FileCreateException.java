package base.exceptions;
import java.io.IOException;

public class FileCreateException extends IOException {
    public FileCreateException(String message) {
        super("File not created: " + message);
    }
}