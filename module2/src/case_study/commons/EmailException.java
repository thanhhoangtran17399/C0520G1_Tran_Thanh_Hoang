package case_study.commons;

public class EmailException extends Exception{
    public EmailException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Enter mail error: "+super.getMessage();
    }
}
