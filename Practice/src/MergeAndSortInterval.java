import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeAndSortInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> list = new ArrayList<>();
		int arr[] = {1, 3, 2, 9, 8, 10, 15, 18};
		//List<Integer> list = new ArrayList<>();
		
		for(int i =0 ;i<arr.length-1 ; i=i+2){

			List<Integer> list1 = new ArrayList<>();
			list1.add(arr[i]);
			list1.add(arr[i+1]);
			list.add(list1);
			
		
		} 	
		
		int n = list.size()* list.get(0).size();
		System.out.println(n);
		// int onemax = list.get(list.size()-1).get(1);
		System.out.println(list);
		List<List<Integer>> list2 = new ArrayList<>();
		list2.add(list.get(0));
		for(int i =1 ;i< list.size() ; i++) {
			
			if(list2.get(list2.size()-1).get(1) > list.get(i).get(0) && list2.get(list2.size()-1).get(1) < list.get(i).get(1)) {
				list2.get(list2.size()-1).set(1, list.get(i).get(1));
			}else if(list2.get(list2.size()-1).get(1) > list.get(i).get(0) && list2.get(list2.size()-1).get(1) >= list.get(i).get(1)){
				//list2.add(list.get(i-1));
			}else {
				list2.add(list.get(i));
		}
		}
		System.out.println(list2);
	}
	

}
