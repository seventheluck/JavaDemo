package multithread.byThread;

public class ThreadJoin extends Thread {

    public ThreadJoin() {

        super();
    }

    public ThreadJoin(String name) {
        super(name);
    }


    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
