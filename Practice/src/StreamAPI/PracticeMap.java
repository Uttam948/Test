package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PracticeMap {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer , String> linkedmap = new TreeMap<>();
		
		Set<Integer> set = new TreeSet<>();
	
		List<String> list = Arrays.asList("sad","sdfsdfs","s","sd","sdfsdf");
		
	
		for(String s : list) {
			
			//set.add(s.length());
			linkedmap.put(s.length(), s);
		}
		
        for(Map.Entry<Integer , String> i : linkedmap.entrySet()) {
        
        	
        }
		
   Optional<Object> st = linkedmap.entrySet().stream().max(Map.Entry.comparingByKey()).map(Map.Entry :: getValue);
   
   System.out.println(st.get());
   
		System.out.println(linkedmap);
	}

}
