package multithread.byRunnable;

public class MyRunnableDemo {

    // Avoiding the problems of single inherit.
    // Separate business logic from thread.
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable, "Wang");

        t1.setName("Li");




        t1.start();
        t2.start();
    }
}
