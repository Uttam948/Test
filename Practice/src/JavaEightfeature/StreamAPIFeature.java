package JavaEightfeature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPIFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(9);
		list.add(9);
		list.add(9);
		
		 list.stream().collect(Collectors.partitioningBy(p -> p%2 ==0));
		
		for(Integer i : list) {
		//	System.out.println(i);
		}

		int v = 12345;
        Set<Integer> set = new HashSet<>(); 
		
        
		List<Integer> lis = list.stream().filter(n -> !set.add(n) ).collect(Collectors.toList());
		System.out.println(lis);
		
		int n = list.stream().max(Comparator.comparing(Integer :: intValue)).get();
		
		//System.out.println(n);
	}

}
