/*
*Bank Account class
*
*@author Daniel Phan
*@version 1
*/
public class BankAccount
{
	private double balance;
	public String accountHolder;
	public String accountNumber;
		//default constructor only creates a memory location and does nothing else
		// doesn't initialize because it doesn't know what to initialize the instance variables with
		//verbs = methods; nouns = variables
	public BankAccount()
	{
		balance = 0;
		accountHolder = "";
		accountNumber = "";
	}
	public void deposit(double depositAmount) //all methods should be named in camel case
	{
		balance += depositAmount; //each method should not have more than 10 lines of code (Luc)
	}
	public double getBalance()
	{
		return balance; //gives out copy of the original value
	}
	public void printStatement()
	{
		System.out.println("Your balance is " + balance);
	}
	//updates balance if withdrawal amount is less than balance
	//otherwise returns 0 if balance is less than withdrawal amount
	public double withdraw(double withdrawAmount)
	{
		if(withdrawAmount > balance) return 0;
		balance -= withdrawAmount;
		return withdrawAmount;
	}	
	//can put main function at the bottom instead of creating a new class
}