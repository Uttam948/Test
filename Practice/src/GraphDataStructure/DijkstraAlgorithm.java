package GraphDataStructure;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Edge{
	
	int src;
	int dec;
	int weight;
	
	Edge(int src , int dec ,int weight){
		this.src = src;
		this.dec = dec;
		this.weight = weight;
	}
}

class Pair implements Comparable<Pair>{
	int src;
	int des;
	Pair(int src , int des){
		this.src = src;
		this.des = des;
	}
	
	@Override
	public int compareTo(Pair o) {
		return  this.des - o.des;
	}
}

public class DijkstraAlgorithm {
	
	public static void graph(int v) {
		ArrayList<Edge> grap[] = new ArrayList[v];
		
		for(int i =0 ;i<v;i++) {
			grap[i] = new ArrayList<>();
		}
		
		grap[0].add(new Edge(0, 1, 2));
		grap[0].add(new Edge(0, 2, 4));
		
		grap[1].add(new Edge(1, 3, 7));
		grap[1].add(new Edge(1, 2, 1));
		
		grap[2].add(new Edge(2, 4, 3));
		grap[3].add(new Edge(3, 5, 1));
		
		grap[4].add(new Edge(4, 3, 2));
		grap[4].add(new Edge(4, 5, 5));
			
		implementsDisjkstra(grap , 0 , v);
	}
	
	
	
	public static void implementsDisjkstra(ArrayList<Edge> graph[] , int src , int vi) {
		
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		boolean vis[] = new boolean[vi];
		int dis[] = new int[vi];
		Edge e = graph[0].get(0);
		pq.add(new Pair(e.src, e.dec));
		
		for(int i =0 ; i <vi ; i++) {
			
			if(i != src) {
				dis[i] = Integer.MAX_VALUE;
			}
		}
		
		while(!pq.isEmpty()) {
			
		Pair curr = pq.remove();
	
		if(!vis[curr.src]) {
			vis[curr.src] = true;
			
			for(int i =0 ;i<graph[curr.src].size();i++) {
				Edge ed = graph[curr.src].get(i);
				int u = ed.src;
				int v = ed.dec;
				
				if(dis[u] + ed.weight < dis[v]) {
					dis[v] =  dis[u] + ed.weight;
					pq.add(new Pair(v, dis[v]));
				}
			}
		}
		
		
		
		}
		
		for(int i =0 ; i< vi ; i++) {
			System.out.println(dis[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph(6);
	}

}
