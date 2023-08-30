package Codewars;

// https://www.codewars.com/kata/550498447451fbbd7600041c/train/java

import java.util.Arrays;

public class AreSameArrays {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }

        return Arrays.equals(Arrays.stream(a).map(el -> el * el).sorted().toArray(),
                Arrays.stream(b).sorted().toArray());
    }
}
