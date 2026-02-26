package leetCode;

import java.util.ArrayList;
import java.util.List;

public class SubstringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		String st = "";
		String []words = {"ab","cd","ef"};
     	permutation( words, list , st);
     //	System.out.println(words.length);
	}
	
	public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        return list;
    }
	
	public static void permutation(String[] words , List<String> str , String st) {
		
		if(words.length ==0) {
			str.add(st);
			System.out.println(str);
			return;
		}
		
		for(int i = 0;i<words.length ; i++) {
			String strr = words[i];
		    String arr[] = new String[words.length-1];
		    for(int j = 0 ; j<words.length-1 ; i++) {
		    	arr[j] = words[j+1];
		    }
			permutation(arr , str , st+strr);
			
		}
	}
	

}
