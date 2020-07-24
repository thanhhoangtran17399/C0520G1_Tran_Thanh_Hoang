package string_and_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String PHONEREGEX_REGEX = "[\\d]{2}-[0][\\d]{9}";
    private static Pattern pattern;
    private static Matcher matcher;
    public PhoneNumberExample() {
        pattern = Pattern.compile(PHONEREGEX_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample= new PhoneNumberExample();
        System.out.println("Input phone number :");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        boolean isvalid = phoneNumberExample.validate(className);
        System.out.println(isvalid);
    }
}
