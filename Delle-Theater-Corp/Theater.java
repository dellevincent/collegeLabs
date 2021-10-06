import java.util.*;
/**
 * Write a description of class Theater here.
 * 
 * @author (Vincent Delle) 
 * @version (a version 1)
 */
public class Theater{
    private String location;
    private HashMap<Integer, Movie> screens;
    public Theater(String location){
       this.location=location;
       screens= new HashMap<>();
    }
    
    public String getLocation(){
        return location;
    }
    
    public HashMap<Integer, Movie> getScreens(){
        return screens;
    }
    
    public void addScreen(Integer screen, Movie movie){
        screens.put(screen, movie);
    }
}
