package TreeDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


class TreeNode{
	
	int data;
	TreeNode left;
	TreeNode Right;
	
	TreeNode(int data){
		this.data = data;
	}
}

public class LevelOrderTraversal {

	static TreeNode root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
		levelOrderTraversal.TreeImplementation(14);
		levelOrderTraversal.TreeImplementation(13);
		levelOrderTraversal.TreeImplementation(15);
		levelOrderTraversal.TreeImplementation(11);
		levelOrderTraversal.show();
	System.out.println(levelOrderTraversal.levelOrderTraversal(root));
	levelOrderTraversal.IteratElementPreorder(root);
		
	}

	public void TreeImplementation(int data) {
		
	root = BSTimplementation(data , root);
	}
	
	public TreeNode BSTimplementation(int data , TreeNode root) {
		
		if(root == null) {
		    root = new TreeNode(data);
		}else if(data > root.data) {
			root.Right = BSTimplementation(data , root.Right);
		}else if(data < root.data) {
			root.left = BSTimplementation(data , root.left);
		}
		return root;
	}
	
	public void show () {
		preorder(root);
	}
	
	public void preorder(TreeNode root) {
		
		if(root != null) {
			System.out.println(root.data);
			preorder(root.left);
			
			preorder(root.Right);	
		}
	}
	
	public List<List<Integer>> levelOrderTraversal(TreeNode root){
		  
		  List<List<Integer>> bigList = new ArrayList<>();
		  Queue<TreeNode> queue = new LinkedList<>();
		  
		  if(root == null) {
			  return bigList;
		  }
		  queue.offer(root);
		  
		  while(!queue.isEmpty()) {
			  
			  List<Integer> list = new ArrayList<>();
			  int num = queue.size();
			  for(int i =0 ;i<num ; i++) {
			  if(queue.peek().left != null) {
				  queue.offer(queue.peek().left);
			  }
			  if(queue.peek().Right != null) {
				  queue.offer(queue.peek().Right);
			  }
			  list.add(queue.poll().data);
		  }
		 
		  bigList.add(list); 
		  }
		  
		  return bigList;
		  
	  }
	
	public void IteratElementPreorder(TreeNode root) {
		
		Stack<TreeNode> stack = new Stack<>();
		if(root == null) {
			System.out.println("Please intsert the data");
		}
		stack.add(root);
		while(!stack.isEmpty()) {
			TreeNode ro= stack.peek();
			System.out.println(ro.data);
			stack.pop();
			 if(ro.Right != null) {
		    	   stack.add(ro.Right);
		    	  // System.out.println(stack.peek().data);
		       }
			if(ro.left != null) {
				stack.add(ro.left);
				// System.out.println(stack.peek().data);
			}
			//stack.pop();
		}
		
	}
}
