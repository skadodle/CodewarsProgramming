package Codewars;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DirectionsReductionTestCase {
    @Test
    public void testNull() {
        assertNull(DirectionsReduction.dirReduc(null));
    }

    @Test
    public void testEmptyArray() {
        assertArrayEquals(new String[0], DirectionsReduction.dirReduc(new String[0]));
    }

    @Test
    public void testCase1() {
        assertArrayEquals(new String[]{"WEST"}, DirectionsReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(new String[0], DirectionsReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"}));
    }

    @Test
    public void testCase3() {
        assertArrayEquals(new String[]{"NORTH"}, DirectionsReduction.dirReduc(new String[]{"NORTH", "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "EAST", "WEST"}));
    }

}