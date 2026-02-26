package NewPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Integer> list = Arrays.asList(1,1);
		 int i=0;
		 Collections.sort(list);
         int val = 0;
         
		 while(i < list.size()-1){
			 
			if(list.get(i) > 0) {
				
				if(list.get(i)+1 != list.get(i+1)) {
					val = list.get(i)+1;
					break;
				}
			}
			i++;
		 }  
		 
		 System.out.println(val);
		 
	}

}
