package Algorithms;


class AVLTreeNode{
	
	int data;
	AVLTreeNode left;
	AVLTreeNode right;
	
	AVLTreeNode(int data){
		this.data = data;
	}
}

class AVLTreeImplementation{
	 
	AVLTreeNode root;
	
	public void BSTimplementation(int data) {
		root = BST(data , root);
	}
	
	public AVLTreeNode BST(int data, AVLTreeNode root) {
		
		if(root == null) {
			root = new AVLTreeNode(data);
		}else if(data < root.data) {
			root.left =BST(data , root.left);
		}else if(data > root.data) {
			root.right =BST(data , root.right);
		}
		
		return root;
	}
	
	
	public void show() {
		preorder(root);
	}
	
	public void preorder(AVLTreeNode root) {
		if(root == null) {
			return;
		}
		
	
		preorder(root.left);
		System.out.println(root.data);
		preorder(root.right);
	}
	
	public int Height() {
		int count = 0;
		if(root == null) {
			return count;
		}
		while(root.left != null || root.right != null) {
			count++;
			if(root.left != null) {
				root = root.left; 
			}
			if(root.right != null) {
				root = root.right;
			}
		}
		return count;
	}
	
}

public class AVLTreeExample {

	public static void main(String[] args) {
	
		
		AVLTreeImplementation AVLTree = new AVLTreeImplementation();
		AVLTree.BSTimplementation(5);
		AVLTree.BSTimplementation(3);
		AVLTree.BSTimplementation(7);
		AVLTree.BSTimplementation(1);
		AVLTree.BSTimplementation(9);
		AVLTree.BSTimplementation(4);
		AVLTree.BSTimplementation(12);
		//AVLTree.show();
		System.out.println(AVLTree.Height());
	}

}
