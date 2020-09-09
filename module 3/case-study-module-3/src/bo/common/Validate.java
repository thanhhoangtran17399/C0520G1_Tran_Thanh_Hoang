package bo.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String CUSTOMER_ID_REGEX = "^(CUS-[\\d]{4})$";
    public static final String SERVICE_ID_REGEX = "^(SV-[\\d]{4})$";
    public static final String PHONE_NUMBER_REGEX = "^((090|091|(84)+90|(84)+91)[\\d]{7})$";
    public static final String ID_CARD_REGEX = "^(([\\d]{9})|([\\d]{12}))$";
    public static final String EMAIL_REGEX = "^[a-z][a-z0-9_\\.]{3,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";

    private static Pattern pattern;
    private static Matcher matcher;
    public static boolean isValid(String str, String regex){
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        boolean check = matcher.matches();
        return check;
    }
}
