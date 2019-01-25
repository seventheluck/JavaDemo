package multithread.deadLock;

public class DeadLockDemo {

    public static void main(String[] args) {
        DeadLock deadLock1 = new DeadLock(true);
        DeadLock deadLock2 = new DeadLock(false);

        Thread thread1 = new Thread(deadLock1, "first");
        Thread thread2 = new Thread(deadLock2, "second");

        thread1.start();
        thread2.start();

    }
}
