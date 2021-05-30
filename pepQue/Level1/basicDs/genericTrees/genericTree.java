package pepQue.Level1.basicDs.genericTrees;

import java.util.*;

class genericTree {
    static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<Node>();

        Node(int d) {
            data = d;
        }
    }

    static void display(Node node) {
        String str = node.data + "->";
        for (Node child : node.children) {
            str += child.data + "->";
        }
        str += ".";
        System.out.println(str);
        for (Node child : node.children) {
            display(child);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Stack<Node> st = new Stack<>();

        // Idea behind creating a generic tree:
        // Create a stack -> check if stack is empty --> if empty -> make current node
        // as root --> else -> if current arr element is -1 ---> pop from stack else
        // --->
        // peek element from stack and make current element as it's children and push
        // current node in the Node stack

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node temp = new Node(arr[i]);
                if (st.size() > 0) {
                    st.peek().children.add(temp);
                } else {
                    root = temp;
                }
                st.push(temp);
            }
        }
        display(root);
    }
}