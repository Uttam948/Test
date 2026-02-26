package leetCode;

import java.util.HashSet;
import java.util.TreeSet;

public class ValidSuduko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //  System.out.println("Jai shri Ram");
          int arr[][] = new int [9][9];
          
          int ar[] = {1,2,4,5};
          
          for(int i =0 ; i<ar.length ; i++) {
        	   
        		  System.out.println(ar[i]);
          }
          
          TreeSet<Integer> set = new TreeSet<>();
          
          
          
          for(int i=0 ; i< arr.length ; i++) {
        	  
        	for(int j =0 ; j<arr.length ; i++) {
        		
        		for(int k = j+1 ; k<arr[j].length ; k++) {
        			
        			if(arr[j][k] != ' ') {
        				
        			}
        		}
        	}
          }
          
	}

}
