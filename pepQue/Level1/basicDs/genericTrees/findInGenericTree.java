import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
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

  public static boolean find1(Node node, int data) {
    // write your code here
    //Technique using traversal
    Queue<Node> q = new LinkedList<>();
    q.add(node);

    while(!q.isEmpty()){
      int n = q.size();
      while(n>0){
        Node p = q.peek();
        q.remove();
        if(p.data == data){
          return true;
        }else{
          for(int i = 0;i<p.children.size();i++){
               q.add(p.children.get(i));
          }
        }
        n--;
      }
    }
    return false;
  }
  public static boolean find2(Node node, int data){
    //Technique using Recursion
    if(node.data == data){
      return true;
    }
    for(Node n: node.children){
      boolean found = find2(n,data);
      if(found){
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    boolean flag = find2(root, data);
    System.out.println(flag);
    // display(root);
  }

}