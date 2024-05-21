package com.devamatre.appsuite.jdk8.map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohtash Lakra (work.lakra@gmail.com)
 * @version 1.0.0
 * @since 05/20/2024 5:16 PM
 */
public class MultiMapTest {

    // LOGGER
    private static Logger LOGGER = LoggerFactory.getLogger(MultiMapTest.class);

    @DataProvider
    private Iterator<Object[]> inputData() {
        // input
        List<Object[]> input = new ArrayList<>();
        input.add(new Object[]{
                List.of(Map.entry("a", "Andrew"), Map.entry("b", "Albert"), Map.entry("b", "Tom"), Map.entry("d", "Sam"), Map.entry("d", "Reo"), Map.entry("g", "Jack"), Map.entry("g", "David")),
                List.of(Map.entry("a", List.of("Andrew")), Map.entry("b", List.of("Albert", "Tom")), Map.entry("d", List.of("Sam", "Reo")), Map.entry("g", List.of("Jack", "David")))
        });

        return input.iterator();
    }

    /**
     * Tests the <code>MultiMap</code> class.
     */
    @Test(dataProvider = "inputData")
    public void testMultiMap(List<Entry<String, String>> inputData, List<Entry<String, List<String>>> expected) {
        final MultiMap instance = new MultiMapImpl();
        inputData.forEach(entry -> instance.put(entry.getKey(), entry.getValue()));
        LOGGER.debug("instance:{}", instance);
        assertNotNull(instance);
        assertEquals(expected.size(), instance.keySet().size());
        assertEquals(expected.stream().map(entry -> entry.getKey()).collect(Collectors.toSet()), instance.keySet());
    }
}
