package leetCode;

public class AddElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4};
		int leftarr[] = new int[arr.length];
		int rightarr[] = new int[arr.length];
		leftarr[0] = 1;
		int mul = 1;
		for(int i =0 ; i < arr.length-1 ; i++) {
			
			mul = mul * arr[i];
			
			leftarr[i+1] = mul;
			
		}
		mul = 1;
		rightarr[arr.length-1] = 1;
		for(int i =arr.length-1 ; i >0 ; i--) {
			
			mul = mul * arr[i];
			rightarr[ i - 1] = mul;
		}
		
		for(int i =0 ; i < rightarr.length ; i++) {
			
			System.out.println(leftarr[i] * rightarr[i]);
		}
		

	}

}
