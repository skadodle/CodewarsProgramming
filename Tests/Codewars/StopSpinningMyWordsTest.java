package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StopSpinningMyWordsTest {
    @Test
    public void testNull() {
        assertNull(Stop_spinning_my_words.spinned_str(null));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", Stop_spinning_my_words.spinned_str(""));
    }

    @Test
    public void standartTest() {
        assertEquals("Stop gninnips my sdrow", Stop_spinning_my_words.spinned_str("Stop spinning my words"));
        assertEquals("", Stop_spinning_my_words.spinned_str(""));
    }
}