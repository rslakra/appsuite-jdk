package com.devamatre.appsuite.jdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Rohtash Lakra
 * @created 10/13/21 1:12 PM
 */
public class BigDecimalTest {

    @Test
    public void testEquals() {
        BigDecimal left = BigDecimal.valueOf(100.456);
        BigDecimal right = BigDecimal.valueOf(100.4560);
        assertEquals(left, right);
        assertTrue(Objects.equals(left, right));
        assertTrue(Objects.equals(BigDecimal.valueOf(100.456), BigDecimal.valueOf(100.4560)));

        BigDecimal leftString = new BigDecimal("100.456");
        BigDecimal rightString = new BigDecimal("100.4560");
        assertNotEquals(leftString, rightString);
        assertFalse(Objects.equals(leftString, rightString));
    }

    public void testNotEqualToZero() {

    }

}
