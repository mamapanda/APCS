/**
 * INHERITANCE
 * -a mechanism for enhancing existing classes (advantage: code reuse)
 * if two or more classes represent similar concepts or properties, then
 * one class can "inherit" the properties of the other class
 * <p>
 * ex, SavingsAccount can inherit from BankAccount
 * Vocab: BankAccount is "superclass" --> parent class
 * Savings Account is "subclass" --> child class
 * DEFINING METHODS FOR A SUBCLASS
 * (1) do nothing - inherit and use methods from the superclass
 * (2) define new method(s) in the subclass
 * (3) "Override" methods from the superclass
 * -Specify method in subclass with same signature
 * --signature implies the name, return type, and parameters
 * Advanced topic
 * -suppose we have deposit(...) methods in both super/sub classes, but we insist on using only deposit
 * methods of the superclass inside the subclass
 * super.deposit(...)
 * Converting between subclass and superclass
 * -You can assign subclass to superclass, but not the other way around.
 * Ex.
 * SavingsAccount s = new SavingsAccount(1000);
 * BankAccount b = s; //technically, SavingsAccount are BankAccounts
 * <p>
 * POLYMORPHISM
 * -in Java, the type of variable does not completely determine the type of object to which it refers
 * -in Java, method calls are always determined by the type of the actual object, not the type of object reference
 * Ex. Suppose both BankAccount and SavingsAccount have deposit methods.
 * <p>
 * ABSTRACT CLASS
 * -To be used when there are no good default methods in the superclass
 * and only the subclass programmer can know how to implement the method properly
 * -Abstract class method has no implementation --> it forces the subclass to implement the method
 * -Cannot coonstruct objects of abstract classes
 * -Concrete class (opposite of abstract class)
 * <p>
 * THE COSMIC SUPERCLASS: Object
 * -In Java, every class that is defined without an explicit "extends" clause
 * automatically extends the class Object
 * -The class Object is the direct or indirect superclass of every class
 * Useful methods of Object class
 * (1) String toString()
 * (2) boolean equals(Object object)
 * (3) Object clone()
 */

/**
 * Simulates a Bank Account
 *
 * @author Daniel Phan
 * @version 11.21.16
 */
public abstract class BankAccount {
    private double balance; //the account balance

    /**
     * Constructs a new BankAccount with the given balance
     * (Postcondition: balance is intialized)
     * @param balance the initial balance
     * (Precondition: balance is declared)
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * Deposits a given amount of money into the account
     * (Postcondition: amount is added to balance)
     * @param amount the amount to deposit
     * (Precondition: amount >= 0)
     */
    public void deposit(double amount) {
        if (amount >= 0) balance += amount;
    }

    /**
     * Returns the balance
     * (Postcondition: balance is returned)
     * @return the account's balance
     * (Precondition: balance is defined)
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Updates the balance
     * (Postcondition: this.balance == balance)
     * @param balance the new balance
     * (Precondition: balance > 0)
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract double withdraw(double amount);
}
