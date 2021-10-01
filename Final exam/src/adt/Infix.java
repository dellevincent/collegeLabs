package adt;

public class Infix { 
    
	public static String evaluate(String expression) {
		
		return InfixToPostfix(expression.replaceAll("\\s+",""));
	}
     
    public static String InfixToPostfix(String expression) { 
        NodeBasedStack<Character> stack = new NodeBasedStack<>();
        String postFix=""; 
		
        for (int i = 0; i<expression.length(); i++)  { 
            char c = expression.charAt(i); 
              
            if (Character.isLetterOrDigit(c)) 
                postFix += c;     
            else if (c == '(') 
                stack.push(c);             
            else if (c == ')') 
            { 
                while (!stack.empty() && stack.peek() != '(') 
                    postFix += stack.pop();  
                if (!stack.empty() && stack.peek() != '(') 
                    return "Invalid Expression";               
                else
                    stack.pop(); 
            } 
            else { 
                while (!stack.empty() && Prec(c) <= Prec(stack.peek())){ 
                    if(stack.peek() == '(') 
                        return "Invalid Expression"; 
                    postFix += stack.pop(); 
                } 
                stack.push(c); 
            } 
        } 
       
        while (!stack.empty()) { 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            postFix += stack.pop(); 
         } 
         return postFix; 
    } 
    
    public static int Prec(char c) { 
        switch (c) { 
        case '+':         	
        case '-': 
            return 1; 
          
        case '*':         	
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
            
        default: 
        	return 0;
		} 
    }

} 

