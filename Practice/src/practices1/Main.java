package practices1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        System.out.println(sum(false,Arrays.asList(1,2,3,4,5,6,7,8,9,10))); //30
		        System.out.println(sum(true, Arrays.asList(5,3,4,6,6,9,0)));//17
		    }
		    
		    public static long sum(boolean flag, List<Integer> numbers){
		       // Todo: Add the logic here
		    	long sum =0 ;
		    	List<Integer> num = new ArrayList<>();
		    	
		    	
		    	if(flag == false) {
		    		
		    	 	num = numbers.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
		    	 		
		    	}if(flag == true) {
		    		
		    	 	num = numbers.stream().filter(p -> p % 2 != 0).collect(Collectors.toList());
		    	}
		    	
                
		    	System.out.println(num);
		    	for(Integer i : num) {
		    		
		    		 sum = sum + i;
		    		
		    	}
		    	
		        return sum;
		    }

	

}
