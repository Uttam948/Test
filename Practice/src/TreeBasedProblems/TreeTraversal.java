package TreeBasedProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Root {
	
	int data;
	Root left;
	Root right;
	
	Root(int data){
		
		this.data = data;
	}
}

public class TreeTraversal {

	 Root root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrp[] = {1,2,3,4,5,6,7,8,9};
		TreeTraversal treeTraversal = new TreeTraversal();
		for(int i =0 ; i<arrp.length ; i++) {
			treeTraversal.Bstimplement(arrp[i]);
		}
       List<List<Integer>> list = new ArrayList<>();
       treeTraversal.levelOrder(list);
       System.out.println(list);
		//treeTraversal.show();
	}
	
	  public void Bstimplement(int data) {
		  
		 root =  Bst(data , root);
	  }
	  
	  public Root Bst(int data , Root root) {
		  
		  if(root == null) {
			  
			  root = new Root(data);
		  }else if(root.data > data) {
			  root.left= Bst(data , root.left);
		  }else if(root.data < data) {
			  root.right = Bst(data , root.right);
		  }
		  
		  return root;
	  }
	
	public void show() {
		
		preOrder(root);
	}  
	
	public void levelOrder(List<List<Integer>> lists) {
		
		Root r = root;
		Queue<Integer> queue = new LinkedList();
		
		if(r != null) {
			queue.add(r.data);
		}
		while( !queue.isEmpty()) {
			
			for(Integer i : queue) {
				
				lists.add(new ArrayList<>(i));
				queue.remove();
			}
			
			if(r.left != null) {
				queue.add(r.left.data);
				r = r.left;
			}
			if(r.right != null) {
				queue.add(r.right.data);
				r = r.left;
			}
		}
	   
	}
	public void preOrder(Root root) {
		
		
		if(root != null) {
			
			
			preOrder(root.left);
			preOrder(root.right);
			System.out.println(root.data);
		}
	}

	
}
