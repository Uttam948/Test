package DataStructure;

import java.util.Stack;

public class Insertion {
	
	Node head;
	Node head1;
	Node head3;
	

		
	public void inserting(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null) {
			head = node;
		}
		else {
			
			Node currNode = head;
			
			while(currNode.next != null) {
			
				currNode = currNode.next;
			}
			
			currNode.next = node; 
			
					
		}
		
		
	}
	
	public void Insertion1(int data) {
		
		Node node = new Node();
		 node.data = data;
		 if(head1 == null) {
			 
			 head1 = node;
		 }else {
			 
			 
			 Node n = head1;
			 
			 while(n.next != null) {
				 
				 n = n.next;
			 }
			 n.next = node;
			 
			 
		 }
		 
		 
	}
	
	public void addFirst(int data) {
		
		Node newNode = new Node();
		newNode.data = data;
		if(head == null) {
			head = newNode;
		}else {
		
		newNode.next = head;
		head = newNode;
		}
	}
	
	public void deleteFirst() {
		
		if(head == null) {
			System.out.println("Empty List");
		}
	   head = head.next;
		
	}
	
	public void swipeNode() {
		
		Node n = head;
		int count = 1;
		Node pre = null;
		while(n!= null) {
			
			if(count % 2 ==0) {
				pre.next = n.next;
			}
			pre = n;
			count++;
			n = n.next;
		}
	}
	
	public void deleteAtGivenKey(int key) {
		
		Node node = head;
		
		while(node.next != null) {
			
			if(node.next.data == key) {
			   node.next = node.next.next;
			}else {
				
				node = node.next;
			}	
			}
			 			
		}
	
	
	public int countElement() {
		Node curr = head;
		int count = 1;
		while(curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}
	
	public void deleteElmentFromGivenPosition(int key) {
		
		Node curNode = head;
		int count = 1;
		while(curNode != null) {
			
			if(count+1 == key) {
				
				curNode.next = curNode.next.next;				
			}else {
				 curNode = curNode.next ;
			}
			count ++;
		}
		
	}
	
	public void mergeTwoLinkedList() {
		
		Node node = head;
		Node node1= head1;
		
		while(node.next != null) {
			
			node = node.next;
		}
		node.next = node1;
	}
	
	/**
	 * 
	 */
	public void addElementLicketList() {
		
		
		Node n = head;
		Node n1 = head1;
		
		
		int carry =0;
		
		while(head != null || head1 != null || carry != 0) {
			int sum = carry;
			if(head!= null) {
				 sum += head.data;
				 head = head.next;
			}if(head1 != null) {
				sum += head1.data;
				head1 = head1.next;
			}
			
	//	int d = head.data + head1.data;
		//stack.push(d);
			carry = sum /10;
		  
			Node node = new Node();
			node.data = sum % 10;
			
			
			
			node.next = head3;
			head3 = node;
		}
		
		 }
	
					 
		public void MergeTwoShortedLinkedList() {
			
			Node n = head;
			Node n1 = head1;
			
			Node node = new Node();
			node.data = 0;
			head3 = node;
			Node n3 = head3;
			
			while(n != null && n1 != null) {
				if(n.data < n1.data) {
					n3.next = n;
					n = n.next;
				}else {
					n3.next = n1;
					n1 = n1.next;
				}
				n3 = n3.next;
			}
		if(n!=null) {
			n3.next = n;
		}
		if(n1!=null) {
			n3.next = n1;
		}
		
			}
			
			public void Reverse() {
				
				Node pre = null;
				Node n = head1;
				Node next = null; 
				
				
				while(n != null) {
					
					next = n.next;
					n.next = pre;
					pre = n;
					n = next;
				}
				
				head1 = pre;
				
			}
	
		
		
	public void show3() {
		
		Node n = head3;
		while(n != null) {
			
			System.out.println(n.data);
			n = n.next;	
		}
		n = new Node();
	  
	}
	public void Shows() {
		Node currNode = head;
		
		while(currNode != null) {
		
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
		 currNode = new Node();	
	}
	
	public void show1() {
		
		Node curNode = head1;
		
		while(curNode != null) {
			
			System.out.println(curNode.data);
			curNode = curNode.next;
		}
		
	//	curNode = new Node();
		
		
	
	}
	
	
}
