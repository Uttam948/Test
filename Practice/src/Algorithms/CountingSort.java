package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,1,3,2,1);
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		Map<Integer , Integer> map = new HashMap<Integer, Integer>();
		
		int k = 0;
		for(Integer i : list) {
			map.put(k , 0);
			k++;
		}
		
		int count = 0;
		for(Integer i : list ) {
			
		     if(map.containsKey(i)) {
		    	 map.put(i, map.get(i)+1);
		     }else {
		    	 map.put(i, 1);
		     }
			
		}
		list1.addAll(map.values());
		System.out.println(list1);

	}

}
