import java.util.*;
/**
 * Write a description of class TheaterCorp here.
 * 
 * @author (Vincent Delle) 
 * @version (a version 1)
 */
public class TheaterCorp{
    private String corpName;
    private ArrayList<Theater> theaters;
    private HashSet<Movie> movies;
    public TheaterCorp(String corpName){
      this.corpName=corpName;
      theaters = new ArrayList<>();
      movies = new HashSet<>();
    }
    
    public String getCorpName(){
        return corpName;
    }
    
    public ArrayList<Theater> getTheater(){
        return theaters;
    }
    
    public HashSet<Movie> getMovies(){
        return movies;
    }
    
    public void addTheater(Theater theater){
        theaters.add(theater);
    }
    
    public void addMovies(Movie movie){
        movies.add(movie);
    }
    
    public void addMovies(String title, Rating rating){
        Movie movie;
        movie = new Movie(title, rating);
        movies.add(movie);
    }
    
    public boolean sellTheater(String location){
        boolean found=false;
        if(location==null || location.isEmpty()){
            System.out.println("Enter Theater location");
        }
        else if(theaters.size()==0){
            System.out.println("No Theaters to sell");
        }
        else{
            for(Iterator<Theater> itr=theaters.iterator(); itr.hasNext();){
                Theater theater= itr.next();
                if(theater.getLocation().equalsIgnoreCase(location)){
                    found=true;
                    System.out.println("Selling Theater " +location);
                    itr.remove();
                }
                else{
                    System.out.println("No Theater Location " +location);
                    found=false;
                }
            }
        }
            return found;
    }
    
    public void listAllMovies(){
        if(movies.size() ==0){
            System.out.println("No movies exist");
        }
        else{
            System.out.println("List Of Movies");
            for(Movie mov:movies){
                System.out.println(" " +mov.getTitle()+ mov.getRating());
            }
        }
    }
    
    public void listAllTheaterMovies(){
        if(theaters.size()==0){
            System.out.println("No Theaters exist");
        }
        else{
            System.out.println("Now Playing");
            for(Iterator<Theater> itr=theaters.iterator(); itr.hasNext();){
                Theater th=itr.next();
                System.out.println("Location " +th.getLocation());
                HashMap<Integer, Movie> screens=th.getScreens();
                if(screens==null || screens.isEmpty()){
                    System.out.println("No screens exist");
                }
                else{
                    for(Iterator it=screens.keySet().iterator(); it.hasNext();){
                      Integer key=(Integer)it.next();
                      System.out.println("  SCREEN " + key + " - " + screens.get(key).getTitle()+ " (" + screens.get(key).getRating()+ ")");
                    }
                }
            }
        }
    }
}
