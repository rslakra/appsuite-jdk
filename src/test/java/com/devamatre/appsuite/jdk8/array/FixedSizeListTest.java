package com.devamatre.appsuite.jdk8.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Rohtash Lakra
 * @created 2/21/24 11:56 AM
 */
public class FixedSizeListTest {

    // LOGGER
    private static Logger LOGGER = LoggerFactory.getLogger(FixedSizeListTest.class);

    @DataProvider
    private Iterator<Object[]> fixedSizeListData() {
        List<Object[]> input = new ArrayList<>();
        input.add(new Object[]{1, 1});
        input.add(new Object[]{2, 2});
        input.add(new Object[]{3, 3});

        return input.iterator();
    }

    /**
     * Tests the <code>fixedSizeList()</code> method.
     */
    @Test(dataProvider = "fixedSizeListData")
    public void testFixedSizeList(int inputData, int expected) {
        FixedSizeList instance = new FixedSizeList();
        List<String> result = instance.fixedSizeList(inputData);
        LOGGER.debug("result:{}", result);
        assertNotNull(result);
        assertEquals(expected, result.size());
    }
}
