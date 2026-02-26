package hackerRankTest;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(73);
		list.add(67);
		list.add(38);
		list.add(33);
		list.add(44);
		list.add(84);
		
		
		System.out.println(GradingStudents.gradingStudents(list));
	}
	
	public static List<Integer> gradingStudents(List<Integer> grades)
	{
	
		List<Integer> list = new ArrayList<>();
		
		for(Integer i : grades) {
			
			int q = i/5;
			q = q +1;
			if(i>=38 &&q*5 - i < 3) {
				
			 if(q*5 - i ==2 ) {
				 i=i+2;
			 }else if(q*5 - i ==1){
				 i = i+1;
			 }
			}
			
			list.add(i);
		}
		return list;
		
	}

}
