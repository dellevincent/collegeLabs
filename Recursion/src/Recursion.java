import java.util.Scanner;
public class Recursion {
	
	private static Scanner numb;

	public static void main(String[] args) {
		numb = new Scanner(System.in);
		System.out.println("Enter Number to find factorial value");
		int digit= numb.nextInt();

		do {
			System.out.println(recurse(digit));
			System.out.println("Enter another Number to find factorial value and 0 to exit!");
			digit= numb.nextInt();
		}
		while(digit!=0);
		System.out.println("Program terminated!");
	}

	public static int recurse(int input){
		
		if(input==1) {
			return 1; 
		}
		else {
			
			return input * recurse(input-1);
			
		}
		
	}
}
