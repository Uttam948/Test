package practices1;

public class RecursionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursion(5);
	}
	
	public static void recursion(int n) {
		
		if(n == 0) {
			return;
		}
		
		for(int i =0 ;i<n;i++) {
			System.out.print(i);
			recursion(n-1);
			System.out.println();
		}
	}

}
