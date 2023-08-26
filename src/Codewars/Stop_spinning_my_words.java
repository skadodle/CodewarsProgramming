package Codewars;

// https://www.codewars.com/kata/5264d2b162488dc400000001/train/java

public class Stop_spinning_my_words {

    public static String spinned_str(String str) {
        if (str == null)
            return null;

        String[] words = str.split(" ");
        String res = "";

        for (String word : words) {
            if (word.length() >= 5) {
                res += spin_word(word);
            } else
                res += word;
            res += " ";
        }

        return res.trim(); // delete last space
    }

    private static String spin_word(String word) {
        String res = "";
        for (int i = 0; i < word.length(); i++) {
            res += word.charAt(word.length() - i - 1);
        }

        return res;
    }

}
