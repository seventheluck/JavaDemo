package multithread.producerConsumerModel.test2;

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

                if (num % 2 == 0) {
                    s.set("Li", 27);
                } else {
                    s.set("Wang", 30);
                }
                num++;
            }
        }
    }
}
