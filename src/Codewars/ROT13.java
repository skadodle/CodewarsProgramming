package Codewars;

// https://www.codewars.com/kata/52223df9e8f98c7aa7000062/train/java

public class ROT13 {
    public static String rot13(String message) {
        if (message == null)
            return null;
        if (message.isEmpty())
            return "";

        String result = "";
        for (char symbol : message.toCharArray()) {
            int ascii = symbol;
            if (ascii >= 65 && ascii <= 90) {
                if (90 - ascii > 13)
                    ascii += 13;
                else
                    ascii -= 13;
            }
            if (ascii >= 97 && ascii <= 122) {
                if (122 - ascii > 13)
                    ascii += 13;
                else
                    ascii -= 13;
            }
            result += (char) ascii;
        }
        return result;
    }
}

