package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

    public static void main(String[] args) {

        LinkedHashSetTest linkedHashSetTest = new LinkedHashSetTest();
        linkedHashSetTest.test();
    }

    public void test() {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(null);
        set.add(null);
        set.add(null);
    }
}
