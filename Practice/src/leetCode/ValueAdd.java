package leetCode;

public class ValueAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[10];
		
		for(int i =0 ; i<10 ; i++) {
			int arrr[] = valueadd(arr , i);
			System.out.println(arrr[i]);
		}
		
		
	}

	public static int[] valueadd(int arr[] , int j ) {
		arr[j] = j;
		return arr ;
		
	}
}
