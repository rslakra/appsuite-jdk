package com.rslakra.appsuite.jdk8.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rohtash Lakra
 * @created 2/29/24 11:05 AM
 */
public class MapTest {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Rohtash", "Lakra", "Name", "Map", "Size");
        final Map<Integer, String> map = new HashMap<>();
        strings.forEach(s -> map.merge(s.length(), s, String::concat));
        System.out.println(map);
    }

}
