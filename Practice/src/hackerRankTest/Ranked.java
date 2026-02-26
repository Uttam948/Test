package hackerRankTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

public class Ranked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ranked =  Arrays.asList(100, 90, 90, 80, 75, 60);

		List<Integer> player =  Arrays.asList(50, 65, 77, 90, 102);
		
		Set<Integer> set = new HashSet<>(ranked);
		
		
	//	System.out.println(set);
		
	//	Collections.reverse(ranked);
		
		ranked = ranked.stream().distinct().collect(Collectors.toList());
		
		List<Integer> list = new ArrayList<>();
		
		for(Integer i : player) {
			
			ranked.add(i);
			Collections.sort(ranked);
			Collections.reverse(ranked);
			
			int n = ranked.indexOf(i)+1;
		    list.add(n);
		}
		
		
		
		Map<Integer , Integer> map = new HashMap<>();
	
		
		for(Entry<Integer, Integer> i : map.entrySet()) {
			
			
		}
		
		//System.out.println(n);
		
		// this can be perform by binary search Algorithm 
	}
	
	public static void Binary(int item , List<Integer> rank) {

	}

}
