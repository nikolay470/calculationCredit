package view.classes.exceptions;

public class InvalidFloorException extends Exception {
    public InvalidFloorException(String mess) {
        super(mess);
    }
    public InvalidFloorException() {}
    public String getMessage() {
        return super.getMessage();
    }
    public void printStackTrace() {
        super.printStackTrace();
    }
}
