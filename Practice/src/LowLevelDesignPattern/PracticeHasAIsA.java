package LowLevelDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeHasAIsA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer> list = Arrays.asList(3,4,5,2,1,1);
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		int target = 4;
		int count = 0;
		
		List<Integer> list1 = new ArrayList<>();
		
		
		
		
		for(Integer i : list) {
			
			 for(int j = list.size()-1 ; j > list.indexOf(i) ;j--) {
				 
				 if(!list1.contains(list.get(j))) {
					 if(i > list.get(j) && i-list.get(j) == target) {
						 count++;
						// System.out.println(i);
					 }else if(i < list.get(j) && list.get(j)-i == target){
						 count++;
						// System.out.println(i);
					 }
					 
				 }
				 list1.add(list.get(j));
			 }
			 list1.removeAll(list1);
		}
		
		System.out.println(count);

	}

}
