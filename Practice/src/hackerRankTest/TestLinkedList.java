package hackerRankTest;



public class TestLinkedList {

	Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLinkedList list = new TestLinkedList();
		list.Insert(2);
		list.Insert(5);
		
		

	}
	
	public void Insert(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			
			head = node;
		}else {
			
			Node n = head;
			while(n.next != null) {
				
				n = n.next;
			}
			
			n.next = node;
			
		}
		
	}

}

  class Node{
	
	   int data;
	   Node next;
	
   }