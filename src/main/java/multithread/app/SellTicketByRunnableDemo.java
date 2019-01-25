package multithread.app;

public class SellTicketByRunnableDemo {

    public static void main(String[] args) {
        SellTicketByRunnable sellTicketByRunnable = new SellTicketByRunnable();

        Thread thread1 = new Thread(sellTicketByRunnable, "Seller 1");
        Thread thread2 = new Thread(sellTicketByRunnable, "Seller 1");
        Thread thread3 = new Thread(sellTicketByRunnable, "Seller 1");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
