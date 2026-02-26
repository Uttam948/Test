package DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Edge{
	
	private int source;
	private int destination;
	Edge(int source, int destination){
		this.source = source;
		this.destination = destination;
	}
	public int getSource() {
		return source;
	}
	public int getDestination() {
		return destination;
	}
	
}

public class GraphPractice {
	

	public static void graphImplementation(ArrayList<Edge> graph[]) {
		
		for(int i = 0; i<graph.length ; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0,2));
		graph[1].add(new Edge(1,3));
		graph[1].add(new Edge(1,2));
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,1));
		graph[2].add(new Edge(2,3));
		graph[3].add(new Edge(3,2));
		graph[3].add(new Edge(3,1));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 4;
		int visited[] = new int[4];
		Queue queue = new Queue();
		ArrayList<Edge> graph[] = new ArrayList[v];
		graphImplementation(graph);
		for(int i = 0; i<graph[2].size();i++) {
			Edge e = graph[2].get(i);
		    System.out.println(e.getSource() + " " +e.getDestination());
		}
	
	}

}
