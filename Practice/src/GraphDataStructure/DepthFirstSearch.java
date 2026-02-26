package GraphDataStructure;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class Edges{
	
	private int src;
	private int des;
	Edges(int src , int des){
		this.des = des;
		this.src = src;
	}
	 
	public int getSrc() {
		return src;
	}
	public int getDes() {
		return des;
	}
}

public class DepthFirstSearch {
	
	public static void graph() {
		int val = 7;
		ArrayList<Edges> graph[] = new ArrayList[7];
		
		for(int i = 0;i<val ; i++) {
			graph[i] = new ArrayList<>();	
		}
		graph[0].add(new Edges(0,1));
		graph[0].add(new Edges(0,2));
		graph[1].add(new Edges(1,0));
		graph[1].add(new Edges(1,3));
		graph[2].add(new Edges(2,0));
		graph[2].add(new Edges(2,4));
		graph[3].add(new Edges(3,4));
		graph[3].add(new Edges(3,5));
		graph[3].add(new Edges(3,1));
		graph[4].add(new Edges(4,3));
		graph[4].add(new Edges(4,5));
		graph[4].add(new Edges(4,2));
		graph[5].add(new Edges(5,3));
		graph[5].add(new Edges(5,4));
		graph[5].add(new Edges(5,6));
		graph[6].add(new Edges(6,5));
		
		 boolean visited[] = new boolean[val];
			
		//	DeptFirstSearch(graph , 0 , visited );
			
			System.out.println();
			
		//	BreathFirstSearch(graph , val);
			System.out.println();
			String st = "";
			printAllPath(graph , st , 5,0,visited);
		
		
	}

	public static void DeptFirstSearch(ArrayList<Edges> graph[] , int curr , boolean visited[]) {
		
		System.out.print(curr);
		visited[curr] = true;
		for(int i = 0;i<graph[curr].size() ; i++) {
			Edges e = graph[curr].get(i);
			if(visited[e.getDes()] == false) {
			DeptFirstSearch(graph  , e.getDes(), visited );
			}
		}
	}
	
	public static void printAllPath(ArrayList<Edges> graph[] , String path , int target , int curr , boolean visited[]) {
		
		if(target ==  curr) {
			System.out.println(path);
			return;
		}
		
		for(int i = 0 ;i<graph[curr].size() ; i++) {
			
			Edges e = graph[curr].get(i);
			if(!visited[e.getDes()]) {
				visited[curr] = true;
				printAllPath(graph , path+e.getDes(), target , e.getDes(), visited);
				visited[curr] = false;
			}
		}
	}
	
	public static void BreathFirstSearch(ArrayList<Edges> graph[] , int v ) {
		
		boolean visited[] = new boolean[v];
         Queue<Integer> q = new LinkedList<>();
         Edges e = graph[0].get(0);
         q.add(e.getSrc());
         while(!q.isEmpty()) {
        	int curr = q.remove();
        	
        	if(visited[curr] == false) {
        		System.out.print(curr);
        		visited[curr] = true;
        		
        		for(int i =0 ;i<graph[curr].size();i++) {
        			Edges ed = graph[curr].get(i);
        			q.add(ed.getDes());
        		}
        	}
         }
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ArrayList<Edges> graph[] = new ArrayList[7];
		graph();
       //  boolean visited[] = new boolean[val];
		
		//DeptFirstSearch(graph , 0 , visited );
	}

}
