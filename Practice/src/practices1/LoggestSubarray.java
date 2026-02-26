package practices1;

import java.util.ArrayList;
import java.util.List;

public class LoggestSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> a = new ArrayList<>();
		a.add(0);
		a.add(2);
		a.add(2);
		a.add(5);
		a.add(5);
		a.add(1);
		
		
		LoggestSubarray loggestSubarray = new LoggestSubarray();
		
		loggestSubarray.LengthLoggestSubarray(a);
	}

	public void LengthLoggestSubarray( List<Integer> a) {
		
		int b[] = new int[a.size()];
		
		for(int j =0 ;j <a.size() ; j++) {
		int count = 1;
			
		for(int i =j+1 ;i <a.size() ; i++) {
			
	          if(a.get(j) == a.get(i)) {
	        	 count++; 
	          }
		}
		b[j] = count;
	
		}
		
		
		
		
	}
}
