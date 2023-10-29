package com.devamatre.appsuite.java.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.devamatre.appsuite.core.Sets;
import com.devamatre.appsuite.jdk.enums.Color;
import com.devamatre.appsuite.jdk.enums.EnumMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.EnumSet;

/**
 * @author Rohtash Lakra
 * @created 11/4/21 12:53 PM
 */
public class EnumMapperTest {

    // LOGGER
    private static final Logger LOGGER = LoggerFactory.getLogger(EnumMapperTest.class);

    public static EnumMapper<Color> colorMapper() {
        return EnumMapper.newBuilder(Color.class)
            .map(Color.RED.name(), Color.RED)
            .map(Color.GREEN.name(), Color.GREEN)
            .map(Color.BLUE.name(), Color.BLUE)
            .build();
    }

    @Test
    public void testEnumMapper() {
        EnumMapper<Color> colorEnumMapper = colorMapper();
        assertNotNull(colorEnumMapper);
        assertEquals(3, colorEnumMapper.size());
        assertEquals(Color.RED, colorEnumMapper.toEnum(Color.RED.name()));
        assertEquals(Color.GREEN, colorEnumMapper.toEnum(Color.GREEN.name()));
        assertEquals(Color.BLUE, colorEnumMapper.toEnum(Color.BLUE.name()));
        assertEquals(Color.RED.name(), colorEnumMapper.from(Color.RED));
        assertEquals(Color.GREEN.name(), colorEnumMapper.from(Color.GREEN));
        assertEquals(Color.BLUE.name(), colorEnumMapper.from(Color.BLUE));
    }

    @Test
    public void testNulls() {
        EnumSet<Color> RGB = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        assertNotNull(RGB);
        assertTrue(RGB.contains(Color.GREEN));
        assertFalse(RGB.contains(null));
    }

    @Test
    public void testSting() {
        String url = "${serviceBaseUrl:https://api.devamatre.com/creditcard/authorize";
        if (url.startsWith("${serviceBaseUrl:")) {
            LOGGER.debug(url.substring("${serviceBaseUrl:".length()));
        }

        Sets.asSet(Color.BLUE.name(), Color.RED.name());

    }

}
