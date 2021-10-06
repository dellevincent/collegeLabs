public class Book{
  private String author;
  private String title;
  private String callNumber;
  
  public Book(String author, String title, String callNumber){
    setBookDetails(author,title,callNumber);
  }
  
  public Book(String author, String title){
    setBookDetails(author,title,null);
  }
  
  public String getAuthor(){
      return author;
  }
  
  public String getTitle(){
      return title;
  }
  
  public String getCallNumber(){
      return callNumber;
  }
  
  public String getBookDetails(){
      return title+ " "+ author + " "+ callNumber; 
  }
  
  public void setBookDetails(String author, String title, String callNumber){
      this.author=author;
      this.title=title;
      this.callNumber=callNumber;
  }
}