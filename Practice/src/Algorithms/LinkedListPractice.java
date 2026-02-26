package Algorithms;

 class TreeNode{
	 int data;
	 TreeNode left;
	 TreeNode Right;
	 
	 TreeNode(int data){
		 this.data = data;
	 }
	 
 }
class TreeImplementation{
	
     TreeNode root;
     
     public void implementation(int data) {
    	 
    	root = BST(root , data);
     }
     
     public TreeNode BST(TreeNode root , int data) {
    	 
    	 
    	 if(root == null) {
    		 root = new TreeNode(data);
    	 }else if(data < root.data) {
    		 root.left = BST(root.left , data);
    	 }else if(data > root.data) {
    		 root.Right = BST(root.Right , data);
    	 }
    	 
    	 return root;
     }
     
     public void show() {
    	 preOrder(root);
     }
     public void preOrder(TreeNode root) {
    	 if(root == null) {
    		 return ;
    	 }
    	 
    	 preOrder(root.left);
    	 preOrder(root.Right);
      	 System.out.println(root.data);
     }
}

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hai");
		
		TreeImplementation treeImplem = new TreeImplementation();
		treeImplem.implementation(1);
		treeImplem.implementation(2);
		treeImplem.implementation(3);
		treeImplem.implementation(4);
		treeImplem.implementation(5);
		treeImplem.show();
	}

}
