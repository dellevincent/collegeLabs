package adt;
 
public class Driver {

	public static void main(String[] args) {
	 String exp = Infix.evaluate("1 + 2 + 3 - 4 * 5");
	 String post="";
	   for(int i=0; i<exp.length(); i++) {
		   post+= exp.charAt(i) + " ";
	   }
	 
	   System.out.println(Postfix.evaluate(post));	
	} 
}