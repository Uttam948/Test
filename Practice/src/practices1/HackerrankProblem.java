package practices1;

import java.util.HashMap;
import java.util.Map;

public class HackerrankProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "dbgggdeaa";
		
		 Map<Character , Integer> map1 = new HashMap<>();
 for(int i = 0 ; i< str1.length() ; i++){
             
             if(map1.containsKey(str1.charAt(i))){
                map1.put(str1.charAt(i), map1.get(str1.charAt(i))+1);
             }else{
                map1.put(str1.charAt(i), 1);
             }
          }
 
 System.out.println(map1);
	}

}
