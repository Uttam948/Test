package RecurrsionProblems;

import java.util.ArrayList;
import java.util.List;

public class PermutationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[] = {1,2,3,4};
          List<Integer> list = new ArrayList<>();
          String str = "He is a good boy";
          String st[] = str.split(" ");
       //   System.out.println(str.length());
         // System.out.println(st.length);
          for(int i =0 ;i<st.length ; i++) {
        	//  System.out.print(st[i]);
          }
         // System.out.println(recur(6));
          reverse(arr , 0 , arr.length-1);
          for(int i =0 ; i <arr.length ; i++) {
        	  System.out.println(arr[i]);
          }
	}
	
	public static void subsequence(int arr[] , int idx , List<Integer> list) {
		
		
	}
	
	public static int[] reverse(int arr[] , int start , int end) {
		
		if(end < start) 
		{ 
			return arr;
		}
			int temp = arr[start];
	     	arr[start] = arr[end];
	    	arr[end] = temp;
	       return reverse(arr, start +1, end -1);
	}
	
	public static int recur(int n) {
		
		if(n <= 1) {
			//System.out.println(n);
			return n ;
		}
		
		return recur(n-1) + recur(n-2);
	}
	
	public static void recursion(int arr[] , List<Integer> list) {
		
		
		
	}

}
