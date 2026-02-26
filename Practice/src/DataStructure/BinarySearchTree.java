package DataStructure;

import java.util.ArrayList;
import java.util.List;

interface BinarySearchTreeMethods{
	
	public void BSTimplementation(int data);
	
	public void show();
	
	public int height(BinaryTreeNode root);
	

}
class BinaryTreeNode{
	
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int data){
		this.data = data;
	}

}
public class BinarySearchTree implements BinarySearchTreeMethods{
  
	static BinaryTreeNode root;
	static int left = 0;
	static int right = 0;
	 int count = 0;
	
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeMethods binarySearchTreeMethods = new BinarySearchTree();
		binarySearchTreeMethods.BSTimplementation(12);
		
	//	BinarySearchTree BinarySearchTree = new BinarySearchTree();
		//BinarySearchTree.BSTimplementation(12);
		binarySearchTreeMethods.BSTimplementation(13);
		binarySearchTreeMethods.BSTimplementation(2);
		binarySearchTreeMethods.BSTimplementation(1);
		binarySearchTreeMethods.BSTimplementation(5);
		binarySearchTreeMethods.BSTimplementation(8);
		binarySearchTreeMethods.BSTimplementation(9);
		
	//	System.out.println(left+"  "+right);
		
		binarySearchTreeMethods.show();
		System.out.println(binarySearchTreeMethods.height(root));
		
	}
	
	@Override
	public void BSTimplementation(int data) {
		
      
    	   root = BSTrec(root , data);
    	   
    	   if(root.left == BSTrec(root.left , data)) {
    		   left++;
    	   }else if(root.right == BSTrec(root.left , data)) {
    		   right++;
    	   }
    	   
    
	}
	 
	
	private BinaryTreeNode BSTrec(BinaryTreeNode root, int data) {
		
		if(root == null) {
		 
			root = new BinaryTreeNode(data);
			
		}else if(root.data > data) {
			root.left = BSTrec(root.left , data);
			
		}else if(root.data < data){
			root.right = BSTrec(root.right , data);
		}
		height(root);
		return root;
	}
	
	  @Override
      public int height(BinaryTreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int height = Math.max(height(root.left) , height( root.right));
	   return height+1;
	}
	
	@Override
	public void show() {
		
		inorderrec(root);
	}

          
	
	public void inorderrec(BinaryTreeNode root) {
		
		if(root != null) {
			
			inorderrec(root.left);
			System.out.println(root.data);
			inorderrec(root.right);
			
		}
	}
	
	public void preOrderrec(BinaryTreeNode root) {
		
		if(root != null){
			
			System.out.println(root.data);
			preOrderrec(root.left);
			preOrderrec(root.right);
			
		}
	}
	
public void postOrderrec(BinaryTreeNode root) {
		
		if(root != null){
			
			
			preOrderrec(root.left);
			preOrderrec(root.right);
			System.out.println(root.data);
			
		}
	}

}








