package pepQue.Level1.basicDs.stacksAndQueues;

import java.util.*;

class LargestAreaHistogram {
    static int largestArea(int[] arr) {
        Stack<Integer> st = new Stack<Integer>();

        int max_area = 0;
        int tp;
        int area_with_top;

        int i = 0;
        while (i < arr.length) {
            if (st.isEmpty() || arr[st.peek()] <= arr[i]) {
                st.push(i++);
            } else {
                tp = st.peek();
                st.pop();
                area_with_top = arr[tp] * (st.isEmpty() ? i : i - st.peek() - 1);
                max_area = Math.max(max_area, area_with_top);
            }
        }
        while (!st.isEmpty()) {
            tp = st.peek();
            st.pop();
            area_with_top = arr[tp] * (st.isEmpty() ? i : i - st.peek() - i - 1);
            max_area = Math.max(max_area, area_with_top);
        }
        return max_area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = largestArea(arr);
        System.out.println(res);
    }
}