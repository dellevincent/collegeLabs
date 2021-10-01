import java.util.*;
import java.io.*;

public class Task {
	
    public String taskName="";
    public String comment="";
    HashMap<String, String> list= new HashMap<>();
    BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
    
    public void addTask1() throws IOException{
        System.out.println("Enter Task: ");
        taskName= stdin.readLine();
        System.out.println("Enter Comment:");
        comment= stdin.readLine();
        addlist();
    }
    public void addlist(){
         list.put(taskName,comment);
    }
    public void getTask(String id){
         System.out.print(id + " " + list.get(id));
    }
    public void deletetask(String taskcalled){
         list.remove(taskcalled);
    }
    public HashMap getList(){
        return list;
    }
}