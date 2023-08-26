package Codewars;

import java.util.regex.Pattern;

// https://www.codewars.com/kata/526dbd6c8c0eb53254000110/train/java

public class SecureTesterString {

    /*
    The string has the following conditions to be alphanumeric:

    -At least one character ("" is not valid)
    -Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
    -No whitespaces / underscore
    */

    public static boolean alphanumeric(String s) {
        if (s == null || s.isEmpty())
            return false;
        return Pattern.matches("[A-Za-z0-9]+", s);
    }

}
