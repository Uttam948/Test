package TreeBasedProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLevelOrderTraversalPractice {
    
	static Root root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeLevelOrderTraversalPractice treeLevel = new TreeLevelOrderTraversalPractice();
		System.out.println(treeLevel.levelOrder(root));
		
	}
	
	public List<List<Integer>> levelOrder(Root root){
		
		List<List<Integer>> list = new ArrayList<>();
		Queue<Root> queue = new LinkedList<>();
		
		if(root == null) {
			return list;
		}
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			List<Integer> list1 = new ArrayList<>();
			Root root1 = queue.peek();
			int num = queue.size();
			for(int i =0 ; i<num ; i++) {
			if(root1.left != null) {
				queue.add(root1.left);
				list1.add(root1.data);
			}else if(root1.right != null) {
			    queue.add(root1.right);
				list1.add(root1.data);
			}
			}
			list.add(list1);
		}
		
		return list;
		
	}

}
