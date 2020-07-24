package string_and_regex.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String CLASSNAMEREGEX_REGEX;

    static {
        CLASSNAMEREGEX_REGEX = "^[C|P|A][\\d]{4}[G|H|I|K|L|M]$";
    }

    public ClassNameExample() {
        pattern = Pattern.compile(CLASSNAMEREGEX_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        System.out.println("Input name of class :");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        boolean isvalid = classNameExample.validate(className);
        System.out.println(isvalid);
    }
}