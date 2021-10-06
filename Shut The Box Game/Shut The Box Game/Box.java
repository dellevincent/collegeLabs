
/**
 * Write a description of class Box here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Box
{
    // instance variables - replace the example below with your own
    private int location;
    private boolean open;
    /**
     * Constructor for objects of class Box
     */
    public Box()
    {
        // initialise instance variables
        location=0;
        open=true;
    }

    public void setLocation(int location){
        this.location=location;
    }

    public int getLocation(){
        return location;
    }

    public boolean openBox(int x){
        if(x==location){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean closedBox(int x){

        if(open){
            open=false;
            return true;
        }
        return open;
    }
}
