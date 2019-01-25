package multithread.threadGroup;

public class ThreadGroupDemo {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        ThreadGroup threadGroup1 = thread1.getThreadGroup();
        ThreadGroup threadGroup2 = thread2.getThreadGroup();

        System.out.println(threadGroup1.getName());
        System.out.println(threadGroup2.getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());

        ThreadGroup threadGroup3 = new ThreadGroup("New group");

        Thread thread3 = new Thread(threadGroup3, myRunnable);
        System.out.println(threadGroup3.getName());

        /*
        *  1. Set daemon thread for the group.
        * */
        threadGroup3.setDaemon(true);

    }
}
