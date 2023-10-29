public class Main {
    public static void main(String[] args) throws InterruptedException {
        Ticket[] tickets = new Ticket[3];
        tickets[0] = new Ticket("Bilet 1");
        tickets[1] = new Ticket("Bilet 2");
        tickets[2] = new Ticket("Bilet 3");
        for (int i=0; i<10; i++) {
            TicketThread tc = new TicketThread(tickets);
            tc.start();
            Thread.sleep(300);
        }
    }
}