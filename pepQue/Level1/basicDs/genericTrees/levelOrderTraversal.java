import java.util.*;


class Main{
	static class Node{
		int data;
		ArrayList<Integer> children = new ArrayList<Integer>();
	}

	static Node newNode(int d){
		Node temp = new Node();
		temp.data = d;
		return temp;
	}
	 public static Node construct(int[] arr) {
	    Node root = null;

	    Stack<Node> st = new Stack<>();
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] == -1) {
	        st.pop();
	      } else {
	        Node t = new Node();
	        t.data = arr[i];

	        if (st.size() > 0) {
	          st.peek().children.add(t);
	        } else {
	          root = t;
	        }

	        st.push(t);
	      }
	    }

    return root;
  }
	static void levelOrderTraversal(Node root){
		if(root == null){
			return;
		}

		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			int n = q.size();
			while(n > 0){
				Node p = q.peek();
				q.remove();
				System.out.print(p.data + " ");
				for(int i = 0;i<p.children.size();i++){
					q.add(p.child.get(i));
				}
				n--;
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	int[] arr = new int[n];
    	String[] values = br.readLine().split(" ");
    	for (int i = 0; i < n; i++) {
      		arr[i] = Integer.parseInt(values[i]);
    	}

    	Node root = construct(arr);
	}
}