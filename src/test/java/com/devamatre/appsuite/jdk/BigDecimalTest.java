package com.devamatre.appsuite.jdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Rohtash Lakra
 * @created 10/13/21 1:12 PM
 */
public class BigDecimalTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(BigDecimalTest.class);

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

    // @Test
    public void testTaxRefund() {
        // BigDecimal refundAmount = BigDecimal.ZERO;
        BigDecimal refundAmount = BigDecimal.valueOf(20000);
        BigDecimal originalPreTaxAmount = BigDecimal.valueOf(20000);
        BigDecimal originalTax = BigDecimal.valueOf(1000);
        LOGGER.debug("refundAmount:{}, originalPreTaxAmount:{}, originalTax:{}", refundAmount, originalPreTaxAmount,
                     originalTax);

        BigDecimal
            refundTax =
            refundAmount.divide(originalPreTaxAmount.abs(),
                                20 /*big enough to handle rounding and plenty of decimal places*/,
                                BigDecimal.ROUND_HALF_UP).multiply(originalTax.abs());

        //return a tax amount that could make full amount has no decimal points
        BigDecimal fullAmount = refundAmount.add(refundTax).setScale(0, BigDecimal.ROUND_HALF_UP);
        LOGGER.debug("refundTax:{}, fullAmount:{}", refundTax, fullAmount);
        refundTax = fullAmount.subtract(refundAmount);
        LOGGER.debug("refundTax:{}", refundTax);
        assertEquals(originalTax, refundTax);
        assertEquals(BigDecimal.ZERO, refundAmount);
    }

}
