package Codewars;

// https://www.codewars.com/kata/5544c7a5cb454edb3c000047/train/java
public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || !(bounce > 0 && bounce < 1) || window >= h)
            return -1;

        int count = 1;
        while (h * bounce > window) {
            count += 2;
            h *= bounce;
        }
        return count;
    }
}
