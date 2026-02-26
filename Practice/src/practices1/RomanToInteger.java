package practices1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		
		char[] rom = {'I','V','X','L','C','D','M'};
		
		Map<Character , Integer> map = new HashMap<Character , Integer>();
		map.put('I', 1);
		map.put('V', 5);  
		map.put('X', 10); 
		map.put('L', 50); 
		map.put('C', 100); 
		map.put('D', 500); 
		map.put('M', 1000); 
		
		
		
		int sum =0 , con1 = 0;
		char c = 0;
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		
		for(int i=0 ; i<st.length();i++) {
			con1 = 0;
			if(i < st.length()-1 ) {
				 c = st.charAt(i+1);
			}
			
			if(st.charAt(i) == 'I' && c == 'V'  ) {
				  con1 =  map.get('V') - map.get('I');
				  i++;
			}else if(st.charAt(i) == 'I' && c == 'X') {
				con1 =  map.get('X') - map.get('I');
				i++;
			}else if(st.charAt(i) == 'X' && c == 'L' ){
				 con1 = map.get('L') - map.get('X');
				 i++;
			}else if(st.charAt(i) == 'X' && c == 'C' ){
				con1 = map.get('C') - map.get('X');
				i++;
			}else if(st.charAt(i) == 'C' && c == 'D' ){
				con1 = map.get('D') - map.get('C');
				i++; }
			else if(st.charAt(i) == 'C' && c == 'M' ){
				con1 = map.get('M') - map.get('C');
				i++; }
			else {
				sum = sum + map.get(st.charAt(i)) ;
			}
			
			sum = sum + con1;
			
		}
		System.out.println(sum);
		

	}

}
