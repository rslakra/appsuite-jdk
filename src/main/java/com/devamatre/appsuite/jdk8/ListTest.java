package com.devamatre.appsuite.jdk8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListTest {

    // LOGGER
    private static Logger LOGGER = LoggerFactory.getLogger(ListTest.class);

    public void testListPartition() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int subListSize = 3;
        Collection<List<Integer>> subLists = Jdk8Utils.INSTANCE.partitionListBySize(intList, subListSize);
        LOGGER.debug("subLists count:" + subLists.size());
        LOGGER.debug("subLists:" + subLists);

        intList = Arrays.asList(1, 2, 3);
        subLists = Jdk8Utils.INSTANCE.partitionListBySize(intList, subListSize);
        LOGGER.debug("subLists count:" + subLists.size());
        LOGGER.debug("subLists:" + subLists);

        intList = Arrays.asList();
        subLists = Jdk8Utils.INSTANCE.partitionListBySize(intList, subListSize);
        LOGGER.debug("subLists count:" + subLists.size());
        LOGGER.debug("subLists:" + subLists);
        LOGGER.debug("subLists isEmpty:" + subLists.isEmpty());

        intList = null;
        subLists = Jdk8Utils.INSTANCE.partitionListBySize(intList, subListSize);
        LOGGER.debug("subLists:" + subLists);
    }

    /**
     *
     */
    public void testList2Map() {
        List<ObjectTest> testObjects = new ArrayList<>();
        testObjects.add(new ObjectTest(1, "First"));
        testObjects.add(new ObjectTest(2, "Second"));
        testObjects.add(new ObjectTest(1, "One"));

        final Map<Integer, List<ObjectTest>> testObjectsMap = new HashMap<>();
        testObjects.forEach(testObject -> {
            List<ObjectTest> testObjectList = testObjectsMap.getOrDefault(testObject.getId(), new ArrayList<>());
            testObjectsMap.putIfAbsent(testObject.getId(), testObjectList);
            testObjectList.add(testObject);
        });

        LOGGER.debug("{}", testObjectsMap);
    }

    public void testList2Map2() {
        List<ObjectTest> testObjects = new ArrayList<>();
        testObjects.add(new ObjectTest(1, "Second"));
        testObjects.add(new ObjectTest(1, "One"));
        // ObjectTest testObjectsMap = testObjects.stream().map().collect(Collectors.groupingBy(ObjectTest::getId));
        // LOGGER.debug("{}", testObjectMap);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ListTest testList = new ListTest();
// testList.testListPartition();
        testList.testList2Map();
        testList.testList2Map2();
    }

}
