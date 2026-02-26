package DataStructure;


class TreeNode{
	
	int data;
	TreeNode left , right;
	
}

public class BinaryTree {
	
	TreeNode root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.InsertingTreeData(2);
		binaryTree.InsertingTreeData(4);
		binaryTree.InsertingTreeData(5);
	}
	
	public void InsertingTreeData(int data) {
		
		TreeNode treeNode = new TreeNode();
		treeNode.data = data;
		
		if(root == null) {
			
			root = treeNode;
		}else if(root.left == null) {
			
			root = root.left = treeNode;
		}else {
			
			root = root.right = treeNode;
		}
		
		System.out.println(treeNode.data);
			
		}
		

}





