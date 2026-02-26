package RecurrsionProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LeedCodeCodingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,4};
         
		Map<Integer , Integer> map = new HashMap<>();
		
		for(int i =0 ; i < arr.length ; i++) {
			
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		System.out.println(map);
		int max = 0;
		int count = 0;
	    Map<Integer , Boolean> map1 = new HashMap<>();
		for(Map.Entry<Integer, Integer> i : map.entrySet()) {
			count = 0;
			if(max < i.getValue()) {
				max = i.getValue();
			}
			
			for(int j =1 ; j<=max ; j++) {
				
				if(i.getValue() % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				map1.put(i.getValue(), true);
			}else {
				map1.put(i.getValue(), false);
			}
		}
		System.out.println(map1);
	}

}
