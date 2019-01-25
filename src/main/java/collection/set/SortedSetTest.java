package collection.set;

import java.util.Set;
import java.util.TreeSet;

public class SortedSetTest {

    public static void main(String[] args) {

        SortedSetTest setTest = new SortedSetTest();
        setTest.test();
    }

    public void test() {
        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(5);
        sortedSet.add(6);
        sortedSet.add(7);
        sortedSet.add(8);
        sortedSet.add(9);
        sortedSet.add(1);
        sortedSet.add(2);
        sortedSet.add(1);
        sortedSet.add(3);
        sortedSet.add(4);
        sortedSet.add(5);
        sortedSet.add(null);// Error
        sortedSet.add(null); //Error
        sortedSet.add(null); //Error

        int first = ((TreeSet<Integer>) sortedSet).first();
        int last = ((TreeSet<Integer>) sortedSet).last();
        Set<Integer> subSet = ((TreeSet<Integer>) sortedSet).subSet(5, 7);
        Set<Integer> subSet2 = ((TreeSet<Integer>) sortedSet).subSet(5,true, 7, false);
        Set<Integer> subSet3 = ((TreeSet<Integer>) sortedSet).subSet(5,false, 7, true);
        Set<Integer> headSet = ((TreeSet<Integer>) sortedSet).headSet(5);
        Set<Integer> tailSet = ((TreeSet<Integer>) sortedSet).tailSet(5);
        Set<Integer> newSet = ((TreeSet<Integer>) sortedSet).descendingSet();

    }

}
