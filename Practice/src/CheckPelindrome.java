import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.xml.stream.events.Characters;

public class CheckPelindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//String str = "abc123cba";
		int count = 0 , count1 = 0;
		
		 String str = "aabcdeffghhttuvrrf";
		 
		 Set<Character> set = new HashSet<>();
		 
	    str.chars().mapToObj(c -> (char) c).filter( n -> !set.add(n)).forEach(System.out :: print);
		
		for(int i =0 ; i< str.length()/2 ; i++) {
			
			if(Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(str.length()-1-i))) {
				
				
				if(str.charAt(i) == str.charAt(str.length()-i-1)) {
					count++;
				}
				count1++;
			//	System.out.println(str.charAt(i) +" "+ str.charAt(str.length()-i-1));
			}
		}
		
		//System.out.println(count + " " + count1);
		
		
	}

}
