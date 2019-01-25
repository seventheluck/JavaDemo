package multithread.app;

public class RealSellTicketByRunnable implements Runnable {

    private int tickets = 100;
    private Object obj = new Object();

    @Override
    public void run() {


//        while (true) {
//            synchronized (obj) {
//                if (tickets > 0) {
//                    System.out.println(Thread.currentThread().getName() + " sells no." + tickets--);
//                }
//            }
//
//        }


//        while (true) {
//            synchronized (this) {
//                if (tickets > 0) {
//                    System.out.println(Thread.currentThread().getName() + " sells no." + tickets--);
//                }
//            }
//
//        }

        sellTickets();

    }

    public synchronized void sellTickets() {

        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + " sells no." + tickets--);
            }

        }
    }
}
