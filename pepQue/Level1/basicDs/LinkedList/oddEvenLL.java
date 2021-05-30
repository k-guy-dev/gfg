package pepQue.Level1.basicDs.LinkedList;

//This is even and odd position example
class oddEvenLL {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node newNode(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
        return head;
    }

    static Node rearrangeEvenOdd(Node head) {
        if (head == null) {
            return null;
        }
        Node odd = head;
        Node even = head.next;

        Node evenFirst = even;

        while (true) {
            // If there are no more nodes left
            // Then connect the last node of odd to the first even node
            if (odd == null || even == null || even.next == null) {
                odd.next = evenFirst;
                break;
            }
            // Connecting Nodes
            odd.next = even.next;
            odd = even.next;
            // if there are no more even nodes
            // after current odd
            if (odd.next == null) {
                even.next = null;
                odd.next = evenFirst;
                break;
            }
            // Connecting even nodes;
            even.next = odd.next;
            even = odd.next;

        }
        return head;
    }

    public static void main(String[] args) {

    }
}