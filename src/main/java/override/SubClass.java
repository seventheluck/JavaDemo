package override;

public class SubClass extends SuperClass {

    public static void main(String[] args) {

        SubClass subClass = new SubClass();
        int a = 1;
        Integer b = 2;
        String result = subClass.add(null, null);
        SuperClass ss = new SubClass();
        //ss.minus(1, 2, 3);
        a = subClass.a;
    }

    public double add(int a, int b, int c) {
        return 2.0;
    }

    public String add(SubClass s, String ss) {
        return "SubClass";
    }

    public String add(SuperClass ssuperClass, Object superClass) {
        return "SuperClass";
    }

    public int minus(int a, int b, int c) {
        return a + b;
    }

    private int multiply(int a, int b) {
        return 1;
    }


}
