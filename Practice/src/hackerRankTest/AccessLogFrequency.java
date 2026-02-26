package hackerRankTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AccessLogFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(3, 1, 4, 4, 5, 1, 1, 3);

		Map<Integer , Integer> map = new HashMap<>();
		
		
		 for(Integer i : list) {
			 
			 if(map.containsKey(i)) {
				 map.put(i, map.get(i)+1);
			 }else {
				 map.put(i, 1);
			 }
			 
		 }
		 System.out.println(map);
		 
		Map<Integer , Integer> map1 =   map.entrySet().stream().
				 sorted(Map.Entry.comparingByValue())
				 .collect(Collectors.toMap(Map.Entry :: getKey ,  Map.Entry::getValue
						,(e1,e2) ->e1, LinkedHashMap::new ));
		  
		  List<Integer> list2 = new ArrayList<>(map.values());
		  
		  Map<Integer , Integer> map3  =new TreeMap<>(map);
		  Map<Integer , Integer> map4  =new TreeMap<>(Collections.reverseOrder());
		  map4.putAll(map);
		  System.out.println(map1);
		  System.out.println(map4);
		// System.out.println(map);
		 for(Map.Entry<Integer, Integer> i : map.entrySet()) {
			 
			 
			 
		 }
		
	}

}
