import java.util.Scanner;
public class Permutation {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input= new Scanner(System.in);
		System.out.println("Enter the word you would like to permutate.");
		String wrds=input.nextLine();
        printPermutn(wrds, "");
		
	}
	
	
	static void printPermutn(String str, String ans){
  
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
  
        for (int i = 0; i < str.length(); i++) {
  
            // ith character of str
            char ch = str.charAt(i);
  
            // Rest of the string after excluding 
            // the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);
  
            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }
}
