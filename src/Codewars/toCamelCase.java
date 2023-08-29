package Codewars;

// https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java

public class toCamelCase {
    public static String toCamelCaseFunc(String s) {
        if (s == null)
            return null;
        if (s.isEmpty())
            return "";

        String result = "";
        boolean flag = true;

        for (String word : s.split("[_-]")) {
            if (flag) {
                result += word.charAt(0) + word.toLowerCase().substring(1);
                flag = false;
            }
            else
                result += word.toUpperCase().charAt(0) + word.toLowerCase().substring(1);
        }
        return result;
    }

}
