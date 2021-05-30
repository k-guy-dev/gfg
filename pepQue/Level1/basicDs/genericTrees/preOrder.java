import java.util.*;


class preOrder{
	
	static class Node{
		int data;
		ArrayList<Integer> children = new ArrayList<>();
		Node(int d){
			data = d;
		}
	}
	List<Integer> nodePreorder = new ArrayList<Integer>();
	public List<Integer> preOrderFunc(Node root){
		if(root == null) return nodePreorder;

		list.add(root.data);

		if(root.children != null){
			for(Node node: root.children){
				preOrderFunc(node);
			}
		}
		return list;
	}

	public static void main(String[] args){
	}
}