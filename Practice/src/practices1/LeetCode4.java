package practices1;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class LeetCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		Stack<Character> stack =  new Stack<>();
		
		
		
		for(int i =1 ;i<s.length()-1 ; i++) {
			
			stack.push(s.charAt(i));
              if(s.charAt(i+1) == ')' && stack.peek() == '(') {
            	  stack.pop();
              }else if(s.charAt(i+1) == '}' && stack.peek() == '{') {
            	  stack.pop();
              }else if(s.charAt(i+1) == ']' && stack.peek() == '[') {
            	  stack.pop();
            	  stack.pop();
              }
		}
				
		System.out.println(stack);
		}
		 
}
