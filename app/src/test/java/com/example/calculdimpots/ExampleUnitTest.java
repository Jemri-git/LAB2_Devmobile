package com.example.calculdimpots;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testImpotBase() {
        // Context of the app under test.
        double surface = 120;
        double impotBase = surface * 2;
        assertEquals(240.0, impotBase, 0.0);
    }

    @Test
    public void testImpotAvecPiscine() {
        int pieces = 4;
        boolean pool = true;
        int supplement = pieces * 50 + (pool ? 100 : 0);
        assertEquals(300, supplement);
    }
    @Test
    public void testImpotSansPiscine() {
        int pieces = 4;
        boolean pool = false;
        int supplement = pieces * 50 + (pool ? 100 : 0);
        assertEquals(200, supplement);
    }
    @Test
    public void testImpotTotal() {
        double surface = 120;
        int pieces = 4;
        boolean pool = true;

        double base       = surface * 2;        // 240
        int supplement    = pieces * 50 + 100;  // 300
        double total      = base + supplement;  // 540

        assertEquals(540.0, total, 0.0);
    }
}