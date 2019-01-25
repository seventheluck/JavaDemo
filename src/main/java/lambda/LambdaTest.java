package lambda;

import java.util.*;

public class LambdaTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.forEach(e -> System.out.println(e));
        MathOperation addition = (int a, int b) -> a + b;

        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return 0;
            }
        };

        MathOperation mathOperation1 = (a, b) -> 0;

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.sort(list, (o1, o2) -> {
            return o1.compareTo(o2);
        });

        MyTest myTest = new MyTest() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        MyTest myTest1 = (a, b) -> a + b;

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface MyTest {
        int add(int a, int b);
    }

}
