package com.devamatre.appsuite.jdk8.array;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rohtash Lakra
 * @created 6/21/23 6:20 PM
 */
public class FixedSizeList {

    /**
     * @param size
     * @return
     */
    public List<String> fixedSizeList(int size) {
        return Arrays.asList(new String[size]);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        FixedSizeList instance = new FixedSizeList();
        List<String> names = instance.fixedSizeList(3);
        names.set(0, "Rohtash");
        names.set(1, "Singh");
        names.set(2, "Lakra");
        names.add("No Name");
    }

}
