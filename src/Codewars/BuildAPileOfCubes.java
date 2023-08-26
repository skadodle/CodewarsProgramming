package Codewars;

// https://www.codewars.com/kata/5592e3bd57b64d00f3000047/train/java
public class BuildAPileOfCubes {
    public static long findNb(long n) {
        long sum = 0L;
        int i = 1;
        while (sum < n) {
            sum += (long) Math.pow(i++, 3);
        }
        return sum == n ? i - 1 : -1;
    }
}
