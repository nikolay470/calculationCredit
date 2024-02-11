package registration.client.classes.exceptions;

public class CountDataException extends Exception {
    public CountDataException(String mess) {
        super(mess);
    }
    public CountDataException() {}
    public String getMessage() {
        return super.getMessage();
    }
    public void printStackTrace() {
        super.printStackTrace();
    }
}
