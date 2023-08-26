package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToCamelCaseTest {
    @Test
    public void testNull() {
        assertNull(toCamelCase.toCamelCaseFunc(null));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", toCamelCase.toCamelCaseFunc(""));
    }

    @Test
    public void testWithMinus() {
        assertEquals("HelloWorldDearFriends", toCamelCase.toCamelCaseFunc("Hello-World-Dear-Friends"));
        assertEquals("helloWorldDearFriends", toCamelCase.toCamelCaseFunc("hello-World-Dear-Friends"));

        assertEquals("MyShadowWarrior", toCamelCase.toCamelCaseFunc("MY-ShADOW-waRRIoR"));
        assertEquals("myShadowWarrior", toCamelCase.toCamelCaseFunc("mY-ShADOW-waRRIoR"));
    }

    @Test
    public void testWithUnderscore() {
        assertEquals("HelloWorldDearFriends", toCamelCase.toCamelCaseFunc("Hello_World_Dear_Friends"));
        assertEquals("helloWorldDearFriends", toCamelCase.toCamelCaseFunc("hello_World_Dear_Friends"));

        assertEquals("MyShadowWarrior", toCamelCase.toCamelCaseFunc("MY_ShADOW_waRRIoR"));
        assertEquals("myShadowWarrior", toCamelCase.toCamelCaseFunc("mY_ShADOW_waRRIoR"));
    }
}