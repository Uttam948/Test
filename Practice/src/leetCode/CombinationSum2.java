package leetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1,1,2,2};
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> lists = new ArrayList<>();
		recursion (0, 4 , arr,list,lists);
		System.out.println(lists);
	}
	
	public static void recursion(int idx , int target ,int arr[] , List<Integer> list , List<List<Integer>> ans) {
			if(target == 0) {
				ans.add(new ArrayList<>(list));
				return ;
			}
		for(int i = idx ; i<arr.length ;i++) {
		
			if(i > idx && arr[i] == arr[i-1]) continue ;
			if(arr[i] > target) break;
			
				list.add(arr[i]);
				recursion(i +1, (target-arr[i]) , arr , list , ans);
				list.remove(list.size()-1);	
		}
	}

}
