
/**
 * Testing KFC class
 * 
 * @author (Lucy) 
 * @version (1.0)
 */

import java.util.Scanner;

public class KFCTester
{
    public static void main(String[] args)
    {   
        Scanner input = new Scanner(System.in);
        KFC chickenWing = new KFC(); 
        boolean cont = true;
        while(cont == true)
        {
            System.out.println("KFC EMPLOYEE DATABASE");
            System.out.println("To print employee payroll, press 1."); 
            System.out.println("To add an employee, press 2.");
            System.out.println("To remove an employee, press 3.");
            System.out.println("To give all employee a raise, press 4.");
            System.out.println("To give a raise to an individual employee, press 5.");
            System.out.println("To exit the database, press any key.");
            System.out.print("Enter your selection: ");
    
            int selection = input.nextInt();
            if (selection == 1)
                chickenWing.printPayroll();
            else if (selection == 2)
            {
                System.out.print("Enter employee name: ");
                String name = input.next();
                System.out.print("Enter employee wage: ");
                double wage = input.nextDouble();
                Employee channingTatum = new Employee(name, wage);
                System.out.print("Enter number of hours worked: ");
                int hours = input.nextInt();
                channingTatum.setHours(hours);
                chickenWing.addEmployee(channingTatum);
            }
            else if (selection == 3)
            {
                System.out.print("Enter employee name for termination: ");
                String name = input.next();
                chickenWing.remove(name);
            }
            else if (selection == 4)
            {
                System.out.print("Enter hourly wage increase: ");
                double increase = input.nextDouble();
                chickenWing.raiseForAll(increase);
            }
            else if (selection == 5)
            {
                System.out.print("Enter employee name for a raise: ");
                String name = input.next();
                System.out.print("Enter hourly wage increase: ");
                double increase = input.nextDouble();
                chickenWing.raiseIndividually(name, increase);
            }
            else
                cont = false;
        }
    }    
}

