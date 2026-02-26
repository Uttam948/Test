package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombinationPhoneNumber {
	
	
	public static List<String> recursion (int n , List<String> list , List<String> list2){
		
		List<String> list3 = new ArrayList<>();
		
		if(n == list.size()) {
			
			return list2;
		}
		
		if(list2.isEmpty()) {
		for(int i =0 ;i<list.get(n).length() ; i++) {
			
			  list3.add(String.valueOf(list.get(n).charAt(i)));
		
		}
		   return recursion(n+1 , list , list3);
	
	}else {
		for(int j = 0 ;j< list2.size() ; j++) {
			for(int i =0 ;i<list.get(n).length() ; i++ ) {

				StringBuilder sb = new StringBuilder();
		sb = sb.append(list2.get(j)).append(list.get(n).charAt(i));
			list3.add(sb.toString());
			
			}
		}
		}
		return recursion(n+1 , list , list3);
	}

		 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(letterCombinations("234"));

	}

	 public static List<String> letterCombinations(String digits) {
	     
		 List<String> list = new ArrayList<>();
		 List<String> list2 = new ArrayList<>();
	        Map<Character, String> map = new HashMap<>();
	        map.put('2',"abc");
	        map.put('3',"def");
	        map.put('4',"ghi");
	        map.put('5',"jkl");
	        map.put('6',"mno");
	        map.put('7',"pqrs");
	        map.put('8',"tuv");
	        map.put('9',"wxyz");

	       for(int i =0 ; i<digits.length() ; i++){
	              
	              list.add( map.get(digits.charAt(i)));
	              
	       }
	       
	       return recursion(0 , list ,list2 );

	       
	    }
}
