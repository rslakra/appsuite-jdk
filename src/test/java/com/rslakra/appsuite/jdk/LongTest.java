package com.rslakra.appsuite.jdk;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rohtash Lakra
 * @created 6/16/20 7:15 PM
 */
public class LongTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(LongTest.class);

    @Test
    public void testParsing() {
        String id = "3457320953205";
        Long longId = Long.parseLong(id);
        LOGGER.debug("id:{}, longId:{}", id, longId);
        assertNotNull(longId);
    }
}
