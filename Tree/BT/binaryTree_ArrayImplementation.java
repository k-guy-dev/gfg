package Tree.BT;

// JAVA implementation of tree using array
// numbering starting from 0 to n-1.
import java.util.*;
import java.io.*;

class Array_imp {
    static int root = 0;
    static String[] str = new String[10];

    /* create root */
    public static void root(String key) {
        str[0] = key;
    }

    /* create left son of root */
    public static void setLeft(String key, int root) {
        int t = (root * 2) + 1;

        if (str[root] == null) {
            System.out.printf("Can't set child at %d, no parent found\n", t);
        } else {
            str[t] = key;
        }
    }

    /* create right son of root */
    public static void setRight(String key, int root) {
        int t = (root * 2) + 2;

        if (str[root] == null) {
            System.out.printf("Can't set child at %d, no parent found\n", t);
        } else {
            str[t] = key;
        }
    }

    public void printTree() {
        for (int i = 0; i < 10; i++) {
            if (str[i] != null)
                System.out.print(str[i]);
            else
                System.out.print("-");
        }
    }
}

class binaryTree_ArrayImplementation {
    public static void main(String[] args) {
        Array_imp obj = new Array_imp();
        obj.root("A");
        obj.set_Left("B", 0);
        obj.setRight("C", 0);
        obj.setLeft("D", 1);
        obj.setRight("E", 1);
        obj.setLeft("F", 2);
        obj.printTree();
    }
}
