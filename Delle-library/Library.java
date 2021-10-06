import java.util.*;
/**
 * This class allows you to input genres of books in the library class, and pick books and genres
 * out of this class.
 * 
 * @author (Vincent Delle)
 * @version (10/21/17)
 */
public class Library{
    private Book bookOfTheWeek;
    private ArrayList<Genre> genres;
    
    public Library()
    {
       bookOfTheWeek= null;
       genres=new ArrayList<>();
    }
    
    public int getNumberofTotalBooks(){
        int numberOfBooks=0;
        for(Genre genre:genres){
            numberOfBooks += genre.getNumberOfBooks();
        }
         return numberOfBooks;
    }
    
    public void addGenre(Genre genre){
        genres.add(genre);
    }
    
    public void addGenre(String genreName){
        addGenre(new Genre(genreName));
    }
    
    public void removeGenre(String  genreName){
        boolean notFound=false;
        Iterator <Genre> itr= genres.iterator();
        while(itr.hasNext()){
            Genre genre=itr.next();
            String genrenm= genre.getGenreName();
            if(genrenm.equalsIgnoreCase(genreName)){
                itr.remove();
                notFound=true;
            }
        }
        if(notFound == false){
            System.out.println("no genre found at: "+genreName);
        }
    }
    
    public void listAllGenres(){
        if(genres.size()>0){
           System.out.println("The genre names:");
           for(Genre genres:genres){
               System.out.println(genres.getGenreName());
           }
        }
        else{
            System.out.println("No genres");
        }
    }
    
    public void listAllLibraryBooks(){
        Iterator<Genre> itr=genres.iterator();
        while(itr.hasNext()){
            Genre bk= itr.next();
            bk.listAllGenreBooks();
        }
    }
    
    public void printBookOfTheWeek(){
        if(bookOfTheWeek==null){
           System.out.println("There is no book of the Week");
        }
        else{
            bookOfTheWeek.getBookDetails();
        }
    }
}
         
