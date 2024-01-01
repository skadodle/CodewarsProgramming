package Codewars;

public class Grill_It {
    public static void main(String[] args) {
        System.out.println(grille("abcdef", 5));
        System.out.println(grille("ft", 351_846));
    }

    public static String grille(String message, int code) {
        if (message.isEmpty())
            return "";
        char[] binaryCode = appendZeros(message, Integer.toBinaryString(code)).toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < binaryCode.length; i++) {
            result.append(binaryCode[i] == '1' ? message.charAt(i) : "");
        }

        return result.toString();
    }

    private static String appendZeros(String message, String code) {
        return message.length() == code.length() ? code :
               message.length() - code.length() > 0 ? "0".repeat(message.length() - code.length()) + code :
               code.substring(code.length() - message.length());
    }
}
