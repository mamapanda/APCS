
/**
 * calculate roots of a quadratic
 * 
 * @author (Daniel Phan) 
 * @version (8.16.16)
 */
import java.util.Scanner;
public class QuadraticFormula
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("y = ax^2+bx+c\nPlease input the a, b, and c values of the quadratic.");
        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("c = ");
        double c = input.nextDouble();
        double discriminant = Math.pow(b,2)-4*a*c;
        if (discriminant>=0){
            double root1 = Math.round(10000.0*(-b+Math.pow(discriminant,0.5))/(2*a))/10000.0;
            double root2 = Math.round(10000.0*(-b-Math.pow(discriminant,0.5))/(2*a))/10000.0;
            System.out.println("The roots of the quadratic are "+root1+" & "+root2+ "(rounded to 4 decimal places.)");
        }
        else{
            System.out.println("The quadratic has no real roots.");
        }
    }
}


