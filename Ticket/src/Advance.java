public class Advance extends Ticket {
    private int daysInAdvance;

    public Advance(int daysInAdvance) {
        super();
        this.daysInAdvance = daysInAdvance;
    }

    @Override
    public double getPrice() {
        return daysInAdvance >= 10 ? 30 : 40;
    }
}
