
/**
 * does integer computations: 
(1) the sum
(2) the difference
(3) the product
(4) the average
(5) the distance (absolute value of difference)
(6) the maximum
(7) the minimum
 * 
 * @author (Daniel Phan)
 * @version (8.16.16)
 */
import java.util.Scanner;
public class Integers
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integers.");
        System.out.print("First Integer: ");
        int a = input.nextInt();
        System.out.print("Second Integer: ");
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("Sum: "+sum);
        int difference = a-b;
        System.out.println("Difference: "+difference);
        int product = a*b;
        System.out.println("Product :"+product);
        double average = sum/2.0;
        System.out.println("Average: "+average);
        int distance = Math.abs(difference);
        System.out.println("Distance: "+distance);
        int maximum = Math.max(a,b);
        System.out.println("Maximum: "+maximum);
        int minimum = Math.min(a,b);
        System.out.println("Minimum: "+minimum);
        
    }
}
