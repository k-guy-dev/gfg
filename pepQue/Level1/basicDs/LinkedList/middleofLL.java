package pepQue.Level1.basicDs.LinkedList;

import java.util.*;

class middleofLL {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node middleLL(Node head) {
        Node fast_ptr = head;
        Node slow_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
        return slow_ptr;
    }

    public static void main(String[] args) {

    }
}