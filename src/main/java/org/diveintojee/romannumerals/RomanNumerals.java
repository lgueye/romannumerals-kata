/*
 *
 */
package org.diveintojee.romannumerals;

import java.util.HashMap;
import java.util.Map;

/**
 * @author louis.gueye@gmail.com
 */
public class RomanNumerals {

    private static Map<Integer, String> DECIMAL_TO_ROMAN = new HashMap<Integer, String>();

    static {

        RomanNumerals.DECIMAL_TO_ROMAN.put(1, "I");
        RomanNumerals.DECIMAL_TO_ROMAN.put(5, "V");
        RomanNumerals.DECIMAL_TO_ROMAN.put(10, "X");
        RomanNumerals.DECIMAL_TO_ROMAN.put(50, "L");
        RomanNumerals.DECIMAL_TO_ROMAN.put(100, "C");
        RomanNumerals.DECIMAL_TO_ROMAN.put(500, "D");
        RomanNumerals.DECIMAL_TO_ROMAN.put(1000, "M");
    }

    /**
     * @param i
     * @return
     */
    public static String fromDecimal(final int i) {

        return RomanNumerals.DECIMAL_TO_ROMAN.get(i);

    }

}
