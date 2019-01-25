package classLoader;
public class ConstClass{
    static{
        System.out.println("ConstClass init!");
    }

    public static final int COUNT = 1;
}