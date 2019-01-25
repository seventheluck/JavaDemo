package multithread.byThread;

public class ThreadPriority extends Thread {

    public ThreadPriority() {

        super();
    }

    public ThreadPriority(String name) {
        super(name);
    }


    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " + i);

            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
