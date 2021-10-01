package adt;
import java.util.Scanner;

public class Postfix {
	
	public static int evaluate(String expression) {
		NodeBasedStack<Integer> stacks= new NodeBasedStack<>();
		
		Scanner scanner= new Scanner(expression.trim());
		
		int value=0;
		String c=null;;
		
		while(scanner.hasNext()) {
			c=scanner.next();
			
			if(isOperand(c)) {
				stacks.push(Integer.parseInt(String.valueOf(c)));
			}
			else{
				int temp1=0;
				int temp2=0;
				temp1=stacks.pop();
				temp2=stacks.pop();
				
				switch(c) {
				case "+" :
					value=temp2+temp1;
					stacks.push(value);
					break;

				case "-" :
					value=temp2-temp1;
					stacks.push(value);
					break;
					
				case "*" :
					value=temp2*temp1;
					stacks.push(value);
					break;
					
				case "/" :
					value=temp2/temp1;
					stacks.push(value);
					break;
				
				default: 
					System.out.println("Not an operator");
				}
				
			}
		}
	
			return stacks.peek();
	}
	
	/**
	 * @param c
	 * @return true if the parameter is an operand and false if the parameter is an operator
	 */
	public static boolean isOperand(String c) {
		if(c.equals("+")) {
			return false;
		}
		else if(c.equals("-")) {
			return false;
		}
		else if(c.equals("*")) {
			return false;
		}
		else if(c.equals("/")) {
			return false;
		}
		else {
			return true;
		}
	}


}
