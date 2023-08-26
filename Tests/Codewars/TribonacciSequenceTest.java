package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TribonacciSequenceTest {

    @Test
    public void testEmptyArray() {
        assertArrayEquals(new double[]{}, TribonacciSequence.tribonacci(new double[]{0}, 10));
    }

    @Test
    public void testCase1() {
        assertArrayEquals(new double[]{1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, TribonacciSequence.tribonacci(new double[]{1, 1, 1}, 10));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(new double[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, TribonacciSequence.tribonacci(new double[]{0, 0, 1}, 10));
    }

    @Test
    public void testCase3() {
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, TribonacciSequence.tribonacci(new double []{0,1,1},10));
    }
}