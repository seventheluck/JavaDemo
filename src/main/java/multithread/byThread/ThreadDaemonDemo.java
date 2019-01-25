package multithread.byThread;

public class ThreadDaemonDemo {

    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon("Li1");
        ThreadDaemon td2 = new ThreadDaemon("Li2");
        td1.setDaemon(true);
        td2.setDaemon(true);
        td1.start();
        td2.start();

/*A daemon thread is a thread that does not prevent the JVM from exiting
when the program finishes but the thread is still running.
An example for a daemon thread is the garbage collection.*/
        for(int x = 0; x < 50; x++) {
            System.out.println(Thread.currentThread().getName() + ": " + x);
        }
    }
}
