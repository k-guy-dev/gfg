package Tree.BT;

import java.util.*;

public class prac {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            item = key;
            left = right = null;
        }
    }

    static Node root;
    static Node temp = root;

    static void insert(Node temp, int key) {
        if (temp == null) {
            root = new Node(key);
            return;
        }

        Queue<Node> q = new LinkedList<Node>();

        q.add(temp);
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                q.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                q.add(temp.right);
            }

        }

    }

    public static void main(String[] args) {
    }
}
