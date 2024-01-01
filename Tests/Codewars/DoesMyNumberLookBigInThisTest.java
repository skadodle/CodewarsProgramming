package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoesMyNumberLookBigInThisTest {

    @Test
    public void testCase1() {
        assertTrue(DoesMyNumberLookBigInThis.isNarcissistic(153));
    }

    @Test
    public void testCase2() {
        assertTrue(DoesMyNumberLookBigInThis.isNarcissistic(1634));
    }

    @Test
    public void testCase3() {
        assertFalse(DoesMyNumberLookBigInThis.isNarcissistic(1642));
    }
}