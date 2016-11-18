/**
* 
*
* @author Daniel Phan
* @version 10.21.16
*/

//public class NotesClassDesign
//{
////Designing classes
//	//classes are collections of objects
//		//objects are entities (not functions)
//		//class should represent a single concept
//			//class names should be nouns
//			//method names should be verbs
////Categories of classes
//	//real-life entities (nouns)
//		//Students, Country, School, BankAccount, Flag, Backpack, Tree
//	//actor class (names should end with "-er" or "-or")
//		//Do some kinds of work for us. (Scanner, . . .)
//	//Utility Class
//		//has no objects
//		//contains a collection of related static methods or constants
//			//Math class, . . .
//	//Application or "Runner" class
//		//class with only main method
////Criteria for a "well-designed" class
//	//(1) Cohesion
//		//all interface features should be closely related to the single concept that the class represents
//		//example
//		public class BadCashRegister
//		{
//			public static final double DIME_VALUE = 0.1;
//			public static final double NICKEL_VALUE = 0.05;
//			//continue for other coins
//
//			/////////////////////////////////////////////////////////////////
//			//there should be another class for the coins (separate entity)//
//			/////////////////////////////////////////////////////////////////
//
//			public void enterPayment(int dollars, int quarters, int dimes, int nickels, int pennies)
//			{
//				//calculate the total
//			}
//		}
//		//Two concepts in the above class
//			//(1) CashRegister that holds coins and computes their total
//			//(2) Values of individual coins
//		//BETTER DESIGN BELOW
//		public class Coin
//		{
//			private String name;
//			private double value;
//			public Coin(double value, String name)
//			{
//				this.name = name;
//				this.value = value;
//			}
//			public double getValue()
//			{
//				return value;
//			}
//		}
//		public class CashRegister
//		{
//			public void enterPayment(int coinCount, Coin coinType)
//			{
//				//calculate payment
//			}
//		}
//
//		//Why is this better?
//		//(1) the cash register no longer needs to know anything about the coin values
//		//(2) Coin can handle different currencies
//		//(3) Coin class does not depend on CashRegister
//	//(2) Coupling
//		//Dependency between multiple classes.
//		//Preferably: low coupling rather than high coupling
//	//Parameter Variables
//		//--> parameter variables are passed in as values, not reference
//			//meaning that parameter variables don't get updated
//		//example
//		public class BankAccount
//		{
//			public double balance;
//			public BankAccount(double balance)
//			{
//				this.balance = balance;
//			}
//			public void transfer(double amount, BankAccount otherAccount)
//			{
//				//amount += 5; //not recommended to change parameter value
//				double amount1 = amount + 5; //better
//				this.balance -= amount;
//				double newBalance = otherAccount.balance + amount;
//			}
//		}
//		BankAccount a = new BankAccount(1000);
//		BankAccount b = new BankAccount(500);
//		//a.transfer(100, b);
//		//a.balance is now 900
//		//b.balance is now 500
//	//Documentation of Methods
//		//Preconditions and Postconditions
//		//Precondition
//			//--> a requirement that the caller of a method must obey
//			//--> a caller (user) of the method responsible to call the method correctly
//			//--> if the method is called improperly in any way,
//				//the method is not responsible for producing a correct result
//			/**
//			 * Deposits money into this account
//			 * @param amount the amount of money to deposit
//			 * (Precondition: amount >= 0)
//			 */
//			public void deposit(double amount)
//			{
//				balance += amount;
//			}
//		//Postcondition
//			//--> when a method is called in accordance to its preconditions,
//				//then the method promises to do its job correctly
//			/**
//			 * Deposits money into this account
//			 * (Postcondition: balance >= 0)
//			 * @param amount the amount of money to deposit
//			 * (Precondition: amount >= 0)
//			 */
//			public void deposit(double amount)
//			{
//				balance += amount;
//			}
//			/**
//			 * Returns the current balance of this account
//			 * (Postcondition: the return values equals the account balance) //redundant
//			 * @return the account balance
//			 */
//			public double getBalance()
//			{
//				return balance;
//			}
//	//Static Methods (Class Methods)
//		//a method that is not invoked on an object
//		//simply implement the method in the class and call it without constructing a class instance
//		/**
//		* Everything to do with a square
//		*
//		* @author Daniel Phan
//		* @version 10.24.16
//		*/
//		public class Square
//		{
//			/**
//			 * Returns the area of a square with the given side
//			 * (Postcondition: area > 0)
//			 * @param side the side length of the square
//			 * @return the area of the square
//			 * (Precondition: side > 0)
//			 */
//			public static double getArea(double side)
//			{
//				return side * side;
//			}
//		}
//}