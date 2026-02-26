package practices1;

import java.util.ArrayList;
import java.util.List;

public class TriangleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n = 5;
         
         List<Integer> list = new ArrayList<>();
         List<Integer> listd = new ArrayList<>();
         List<List<Integer>> lists = new ArrayList<>();
         list.add(1);
         listd.add(1);
         lists.add(listd);
        // list.add(1);
        // lists.add(list);
     
         for(int i =1 ; i<n ; i++) {
        	 List<Integer> newList = new ArrayList<>();
        	 newList.add(list.get(0));
        	 for(int j = 1; j<list.size() ; j++) {
        		 
        			 int sum = list.get(j) + list.get(j-1);
        			 newList.add(sum); 
        		// System.out.println(newList);
        	 }
        	 newList.add(list.get(list.size()-1));
        	 lists.add(newList);
        	 list.removeAll(list);
        	
        	 for(Integer k : newList) {
        		 list.add(k);
        	 }
        	// System.out.println(newList);
         }
     
         System.out.println(lists);
         
	}
	
}
