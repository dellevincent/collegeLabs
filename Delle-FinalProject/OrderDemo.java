import java.util.*;
/**
 * Write a description of class OrderDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrderDemo{
    private Scanner reader;
    private HashSet<Order> order;
    private FoodItem[] food;
 
    public OrderDemo(){
        FoodItem f1= new FoodItem("hamberger",5.50);
        FoodItem f2= new FoodItem("fries", 3.00);
        FoodItem f3= new FoodItem("soda", 2.20);
        FoodItem f4= new FoodItem("water", 0.00);
        reader= new Scanner(System.in);
        food=new FoodItem[4];
        food[0]=f1;
        food[1]=f2;
        food[2]=f3;
        food[3]=f4;
    }
    
    public void printWelcome() { 
        System.out.println("Welcome: Please select from the following:");
        System.out.println("Ordering (O), View Order (V) and Exit (Other)");
        System.out.print("> "); 
        String inputLine = reader.nextLine().trim().toLowerCase();
       do{ 
            if (inputLine.equals("o")) { 
                System.out.println("Now Ordering..... Please type your order.");
                HashMap<String, Double> order= new HashMap<>();
                if(inputLine.equals("hamberger")){
                    order.put("Hamberger",5.50);
                    System.out.println("You ordered " +inputLine);
                    System.out.print("> "); 
                    inputLine = reader.nextLine().trim().toLowerCase(); 
                }
                else if(inputLine.equals("fries")){
                    order.put("fries",3.00);
                    System.out.println("You ordered " +inputLine);
                    System.out.print("> "); 
                    inputLine = reader.nextLine().trim().toLowerCase(); 
                }
                else if(inputLine.equals("soda")){
                    order.put("soda", 2.20);
                    System.out.println("You ordered " +inputLine);
                    System.out.print("> "); 
                    inputLine = reader.nextLine().trim().toLowerCase(); 
                }
                else if(inputLine.equals("water")){
                    order.put("watere", 0.00);
                    System.out.println("You ordered " +inputLine);
                    System.out.print("> "); 
                    inputLine = reader.nextLine().trim().toLowerCase(); 
                }
                
                else{
                    System.out.println("Please choose an order.");
                    System.out.print("> "); 
                    inputLine = reader.nextLine().trim().toLowerCase(); 
                }
                            } 
            else if (inputLine.equals("v")) { 
                int index=0;
                System.out.println("Menu");
                for(index=0;index<food.length;index++){
                    System.out.println(food[index].getItem() + " " + food[index].getPrice());
                }
                System.out.print("> "); 
                inputLine = reader.nextLine().trim().toLowerCase(); 
            }
            System.out.print("> "); 
            inputLine = reader.nextLine().trim().toLowerCase(); 
       } 
       while(!inputLine.equals("bye"));
        System.out.println("Bye"); 
    }
}
