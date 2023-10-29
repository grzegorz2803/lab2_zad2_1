import java.util.Random;

public class TicketThread extends Thread {
    Ticket[] tickets;
    public TicketThread(Ticket[] tickets) {
        this.tickets = tickets;
    }

    @Override
    public void run(){
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Wątek "+Thread.currentThread().getName()+" zarezerwował "+tickets[i].getName());
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Wątek "+Thread.currentThread().getName()+" zwolnił  "+tickets[i].getName());
        }
    }
}
