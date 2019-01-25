package map;

import collection.set.LinkedHashSetTest;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args) {

        LinkedHashMapTest linkedHashMapTest = new LinkedHashMapTest();
        linkedHashMapTest.test();
    }

    public void test() {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("First", 1);
    }
}
