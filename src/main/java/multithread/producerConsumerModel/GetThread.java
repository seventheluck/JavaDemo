package multithread.producerConsumerModel;

public class GetThread implements Runnable {
    private Student s;

    public GetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                System.out.println(Thread.currentThread().getName() + " Get is synchronizing");


                if (!s.flag) {
                    System.out.println(Thread.currentThread().getName() + " Get cannot get new value");
                    try {
                        System.out.println(Thread.currentThread().getName() + " Get is waiting");
                        /*
                        * 1. Release lock, other threads will be selected by system to execute.
                        * 2. Wait to be selected next round.
                        * */

                        s.wait();


                        System.out.println(Thread.currentThread().getName() + " Get finished waiting");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(s.name + "---" + s.age);

                s.flag = false;
                System.out.println(Thread.currentThread().getName() + " Get is notifying");
                /*
                * 1. Did not notify other threads right now.
                * 2. Notify other threads after exit the synchronized block.
                * */
                s.notify();
                System.out.println(Thread.currentThread().getName() + " Get finished notifying");
                System.out.println(Thread.currentThread().getName() + " Get finished synchronizing");
            }
        }
    }
}
