package GraphDataStructure;

import java.util.HashMap;
import java.util.Map;


public class DeptFirstSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{2,3},{1,5,6},{1,4,7},{3,8},{2},{2},{3,8},{4,7},{}};
		
		int arr1[][] = {{2},{1,3},{2} , {5},{4,6},{6} , {7},{8}};
		
		boolean visited[] =new boolean[arr.length + 1]; 
		
		dfs(arr , 0 , visited);
		
		
	}
	
	public static void dfsProvisions(int arr[][] , int curr , boolean visited[]) {
		 
	}
	
	public static void dfs(int arr[][] , int curr , boolean visited[]) {
		
		System.out.println(curr);
		visited[curr] = true;
		for(int i =0 ; i < arr[curr].length ; i++) {
			
			int nieghbor = arr[curr][i];
			
			if(!visited [nieghbor]) {
				dfs(arr , nieghbor, visited);
			}
		}
	}
}
