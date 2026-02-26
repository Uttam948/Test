package NovermberCoding_2025;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Jan19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int costs[] = {2,2,2};
		int capacity[] = {3,5,4};
		int b = 5;
		Map<Integer , Integer> map = new TreeMap<>();
		
		for(int i =0 ;i <costs.length ; i++) {
			map.put(costs[i], capacity[i]);
		}
		
		int max = 0;
		int sum = 0;
		int sum1 = 0;
		if(map.size() > 1) {
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {

		     sum = sum + m.getKey();
		     sum1 = sum1 + m.getValue();
		     if(m.getKey() < b && sum1 > max) {
		    	 max = sum1;
		     }
		     if(sum < b && sum1 > max) {
		    	 max= sum1;
		     }else {
		    	  sum = sum - m.getKey();
				     sum1 = sum1 - m.getValue();
		     }
		}
		}else {
			for(int i =0 ; i<costs.length ; i++) {
				
				
			}
		}
		
		System.out.println(map);

	}

}
