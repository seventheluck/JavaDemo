package multithread.byThread;

import java.util.Date;

public class ThreadStop extends Thread {

    public void run() {
        System.out.println("Running: " + new Date());

        try {
            this.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Thread end! " ) ;
        }

        System.out.println("End: " + new Date());
    }
}
