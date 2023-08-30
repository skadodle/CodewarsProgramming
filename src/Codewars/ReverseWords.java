package Codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static String reverseWords(final String original) {
        if (original == null)
            throw new NullPointerException("String is null!");
        return Arrays.stream(original.split(" "))
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }
}
