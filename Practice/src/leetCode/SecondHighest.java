package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,4,2,6,5,2,1,0};
		 
		System.out.println(secondHighest(a));
		

	}

	public static int secondHighest(int a[]) {
		
		
		List<Integer> list = new ArrayList<>();
		
		
		int max = 0;
		int second = 0;
		
		for(Integer i : a) {
			
			if(i > max) {
				
				max = i;
			}
			if(i > second && i < max) {
				
				second = i;
			}
		}
		
		return second;
	}
}
