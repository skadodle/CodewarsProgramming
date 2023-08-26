package Codewars;

public class MorseDecoder {
    static final char[] english = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'k', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?'};

    static final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",
            "--..--", ".-.-.-", "..--.."};

    public static String decodeBits(String bits) {
        String code = "";
        String str_of_ones = "1";
        int length_of_dash = 0;
        int length_of_dot = 0;
        boolean flag = true;

        bits = bits.substring(bits.indexOf('1'), bits.lastIndexOf('1') + 1);

        while (bits.contains(str_of_ones)) {
            length_of_dash++;
            str_of_ones += "1";
        }

        length_of_dot = length_of_dash / 3;
        if (length_of_dot == 0) {
            length_of_dot = length_of_dash;
            length_of_dot *= 3;
        }

        if (bits.contains("0".repeat(length_of_dot)) && !bits.contains("0".repeat(length_of_dash))) {
            flag = false;
        }

        for (String word : bits.split("1".repeat(length_of_dash))) {
            if (word.contains("1".repeat(length_of_dot))) {
                flag = false;
                break;
            }
        }

        if (flag) {
            length_of_dot = length_of_dash;
            length_of_dash *= 3;
        }

        for (String word : bits.split("0".repeat(length_of_dot * 7))) {
            for (String character : word.split("0".repeat(length_of_dot * 3))) {
                if (character.isEmpty() || character.equals(" "))
                    continue;
                for (String symbol : character.split("0".repeat(length_of_dot))) {
                    if (symbol.equals("1".repeat(length_of_dot)))
                        code += ".";
                    else if (symbol.equals("1".repeat(length_of_dash)))
                        code += "-";
                }
                code += " ";
            }
            code += "  ";
        }

        if (code.trim().equals("-")) {
            code = code.replace("-", ".");
            code = code.replace("   ", " ");
        }

        return decode(code);
    }

    public static String decode(String morseCode) {
        morseCode = morseCode.trim();

        String result = "";

        for (String word : morseCode.split(" ".repeat(3))) {
            for (String letter : word.split(" ")) {
                if (letter.equals(" ") || letter.isEmpty())
                    continue;
                result += get_symbol(letter);
            }
            result += " ";
        }
        return result;
    }

    public static String get_symbol(String code) {
        if (code.equals("...---..."))
            return "SOS";

        for (int i = 0; i < morse.length; i++) {
            if (morse[i].equals(code)) {
                return String.valueOf(english[i]);
            }
        }
        return null;
    }
}
