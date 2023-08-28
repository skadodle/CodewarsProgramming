package Codewars;

import java.util.Arrays;

import static java.lang.Math.max;

// https://www.codewars.com/kata/551f23362ff852e2ab000037/train/java

public class LongestPyramidSlideDown {

    public static int longestSlideDown(int[][] pyramid) {
        if (pyramid == null) {
            throw new NullPointerException("Pyramid is null!");
        }
        if (pyramid.length == 0) {
            return 0;
        }

        int[][] pyramidSummer = pyramid.clone();

        for (int row = 1; row < pyramid.length; row++) {
            for (int column = 0; column < pyramid[row].length; column++) {
                if (column == 0) {
                    pyramidSummer[row][column] += pyramidSummer[row - 1][column];
                } else if (column == pyramid[row].length - 1) {
                    pyramidSummer[row][column] += pyramidSummer[row - 1][column - 1];
                } else {
                    pyramidSummer[row][column] += max(pyramidSummer[row - 1][column - 1], pyramidSummer[row - 1][column]);
                }
            }
        }
        return Arrays.stream(pyramidSummer[pyramidSummer.length - 1])
                .max()
                .orElse(0);
    }
}
