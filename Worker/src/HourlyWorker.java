/**
 * Represents an hourly worker
 *
 * @author Daniel Phan
 * @version 11.28.16
 */
public class HourlyWorker extends Worker {
    /**
     * Constructs a new HourlyWorker with the given name and wage
     * (Postcondition: super.name and super.wage are initialized)
     * @param name the worker's name
     * @param wage the worker's age
     * (Precondition: super.name and super.wage are declared)
     */
    public HourlyWorker(String name, double wage) {
        super(name, wage);
    }

    /**
     * Computes the worker's pay based on an amount of weekly hours worked.
     * The worker is paid 1.5x for hours worked over 40.
     * (Postcondition: the money the worker earned is returned)
     * @param hours the weekly hours worked
     * @return the worker's pay based on the amount of weekly hours worked
     * (Precondition: hours >= 0)
     */
    @Override
    public double computePay(int hours) {
        return getWage() * (hours + 0.5 * Math.max(hours - 40, 0));
    }
}
