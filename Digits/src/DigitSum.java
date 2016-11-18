
/**
 * computes sum of all digits in a number
 * 
 * @author (Daniel Phan ID: 71609829) 
 * @version (1)
 */
import java.util.Scanner;
public class DigitSum {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter a number:");
		System.out.print(">");
		int number = userinput.nextInt();
		int sum = 0;
		while(number > 0){
		    int term = number%10;
		    number = number/10;
		    sum = sum + term;
		  }
		System.out.println("Sum of Digits: " + sum);
	}
}

