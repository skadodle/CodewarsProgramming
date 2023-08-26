package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsIsogramTest {

    @Test
    public void testNull() {
        try {
            IsIsogram.check(null);
        } catch (Exception ex) {
            ex.getStackTrace();
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testEmptyString() {
        assertTrue(IsIsogram.check(""));
    }

    @Test
    public void testStandart() {
        assertTrue(IsIsogram.check("Dermatoglyphics"));
        assertFalse(IsIsogram.check("aba"));
        assertFalse(IsIsogram.check("moOse"));
    }

    @Test
    public void testCase() {
        assertTrue(IsIsogram.check("qwertyuiopasdfghjklzxcvbnm"));
        assertTrue(IsIsogram.check("fogyNelsMatB"));
        assertFalse(IsIsogram.check("IsNelsonAndMurdockAreFriends"));
    }

}