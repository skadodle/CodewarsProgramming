package Codewars;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTest {

    @Test
    public void testNull() {
        try {
            ReverseWords.reverseWords(null);
        } catch (Exception ex) {
            System.out.printf(ex.getMessage());
        }
    }

    @Test
    public void testEmptyString() {
        assertEquals("", ReverseWords.reverseWords(""));
    }

    @Test
    public void testCase1() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords.reverseWords("The quick brown fox jumps over the lazy dog."));
    }

    @Test
    public void testCase2() {
        assertEquals("elppa", ReverseWords.reverseWords("apple"));
    }

    @Test
    public void testCase3() {
        assertEquals("a b c d", ReverseWords.reverseWords("a b c d"));
    }

    @Test
    public void testCase4() {
        assertEquals("elbuod  decaps  sdrow", ReverseWords.reverseWords("double  spaced  words"));
    }
}