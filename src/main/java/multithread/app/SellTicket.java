package multithread.app;

public class SellTicket extends Thread {

    private static int tickets = 100;

    public SellTicket() {
        super();
    }

    public SellTicket(String name) {
        super(name);
    }

    public void run() {

        while (true) {
            if (tickets > 0) {
                System.out.println(getName() + " sells no." + tickets--);
            }
        }

    }
}
