package com.rslakra.appsuite.jdk.annotation;

import com.rslakra.appsuite.jdk8.annotation.MarketAnnotation;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rohtash Lakra
 * @created 4/29/20 2:51 PM
 */
public class AnnotationTest {

    // LOGGER
    private static final Logger LOGGER = LoggerFactory.getLogger(AnnotationTest.class);

    @MarketAnnotation
    private void doReturn(final boolean isValid) {
        LOGGER.debug("Start doReturn");
        if (isValid) {
            LOGGER.debug("Returning from doReturn");
            return;
        }
        LOGGER.debug("End doReturn");
    }

    @Test
    public void testAnnotation() {
        LOGGER.debug("Start testAnnotation");
        doReturn(true);
        LOGGER.debug("End testAnnotation");

    }
}
