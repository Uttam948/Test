package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    List<String> list = Arrays.asList("uttam","Ram","Amit");
	    
	    String str = "Uttam";
	    
	    for(char i : str.toCharArray()) {
	    	
	    }
	    
    //  str.chars().mapToObj(c -> (char) c).distinct().forEach(System.out::print);
    
	    Map<Character , Long> map = new HashMap<>();
	    
	  //  map = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(n -> n, Collectors.counting()));
	    
	    System.out.println(map);
	    
	    List<String> list2 = Arrays.asList("a","b","b");
	     
	    list = list.stream().sorted(Comparator.comparing(String ::  length)).collect(Collectors.toList());
	    
	    System.out.println(list);
	    
	    
	}

}
