public class SavingsAccount extends BankAccount {
    //private double balance; //not recommended
    private double interestRate;
    /**
     * SavingsAccount automatically inherits all methods and instance variables of BankAccount
     * except [constructor, ...]
     */
    public SavingsAccount(double balance) {
        super(balance); //BankAccount constructor //initializes BankAccount's balance to balance parameter
        interestRate = 0.01;
    }

    public void addInterest() {
        super.deposit(interestRate * getBalance());
    }
    public void deposit(double amount){
        System.out.println("Loser, get a job");
    }

}
