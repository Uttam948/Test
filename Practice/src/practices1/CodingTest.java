package practices1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CodingTest {
	
	public static void main(String agr[]) {
		
        Scanner sc = new Scanner(System.in);
      //  int n = sc.nextInt();
        int firstValue = 0 ,  secondValue = 0 , bigDifference = 0 , oldDifference =0;
        	int	value = 0;
        	char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l'
        			,'m','n','o','p','q','r','s','t','u','v','x','y','z'};
        	
		List<List<Integer>> leaveTimes = new ArrayList<>();
		
		List<Integer> leaveTime = Arrays.asList(0,2);
		List<Integer> leaveTime1 = Arrays.asList(1,3);
		List<Integer> leaveTime2= Arrays.asList(5,7);
		leaveTimes.add(leaveTime);
		leaveTimes.add(leaveTime1);
		leaveTimes.add(leaveTime2);
		
		
	    System.out.println(leaveTimes);
	    
	    
	     for(List<Integer> integer : leaveTimes) {
	    
	    		  secondValue = integer.get(1);
	    	
	    	if(firstValue > 0) {
	        oldDifference = secondValue - firstValue ;
	    	}
	    	firstValue = secondValue;
	    	
	    	if(bigDifference <  oldDifference)
	    	{
	    		bigDifference  = oldDifference;
	    		value = integer.get(0);
	    	}
	    	}
	     
	     System.out.println(alpha[value]);
	     }
	  

}

