package registration.client.exceptions;

public class InvalidDataFormatException extends Exception{
    private String message;
    public InvalidDataFormatException(String mess) {
        super();
        message = mess;
    }
    public InvalidDataFormatException() {}

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
