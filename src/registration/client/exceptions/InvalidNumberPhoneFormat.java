package registration.client.exceptions;

public class InvalidNumberPhoneFormat extends Exception{
    private String message;

    public InvalidNumberPhoneFormat(String mess) {
        super();
        message = mess;
    }
    public InvalidNumberPhoneFormat() {}

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
