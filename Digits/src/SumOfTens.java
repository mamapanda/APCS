
/**
 * displays number as sum of tens, hundreds, thousands, etc. less than 
 * 
 * @author (Daniel Phan ID: 71609829) 
 * @version (1)
 */
import java.util.Scanner;
public class SumOfTens {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Please enter a number:");
        System.out.print(">");
        int number = userinput.nextInt();
        int term = number/10;
        int count = 1; //Sorry for copying part of your code, Mr. Luc.
        while(term>9)
        {
            term = term/10;
            count = count + 1;
          }
        int tens = (number)%(10);
        int count2 = 1;
        System.out.print("= ");
        while(count2 < count+1)
        {
            System.out.print(tens + " + ");
            number = number-tens;
            count2 = count2 + 1;
            tens = number%(int)Math.pow(10,count2);
          }
        System.out.println(tens);
    }
}

