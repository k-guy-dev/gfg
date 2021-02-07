package pepQue.Level1.recursion.rec_in_arrays;

import java.util.*;

class printArray {

    static void printArray(int[] arr, int n) {

        if (n == arr.length) {
            return;
        }

        System.out.println(arr[n]);

        printArray(arr, n + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr, 0);
    }

}