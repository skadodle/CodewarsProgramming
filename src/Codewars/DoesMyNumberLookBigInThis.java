package Codewars;

import static java.lang.Math.pow;

public class DoesMyNumberLookBigInThis {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
        System.out.println(isNarcissistic(1634));
    }

    public static boolean isNarcissistic(int num) {
        int sum = num;
        int step = Integer.toString(num).length();
        while(num != 0 && sum >= 0) {
            sum -= (int) pow(num % 10, step);
            num /= 10;
        }
        return sum == 0;
    }
}
