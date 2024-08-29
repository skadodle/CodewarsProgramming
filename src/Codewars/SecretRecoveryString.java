package Codewars;

// https://www.codewars.com/kata/53f40dff5f9d31b813000774/train/java

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class SecretRecoveryString {

    private Character[] letters;
    private int[][] possiblePosses;

    public String recoverSecret(char[][] triplets) {
        Set<Character> set = new HashSet<>();
        for (char[] triplet : triplets) {
            set.add(triplet[0]);
            set.add(triplet[1]);
            set.add(triplet[2]);
        }

        letters = set.toArray(new Character[0]);
        StringBuilder stringBuilder = new StringBuilder();
        possiblePosses = new int[letters.length][letters.length];

        for (int[] elem : possiblePosses)
            Arrays.fill(elem, 1);

        for (int i = 0; i < letters.length; i++)
            findLetterOnPos(triplets, i);

        for (int j = 0; j < letters.length; j++)
            for (int i = 0; i < letters.length; i++)
                if (possiblePosses[i][j] == 1) {
                    stringBuilder.append(letters[i]);
                }

        return stringBuilder.toString();
    }

    private void findLetterOnPos(char[][] triplets, int k) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        for (i = 0; i < letters.length; i++) {
            char letter = letters[i];
            if (possiblePosses[i][k] == 1)
                set.add(letter);
        }
        for (char[] triplet : triplets) {
            if (set.contains(triplet[0]) && set.contains(triplet[1]))
                for (i = 0; i < letters.length; i++)
                    if (letters[i] == triplet[1])
                        possiblePosses[i][k] = 0;
            if (set.contains(triplet[1]) && set.contains(triplet[2]))
                for (i = 0; i < letters.length; i++)
                    if (letters[i] == triplet[2])
                        possiblePosses[i][k] = 0;
        }

        set.clear();

        for (i = 0; i < letters.length; i++)
            if (possiblePosses[i][k] == 1)
                set.add(letters[i]);
        if (set.size() == 1)
            for (i = 0; i < letters.length; i++)
                if (set.contains(letters[i])) {
                    Arrays.fill(possiblePosses[i], 0);
                    possiblePosses[i][k] = 1;
                }
    }
}