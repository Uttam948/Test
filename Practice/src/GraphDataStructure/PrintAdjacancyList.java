package GraphDataStructure;

import java.util.ArrayList;


class E{
	int u;
	int v;
	
	E(int u , int v) {
		
	}
		
	
}

public class PrintAdjacancyList {
	
	public static void graph(int arr[][] , int tv) {
		
		ArrayList<E> graph[] = new ArrayList[tv];
		
		for(int i =0 ; i<tv ; i++) {
			graph[i] = new ArrayList<>();
		}
	
		for(int i =0 ;i< tv ; i++) {
			
			for(int j = 0; j<arr[i].length ; j++) {
				graph[i].add(new E(arr[i][0] , arr[i][j]));
			}
		
		}
		adjcencyList(graph , tv);
		
	}
	
	public static void adjcencyList(ArrayList<E> graph[]  , int tv) {
		
		 for(int i =0 ;i < tv ; i++) {
			 E a = graph[i].get(0);
			 for(int j = 0; j< graph[i].size() ; j++) {
				 E e = graph[i].get(j);
				 System.out.println(a.u +" " + e.v);
				// System.out.println();
				 
			 }
		 }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[][] = {{0,1} , {1,2} , {2,0}};
       int tv = 3;
       graph(arr , tv);
       
	}

}
