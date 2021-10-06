
/**
 * Write a description of class PartTimeEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartTimeEmployee extends Employee
{
    // instance variables - replace the example below with your own
    public double wages;
    public double hoursWorked;
    /**
     * Constructor for objects of class PartTimeEmployee
     */
    public PartTimeEmployee(String firstName, String lastName, String id, double wages,double hoursWorked)
    {
        super(firstName,lastName,id);
        this.wages=wages;
        this.hoursWorked=hoursWorked;
    }
    
    public void addPartTimeEmployee(String id, String firstName, String lastName){
        addEmployee(id, firstName, lastName);
    }
    
    public String toString(){
       return firstName + " " +lastName+ " weeklyWage: " +Double.toString(wages*hoursWorked);
   }
}
