package practices1;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {9};
		//int arr[] = {9,8,9};
		int emrr[] = new int[arr.length+1];
		int n = arr.length-1;
		int m = arr.length;
		int num = 0;
		int carry = 1;
		//int i =0;
	    
		for(int i = arr.length-1 ; i>= 0 ; i--)
		{
			 num = arr[i] + carry;
			 
			arr[i] = num % 10;
			carry = num /10;
		}
	
		  if(carry > 0) {
			  
			  emrr[0] = carry;
			  System.arraycopy(arr, 0, emrr, 1, arr.length);
			  arr = emrr;
		  }
        		
           for(int i =0 ; i<arr.length ; i++) {
        	   
        	  System.out.println(arr[i]);
           }
	}

}
