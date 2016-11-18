
/**
 * Contains information about an employee
 * 
 * @author Daniel Phan 
 * @version 10.31.16
 */
public class Employee
{
    private String name; //the name of the employee
    private double hoursWorked; //the number of hours the employee worked
    private double wage; //the employee's hourly wage
    
    /**
     * Creates a new employee with the given name and wage. Initializes the hours worked to 0.
     * (Postcondition: name != "", hoursWorked == 0, wage > 0)
     * @param aName the employee's name
     * @param aWage the employee's wage
     * (Precondition: aName != "", aWage > 0)
     */
    public Employee(String aName, double aWage)
    {
        name = aName;
        hoursWorked = 0;
        wage = aWage;
    }
    
    /**
     * Sets the employee's total working hours
     * (Postcondition: hoursWorked >= 0)
     * @param hours the employee's new total working hours
     * (Precondition: hours >= 0)
     */
    public void setHours(double hours)
    {
        hoursWorked = hours;
    }
    
    /**
     * Returns the total number of hours the employee worked
     * (Postcondition: hoursWorked >= 0)
     * @return the total hours the employee worked
     * (Precondition: hoursWorked >= 0)
     */
    public double getHours()
    {
        return hoursWorked;
    }
    
    /**
     * Sets the employee's wage
     * (Postcondition: wage > 0)
     * @param aWage the employee's new wage
     * (Precondition: aWage > 0)
     */
    public void setWage(double aWage)
    {
        wage = aWage;
    }
    
    /**
     * Returns the employee's name
     * (Postcondition: name != "")
     * @return the employee's name
     * (Precondition: name != "")
     */
    public String getName()
    {
       return name;
    }
    
    /**
     * Returns the employee's wage
     * (Postcondition: wage > 0)
     * @return the employee's wage
     * (Precondition: wage > 0)
     */
    public double getWage()
    {
       return wage;
    }
    
    
}

