public class Ticket {
    private  String name;
    private  boolean reserved;

    public Ticket(String name) {
        this.name = name;
        reserved = false;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public String getName() {
        return name;
    }
    public boolean isReserved() {
        return reserved;
    }
}
