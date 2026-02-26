package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String st= "asfddssdfaassddd";
	
		List<Integer> list = Arrays.asList(10 ,20, 20, 10, 10, 30, 50, 10, 20);
		
		
		Map<Integer , Integer> map = new HashMap<>();
		
		for(Integer i : list) {
			
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		int sum = 0;
		for(Integer j: map.values()) {
			
			int num = j/2;
			sum = sum + num;
		}
		System.out.println(sum);
	   
	}

}
