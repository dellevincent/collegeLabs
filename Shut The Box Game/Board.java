import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    // instance variables - replace the example below with your own
    private ArrayList<Box> boxes;
    private ArrayList<Player> players;
    private Scanner input;
    private int die1;
    private int die2;
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        die1=0;
        die2=0;
        players= new ArrayList<>();
        boxes= new ArrayList<>();
        input= new Scanner(System.in);
    }

    public void createBoard(){
        int index=0;
        for(index=0; index<=8; index++){
            boxes.add(new Box());
        }
        for(index=0; index<=8; index++){
            boxes.get(index).setLocation(index+1);
        }
    }

    public void viewBoard(){

        for(int index=0; index<=boxes.size()-1; index++){
            System.out.println(boxes.get(index).getLocation());
        }
    }

    public void createPlayers(int number){
        int ind=number;
        if(ind==0){
            System.out.println("Number of Players can't be 0.");
        }
        else{
        System.out.println("Enter Players Name(s)");
        for(int index=0; index<=ind-1; index++){
            String reader=input.nextLine();
            players.add(new Player(reader));
            System.out.println("Player Name " + players.get(index).getName());
        }
        }
        System.out.println("Do you want to include a computer in this game? Yes/No");
        String reader=input.nextLine();
        if(reader.equalsIgnoreCase("yes")){
            ind=ind+1;
            players.add(new Computer());
            System.out.println("You have an AI opponent in this game. Good Luck.");
        }
    }

    public void viewPlayers(){
        System.out.println("List of Players");
        for(Player x:players){
            System.out.println(x.getName());
        }
    }

    public void rollDies(Player player){
        if(player instanceof Player){
            die1= player.rollDie1();
            die2 = player.rollDie2();
            System.out.println("You rolled " +die1 +" & " +die2);
        }
        else if(player instanceof Computer){
            die1= player.rollDie1();
            die2 = player.rollDie2();
            System.out.println("You rolled " +die1 +" & " +die2);
        }
    }

    public void selectBoxes(){
        int total=0;
        System.out.println("Do you want to combine die?Yes/No");
        String reader=input.nextLine();
        if(reader.equalsIgnoreCase("yes") && die1 + die2<=9){
            int x= die1 + die2;
            for(int index=0; index< boxes.size()-1;){
                if(boxes.get(index).getLocation()==x){
                    if(boxes.get(index).closedBox(x)){
                        System.out.println("You closed box "+x);
                    }
                    else{
                        System.out.println("Already Closed Box");
                    }
                }
                index++;
            }
        }
        else{
            System.out.println("Pick Boxes that add up to your rolled total of " + (die1+die2));
           
            do{
                System.out.println("You have " +((die1+die2)-total) );
                int box1=input.nextInt();
                for(int index=0; index< boxes.size()-1;){
                    if(boxes.get(index).getLocation()==box1){
                        if(boxes.get(index).closedBox(box1)){
                            System.out.println("You closed box "+box1); 
                            total+=box1;
                        }
                        else{
                            System.out.println("Already Closed Box");
                        }
                    }
                    index++;
                }
            }
            while(total< die1+die2);
            
        }
        
        for(int index=0; index<=boxes.size()-1; index++){
            if(!boxes.get(index).closedBox(index)){
               total += boxes.get(index).getLocation();
            }
        }
        System.out.println(total);
    }

    public void randomizer(){
        ArrayList<Player> l= new ArrayList<>();
        Random rand=new Random();
        int index=0;
        while(!players.isEmpty()){
            int r=rand.nextInt(players.size());
            l.add(players.remove(r));
            index++;
        }
        players=l;
    }
    
    public void start(){
        createBoard();
        System.out.println("Enter Number of Players and Names.");
        int number=input.nextInt();
        if(number>0){
            createPlayers(number);
        }
        randomizer();
        System.out.println("This is Your Play Order");
        players.forEach(player->System.out.println(player.getName()));
    }
    
    public void computerMove(){
        int roll= die1+die2;
        Random rand= new Random();
        if(roll<=10){
            
        }
    }
}
