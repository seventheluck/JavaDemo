package multithread.producerConsumerModel;

public class SetThread implements Runnable {
    private Student s;
    private int num = 0;

    public SetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                System.out.println(Thread.currentThread().getName() + " Set is synchronizing");
                if (s.flag) {
                    System.out.println(Thread.currentThread().getName() + " Set cannot set new value");
                    try {
                        System.out.println(Thread.currentThread().getName() + " Set is waiting");
                         /*
                         * 1. Release lock, other threads will be selected by system to execute.
                         * 2. Wait to be selected next round.
                         * */
                        s.wait();
                        System.out.println(Thread.currentThread().getName() + " Set finished waiting");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (num % 2 == 0) {
                    s.name = "Li";
                    s.age = 27;
                } else {
                    s.name = "Wang";
                    s.age = 30;
                }
                num++;
                s.flag = true;
                System.out.println(Thread.currentThread().getName() + " Set is notifying");
                 /*
                 * 1. Did not notify other threads right now.
                 * 2. Notify other threads after exit the synchronized block.
                 * */
                s.notify();
                System.out.println(Thread.currentThread().getName() + " Set finished notifying");
                System.out.println(Thread.currentThread().getName() + " Set exit synchronizing");
            }
        }
    }
}
