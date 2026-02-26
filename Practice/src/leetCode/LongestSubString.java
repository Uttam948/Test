package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s2 = "abcabcbb";
		String s1 = "bbbbb";
		String s = "pwwkew";
		
		LongestSubString LongestSubString = new LongestSubString();

		LongestSubString.longestSubString(s);
		
	//	System.out.println(LongestSubString.longestSubString(s));
	}

	
	public void longestSubString(String s) {
		
		HashSet<Character> set = new HashSet<>();
		int j = 0;
		int maxlength = 0;
		int maxstart =0;
	    for(int i =0 ;i<s.length() ; i++) {
	    	
	    	char ch = s.charAt(i);
	    	
	    	while(set.contains(ch)) {
	    		
	    		set.remove(s.charAt(j));
	    		j++;
	    		
	    	}
	    	
	    	set.add(ch);
	    	System.out.println(j);
	    	
	    	if(i-j+1 > maxlength) {
	    		maxlength = i-j+1;
	    		maxstart = j;
	    		
	    	}
	    	
	    	System.out.println(maxstart+" "+ maxlength);
	    }
	    
	    
	 //  System.out.println(s.substring(maxstart, maxstart + maxlength));
	    
	    
		
	//	return set.size();
		
	}
}
