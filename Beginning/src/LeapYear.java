
/**
 *checks if a year is a leap year or not
 * 
 * @author (Daniel Phan) 
 * @version (08.22.16)
 */
import java.util.Scanner;
public class LeapYear
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if(year%4 == 0)
        {
            if(year>1582)
            {
                if(year%100 == 0)
                {
                    if(year%400 == 0)
                    {
                        System.out.println(year+" is a leap year.");
                    }
                    else
                    {
                        System.out.println(year+" is not a leap year.");
                    }
                }
                else
                {
                    System.out.println(year+" is a leap year.");
                }
            }
            else
            {
                System.out.println(year+" is a leap year.");
            }
        }
        else
        {
            System.out.println(year+" is not a leap year.");
        }
    }
}
