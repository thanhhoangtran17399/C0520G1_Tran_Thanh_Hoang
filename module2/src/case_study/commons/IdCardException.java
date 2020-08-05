package case_study.commons;

public class IdCardException extends Exception{
    public IdCardException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Enter ID error: "+super.getMessage();
    }
}
