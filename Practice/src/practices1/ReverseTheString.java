package practices1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st  = "aaabbbbsss";
	//	int p = st.length()-1;
		
		char[]a = st.toCharArray();
		
		int  i=0 , j=0;
		
		HashMap<Integer , String> maps = new HashMap<>();
		
		maps.put(1, "Uttam");
		maps.put(2, "Tulika");
		
		//Stream<Entry<Integer, String>> st1 = maps.entrySet().stream().filter(p -> p.getKey() == 1);
				
             
		
		
		
		List<Character> list = Arrays.asList('a','a','b','b','b','s');
		
		List<char[]> list3 = Arrays.asList(a);
		
		 List<Integer> list2 = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5); 
		
		// list.stream().distinct().forEach( n-> System.out.println(n));
	    
	      
	      
	      

	}

}
