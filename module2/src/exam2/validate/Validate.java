package exam2.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
  /*  public static final String EMAIL_REGEX = "[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)";*/
    public static final String SODIENTHOAI_REGEX = "^(09)+[\\d]{8}$";
    private static Pattern pattern;
    private static Matcher matcher;

    public static boolean isValid(String str, String regex){
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        boolean check = matcher.matches();
        if (!check){
            System.out.println("Input is wrong !!!" + regex);
        }
        return check;
    }
}
