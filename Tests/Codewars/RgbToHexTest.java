package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RgbToHexTest {

    @Test
    public void testZeros() {
        assertEquals("000000", RgbToHex.convert(0, 0, 0));
    }

    @Test
    public void testStandart() {
        assertEquals( "000000", RgbToHex.convert(0, 0, 0));
        assertEquals( "010203", RgbToHex.convert(1, 2, 3));
        assertEquals( "FFFFFF", RgbToHex.convert(255, 255, 255));
        assertEquals( "FEFDFC", RgbToHex.convert(254, 253, 252));
        assertEquals( "00FF7D", RgbToHex.convert(-20, 275, 125));
    }

}