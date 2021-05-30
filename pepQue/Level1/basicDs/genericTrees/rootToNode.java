import java.util.*;
import java.io.*;

class Main{
  static class Node{
    int data;
    ArrayList<Node> children = new ArrayList<>();
    Node(int d){
      this.data = d;
    }
  }
  static class Pair<T,V>{
    T first;
    V second;
    Pair(){}
    Pair(T first, V second){
      this.first = first;
      this.second = second;
    }
  }

  static int sz = (int)1e5;

  static Vector<Integer>[] tree = new Vector[sz];

  static boolean[] vis = new boolean[sz];

  static Vector<Integer>[] path = new Vector[sz];

  static void addEdge(int a, int b){
    tree[a].add(b);
    tree[b].add(a);
  }

  static void bfs(int node){
    Queue<Pair<Integer,Integer>> q = new LinkedList<>();

    q.add(new Pair<>(node,-1));
    vis[node] = true;

    while(!q.isEmpty()){
      Pair<Integer,Integer> p = q.poll();
      vis[p.first] = true;

      for(int child: tree[p.first]){
        if(!vis[child]){
          q.add(new Pair<>(child,p.first));
          path[child] = (Vector<Integer>) path[p.first].clone();
          path[child].add(p.first);
        }
      }
    }
  }

  static void displayPath(int node) {
        for (int k : path[node]) {
            System.out.print(k + " ");
        }
        System.out.println(node);
    }

  static Node construct(int[] arr){
    Node root = null;

    Stack<Node> st = new Stack<>();
    for(int i = 0;i<arr.length;i++){
      if(arr[i] == -1){
        st.pop();
      }else{
        Node temp = new Node(arr[i]);
        if(st.size()>0){
          st.peek().children.add(temp);
        }else{
          root = temp;
        }
        st.push(temp);
      }
    }
    return root;
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

  public static void main(String[] args){

    for (int i = 0; i < sz; i++) {
            tree[i] = new Vector<>();
            path[i] = new Vector<>();
            vis[i] = false;
        }
 
        // Number of vertices
        int n = 6;
 
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(3, 4);
        addEdge(3, 5);
 
        // Calling modified bfs function
        bfs(0);
 
        // Display paths from root vertex
        // to the given vertices
        displayPath(2);
        displayPath(4);
        displayPath(5);

  }
}