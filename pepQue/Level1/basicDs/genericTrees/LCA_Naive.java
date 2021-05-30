import java.util.*;


class Main{
	static int Maxn = 1001;
	static int[] depth = new int[Maxn];
	static int[] parent = new int[Maxn];

	static Vector<Integer>[] adj = new Vector[Maxn];

	static{
		for(int i = 0;i<Maxn;i++){
			adj[i] = new Vector<>();
		}
	}

	static void addEdge(int a, int b){
		adj[a].add(b);
		adj[b].add(a);
	}

	static void dfs(int cur, int prev){
		//making parent for each node
		parent[cur] = prev;
		//marking depth for each node
		depth[cur] = depth[prev+1];
		for(int i = 0;i<adj[cur].size();i++){
			if(adj[cur].elementAt(i) != prev){
				dfs(adj[cur].elementAt(i),cur);
			}
		}
	}

	static void preprocess(){
		depth[0] = -1;
		dfs(1,0);
	}

	static int LCANaive(int u, int v){
		if(u==v){
			return u;
		}
		if(depth[u] > depth[v]){
			int temp = u;
			u = v;
			v = temp;
		}
		v = parent[v];
		return LCANaive(u,v);
	}
	
	public static void main(String[] args){
		addEdge(1, 2);
        addEdge(1, 3);
        addEdge(1, 4);
        addEdge(2, 5);
        addEdge(2, 6);
        addEdge(3, 7);
        addEdge(4, 8);
        addEdge(4, 9);
        addEdge(9, 10);
        addEdge(9, 11);
        addEdge(7, 12);
        addEdge(7, 13);
 
        preprocess();
 
        System.out.println("LCA(11,8) : " + LCANaive(11, 8));
        System.out.println("LCA(3,13) : " + LCANaive(3, 13));
	}
}
