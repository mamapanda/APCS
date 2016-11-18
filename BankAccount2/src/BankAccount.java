/**
 * INHERITANCE
 * -a mechanism for enhancing existing classes (advantage: code reuse)
 * if two or more classes represent similar concepts or properties, then
 * one class can "inherit" the properties of the other class
 *
 * ex, SavingsAccount can inherit from BankAccount
 * Vocab: BankAccount is "superclass" --> parent class
 *  Savings Account is "subclass" --> child class
 *  DEFINING METHODS FOR A SUBCLASS
 *    (1) do nothing - inherit and use methods from the superclass
 *    (2) define new method(s) in the subclass
 *    (3) "Override" methods from the superclass
 *      -Specify method in subclass with same signature
 *        --signature implies the name, return type, and parameters
 * Advanced topic
 *  -suppose we have deposit(...) methods in both super/sub classes, but we insist on using only deposit
 *    methods of the superclass inside the subclass
 *      super.deposit(...)
 * Converting between subclass and superclass
 *  -You can assign subclass to superclass, but not the other way around.
 *    Ex.
 *      SavingsAccount s = new SavingsAccount(1000);
 *      BankAccount b = s; //technically, SavingsAccount are BankAccounts
 *
 * POLYMORPHISM
 *  -in Java, the type of variable does not completely determine the type of object to which it refers
 *  -in Java, method calls are always determined by the type of the actual object, not the type of object reference
 *    Ex. Suppose both BankAccount and SavingsAccount have deposit methods.
 */
public class BankAccount
{
   private double balance;

  public BankAccount(double balance)
  {
    this.balance = balance;
  } 

  public void deposit(double amount)
  {
    balance += amount;
  }
  public double getBalance()
  {
    return balance;
  }
  public void setBalance(double balance)
  {
    this.balance = balance;
  }
}
