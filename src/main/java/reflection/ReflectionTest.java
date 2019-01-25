package reflection;

import override.SubClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        String str = "Hello";
        Class c = str.getClass();
        Object instance = c.newInstance();
        instance = "World";
        System.out.println(str + " " + instance);
        Method[] methods = c.getMethods();
        /*for(Method m : methods){
            System.out.println(m);
        }*/
        try {
            Method m = c.getDeclaredMethod("toString");
            System.out.println(m.invoke(instance, null));
            m = c.getDeclaredMethod("indexOf", int.class);
            System.out.println(m.invoke(instance, 'W'));
        } catch (NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        SubClass subClass = new SubClass();
        Class sc = subClass.getClass();
        Object sco = sc.newInstance();
        try {
            Method scom = sc.getDeclaredMethod("multiply", int.class, int.class);
            scom.setAccessible(true);
            System.out.println(scom.invoke(sco, 1, 1));
        } catch (NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
