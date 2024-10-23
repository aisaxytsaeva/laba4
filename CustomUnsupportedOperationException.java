
import java.util.Objects;

public class CustomUnsupportedOperationException extends UnsupportedOperationException{
    private final String message;

    public CustomUnsupportedOperationException(String message){
        this.message = Objects.requireNonNull(message);
    }

    @Override
       public String getMessage() {
           return message;
       }
}