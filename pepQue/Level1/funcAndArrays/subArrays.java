package pepQue.Level1.funcAndArrays;

import java.util.*;

class subArrays {
    static void subArrays(int[] arr, int n) {
        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                j++;
                System.out.println();
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        subArrays(arr, n);
    }
}