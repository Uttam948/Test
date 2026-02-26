package hackerRankTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StudentRank {
    
	String[] students  = {"Alex" , "Chris" ,"Sam", "uttam"};
	
	int[] ranks = new int[]{-1,-5,-2,-3};

	public static void main(String[] args) {
		
		String[] students  = {"Alex" , "Chris" ,"Sam", "uttam"};
		
		int[] ranks = new int[]{-1,-5,-2,-3};
		
		int[] rank = new int[ranks.length];
		for(int i=0 ; i<ranks.length ; i++) {
			ranks[i] = Integer.valueOf(ranks[i]).intValue();
		}
		
		
		StudentRank sr = new StudentRank(students , rank);
		
		System.out.println(sr.highestRank() + " , " + sr.lowestRank());
		
	}

	Map<Integer , String> map = new HashMap<Integer , String>();
	List<String> list = new ArrayList<>();
	public StudentRank(String[] student, int[] rank) {
		student = students;
		rank = ranks;
		
		int low , high;
		for(int i =0 ; i< rank.length ; i++ ) {
			map.put(rank[i], student[i]);
		}	

		list.addAll(map.values());
		//System.out.println(list);	
	}
	private String lowestRank() {		
		return list.get(0);
	}
	private String highestRank() {	
		return  list.get(map.size()-1);
	}
	
}