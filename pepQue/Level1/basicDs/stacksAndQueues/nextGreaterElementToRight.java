package pepQue.Level1.basicDs.stacksAndQueues;

import java.util.*;

class nextGreaterElementToRight {

    static void nextGreater(int[] arr) {
        Stack<Integer> st = new Stack<Integer>();
        int[] ngi = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!st.isEmpty()) {
                while (!st.isEmpty() && st.peek() <= arr[i]) {
                    st.pop();
                }
            }
            ngi[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " next greater is " + ngi[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        nextGreater(arr);
    }
}