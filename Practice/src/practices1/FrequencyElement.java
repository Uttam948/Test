package practices1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "aaabbccbb";
		int count = 1;
		Map<Character , Long> map = new HashMap<>();
		
		
		map = st.chars().mapToObj(c -> (char)c).
		collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		
	
		char []s = st.toCharArray();
		
		int []a = new int[st.length()];
		
		int visited = -1;
		int k =0;
		
		char []b = new char[st.length()];
		
		for(int  i = 0 ; i<st.length() ; i++) {

			a[i] = 1;
			for(int j = i+1 ; j<st.length() ;j++) {
				
				if(s[i] == s[j]) {
					
				     a[i] ++ ;
					s[j] = '0';
				}
			}
		}
		
		for(int i =0 ;i<a.length ; i++) {
			
			if(s[i] != '0' ) {
				//System.out.print(a[i]);
			}
		}
		
		System.out.println(map);
		
		}
		
		

	


}
