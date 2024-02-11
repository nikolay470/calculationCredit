package registration.client.classes.exceptions;

public class FIOInvalidFormatException extends Exception{
    public FIOInvalidFormatException(String mess) {
        super(mess);
    }
    public FIOInvalidFormatException() {}
    public String getMessage() {
        return super.getMessage();
    }
    public void printStackTrace() {
        super.printStackTrace();
    }
}
