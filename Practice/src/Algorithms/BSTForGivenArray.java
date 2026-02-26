package Algorithms;


class BSTRoot{
	
	int data;
	BSTRoot left;
	BSTRoot right;
	BSTRoot(int data){
		
		this.data = data;
	}
}

public class BSTForGivenArray {
      
	BSTRoot root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {4,5,6,3,1,2,9,8};
		
		BSTForGivenArray bstForGivenArray = new BSTForGivenArray();
		
		for(int i = 0;i <arr.length ; i++) {
			
			bstForGivenArray.insert(arr[i]);
		}
			
			bstForGivenArray.show();
		
		
	}
	
	public void insert(int data) {
		
		root = insertrec(root,data);
	}
	
	public BSTRoot insertrec(BSTRoot root, int data) {
		
            if(root == null) {
			
			root =new BSTRoot(data);
			
		}else if(data < root.data) {
			
			root.left = insertrec(root.left , data);
			
		}else if(root.data < data) {
			
			root.right = insertrec(root.right , data);
		}
            
            return root;
	}
	
	public void show() {
		
		preorder(root);
	}
	
	public void preorder(BSTRoot root) {
		
		if(root != null) {
			
			
			preorder(root.left);
			System.out.println(root.data);
			preorder(root.right);
			
		}
		
	}

}
