import java.util.*;
/**
 * This class allows user to create genre and input books to a their respected genres.
 * 
 * @author (Vincent Delle) 
 * @version (10/19/17)
 */
public class Genre
{
   private String genreName;
   private ArrayList<Book> books;
    public Genre(String genreName)
    {
        books=new ArrayList<>();
        this.genreName=genreName;
    }
    
    public String getGenreName(){
        return genreName;
    }
    
    public ArrayList<Book> getBookGenreBooks(){
        return books;
    }
    
    public int getNumberOfBooks(){
        return books.size();
    }
    
    public boolean bookIndexValid(int index){
        boolean valid=false;
        if(index<0){
            System.out.println("Index cannot be negative");
        }
        
        else if(index>books.size()){
            System.out.println("Index is too large");
        }
        else if(books==null){
            System.out.println("Book collection cannot be empty");
        }
        else if(index>=0 && index<=(books.size()-1)){
            valid=true;
        }
            return valid;    
    }
    
    public void addGenreBook(Book book){
        books.add(book);
    }
    
    public void addGenreBook(String author, String title, String callNumber){
        Book book;
        book=new Book(author, title, callNumber);
        books.add(book);
    }
    
    public int findGenreBookWithCallNumber(String callNumber){
        int index=0;
        boolean searching=true;
        while(searching && index<=books.size()){
            Book book=books.get(index);
            if(book.getCallNumber().contains(callNumber)){
                searching=false;
             }
             else{
                index++;
                }
        }
        
        if(searching){
            return -1;
        }
        
        else{
            return index;
        }
    }
     
    public void removeGenreBookWithCallNumber(String callNumber){
        int index=findGenreBookWithCallNumber(callNumber);
        if(bookIndexValid(index)){
            System.out.println("removing " +books.get(index).getBookDetails());
            books.remove(index);
        }
        else{
            System.out.println("No Book at Call Number " +callNumber);
        }
    }
    
    public void removeAllGenreBooksByAuthor(String author){
        Iterator <Book> itr=books.iterator();
        while(itr.hasNext()){
            Book book = itr.next();
            if(author.equals(book.getAuthor())){
                System.out.println("Removed " +book.getBookDetails());
                itr.remove();
            }   
        }
    }
    
    public void listAllGenreBooks(){
        if(books.isEmpty()){
            System.out.println("There are no books to print");
        }
        else{
            System.out.println(getGenreName());
            for(Book book:books){
                System.out.println(book.getBookDetails());
            }
        }
    }
    
    public void listGenreBooksByAuthor(String author){
        boolean match=false;
        System.out.println(getGenreName()+" Books by author "+ author);
        for(Book b:books){
            if(b.getAuthor().equalsIgnoreCase(author)){
                match=true;
                System.out.println(b.getBookDetails());
            }
        }
        if(match==false){
            System.out.println("No Books by author" +author);
        }
    }
}
