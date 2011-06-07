/*
 *
 */
package org.diveintojee.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author louis.gueye@gmail.com
 */
public class RomanNumeralsTest {
    @Test
    public void fifty() {
        assertEquals("L", RomanNumerals.fromDecimal(50));
    }

    @Test
    public void five() {
        assertEquals("V", RomanNumerals.fromDecimal(5));
    }

    @Test
    public void fiveHundred() {
        assertEquals("D", RomanNumerals.fromDecimal(500));
    }

    @Test
    @Ignore
    public void four() {
        assertEquals("IV", RomanNumerals.fromDecimal(4));
    }

    @Test
    public void hundred() {
        assertEquals("C", RomanNumerals.fromDecimal(100));
    }

    @Test
    public void one() {
        assertEquals("I", RomanNumerals.fromDecimal(1));
    }

    @Test
    public void ten() {
        assertEquals("X", RomanNumerals.fromDecimal(10));
    }

    @Test
    public void thousand() {
        assertEquals("M", RomanNumerals.fromDecimal(1000));
    }
}
