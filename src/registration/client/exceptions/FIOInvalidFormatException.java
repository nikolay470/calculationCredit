package registration.client.exceptions;

public class FIOInvalidFormatException extends Exception{
    public FIOInvalidFormatException(String mess) {
        super(mess);
    }
    public FIOInvalidFormatException() {}
}
