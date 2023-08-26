package Codewars;

// https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java

public class IsAPanagram {

    public static boolean check(String sentence) {
        sentence = sentence.replaceAll("\\d+", "");
        sentence = sentence.replaceAll("\\p{Punct}", "");
        sentence = sentence.toLowerCase();

        String alph = "";

        for (char chr : sentence.trim().toCharArray()) {
            if (chr != ' ' && !alph.contains(String.valueOf(chr)))
                alph += chr;
        }
        System.out.println(alph);
        return alph.length() == 26;
    }
}
