package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class subsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[] = {1,2,3,};
          List<Integer> list = new ArrayList<>();
          TreeSet<Integer> set = new TreeSet<>();
          recur(0 , arr , 0 , set);
          System.out.println(set);
	}

	public static void recur(int idx ,  int arr[] , int sum , TreeSet<Integer> set) {
		
		if(idx >= arr.length) {
			
			//	System.out.println(sum);
			set.add(sum);
				return;
			
		}
		sum = sum + arr[idx];
	 //	list.add(arr[idx]);
		recur(idx+1  , arr , sum , set);
		sum = sum - arr[idx];
	//	list.remove(list.size()- 1);
		recur(idx+1, arr, sum , set);
		
	}
}
