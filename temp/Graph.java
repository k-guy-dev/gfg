package temp;
import java.util.*;
import java.io.*;


class Graphs{
	static int v;
	ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	void BFS(int s){
		boolean visited[] = new boolean[v];
		ArrayList<Integer> q = new ArrayList<Integer>();

		visited[s] = true;
		q.add(s);

		while(s.size() > 0){
			s = q
		}
	}

	public static void main(String[] args){

	}
}