public class Test
{
	public static void main(String[] args)
	{
		BankAccount a = new BankAccount();
		a.deposit(1000); //a now has a balance of $1k
		a.accountHolder = "I am pretty.";
		a.withdraw(450.5);
		a.printStatement();
	}
}