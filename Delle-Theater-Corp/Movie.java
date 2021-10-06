
/**
 * Write a description of class Movie here.
 * 
 * @author (Vincent Delle) 
 * @version (a version 1)
 */
public class Movie
{
    private String title;
    private Rating rating;
    public Movie(String title, Rating rating){
       this.title=title;
       this.rating=rating;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getRating(){
        return rating.toString();
    }
}
