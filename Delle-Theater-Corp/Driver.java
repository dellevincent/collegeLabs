
/**
 * Write a description of class Driver here.
 * 
 * @author (Vincent delle) 
 * @version (a version 1)
 */
public class Driver{
    public static void main(String[] args){
      TheaterCorp myCorp = new TheaterCorp("myCorp");
      Theater t1 = new Theater("Pitman");
      Theater t2 = new Theater("Glassboro");
      Movie jumanji = new Movie("Jumanji", Rating.PG);
      t1.addScreen(1, new Movie("Bambi", Rating.G));
      t1.addScreen(2, jumanji);
      t2.addScreen(1, jumanji);
      t2.addScreen(2, new Movie("Die Hard", Rating.R));
      myCorp.addTheater(t1);
      myCorp.addTheater(t2);
      myCorp.listAllTheaterMovies();
    }
}
