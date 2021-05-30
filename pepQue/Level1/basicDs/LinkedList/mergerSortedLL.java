package pepQue.Level1.basicDs.LinkedList;

import java.util.*;

class mergerSortedLL {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Util function to add node to the last
    static void addToLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    static Node merger(Node n1, Node n2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while (true) {

            if (n1 == null) {
                tail.next = n2;
                break;
            }
            if (n2 == null) {
                tail.next = n1;
                break;
            }

            if (n1.data <= n2.data) {
                tail.next = n1;
                n1 = n1.next;
            } else {
                tail.next = n2;
                n2 = n2.next;
            }
            tail = tail.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}