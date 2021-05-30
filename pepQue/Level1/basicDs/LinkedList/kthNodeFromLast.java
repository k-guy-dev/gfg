package pepQue.Level1.basicDs.LinkedList;

import java.util.*;

class reverseLinkedList {
    static Node head;
    static Node tail;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // hare tortoise algorithm
    static Node kthLast(int k) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != tail) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    // Recursion Method
    static Node reverseRecursion(Node node) {
        if (head == null || head.next == null) {
            return head;
        }
        Node rest = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    public static void main(String[] args) {

    }
}