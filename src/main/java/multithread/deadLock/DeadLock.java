package multithread.deadLock;

public class DeadLock implements Runnable {
    private boolean flag;

    public DeadLock(boolean flag) {
        super();
        this.flag = flag;
    }

    @Override
    public void run() {
        int i = 0;
        int j = 0;
        if (flag) {
            synchronized (MyLockObject.obj1) {
                //System.out.println("obj1 locked!");
                synchronized (MyLockObject.obj2) {
                    while (true) {
                        System.out.println("i: " + i++);
                    }
                }
            }
        } else {
            synchronized (MyLockObject.obj2) {
                //System.out.println("obj2 locked!");
                synchronized (MyLockObject.obj1) {
                    while (true) {
                        System.out.println("j: " + j++);
                    }
                }
            }
        }
    }
}
