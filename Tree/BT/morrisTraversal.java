package Tree.BT;

class _Node {
    int data;
    _Node left, right;

    _Node(int item) {
        data = item;
        left = right = null;
    }
}

// 1. Initialize current as root
// 2. While current is not NULL
// If the current does not have left child
// a) Print current’s data
// b) Go to the right, i.e., current = current->right
// Else
// a) Make current as the right child of the rightmost
// node in current's left subtree
// b) Go to this left child, i.e., current = current->left

// In this traversal the tree is altered During the traversal
// But return to it's normal state when at the end
class morrisTraversal {
    _Node root;

    void MorrisTrav(_Node root) {
        _Node current, prev;
        current = root;
        while (current != null) {
            if (current.left == null) {
                System.out.print(current.data + " ");
                current = current.right;
            } else {
                prev = current.left;
                while (prev.right != null && prev.right != current) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = current;
                    current = current.left;
                } else {
                    prev.right = null;
                    System.out.print(current.data + " ");
                    current = current.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        morrisTraversal tree = new morrisTraversal();
        tree.root = new _Node(1);
        tree.root.left = new _Node(2);
        tree.root.right = new _Node(3);
        tree.root.left.left = new _Node(4);
        tree.root.left.right = new _Node(5);
        tree.MorrisTrav(tree.root);

    }
}