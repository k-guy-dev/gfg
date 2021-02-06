package pepQue.Level1.funcAndArrays;

import java.util.*;

class roatateArray {

    // To rotate an array to right
    static void reverseUtil(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    static void rotateToRight(int[] arr, int n, int k) {
        if (k > arr.length - 1) {
            k = k % arr.length;
        } else if (k < 0) {
            k += arr.length;
        }
        int p11 = 0, p12 = n - k - 1, p21 = n - k, p22 = n - 1;
        reverseUtil(arr, p11, p12);
        reverseUtil(arr, p21, p22);
        reverseUtil(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateToRight(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}