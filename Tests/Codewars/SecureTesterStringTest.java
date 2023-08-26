package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecureTesterStringTest {
    @Test
    public void testNull() {
        assertFalse(SecureTesterString.alphanumeric(null));
    }

    @Test
    public void testEmptyString() {
        assertFalse(SecureTesterString.alphanumeric(""));
    }

    @Test
    public void testTrueString() {
        assertTrue(SecureTesterString.alphanumeric("TodayIsA11DayOfNovember"));
        assertTrue(SecureTesterString.alphanumeric("GoodMorningGuys"));
        assertTrue(SecureTesterString.alphanumeric("SecondChampionIsChuckles"));
        assertTrue(SecureTesterString.alphanumeric("HelloBetsyHowAreYouToday"));
    }

    @Test
    public void testFalseString() {
        assertFalse(SecureTesterString.alphanumeric("TodayI'mTheBestDeveloper!"));
        assertFalse(SecureTesterString.alphanumeric("Hello Marci"));
        assertFalse(SecureTesterString.alphanumeric("slavikkop@gmail.com"));
        assertFalse(SecureTesterString.alphanumeric("e-mail is good with Thunderbird!"));
    }
}