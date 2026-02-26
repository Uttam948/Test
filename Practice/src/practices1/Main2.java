package practices1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		String s1 = "CREAT";
		String s2 = "REACT";
		
		List<String> list = Arrays.asList(s1);
		List<String> list2 = Arrays.asList(s2);
		
	//list.stream().distinct().sorted().collect(Collectors.toList());
	// list2.stream().distinct().sorted().collect(Collectors.toList());
	  
	list.stream().distinct();
	  list2.stream().distinct();
	  
	  for(String i : list) {
		  
		  for(String j : list2) {
			  
			  if(i == j) {
				  
				  list.remove(i);
			  }
		  }
	  }
	  
	  System.out.println(list +" "+ list2);
	  
	
}
}