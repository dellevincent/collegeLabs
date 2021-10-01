import java.util.*;
import java.io.*; 

public class TaskList extends Task{
    HashMap<String, Task> tasklist= new HashMap<>();
    
    public void addTask(String day) throws IOException{
        Task temp= new Task();
        if(!tasklist.containsKey(day)){
            temp.addTask1();
            tasklist.put(day.trim(),temp);
        }
        else{
           tasklist.get(day.trim()).addTask1(); 
        }
    }
    
    public void deleteTaskOnSpecificDay(String day, String taskName) {
        if(tasklist.isEmpty()){
            System.out.println("No task to delete.");
        }
        else{
            System.out.println(taskName+" for " +day+ " has been deleted.");
            tasklist.get(day.trim()).deletetask(taskName.trim());
        }
    }
    
    public void deleteSpecificTask(String taskName) {
        if(!tasklist.isEmpty()){
          for(Iterator<String> itr= tasklist.keySet().iterator(); itr.hasNext();){
              String tasks = itr.next();
              System.out.println(taskName +" has been deleted.");
              tasklist.get(tasks.trim()).deletetask(taskName.trim());
            }
        }
        else{
            System.out.println("There are no task to delete.");
        }
    }
    
    public void printContentOfTask() {
        if(!tasklist.isEmpty()){ 
          for(Iterator<String> itr= tasklist.keySet().iterator(); itr.hasNext();){
              String days = itr.next();
              Task dayTask= tasklist.get(days.trim());
              HashMap temp= dayTask.getList();
              for(Iterator<String> itr2= temp.keySet().iterator(); itr2.hasNext();){
                String task= itr2.next();
                System.out.println(days + " " +task + " " + temp.get(task));
              }              
          }
        }
        else{
            System.out.println("There are no task Info to diplay.");
        } 
    }
    
    public void searchDayForTask(String day) {
        if(!tasklist.isEmpty()){
            Task dayTask= tasklist.get(day.trim());
            HashMap temp= dayTask.getList();
            for(Iterator<String> itr= temp.keySet().iterator(); itr.hasNext();){
                String task= itr.next();
                System.out.println(day + " " +task + " " + temp.get(task));
                
            }
        }
        else{
            System.out.println("There are no task for this day.");
        }
    }
}
