package multithread.byThread;

public class ThreadDaemon extends Thread {

    public ThreadDaemon() {

        super();
    }

    public ThreadDaemon(String name) {
        super(name);
    }


    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
