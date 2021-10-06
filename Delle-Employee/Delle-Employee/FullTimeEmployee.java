
/**
 * Write a description of class FullTimeEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTimeEmployee extends Employee
{
    public double salary;
    /**
     * Constructor for objects of class FullTimeEmployee
     */
   public FullTimeEmployee(String firstName, String lastName, String id, double salary)
    {
        super(firstName,lastName,id);
        this.salary=salary;
    }
    
   public void addFullTimeEmployee(String id, String firstName, String lastName){
        addEmployee(id, firstName, lastName);
   }
   
   public String toString(){
       return firstName + " " +lastName+ " weeklySalary: " +Double.toString(salary/52);
   }
}
