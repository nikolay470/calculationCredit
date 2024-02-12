package registration.model.exceptions;

public class RecordInFileException extends Exception{
    private String message;

    public RecordInFileException(String mess) {
        super();
        message = mess;
    }
    public RecordInFileException() {}

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
