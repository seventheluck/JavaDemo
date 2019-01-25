package multithread.app;

public class SellTicketByRunnable implements Runnable{

    private int tickets = 100;
    @Override
    public void run() {

        while (true) {
            if (tickets > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " sells no." + tickets--);
            }
        }

    }
}
