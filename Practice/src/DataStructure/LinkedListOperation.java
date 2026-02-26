package DataStructure;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class NewNode{
	
	int data;
	NewNode next;
	
	NewNode(int data){
		this.data = data;
	}
}

public class LinkedListOperation {

	static NewNode head ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack stack = new Stack();
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		for(Integer i  : list) {
			
			stack.push(i);
		}
		
		
	
	    while(!stack.empty()) {
	    	NewNode node = new NewNode((int) stack.peek());
			stack.pop();
			node = node.next;
			
	    }
	    
	   
	
		
		
	}
	
	

}
