package multithread.byThread;

public class ThreadYield extends Thread {

    public ThreadYield() {

        super();
    }

    public ThreadYield(String name) {
        super(name);
    }


    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " + i);
            // Yield, but not enforcement
            this.yield();
        }
    }
}
