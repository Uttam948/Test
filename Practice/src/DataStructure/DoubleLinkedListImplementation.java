package DataStructure;

public class DoubleLinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		doublyLinkedListimpl doublyLinkedListimpl = new doublyLinkedListimpl();
		doublyLinkedListimpl.insertion(12);
		doublyLinkedListimpl.insertion(1);
		doublyLinkedListimpl.insertion(5);
		doublyLinkedListimpl.insertion(8);
		doublyLinkedListimpl.insertion(3);
		doublyLinkedListimpl.insertAtFirst(17);
		doublyLinkedListimpl.show();
	}

}

class doubleNode{
	
	int data;
	doubleNode next;
	doubleNode pre;
	
	
}

class doublyLinkedListimpl{
	
	doubleNode head;
	
	
	public void insertion(int data) {
		
		doubleNode dleNode = new doubleNode();
		dleNode.data = data;
	
		
		
		if(head == null) {
			
			head = dleNode;
		}else {
			
			doubleNode n = head;
			 while(n.next!= null) {
				 
			
				 n.next.pre = n;
				 n = n.next;
				 
				 
				 
			 }
			 n.next = dleNode;
		}
		
		
	}
	
	public void insertAtFirst(int data) {
		
		doubleNode dleNode = new doubleNode();
		dleNode.data = data;
		dleNode.next = head;
	     
		
			head = dleNode;
		
		
		
	}
	
	public void show() {
		
		doubleNode n = head;
		
		while(n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	
		}	
}
