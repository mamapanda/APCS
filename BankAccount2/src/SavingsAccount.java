/**
 * Simulates a savings account
 *
 * @author Daniel Phan
 * @version 11.21.16
 */
public class SavingsAccount extends BankAccount {
    //private double balance; //not recommended
    private double interestRate; //the interest rate of the account
    /**
     * SavingsAccount automatically inherits all methods and instance variables of BankAccount
     * except [constructor, ...]
     */
    /**
     * Constructs a new SavingsAccount with the given initial balance
     * (Postcondition: interestRate and balance are initialized)
     * @param balance the initial balance
     * (Precondition: balance and interest rate are declared)
     */
    public SavingsAccount(double balance) {
        super(balance); //BankAccount constructor //initializes BankAccount's balance to balance parameter
        interestRate = 0.01;
    }

    /**
     * Adds interest to the account
     * (Postcondition: interest is added to the balance)
     * (Precondition: interestRate > 0)
     */
    public void addInterest() {
        super.deposit(interestRate * getBalance());
    }
}
