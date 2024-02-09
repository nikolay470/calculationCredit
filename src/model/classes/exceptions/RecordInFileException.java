package model.classes.exceptions;

public class RecordInFileException extends Exception{
    public RecordInFileException(String mess) {
        super(mess);
    }
    public RecordInFileException() {}
    public String getMessage() {
        return super.getMessage();
    }
    public void printStackTrace() {
        super.printStackTrace();
    }
}
