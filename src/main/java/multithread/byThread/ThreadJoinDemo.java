package multithread.byThread;

public class ThreadJoinDemo {

    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin("Li1");
        ThreadJoin tj2 = new ThreadJoin("Li2");
        ThreadJoin tj3 = new ThreadJoin("Li3");

        tj1.start();
        tj2.start();
        try {
            /*
             * 1. When join() executed, current thread will run first.
             * 2. Other threads start after this thread finished.
             * */
            tj2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj3.start();
    }
}
