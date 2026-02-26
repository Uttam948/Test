package leetCode;

import java.util.Stack;

public class MatchRegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aab";
		String p ="c*a*b";
		
		//String s = "aab";
		//String p = ".*c";
		int num =58;
		
		
	
		   int n = 0;
	        int  i =1 ;
	        Stack<String> stack = new Stack<>();
	        while(num > 0 ){
	             
	             int m = num % 10;
	             num = num/10;
	             m = i * m;
	             if(m < 10 && m>5 && 10-m == 1){
	                 stack.add("IX");
	             }else if(m < 50 && 50 - m == 10){
	                  stack.add("XL");
	             }

	             i = i*10;
	             
	             System.out.println(m);
	        }
	        
	        
	        System.out.println(stack);
	         
	        String fin = "";
	        
	        while(stack.size() > 0) {
	        fin = fin.concat(stack.peek());
	        	stack.pop();
	        }
	        
	        System.out.println(fin);



	     
		 
		
 
		
	}

}
