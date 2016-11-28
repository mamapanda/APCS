/**
 * Simulates a time deposit bank account
 *
 * @author Daniel Phan
 * @version 11.21.16
 */
public class TimeDepositAccount extends SavingsAccount {
    private static final int EARLY_PENALTY = 10; //the penalty for withdrawing early
    private double interestRate; //the interest rate
    private int months; //the number of months to maturity

    /**
     * Creates a new TimeDepositAccount with the given initial balance, interest rate, and months
     * (Postcondition: balance, interestRate, and months are initialized)
     *
     * @param balance      the initial balance
     * @param interestRate the interest rate of the account
     * @param months       the number of months to maturity
     *                     (Precondition: balance, interestRate, and months are initialized)
     */
    public TimeDepositAccount(double balance, int months, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
        this.months = months;
    }

    /**
     * Adds interest to the account, and reduces the months to maturity by one
     * (Postcondition: months is decremented by 1, and the balance is increased by the interest rate)
     * (Precondition: interestRate > 0)
     */
    @Override
    public void addInterest() {
        if (months > 0) months--;
        super.deposit(interestRate * getBalance());
    }

    /**
     * Withdraws a certain amount of money from this account, if possible
     * $10 is deducted from the account balance if the account has not matured
     * (Postcondition: the amount withdrawn is returned)
     *
     * @param amount the amount of money to withdraw
     * @return the amount withdrawn; 0 if there is not enough money
     * (Precondition: amount >= 0)
     */
    @Override
    public double withdraw(double amount) {
        if (amount < 0) return 0;
        double newBalance = getBalance() - amount - (months > 0 ? EARLY_PENALTY : 0);
        if (newBalance >= 0) setBalance(newBalance);
        return newBalance < 0 ? -1 : amount;
    }
}
