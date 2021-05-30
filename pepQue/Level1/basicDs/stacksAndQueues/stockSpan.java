package pepQue.Level1.basicDs.stacksAndQueues;

import java.util.*;

class stockSpan {
    static int[] span(int[] arr) {
        int[] span = new int[arr.length + 1];
        Stack<Integer> st = new Stack<Integer>();
        st.push(0);
        span[0] = 1;
        for (int i = 2; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = span(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}