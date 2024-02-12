package registration.client.exceptions;

public class FIOInvalidFormatException extends Exception{
    private String message;

    public FIOInvalidFormatException(String mess) {
        super();
        message = mess;
    }
    public FIOInvalidFormatException() {}

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
