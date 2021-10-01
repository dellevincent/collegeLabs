import java.io.*;
public class Driver
{
   public static void main(String[] args) throws IOException{
    int i=0;
    TaskList tasks= new TaskList();
    BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
    boolean run=false;
    while(!run){
        System.out.println("0. Exit.");
        System.out.println("1. Add a task.");
        System.out.println("2. Delete a task on a specific day.");
        System.out.println("3. Delete a specific task.");
        System.out.println("4. Print content of TaskList.");
        System.out.println("5. Search day for tasks");
        int num=Integer.parseInt(stdin.readLine());
        switch(num){
            case 0:
                run=true;
                break;
            case 1: 
                System.out.println("Enter day");
                String dy=stdin.readLine();
                tasks.addTask(dy);
                break;
            case 2:
                System.out.println("Enter day and specific task");
                String day=stdin.readLine();
                String tsk=stdin.readLine();
                tasks.deleteTaskOnSpecificDay(day,tsk);
                break;
            case 3:
                System.out.println("Delete a specific task.");
                String tsk1= stdin.readLine();
                tasks.deleteSpecificTask(tsk1);
                break;
            case 4:
                System.out.println("Print content of TaskList.");
                tasks.printContentOfTask();
                break;
            case 5:
                System.out.println("Search day for tasks");
                String tsk2= stdin.readLine();
                tasks.searchDayForTask(tsk2);
                break;
            default:
                System.out.println("Please enter a valid number:");
        }
     }
   }
}