import java.util.*;
/**
 * Write a description of class Company here.
 * This class allows users to check the number of employees a company has.
 * Also keep track of the employees, with the unique id.
 * @author (Vincent Delle) 
 * @version (a version 1)
 */
public class Company{
    private final int max;
    private final int min;
    private String name;
    private HashMap<String, String> employees;
    private Random randomGenerator;
    public Company(String name){
     max=999;
     min=100;
     this.name=name.trim().replaceAll(" +"," ");
     employees= new HashMap<>();
    }
    
    public String getName(){
        return name;
    }
    
    public HashMap<String, String> getEmployees(){
        return employees;
    }
    
    public int getTotalEmployees(){
       Iterator<String> itr= employees.keySet().iterator();
       int i=0;
       while(itr.hasNext()){
           String notEmpty= itr.next();
           i++;
        }
        
        return i;
    }
    
    public String formatString(String origString){
        if(origString== null){
            return origString;
        }
        else{
            return origString.toUpperCase().replaceAll(" +"," ");
        }
    }
    
    public String generateId(String name){
        randomGenerator = new Random();
        String[] nameArray=name.split("\\s");
        String id="";
        for(int i=0; i < nameArray.length; i++){
            int rand = randomGenerator.nextInt(max-min)+100;
            id = nameArray[i].substring(0,1) + Integer.toString(rand);
        }
        return id;
    }
    
    public void addEmployee(String inputName){
        inputName = formatString(inputName.trim());
        if(inputName==null){
            System.out.println("Enter New Eployee name");
        }
        else if(employees.containsKey(inputName)){
            System.out.println(inputName+  " Already exist.");
        }
        else{
            employees.put(inputName.trim(),generateId(inputName));
            System.out.println("Name " +inputName);
            System.out.println("ID " +employees.get(inputName));
        }
    }
    
    public void deleteEmployee(String inputName){
        inputName = formatString(inputName.trim());
        if(inputName.length()==0 || inputName.isEmpty()){
            System.out.println("Enter Valid name");
        }
        else if(employees.containsKey(inputName)){
            System.out.println("Name: "+inputName);
            System.out.println("ID: "+ employees.get(inputName));
            employees.remove(inputName);  
        }
        else{
            System.out.println("Employee doesn't exist");
        }
    }
    
    public void removeIds(String id){
        boolean found = false;
        id = formatString(id);
        if(id == null || id.isEmpty()){
            System.out.println("Id is INVALID");
        }
        else
        {
            for(Iterator<String> itr = employees.keySet().iterator(); itr.hasNext(); ) {
             String ids =  itr.next();
             if(employees.get(ids).contains(id)){
                found = true;
                itr.remove();
             }
           }
        }
        if(!found){
                System.out.println("no employees wth ID " +id);
        }    
    }
    
    public void listEmployees(){
        System.out.println("Employees for " +name);
        if(employees.isEmpty()){
            System.out.println("No Employees");
        }
        else{      
            for(Iterator<String> itr = employees.keySet().iterator(); itr.hasNext(); )
            {
                String employeesNames =  itr.next();
                System.out.println(employeesNames + ": " + employees.get(employeesNames));
            }
        }
    }
}
