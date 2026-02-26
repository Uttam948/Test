package NovermberCoding_2025;

public class Jan28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //String str1 = "Abc 012..##  10cbA";
		   
	//String str = "ccabaghjcv"	;
	String str = "aacabdkacaa";
	
	
		//  System.out.println(checkPelindrome(str ,0,  str.length()-1 , 1 , 0));
	
	int arr[][] = new int[5][5];
	
	int val = (int) arr[5-1][5-1];
	
	System.out.println(val);
		  
	}
	
	public static int  checkPelindrome(String str , int i  , int j , int count ,  int max) {
	
	while(i < str.length()) {
		while(i <= j) {
			if(str.charAt(i) == str.charAt(j)) {
				i++; j--;
				count++;
			}
			j--;
		}
		if(max < count) {
			max = count;
			
		}
		i++;
	}
		return max;
	}

}
