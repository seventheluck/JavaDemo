package multithread.byThread;

public class ThreadJoinDemo {

    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin("Li1");
        ThreadJoin tj2 = new ThreadJoin("Li2");
        ThreadJoin tj3 = new ThreadJoin("Li3");

        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();
    }
}
