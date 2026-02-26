package NewPractice;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String num1 = "123";
       String num2 = "456";
       int l = 0;
       int k =0;
        int sumfinal = 0;

 	   int arr[][] = new int[num1.length()-1][num2.length() + num1.length()];
       for(int i = num1.length()-1; i>= 0 ; i--) {
    	   int carry = 0;
    	   int j = 0;
    	   int m = arr.length-1;
    	   int sum = 0;
    	   if(i < num1.length()-1) {
    		   m = m-l-1;
    		   l++;
    	   }
    	   for( j = num2.length()-1; j>=0 ; j--) {
    		   
    		   int val1 = num1.charAt(i) - '0';
    		   int val2 = num2.charAt(j) - '0';
    		   int mul = val1 * val2 + carry;
    			 arr[k][m] = mul%10;
    		   carry = mul /10;
    		   m--;   
    	   }
    	   arr[k][m] = carry;
    	   k++;
    	   sumfinal = sumfinal  + sum;
       }
       
       for(int i = 0 ; i<num1.length()-1 ; i++) {
    	   for(int j =0 ;j<num2.length() + num1.length();j++) {
    		   System.out.println(arr[i][j]);
    	   }
       }
	}

}
