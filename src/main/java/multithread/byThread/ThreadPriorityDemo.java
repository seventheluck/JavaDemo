package multithread.byThread;

public class ThreadPriorityDemo {


    public static void main(String[] args) {
        ThreadPriority threadPriority1 = new ThreadPriority("1");
        ThreadPriority threadPriority2 = new ThreadPriority("2");
        ThreadPriority threadPriority3 = new ThreadPriority("3");

        threadPriority1.setPriority(4);
        threadPriority2.setPriority(5);
        threadPriority3.setPriority(10);
        threadPriority1.start();
        threadPriority2.start();
        threadPriority3.start();


    }
}
