package view.classes.exceptions;

public class InvalidNumberPhoneFormat extends Exception{
    public InvalidNumberPhoneFormat(String mess) {
        super(mess);
    }
    public InvalidNumberPhoneFormat() {}
    public String getMessage() {
        return  super.getMessage();
    }
    public void printStackTrace() {
        super.printStackTrace();
    }
}
