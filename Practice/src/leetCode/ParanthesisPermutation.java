package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParanthesisPermutation {

	public static void merputation(String str, String perm) {
		
		if(str.length() == 0) {
			System.out.println(perm);
			return;
		}
		
		for(int i = 0;i<str.length() ; i++) {
			char curr = str.charAt(i);
			String newcurr = str.substring(0,i) + str.substring(i+1); 
			merputation(newcurr , curr+perm);
		}
	}
	
	 public static void numberPermut(int arr[] , List<Integer> data) {
		 
		 if(arr.length == 0) {
			 System.out.println(data);
			 return ;
		 }
		 
		 for(int i =0 ;i<arr.length ; i++) {
			 int n= arr[i];
			 List<Integer> list1 = new ArrayList<>();
			 list1.subList(0, arr[i]);
			 numberPermut(arr , data);
		 }
	 }
	
	public static List<List<Integer>> permutationNumber(int num[]){
		
		List<List<Integer>> list = new ArrayList<>();
		
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list.subList(0, list.get(0)) );
		
		String str = "ABC";
		//merputation(str , "");
		int arr[] = {1,2,3};
	//	numberPermut(arr, list);
	//	permutationNumber(arr);	
	}

}
