package com.rslakra.appsuite.jdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.rslakra.appsuite.core.BeanUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Rohtash Lakra
 * @created 5/5/21 3:07 PM
 */
public class ResponseTest {

    @Test
    public void testResponseArray() {
        String[] responseArray = BeanUtils.toType(Arrays.asList("Rohtash", "Singh", "Lakra"), String[].class);
        assertNotNull(responseArray);
        assertEquals(3, responseArray.length);
    }

    @Test
    public void testResponseList() {
        List<String> responseList = BeanUtils.toType(Arrays.asList("Rohtash", "Singh", "Lakra"), List.class);
        assertNotNull(responseList);
        assertEquals(3, responseList.size());
    }

    @Test
    public void testResponseSet() {
        Set<String> responseSet = BeanUtils.toType(Arrays.asList("Rohtash", "Singh", "Lakra"), Set.class);
        assertNotNull(responseSet);
        assertEquals(3, responseSet.size());
    }

    @Test
    public void testResponseMap() {
        Map<Integer, String> mapResponses = new HashMap<>();
        mapResponses.put(1, "One");
        mapResponses.put(2, "Two");
        mapResponses.put(3, "Three");
        mapResponses.put(4, "Four");
        List<Integer> mapKeys = BeanUtils.toType(mapResponses, List.class);
        assertNotNull(mapKeys);
        assertEquals(4, mapKeys.size());
    }

}
