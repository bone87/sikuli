package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    /**
     * Find pattern in string and return string value.
     **/
    public static String findPatternInString(String pattern, String string) {
        Pattern patt = Pattern.compile(pattern);
        Matcher mt = patt.matcher(string);
        mt.find();
        return mt.group(1);
    }

}
