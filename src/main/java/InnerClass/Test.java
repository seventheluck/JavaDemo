package InnerClass;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.test(1);

        Test.Test2 test2 = test.new Test2();

        Test.Test3 test3 = new Test3();
    }

    public void test(int b) {
        int a = 10;
        new Thread() {
            public void run() {
                System.out.println(a);
                System.out.println(b);
            }

            ;
        }.start();
    }

    static class Test3 {

    }

    class Test2 {

    }
}


class TT {

    public static void main(String[] args) {
        Test test = new Test();
        test.test(1);

        Test.Test2 test2 = test.new Test2();

        Test.Test3 test3 = new Test.Test3();
    }
}