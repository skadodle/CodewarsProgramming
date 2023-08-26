package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductOfConsecutiveFibNumbersTest {

    @Test
    public void testCase1() {
        assertArrayEquals(new long[] {55, 89, 1}, ProductOfConsecutiveFibNumbers.productFib(4895));
    }
    @Test
    public void testCase2() {
        assertArrayEquals(new long[] {89, 144, 0}, ProductOfConsecutiveFibNumbers.productFib(5895));
    }
}