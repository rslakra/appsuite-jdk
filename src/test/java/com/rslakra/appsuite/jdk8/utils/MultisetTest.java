package com.rslakra.appsuite.jdk8.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohtash Lakra
 * @version 1.0.0
 * @since 05/20/2024 6:01 PM
 */
public class MultisetTest {


    // LOGGER
    private static Logger LOGGER = LoggerFactory.getLogger(MultisetTest.class);

    @DataProvider
    private Iterator<Object[]> inputData() {
        // input
        List<Object[]> input = new ArrayList<>();
        input.add(new Object[]{
                List.of("192.170.0.1", "75.245.10.1", "10.125.22.20", "192.170.0.1"),
                List.of(Map.entry("192.170.0.1", 2), Map.entry("75.245.10.1", 1), Map.entry("10.125.22.20", 1))
        });

        return input.iterator();
    }

    /**
     * Tests the <code>MultiMap</code> class.
     */
    @Test(dataProvider = "inputData")
    public void testMultiMap(List<String> inputData, List<Entry<String, Integer>> expected) {
        final Multiset<String> instance = new MultisetImpl<>();
        inputData.forEach(entry -> instance.add(entry));
        LOGGER.debug("instance:{}", instance);
        assertNotNull(instance);
        expected.forEach(entry -> {
            assertEquals(entry.getValue(), instance.count(entry.getKey()));
        });
    }
}
