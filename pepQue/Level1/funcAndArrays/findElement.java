package pepQue.Level1.funcAndArrays;

import java.util.*;

class findElements {

    static int search(int[] arr, int low, int high, int n) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == n) {
            return mid;
        } else if (arr[mid] < n) {
            return search(arr, low, mid - 1, n);
        }
        return search(arr, mid + 1, high, n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int res = search(arr, 0, arr.length - 1, d);
        System.out.println(res);
    }
}