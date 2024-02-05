package Codewars;

import org.junit.jupiter.api.Test;

import static Codewars.TheLostBeginning.getNumber;
import static org.junit.jupiter.api.Assertions.*;

public class TheLostBeginningTest {
    @Test
    public void testValidCases() {
        assertEquals(1, getNumber("123456789101112"));
        assertEquals(-1, getNumber("11121314151617181921"));
        assertEquals(67, getNumber("67686970"));
        assertEquals(95, getNumber("9596979899100101102103104"));
        assertEquals(-1, getNumber("9596979899101102103105106"));
    }

    @Test
    public void testAdditionalCases() {
        assertEquals(1, getNumber("123"));
        assertEquals(-1, getNumber("111222333444"));
        assertEquals(-1, getNumber("98765432101234567890"));
        assertEquals(101, getNumber("101102103"));
        assertEquals(555, getNumber("555556557558559560"));
        assertEquals(90, getNumber("909192939495"));
        assertEquals(-1, getNumber("123456789123"));
        assertEquals(333444555, getNumber("333444555"));
        assertEquals(111000, getNumber("111000111001111002111003111004"));
        assertEquals(-1, getNumber("111211311411511611711811911"));
        assertEquals(12, getNumber("12131415161718192021"));
        assertEquals(-1, getNumber("909192939495100"));
        assertEquals(-1, getNumber("100101102103104100"));
        assertEquals(13, getNumber("13141516171819202122"));
        assertEquals(-1, getNumber("1213141516171819202120"));
        assertEquals(12412512, getNumber("12412512"));
    }

    @Test
    public void testEdgeCases() {
        assertEquals(-1, getNumber(""));
        assertEquals(-1, getNumber("abc123"));
        assertEquals(-1, getNumber("000001"));
        assertEquals(-1, getNumber("0000"));
        assertEquals(-1, getNumber("0"));
    }
}