import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
	private static String password="";
	private static String values= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890~!@#$%^&*()_+{}[]|/?";
	private static String digit= "1234567890";
	private static String word="";
	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    sc= new Scanner(System.in); 
		System.out.println("Enter D for digit or press enter to continue ");
		word=sc.nextLine();
		System.out.println("How many characters do you want for your password");
		int numb =sc.nextInt();
		System.out.println("This is your passcode " +generate(numb));
	}
	
	public static String generate(int input) {
		Random rand= new Random();
		int temp;
		if(word.equalsIgnoreCase("d")) {
			for(int i=0; i<input; i++) {
				temp= rand.nextInt(digit.length());
				password += digit.charAt(temp);
			}
		}
		else {
			for(int i=0; i<input; i++) {
				temp= rand.nextInt(values.length());
				password += values.charAt(temp);
			}
		}
		return password;
	}
}
