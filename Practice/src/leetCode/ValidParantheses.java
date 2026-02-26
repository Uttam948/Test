package leetCode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		 
		
		Scanner sc = new Scanner(System.in);
		
		//String s = sc.next();
	//	String s = "[{()}]";
		       // String s = "{}";
		//String s = "}{";
	//	String s = "{]";
	//	String s = "{}()";
		String s = "(){}}{";
		
		ValidParantheses ValidParantheses = new ValidParantheses();
		
		
		System.out.println(	ValidParantheses.isValid(s));
		
	}
		 
		public boolean isValid(String s) {
			 
			 
			 Stack<Character> stack = new Stack<>();
			 
			 
			 
			 
			 char []a = s.toCharArray();
			 			 
			 
			 stack.push(s.charAt(0));
			 
			 for(int i =1;i<a.length ; i++) {
				
				 if(stack.empty()) {
					 stack.push(a[i]);
					 
				 }
				
				 else if((stack.peek().equals('(') && a[i] == ')' )) {
					 //||
						// (stack.peek().equals(')') && a[i] == '(' ) ) {
					 
					 stack.pop();
					 
					 
					
				 }else if((stack.peek().equals('{') && a[i] == '}' ) ) {
						 
					//	|| (stack.peek().equals('}') && a[i] == '{' ) ) {
							
							 stack.pop();
							 
							 
						 }else if((stack.peek().equals('[') && a[i] == ']' ) ) {
						///|| (stack.peek().equals(']') && a[i] == '[' ) ) {
							
							 stack.pop();
							 
							 
						 
						 }else {
							 stack.push(a[i]);
						 }
					
				 
				 

				 
				
				/* if(((a[i] ==  '[') && stack.peek().equals(']')) || ((a[i] == ']') && stack.peek().equals('[')) ) {
					 
					 stack.pop();
					 
					 
				 }else  if(((a[i] ==  '{') && stack.peek().equals('}')) || ((a[i] == '{') && stack.peek().equals('}'))){
					 
					 stack.pop();
					 
				 }else  if(((a[i] ==  '(') && stack.peek().equals(')')) || ((a[i] == '(') && stack.peek().equals(')') )) {
					 stack.pop();
				
				 }else {
					 stack.push(a[i]);
				 }*/
				 
							 
				// System.out.println(stack.peek());
				 
			 }
			 
			
			 
			 if(stack.size() == 0) {
				 return true;
			 }
			 System.out.println(stack);
			 
			 
			return false;
			 
			
		
	}
}
