package InnerClass;

public class Demo {
    public int b;
    private int a;

    public static void main(String[] args) {
        Demo demo = new Demo();
//        Thread thread = new Thread();
//        demo.access(thread);
//        thread.start();
    }

    private int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public void access2(String s) {
        Demo demo = new Demo() {
            public void m() {
                System.out.println(s);
            }
        };

    }

    public void m() {
    }

    public void access(Thread thread) {
        final String a = "abc";
        class MethodInnerClass {
            public String add() {
                return a;
            }
        }


        new MethodInnerClass().add();

        thread = new Thread() {
            public void run() {
                if(a == null)
                    System.out.println("null");
                else if(a != null)
                    System.out.println(a);
                else
                    System.out.println("Nothing");
            }
        };

        //thread.start();
    }

    class InnerClass {
        int c;
        int d;

        int minus(int a, int b) {
            return a - b;
        }

        void print() {
            System.out.println(Demo.this.a);
        }
    }
}

class Demo2 {
    private Demo demo = new Demo();
    //Demo.InnerClass innerClass = new Demo.InnerClass();
    Demo.InnerClass innerClass = demo.new InnerClass();
}
