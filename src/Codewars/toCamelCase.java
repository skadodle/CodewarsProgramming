package Codewars;

// https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java

public class toCamelCase {
    public static String toCamelCaseFunc(String s) {
        if (s == null)
            return null;

        boolean flag = false;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (flag) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    result += (char) (s.charAt(i) + ('A' - 'a'));
                else
                    result += s.charAt(i);
                flag = false;
            } else if (s.charAt(i) == '-' || s.charAt(i) == '_')
                flag = true;
            else {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' && i != 0)
                    result += (char) (s.charAt(i) + ('a' - 'A'));
                else
                    result += s.charAt(i);
            }
        }
        return result;
    }

}
