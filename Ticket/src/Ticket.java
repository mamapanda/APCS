public abstract class Ticket {
    private int serialNumber;
    private static int currentSerial = 1;

    public Ticket() {
        serialNumber = getNextSerialNumber();
    }

    public abstract double getPrice();

    public String toString() {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    private static int getNextSerialNumber() {
        return currentSerial++;
    }
}
