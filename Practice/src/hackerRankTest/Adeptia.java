package hackerRankTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Adeptia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {7,5,3,2,1,6,4};
		int c = 0;
		
		for(int i =0 ;i<a.length ; i++) {
			
			if(i != a[i]) {
				
			}
		}
		
		//System.out.println(c);
		
		String st = "1,1,3,3,5,5,6";
		
		List<String> list = Arrays.asList(st.split(","));
		
		List<String> lists =   list.stream().distinct().collect(Collectors.toList());
	    
		//System.out.print(lists.get(0));
		
		for(String s :lists) {
			//System.out.print(","+s);
			
			
			
				
		}
	}
}

class X {
	
	public void Square() {
		
		int w;
		int h;
	}
	
}

class W {
	
	public void rectangle() {
		
	}
}
	
	











