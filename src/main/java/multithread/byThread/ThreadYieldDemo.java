package multithread.byThread;

public class ThreadYieldDemo {

    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin("Li1");
        ThreadJoin tj2 = new ThreadJoin("Li2");

        tj1.start();

        tj2.start();
    }
}
