package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComplementaryDNATest {
    @Test
    public void testNull() {
        try {
            ComplementaryDNA.makeComplete(null);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testEmptyString() {
        try {
            ComplementaryDNA.makeComplete("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testCase1() {
        assertEquals("TTTT", ComplementaryDNA.makeComplete("AAAA"));
    }
    @Test
    public void testCase2() {
        assertEquals("TAACG", ComplementaryDNA.makeComplete("ATTGC"));
    }
    @Test
    public void testCase3() {
        assertEquals("CATA", ComplementaryDNA.makeComplete("GTAT"));
    }

    @Test
    public void testCase4() {
        assertEquals("TCGA", ComplementaryDNA.makeComplete("AGCT"));
    }
}