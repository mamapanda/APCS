/**
 * Class to run TimeDepositAccount
 *
 * @author Daniel Phan
 * @version 11.21.16
 */

import java.util.Scanner;

public class AccountTester
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Initial Amount: ");
        double amount = in.nextDouble();
        System.out.print("Interest Rate: ");
        double interest = in.nextDouble();
        System.out.print("Months: ");
        TimeDepositAccount tda = new TimeDepositAccount(amount, interest, in.nextDouble());
        loop:
        while (true) {
            System.out.println();
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Add Interest");
            System.out.println("4 - View balance");
            System.out.println("0 - Exit");
            System.out.print("> ");
            switch (in.nextInt()) {
                case 1:
                    System.out.print("Amount: ");
                    tda.deposit(in.nextDouble());
                    break;
                case 2:
                    System.out.print("Amount: ");
                    double withdrawal = tda.withdraw(in.nextDouble());
                    System.out.println(withdrawal == -1 ? "Not enough money" : "Money withdrawn");
                    break;
                case 3:
                    tda.addInterest();
                    break;
                case 4:
                    System.out.format("Balance: %.2f\n", tda.getBalance());
                    break;
                case 0:
                    break loop;
            }
            System.out.println();
        }
    }
}