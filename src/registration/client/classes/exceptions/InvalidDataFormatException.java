package registration.client.classes.exceptions;

public class InvalidDataFormatException extends Exception{
    public InvalidDataFormatException(String mess) {
        super(mess);
    }
    public InvalidDataFormatException() {}
    public String getMessage() {
        return  super.getMessage();
    }
    public void printStackTrace() {
        super.printStackTrace();
    }
}
