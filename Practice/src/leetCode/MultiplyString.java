package leetCode;

public class MultiplyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "123";
		String str2 = "456";
		int arrfinal[] = new int[str1.length() + str2.length()];
	     int cary = 0;
		int  l = 1;
		  for(int i = str1.length()-1; i>= 0 ; i--) {
	    	   int carry = 0;
	    	  // int j = 0;
	    	   int arr[] = new int[str1.length() + str2.length()];
	    	   int m = arr.length-1;
	    	   Long sum = 0L;
	    	   if(i < str1.length()-1) {
	    		   m = m-l;
	    		   l++;
	    	   }
	    	 
	    	   for(int j = str2.length()-1; j>=0 ; j--) {
	    		   
	    		   int val1 = str1.charAt(i) - '0';
	    		   int val2 = str2.charAt(j) - '0';
	    		   int mul = val1 * val2 + carry;
	    			   arr[m] = mul%10;
	    		   carry = mul /10;
	    		   m--;
	    		   
	    	   }
	    	 
	    	   arr[m] = carry;
		
			for(int k = arr.length-1 ; k>=0 ; k--) {
				System.out.print(arr[k]);
				int mul = arrfinal[k] + arr[k] + cary;
				cary = 0;
				arrfinal[k] = mul % 10;
				cary = mul /10;
			}
		
			System.out.println();
		}
		  
		  StringBuilder st = new StringBuilder();
		for(int i =0  ; i <arrfinal.length ; i++) {
				//st.append(arrfinal[i]);
		}
		int h = 0;
		if(arrfinal[0] == 0) {
			h = 1;
		}
		while(h < arrfinal.length) {
			st.append(arrfinal[h]);
			h++;
		}
		
		System.out.println(st);
	}

}
