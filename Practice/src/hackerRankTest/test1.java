package hackerRankTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		int arr[] = {0,3,2,1,4};
		Arrays.sort(arr);
		int val = 0;
		int n = arr.length;
		int k = 0;
		
	    //  List<Integer> list = new ArrayList<>();
	      
	      Map<Integer, Integer> map = new HashMap<>();
	      
	      for(int i =1 ;i<=arr.length ; i++) {
	    	  
	    	  map.put(i, arr[k]);
	    	  k++;
	      }
	      
			//System.out.println(map);	
	      A a = new B();
	      System.out.println(a.add(5,6));
	      A a1 = new C();
	      System.out.println(a1.add(2,3));
	      
	}

}

abstract class A{
	
	abstract int add(int a , int b);
}

   class B extends A{
	
	  @Override
	  int add(int a , int b) {
		  
		  int c = a + b;
		return c; 
	 }
	
}
   class C extends A{

	@Override
	int add(int a, int b) {
		int c = a*b;
		return c;
	}
	   
	   
   }
