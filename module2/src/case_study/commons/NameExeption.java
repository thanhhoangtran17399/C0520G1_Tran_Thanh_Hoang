package case_study.commons;

public class NameExeption extends Exception{
    public NameExeption(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return "Enter name error: "+super.getMessage();
    }
}
