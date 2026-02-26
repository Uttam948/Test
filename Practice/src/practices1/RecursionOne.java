package practices1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RecursionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3 };
		int n = arr.length;
		List<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		
		Permutations(0 , arr , stack , n);
	}
	
	public static void Permutations(int i , int arr[] , Stack<Integer> stack ,int n) {
		
		if(i == n) {
			
			if(!stack.empty()) {
				int sum = 0;
				for(Integer k : stack) {
					 sum = sum  + k;
				}
			System.out.println(stack);
			}
			return;
		}
		stack.push(arr[i]);
		Permutations(i+1 , arr , stack ,n);
		stack.pop();
		Permutations(i+1,arr , stack , n);
		
	}

}
