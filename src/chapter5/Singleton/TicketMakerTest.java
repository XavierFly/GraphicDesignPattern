package chapter5.Singleton;

public class TicketMakerTest {
    public static void main(String[] args) {
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        System.out.println(ticketMaker1.getTicket());

        TicketMaker ticketMaker2 = TicketMaker.getInstance();
        System.out.println(ticketMaker2.getTicket());
    }
}
