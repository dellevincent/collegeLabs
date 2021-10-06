import java.util.ArrayList;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    public int score;
    private SixSidedDie die1;
    private SixSidedDie die2;
    public int roll1;
    public int roll2;
    private String name;
    /**
     * Constructor for objects of class Player
     */
    public Player(String name)
    {
        // initialise instance variables
        score=0;
        this.name=name;
        die1= new SixSidedDie();
        die2= new SixSidedDie();
        roll1=0;
        roll2=0;
    }

    public String getName(){
        return name;
    }

    public int rollDie1(){
        roll1= die1.roll();
        return roll1;
    }

    public int rollDie2(){
        roll2= die2.roll();
        return roll2;
    }
    

    public void score(int score){
        this.score=score;
    }

    public int getScore(){
        return score;
    }
}
