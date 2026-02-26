package DataStructure;


class AVLNode{
	
	 int data;
	 AVLNode left;
	 AVLNode right;
	 int height = 1;
	 AVLNode(int data){
		 this.data = data;
		 left = null;
		 right = null;
		 height = 1;
	 }
	
}

public class AVLTreeImplementation {

	static int Height(AVLNode N) {
		
		if(N == null) {
			return 0;
		}
		return N.height;
	}
	
	
	
	static AVLNode RightRotation(AVLNode y) {
		
		AVLNode x = y.left;
		AVLNode t2 = x.right;
		
		x.right = y;
		y.left = t2;
		
		y.height = 1 + Math.max(Height(y.left), Height(y.right));
		x.height = 1 + Math.max(Height(y.left), Height(y.right));
		
		return x;
	}
	
	static AVLNode LeftRotation(AVLNode x) {
		
		AVLNode y = x.right;
		AVLNode t2 = y.left;
		
		y.left = x;
		x.right = t2;
		
		x.height = 1 + Math.max(Height(x.left), Height(x.right));
		y.height = 1 + Math.max(Height(x.left), Height(x.right));
		
		return y;
	}
	
	static int getBalance(AVLNode N) {
		
		if(N == null) {
			return 0;
			
		}
		return Height(N.left) - Height(N.right);
	}
	

	
	static AVLNode insertion(AVLNode node , int data) {
		
		if(node == null) {
	         return new AVLNode(data);
		}else if(node.data  > data) {
			node.left = insertion(node.left , data);
		}else if(node.data < data) {
			node.right = insertion(node.right , data);
		}else {
			return node;
		}
		
		node.height = 1+Math.max(Height(node.left), Height(node.right));
		int balance = getBalance(node);
		
		if(balance > 1 && data<node.left.data) {
			return RightRotation(node);
		}
		if(balance < -1 && data>node.right.data) {
			return LeftRotation(node);
		}
		
		if(balance > 1 && data>node.left.data) {
			node.left = LeftRotation(node);
			return RightRotation(node);
		}
		
		if(balance < -1 && data>node.right.data) {
			node.right = RightRotation(node);
			return LeftRotation(node);
		}
		
		return node;
	}
	
	static void preOrder(AVLNode node) {
		
		if(node != null) {
			System.out.print(node.data + " ");
			preOrder(node.left);
			
			preOrder(node.right);
		}
	}
	
	static void inOrder(AVLNode node) {
		
		if(node != null) {
		
			preOrder(node.left);
			System.out.print(node.data + " ");
			preOrder(node.right);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVLNode root = null;
		
		root = insertion(root, 13);
		root = insertion(root, 10); 
        root = insertion(root, 20); 
        root = insertion(root, 30); 
        root = insertion(root, 40); 
        root = insertion(root, 50); 
        root = insertion(root, 25); 
		
        
        System.out.println("AVL tree with preOrder implementation");
		preOrder(root);
		System.out.println();
		  System.out.println("AVL tree with inorder implementation");
			inOrder(root);
		
	}

}
