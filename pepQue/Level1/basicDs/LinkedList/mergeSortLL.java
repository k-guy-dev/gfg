package pepQue.Level1.basicDs.LinkedList;

class mergeSortLL {
    // functions in play:
    // 1. findMiddle - to divide the ll in two halves
    // 2. sortedMerge - to merge the two divided halves
    // 3. mergeSort - main sort function
    // 4. push - to push new element in front of the ll

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node findMiddle(Node head) {
        Node fast_ptr = head;
        Node slow_ptr = head;
        while (fast_ptr.next != null && fast_ptr.next.next != null) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        return slow_ptr;
    }

    static Node sortedMerge(Node n1, Node n2) {
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

    static void push(int new_Data) {
        Node new_node = new Node(new_Data);
        new_node.next = head;
        head = new_node;
    }

    static Node mergeSort(Node h) {
        // Base case
        if (h == null || h.next == null) {
            return h;
        }

        Node middle = findMiddle(h);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        // Apply mergeSort of left and right
        Node left = mergeSort(h);
        Node right = mergeSort(nextOfMiddle);

        Node sortedList = sortedMerge(left, right);
        return sortedList;
    }

    static void printlist(Node h) {
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        mergeSortLL li = new mergeSortLL();

        li.push(15);
        li.push(10);
        li.push(5);
        li.push(20);
        li.push(3);
        li.push(2);

        li.head = li.mergeSort(li.head);
        System.out.println("Sorted");
        li.printlist(li.head);
    }
}