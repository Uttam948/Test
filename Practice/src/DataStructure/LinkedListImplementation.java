package DataStructure;

import java.util.Scanner;

public class LinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Runner runner = new Runner();
		runner.insert(1);
		runner.insert(2);
		runner.insert(3);
		runner.insert(4);
	//	runner.insertfirst(5);
	//	runner.circularLinkedList(2);
		
		runner.show();
		}
	}

class Runner{
	
	Node head;
	
	
	public void insert(int data) {
		
		
		Node node = new Node();
		node.data = data;
		
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
	
	public void insertfirst(int data) {
		
		Node node = new Node();
		node.data = data;
		//node.next = null;
		node.next = head;
		head = node;
		
		
		
		
	}
	
	public void circularLinkedList(int key) {
		
		Node node = head;
	    Node n = head;
		while(node.next != null) {
			node = node.next;	
		}
		node.next = n;	
		}
	
	
		
		
	
	public void show() {
		
		Node node = head;
		
		while(node.next != null) {
			
			System.out.println(node.data);
			node = node.next;
		}
		
		System.out.println(node.data);
			
	}
}