package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryMultipleOf3Test {

    @Test
    public void testEmptyString() {
        assertTrue(BinaryMultipleOf3.check().matcher("").matches());
    }

    @Test
    public void testFalseCase1() {
        assertFalse(BinaryMultipleOf3.check().matcher(" 001").matches());
    }

    @Test
    public void testFalseCase2() {
        assertFalse(BinaryMultipleOf3.check().matcher("ab00110").matches());
    }

    @Test
    public void testFalseCase3() {
        assertFalse(BinaryMultipleOf3.check().matcher("01234").matches());
    }

    @Test
    public void testFalseCase4() {
        assertFalse(BinaryMultipleOf3.check().matcher("abcd").matches());
    }

    @Test
    public void testFalseCase5() {
        assertFalse(BinaryMultipleOf3.check().matcher("abcdf0101001    ").matches());
    }

    @Test
    public void testFalseCase6() {
        assertFalse(BinaryMultipleOf3.check().matcher(",.,,.,00100101  ").matches());
    }

    @Test
    public void testTrueCase1() {
        assertTrue(BinaryMultipleOf3.check().matcher("011").matches());
    }

    @Test
    public void testTrueCase2() {
        assertTrue(BinaryMultipleOf3.check().matcher("110").matches());
    }

    @Test
    public void testTrueCase3() {
        assertTrue(BinaryMultipleOf3.check().matcher("0000100001010101").matches());
    }

    @Test
    public void testTrueCase4() {
        assertTrue(BinaryMultipleOf3.check().matcher("000101010000").matches());
    }


}