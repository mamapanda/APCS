/**
 * Represents a salaried worker that earns the regular wage per hours worked
 *
 * @author Daniel Phan
 * @version 11.28.16
 */
public class SalariedWorker extends Worker {
    /**
     * Constructs a new SalariedWorker with the given name and wage
     * (Postcondition: super.name and super.wage are initialized)
     * @param name the worker's name
     * @param wage the worker's age
     * (Precondition: super.name and super.wage are declared)
     */
    public SalariedWorker(String name, double wage) {
        super(name, wage);
    }

    /**
     * Computes the worker's pay based on an amount of weekly hours worked
     * (Postcondition: the money the worker earned is returned)
     * @param hours the weekly hours worked
     * @return the worker's pay based on the amount of weekly hours worked
     * (Precondition: hours >= 0)
     */
    @Override
    public double computePay(int hours) {
        return super.getWage() * hours;
    }
}
