package Codewars;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BouncingBallTest {

    @Test
    public void test1() {
        assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
    }
    @Test
    public void test2() {
        assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
    }
    @Test
    public void test3() {
        assertEquals(-1, BouncingBall.bouncingBall(3.0, 2.66, 1.5));
    }
    @Test
    public void test4() {
        assertEquals(-1, BouncingBall.bouncingBall(30.0, 0.66, 35));
    }
    @Test
    public void test5() {
        assertEquals(37, BouncingBall.bouncingBall(25.0, 0.9, 3.7));
    }
    @Test
    public void test6() {
        assertEquals(3, BouncingBall.bouncingBall(10.0, 0.36, 3.5));
    }

}