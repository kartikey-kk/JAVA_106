package unit2;

public class InsufficientBalanceException extends RuntimeException {


    public InsufficientBalanceException(String message){
        super(message);
    }
}
