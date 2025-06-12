package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ROT13Test {
    @Test
    public void testNull() {
        assertNull(ROT13.rot13(null));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", ROT13.rot13(""));
    }

    @Test
    public void testCase1() {
        assertEquals(("Jul qvq gur puvpxra pebff gur ebnq?"), ROT13.rot13("Why did the chicken cross the road?"));
    }

    @Test
    public void testCase2() {
        assertEquals(("To get to the other side!"), ROT13.rot13("Gb trg gb gur bgure fvqr!"));
    }
}