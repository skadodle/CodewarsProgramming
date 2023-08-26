package Codewars;

// https://www.codewars.com/kata/556deca17c58da83c00002db/train/java

public class TribonacciSequence {
    public static double[] tribonacci(double[] s, int n) {
        if (s.length < 3)
            return new double[]{};
        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            if (i < 3) {
                result[i] = s[i];
            } else {
                result[i] = result[i - 1] + result[i - 2] + result[i - 3];
            }
        }
        return result;
    }
}
