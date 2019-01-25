package generics;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Plate<Fruit> plate = new Plate<>(new Fruit("fruit"));
        plate.set(new Fruit("fruit2"));
        Fruit result = plate.get();


        Plate<? extends Fruit> plate2 = new Plate<>(new Fruit("fruit"));
//        plate2.set(new Fruit("fruit2 extends"));
//        plate2.set(new Apple("apple extends fruit", "red"));
        Fruit result2 = plate2.get();

        Plate<? super Apple> plate3 = new Plate<>(new Fruit("fruit"));
        plate3.set(new Apple("apple2", "red"));
        //plate3.set(new Apple("apple extends fruit", "red"));
        Apple result3 = (Apple) plate3.get();

        Plate<? extends Fruit> plate4 = new Plate<>(new Apple("apple2", "red"));

        Apple result4 = (Apple) plate4.get();

        Map<String, ?> map = new HashMap<String, String>();
        //map.put("123", "String");

        Map<String, String> map2 = new HashMap<>();
        map2.put("1", "1");
        add(map2);
        Map<String, Integer> map3 = new HashMap<String, Integer>();
        map3.put("1", 1);
        add(map3);

        Map<?, ?> map4 = new HashMap<>();
        map4 = new HashMap<String, Integer>();
        map4 = new HashMap<String, String>();

    }

    public static void add(Map<String, ?> map) {
        Object temp = map.get("1");
        String str = String.valueOf(temp);
    }
}
