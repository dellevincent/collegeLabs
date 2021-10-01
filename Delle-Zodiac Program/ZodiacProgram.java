import java.util.Scanner;
/**
 * This Class contains a start method that allows users to interact with
 * the program, view thier Zodiac signs, and seach Zodiac start and end dates
 * 2 fields- zd, and reader
 * @author (Vincent Delle)
 * @version (version number 1)
 */
public class ZodiacProgram{
    private Zodiac zd;
    private Scanner reader;
        /**
    * Constructor for objects of class ZodiacProgram
    * The Constructor of the class ZodiacProgram, this class initializes the 
    * fields.
    */
    public ZodiacProgram(){
        zd= new Zodiac(31,12);
        reader= new Scanner(System.in);
    }
        
    /**
     * Mutator method that allows user to input and interact with the 
     * program
     */
    public void start(){
        System.out.println("Welcome: Please select your choice:");
        System.out.println("(D) to begin by date && (Z) to begin by Zodiac sign.&& (bye) to exit");
        String inputLine=reader.nextLine().trim();   
        do{
            if(inputLine.equalsIgnoreCase("d")){
                System.out.println("Enter Month then Date");
                int numb=reader.nextInt();
                int numb2=reader.nextInt();
                System.out.println(zd.zodiacByDate(numb,numb2));
                System.out.println("Do want to continue? (Y) for yes && (N) for No");
                inputLine=reader.nextLine().trim();
            }
            else{
              do{
               if(inputLine.equalsIgnoreCase("z")){
                  System.out.println("Enter Zodiac Sign");
                  inputLine=reader.nextLine().trim();
                  System.out.println(zd.zodiacDate(inputLine));
                  System.out.println("Do want to continue? (Y) for yes && (N) for No");
                  inputLine=reader.nextLine().trim();
               }
              }
              while(inputLine.equalsIgnoreCase("z"));
            }
            if(inputLine.equalsIgnoreCase("y")){
                System.out.println("(D) to begin by date && (Z) to begin by Zodiac sign.&& (bye) to exit");
            }
            else if(inputLine.equalsIgnoreCase("n") ){
                System.out.println("Bye");
                break;
            }
            if(inputLine.equalsIgnoreCase("bye")){
                System.out.println("Bye");
                break;
            }
            inputLine=reader.nextLine().trim();
        }
        while(!inputLine.equalsIgnoreCase("bye") || inputLine.equalsIgnoreCase("y"));
    }    
}
