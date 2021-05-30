package pepQue.Level1.basicDs.genericTrees;
import java.util.*;
import java.io.*;

class HeightOfGenericTree{
	
	static int MAX = 1001;

	static ArrayList<ArrayList<Integer>> adj = new
								ArrayList<ArrayList<Integer>>();

	static class Node{
		int data;
		ArrayList<Node> children = new ArrayList<>();
		Node(int d){
			this.data = d;
		}
	}

	static void display(Node node){
		String str = node.data + "->";
		for(Node child: node.children){
			str += child.data + "->";
		}
		str += ".";
		System.out.println(str);
		for(Node child: node.children){
			display(child);
		}
	}
	static int build_tree(int arr[], int n){
		int root_index = 0;

		for(int i = 0;i<n;i++){
			if(arr[i] == -1){
				root_index = i;
			}
			else{
				adj.get(i).add(arr[i]);
				adj.get(arr[i]).add(i);
			}
		}
		return root_index;
	}


	static int BFS(int start){
		Map<Integer,Integer> vis = new Hash	Map<Integer,Integer>();
		ArrayList<ArrayList<Integer>> q = new ArrayList<ArrayList<Integer>>();
		int max_level_reached = 0;

		q.add(new ArrayList<Integer>(Arrays.asList(start,0)));
		ArrayList<Integer> p = new ArrayList<Integer>();

		while(q.size() !=0){
			p = q.get(0);
			vis.put(p.get(0),1);

			max_level_reached = Math.max(max_level_reached, p.get(0));
			q.remove(0);

			for(int i = 0;i< adj.get(p.get(0)).size();i++){
				if(!vis.containsKey(adj.get(p.get(0)).get(i))){
					q.add(new ArrayList<Integer>(Arrays.asList(adj.get(p.get(0)).get(i), p.get(1)+1)));
				}
			}
		}
		return max_level_reached;
	}
	public static void main(String[] args) throws IOException{
		 for(int i = 0; i < MAX; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
         
        // node 0 to node n-1
        int parent[] = { -1, 0, 1, 2, 3 };
         
        // Number of nodes in tree
        int n = parent.length;
        int root_index = build_tree(parent, n);
        int ma = BFS(root_index);
        System.out.println( "Height of N-ary Tree=" + ma);
	}
}