package Codewars;

// https://www.codewars.com/kata/5541f58a944b85ce6d00006a/train/java
public class ProductOfConsecutiveFibNumbers {
    public static long[] productFib(long prod) {
        long f0 = 0;
        long f1 = 1;

        while (f0 * f1 < prod) {
            f1 += f0;
            f0 = f1 - f0;
        }
        return new long[]{f0, f1, f0 * f1 == prod ? 1 : 0};
    }
}
