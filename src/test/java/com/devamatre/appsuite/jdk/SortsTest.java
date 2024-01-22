package com.devamatre.appsuite.jdk;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.google.common.primitives.Longs;
import org.junit.jupiter.api.Test;

/**
 * @author Rohtash Lakra
 * @created 9/29/20 11:53 AM
 */
public class SortsTest {

    @Test
    public void testEquals() {
        Long first = Longs.tryParse("first-1969702");
        assertNull(first);
        Long second = Long.valueOf("1938167");
        assertNotNull(second);
        assertFalse(second.equals(first));
    }

}
