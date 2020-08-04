package case_study.commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String SEVICE_ID_REGEX = "^(SV(VL|HO|RO)-[\\d]{4})$";
    public static final String SEVICE_NAME_REGEX = "^([A-Z][a-z]*)$";
    public static final String EXTRA_SERVICE_NAME_REGEX = "^(massage)|(karaoke)|(food)|(drink)|(car)$";
    public static final String NAME_CUSTOMER = "^([A-Z][a-z]{1,}[\\s])[A-Z][a-z]*(([\\s][A-Z][a-z]*){0,4})";
    public static final String EMAIL_CUSTOMER = "^[\\w]{3,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
    public static final String ID_CARD_CUSTOMER = "[\\d]{9}";
    public static final String BIRTHDAY_CUSTOMER = "^([0-2][\\d]|[3][0-1])/(0[1-9]|10|11|12)/(19[\\d]{2}|200[1-5])$";
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

    public static boolean isMoreThan (double number, double numberToCompare) {
        boolean check = number > numberToCompare;
        if(!check){
            System.out.println("This number is not more than " + numberToCompare);
        }
        return check;
    }

    public static boolean isLessThanAndMoreThan (double number, double smallerNumber, double biggerNumber) {
        boolean check = number > smallerNumber && number < biggerNumber;
        if(!check){
            System.out.println("This number is wrong !!!");
        }
        return check;
    }

}
