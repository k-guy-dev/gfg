package pepQue.Level1.basicDs.LinkedList;

import java.util.*;

class kreverseLL {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node reverse(Node head, int k) {
        Stack<Node> st = new Stack<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            int count = 0;
            while (current != null && count < k) {
                st.push(current);
                current = current.next;
                count++;
            }
            while (st.size > 0) {
                if (prev == null) {
                    prev = st.peek();
                    head = prev;
                    st.pop();
                } else {
                    prev.next = st.peek();
                    prev = prev.next;
                    st.pop();
                }
            }
        }
        prev.next = null;
        return head;
    }

    public static void main(String[] args) {

    }
}