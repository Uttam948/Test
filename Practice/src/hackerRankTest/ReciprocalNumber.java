package hackerRankTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReciprocalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double b = 0.1/8;
		
		int arr[][] = {{1,2},{3,4},{4,5} ,{4,5}, {4,5},{1,2}};
		
		int arr1[] = new int[arr.length];
		
		Map<Integer,Integer> map = new HashMap<>();
		
	//	Set<Integer> set = new HashSet<>();
		
		
		for(int i = 0; i<arr.length-1 ; i++) {
			
			int count=1;
			for(int j = i+1; j< arr.length;j++) {
			if(arr[i][0] == arr[j][0] &&arr[i][1] == arr[j][1] ) {
				count ++;
				arr[j][0]= 0;
				arr[j][1] = 0;
			}
			} 
			arr1[i] = count;
			
		}
		
		int c = 0;
		
        for(int i =0 ; i<arr.length ; i++) {
        	if(arr[i][0] != 0 && arr[i][1] != 0) {
        	//	c++;
        		if(arr1[i] >=2 ) {
        			c++;
        		}
        	}
        	
        }
        System.out.println(c);

    //    System.out.println(c);
	}

}
