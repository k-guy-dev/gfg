package pepQue.Level1.basicDs.stacksAndQueues;

import java.util.*;

class slidingWindow {
    public static int[] maxSliding(int[] a, int k) {
        int n = a.length;
        if (n == 0) {
            return a;
        }
        Deque<Integer> dq = new LinkedList<Integer>();
        int[] ans = new int[n - k + 1];

        int i = 0;
        for (; i < k; i++) {
            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (; i < n; i++) {
            ans[i - k] = a[dq.peekFirst()];
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans[i - k] = a[dq.peekFirst()];
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = maxSliding(arr, k);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}