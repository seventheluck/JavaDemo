package multithread.byThread;

public class ThreadStopDemo {

    public static void main(String[] args) {
        ThreadStop ts1 = new ThreadStop();

        ts1.start();

        try {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
            ts1.interrupt();
        } catch (InterruptedException e) {


        }
    }
}
