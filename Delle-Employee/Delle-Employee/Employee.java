import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee{
    // instance variables - replace the example below with your own
    public String firstName;
    public String lastName;
    public String id;
    public HashMap<String, String> employees;
    public ArrayList<String> employeeNames;
    /**
     * Constructor for objects of class Employee
     */
    public Employee(String firstName, String lastName, String id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        employees= new HashMap<>();
    }
    
    public String Name(){
        return firstName.trim() +" " +lastName.trim();
    }
    
    public HashMap<String, String> getEmployees(){
        return employees;
    }
    
     public void addEmployee(String id, String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        String name= firstName + " " +lastName;
        if(name==null || id==null){
            System.out.print("Enter New Eployee name");
        }
        else if(employees.containsKey(id)){
            System.out.println(id +  " Already exist.");
        }
        else{
            employees.put(id.trim(), name.trim());
            System.out.println("Employee id " + id  + " "+ "Name " +employees.get(id));
        }
    }
    
     public void deleteEmployee(String id){
        this.id=id.trim();
        if(id.length()==0 || id.isEmpty()){
            System.out.println("Enter Valid name");
        }
        else if(employees.containsKey(id)){
            System.out.println("Name: "+ employees.get(id));
            System.out.println("ID: "+ id );
            System.out.println("Removed");
            employees.remove(id);
        }
        else{
            System.out.println("Employee doesn't exist");
        }
    }
    
    public void listAllEmployee(){
          if(employees.isEmpty()){
            System.out.println("No Employees");
        }
        else{  
            ArrayList<String> employeeName = new ArrayList<>();
            for(Iterator<String> itr = employees.keySet().iterator(); itr.hasNext(); )
            {
                String employeesNames =  itr.next();
                employeeName.add(employees.get(employeesNames));
            }
            Collections.sort(employeeName);
            for(String names:employeeName){
                System.out.println(employeeName);
            }
        }
    }
}
