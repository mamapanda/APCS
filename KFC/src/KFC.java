
/**
 * Acts as an employee database for a KFC company
 * 
 * @author Daniel Phan 
 * @version 10.31.16
 */

import java.util.ArrayList;

public class KFC
{
    private ArrayList<Employee> employees; //list of employees in payroll.
    
    /**
     * Constructs a new instance of KFC with no employees
     * (Postcondition: employees is initialized)
     * (Precondition: employees is declared)
     */
    public KFC()
    {
       employees = new ArrayList<Employee>();
    }
    
    /**
     * Adds an employee to KFC
     * (Postcondition: employees.contains(e) == true)
     * @param e the employee to add
     * (Precondition: e != null)
     */
    public void addEmployee(Employee e)
    {
        employees.add(e);
    }
    
    /**
     * Gives all employees a pay raise
     * (Postcondition: all employee wages > 0)
     * @param increase the amount to increase the employees' pay by
     * (Precondition: increase > 0)
     */
    public void raiseForAll(double increase)
    {
        for(int i = 0; i < employees.size(); i++)
        {
            employees.get(i).setWage(employees.get(i).getWage() + increase);
        }
    }
    
    /**
     * Increases the wage for an employee with the given name
     * (Postcondition: employees.get(i).getWage() > increase)
     * @param name the employee's name
     * @param increase the amount by which to increase the employee's wage
     * (Precondition: increase > 0)
     */
    public void raiseIndividually(String name, double increase)
    {
        int i = findEmployeeIndex(name);
        if(i > -1)
            employees.get(i).setWage(employees.get(i).getWage() + increase);
    }
    
    /**
     * Removes the employee with the given name from employees
     * (Postcondition: the employee with the given name is removed from employees)
     * @param name the name of the employee to remove
     * (Precondition: name != "")
     */
    public void remove(String name)
    {
        int i = findEmployeeIndex(name);
        if(i > -1) 
            employees.remove(i);
    }
    
    /**
     * Finds the index of the employee in employees. Returns -1 if the employee is not present.
     * (Postcondition: the index is returned if the employee is present; else -1 is returned)
     * @param name the name of the employee to find
     * @return the index of the employee to find
     * (Precondition: name != "")
     */
    private int findEmployeeIndex(String name)
    {
        for(int i = 0; i < employees.size(); i++)
        {
            if(employees.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }
    
    /**
     * Prints each employee's name, hours worked, and total pay.
     * Employees are paid 1.5x for each hour worked over 40
     * (Postcondition: the payroll is printed to the console)
     * (Precondition: e.isEmpty() != false)
     */
    public void printPayroll()
    {
        System.out.println();
        for(Employee e: employees)
        {
            double pay;
            if(e.getHours() > 40)
                pay = 40 * e.getWage() + (e.getHours() - 40) * 1.5 * e.getWage();
            else
                pay = e.getWage() * e.getHours();
            System.out.format("Name: %s, Hours Worked: %.2f, Total Earnings: $%.2f\n", e.getName(), e.getHours(), pay);
        }
        System.out.println();
    }
     
}