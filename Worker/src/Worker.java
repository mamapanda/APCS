/**
 * Represents a paid worker
 *
 * @author Daniel Phan
 * @version 11.28.16
 */
public abstract class Worker {
    private String name; //the name of the worker
    private double wage; //the worker's hourly wage

    /**
     * Constructs a new worker with the given name and wage
     * (Postcondition: this.name and this.wage are initialized)
     * @param name the name of the worker
     * @param wage the worker's wage
     * (Precondition: this.name and this.wage are declared)
     */
    public Worker(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    /**
     * Returns the worker's name
     * (Postcondition: this.name is returned)
     * @return the worker's name
     * (Precondition: this.name is defined)
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the worker's wage
     * (Postcondition: this.wage is returned)
     * @return the worker's wage
     * (Precondition: this.wage is defined)
     */
    public double getWage() {
        return this.wage;
    }

    /**
     * Computes the worker's pay based on an amount of weekly hours worked
     * (Postcondition: the money the worker earned is returned)
     * @param hours the weekly hours worked
     * @return the worker's pay based on the amount of weekly hours worked
     * (Precondition: hours >= 0)
     */
    public abstract double computePay(int hours);
}
