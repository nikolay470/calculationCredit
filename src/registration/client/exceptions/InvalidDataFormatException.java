package registration.client.exceptions;

public class InvalidDataFormatException extends Exception{
    public InvalidDataFormatException(String mess) {
        super(mess);
    }
    public InvalidDataFormatException() {}
}
