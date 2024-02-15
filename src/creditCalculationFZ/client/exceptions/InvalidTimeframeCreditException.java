package creditCalculationFZ.client.exceptions;

public class InvalidTimeframeCreditException extends Exception {
    public InvalidTimeframeCreditException(String mess) {
        super(mess);
    }

    public InvalidTimeframeCreditException() {}
}
