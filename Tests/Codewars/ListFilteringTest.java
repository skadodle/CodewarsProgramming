package Codewars;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListFilteringTest {
    @Test
    public void testCase1() {
        assertEquals(List.of(1, 2), ListFiltering.filterList(List.of(1, 2, "a", "b")));
    }

    @Test
    public void testCase2() {
        assertEquals(List.of(1, 0, 15), ListFiltering.filterList(List.of(1, "a", "b", 0, 15)));
    }

    @Test
    public void testCase3() {
        assertEquals(List.of(1, 2, 123), ListFiltering.filterList(List.of(1, 2, "aasf", "1", "123", 123)));
    }
}