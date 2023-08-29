package Codewars;

// https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java

public class ComplementaryDNA {
    public static String makeComplete(String dna) {
        if (dna == null)
            throw new NullPointerException("String is null!");
        if (dna.isEmpty())
            throw new IllegalArgumentException("String is empty!");

        String result = "";
        for (char symbol : dna.toCharArray()) {
            result += convert(symbol);
        }
        return result;
    }
    private static String convert(char symbol) {
        return  symbol == 'A' ? "T" :
                symbol == 'T' ? "A" :
                symbol == 'C' ? "G" : "C";
    }
}
