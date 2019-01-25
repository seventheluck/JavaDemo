package multithread.app;

public class SellTicketDemo {

    public static void main(String[] args) {
        SellTicket sellTicket1 = new SellTicket("Seller 1");
        SellTicket sellTicket2 = new SellTicket("Seller 1");
        SellTicket sellTicket3 = new SellTicket("Seller 1");

        sellTicket1.start();
        sellTicket2.start();
        sellTicket3.start();
    }
}
