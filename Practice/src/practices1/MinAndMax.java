package practices1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   List<Integer> arr = Arrays.asList(1,2,3,5,1,2);
  
	    List<Integer> list = arr.stream().sorted().collect(Collectors.toList());
	    
	   list.remove(0);
	   int max = 0;
	   for(Integer i : list) {
		   max = max + i;
	   }
	   List<Integer> list1 = arr.stream().sorted().collect(Collectors.toList());
	   list.remove(list.size()-1);
	   int min = 0;
	   for(Integer i : list1) {
		   min = min + i;
	   }
	    System.out.println(max+" "+min);

	   
	    
	    
	   
	}

}
