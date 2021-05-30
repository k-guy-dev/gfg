package pepQue.Level1.basicDs.LinkedList;

import java.util.*;

class reverseLinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Iterative Method
    static Node reversIterative(Node node) {
        Node prev = null;
        Node curr = node;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev.next;
            prev = curr;
            curr = next;
        }
        return node;
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