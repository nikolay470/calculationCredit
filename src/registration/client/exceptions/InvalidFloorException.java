package registration.client.exceptions;

public class InvalidFloorException extends Exception {
    private String message;

    public InvalidFloorException(String mess) {
        super();
        message = mess;
    }
    public InvalidFloorException() {}

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
