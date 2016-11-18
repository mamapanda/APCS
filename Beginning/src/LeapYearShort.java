
/**
 * checks if a year is a leap year or not
 * 
 * @author (Daniel Phan) 
 * @version (08.21.16)
 */
import java.util.Scanner;
public class LeapYearShort
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        int fourthYearTest = year%4;
        int hundredthYearTest = year%100;
        int four100thYearTest = year%400;
        if(fourthYearTest != 0 || (hundredthYearTest == 0 && year > 1582 && four100thYearTest != 0))
        {
            System.out.println(year + " is not a leap year.");
        }
        else
        {
            System.out.println(year + " is a leap year.");
        }
    }
}
