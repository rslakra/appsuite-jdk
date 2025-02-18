package com.rslakra.appsuite.jdk;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rohtash Lakra
 * @created 6/30/22 6:02 PM
 */
public class ApacheTest {

    // LOGGER
    private static Logger LOGGER = LoggerFactory.getLogger(ApacheTest.class);

    @Test
    public void testStringUtils_isBlank() {
        String input = null;
        LOGGER.debug("input:{}", input);
        assertTrue(StringUtils.isBlank(input));

        input = "";
        LOGGER.debug("input:{}", input);
        assertTrue(StringUtils.isBlank(input));

        input = "    token";
        LOGGER.debug("input:{}", input);
        assertFalse(StringUtils.isBlank(input));

        input = "lakra";
        LOGGER.debug("input:{}", input);
        assertFalse(StringUtils.isBlank(input));
    }

    @Test
    public void testStringUtils_isNotBlank() {
        String input = null;
        LOGGER.debug("input:{}", input);
        assertFalse(StringUtils.isNotBlank(input));

        input = "";
        LOGGER.debug("input:{}", input);
        assertFalse(StringUtils.isNotBlank(input));

        input = "Bearer token";
        LOGGER.debug("input:{}", input);
        assertTrue(StringUtils.isNotBlank(input));

        input = "lakra";
        LOGGER.debug("input:{}", input);
        assertTrue(StringUtils.isNotBlank(input));
    }


    @Test
    public void testStringUtils_isEmpty() {
        String input = null;
        LOGGER.debug("input:{}", input);
        assertTrue(StringUtils.isEmpty(input));

        input = "";
        LOGGER.debug("input:{}", input);
        assertTrue(StringUtils.isEmpty(input));

        input = "Bearer token";
        LOGGER.debug("input:{}", input);
        assertFalse(StringUtils.isEmpty(input));

        input = "lakra";
        LOGGER.debug("input:{}", input);
        assertFalse(StringUtils.isEmpty(input));
    }

    @Test
    public void testStringUtils_isNotEmpty() {
        String input = null;
        LOGGER.debug("input:{}", input);
        assertFalse(StringUtils.isNotEmpty(input));

        input = "";
        LOGGER.debug("input:{}", input);
        assertFalse(StringUtils.isNotEmpty(input));

        input = "Bearer token";
        LOGGER.debug("input:{}", input);
        assertTrue(StringUtils.isNotEmpty(input));

        input = "lakra";
        LOGGER.debug("input:{}", input);
        assertTrue(StringUtils.isNotEmpty(input));
    }


}
