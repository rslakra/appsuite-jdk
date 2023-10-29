package com.devamatre.appsuite.java.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.devamatre.appsuite.jdk.enums.Color;
import org.junit.jupiter.api.Test;

/**
 * @author Rohtash Lakra
 * @created 4/23/20 7:03 PM
 */
public class TestEnum {

    @Test
    public void testEnumToString() {
        assertEquals(Color.RED.toString(), "Red");
        assertEquals(Color.GREEN.toString(), "Green");
        assertEquals(Color.YELLOW.toString(), "Yellow");
        Color color = null;
        assertTrue(Color.YELLOW != color);
    }

    @Test
    public void testEnumName() {
//        assertEquals("Green", Color.GREEN.name());
        assertNotNull(Color.RED.name(), "Red");
        assertNotNull(Color.GREEN.name(), "Green");
        assertNotNull(Color.YELLOW.name(), "Yellow");
        Color color = Color.GREEN;
        assertFalse(Color.GREEN != color);
    }
}
