/**
 * Represents a commissioned worker
 *
 * @author Daniel Phan
 * @version 11.29.16
 */
public class Commission extends Hourly {
    private double commissionRate; //the commission rate
    private double totalSales; //the employee's total sales

    /**
     * Constructs a new Commission with the given name, address,
     * phone number, social security number, wage, and commission
     * (Postcondition: the class's fields are all initialized)
     * @param eName the employee's name
     * @param eAddress the employee's address
     * @param ePhone the employee's phone number
     * @param socSecNumber the employee's social security number
     * @param wage the employee's wage
     * @param commission the employee's commission rate
     * (Precondition: the class's fields are all declared)
     */
    public Commission(String eName, String eAddress, String ePhone,
                  String socSecNumber, double wage, double commission) {
        super(eName, eAddress, ePhone, socSecNumber, wage);
        this.commissionRate = commission;
        this.totalSales = 0;
    }

    /**
     * Returns a string containing the worker's information
     * (Postcondition: the string containing the worker's information is returned)
     * @return a string containing the worker's information
     * (Precondition: all of this class's fields are defined)
     */
    @Override
    public String toString() {
        return String.format("%s\nTotal Sales: %.2f", super.toString(), this.totalSales);
    }

    /**
     * Adds to the employee's total sales
     * (Postcondition: totalSales >= sales)
     * @param sales the amount of sales to add
     * (Precondition: sales > 0)
     */
    public void addSales(double sales) {
        this.totalSales += sales;
    }

    /**
     * Calculates and returns the employee's pay
     * (Postcondition: pay >= 0, totalSales == 0)
     * @return the employee's pay
     * (Precondition: super.pay() > 0, 0 <= commissionRate < 1, totalSales >= 0)
     */
    @Override
    public double pay() {
        double pay = super.pay() + this.commissionRate * this.totalSales;
        this.totalSales = 0;
        return pay;
    }
}
