package NovermberCoding_2025;

public class Feb05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr[] = {3 , -2 , 1, 1};
		int newarr[] = new int[arr.length];
		int k =0;
		for(int i =0 ; i<arr.length ; i++) {
			
			int mod = arr[i] % arr.length;
			int plus = mod + i;
		
	        if(plus >= 0 && plus <= arr.length-1) {
	        	newarr[i] = arr[plus];
	        	//System.out.println(i);
	        }else if(plus < 0) {
	         int b = arr.length + plus;
	         newarr[i] = arr[b];
	         //System.out.println(i);
	        }else if(plus > arr.length-1) {
	        	int m = plus-arr.length;
	        	newarr[i] = arr[m];
	        	//System.out.println(m);
	        }
	
			
			
			
		}
		
		for(int i =0 ; i<newarr.length ; i++) {
			System.out.println(newarr[i]);
		}
	}

}
