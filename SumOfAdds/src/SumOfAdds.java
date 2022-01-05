import java.util.Scanner;

public class SumOfAdds {
	
	public static Scanner digit;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		digit = new Scanner(System.in);
		
		System.out.println("Enter a digit to find the total number of addition posibilies.");
		int number=digit.nextInt();
		int temp=number;
		int count=0;
		
		for(int i=0; i<(number/2)+1;i++) {
			System.out.println("[ " +i + " , " + temp+ " ]");
			temp-=1;
			count=i+1;
		}
		System.out.println("Your possible number of Sums: " + count);
	}
}