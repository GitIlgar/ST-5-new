package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    public void testAverage() {
        Sqrt mySqrt = new Sqrt(9999999);
        assertEquals(11.5, mySqrt.average(11.0, 12.0));
        assertEquals(32.5, mySqrt.average(30.0, 35.0));
        assertEquals(78.5, mySqrt.average(77.0, 80.0));
    }

    @Test
    public void testGood() {
        Sqrt mySqrt = new Sqrt(9999999);
        assertTrue(mySqrt.good(70.0, 4900.0));
        assertFalse(mySqrt.good(3.8, 9.1));
    }

    @Test
    public void testImprove() {
        Sqrt mySqrt = new Sqrt(9999999);
        assertEquals(3.0, mySqrt.improve(4.0, 8.0));
        assertEquals(55.0, mySqrt.improve(10.0, 1000.0));
    }

    @Test
    public void testIter() {
        Sqrt mySqrt = new Sqrt(9999999);
        assertTrue(mySqrt.good(mySqrt.iter(5.0, 25.0), 25.0));
    }

    @Test
    public void testCalc() {
        Sqrt mySqrt = new Sqrt(4.0);
        assertEquals(2.0, mySqrt.calc(), 0.001);
        mySqrt = new Sqrt(9.0);
        assertEquals(Math.sqrt(9.0), mySqrt.calc(), 0.001);
    }
}
