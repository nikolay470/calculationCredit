package creditCalculation.client.exceptions;

public class InvalidTypePaymentException extends Exception{

    public InvalidTypePaymentException(String mess) {
        super(mess);
    }
    public InvalidTypePaymentException() {}
}
