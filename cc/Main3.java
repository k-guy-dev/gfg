package cc;

import java.util.*;

class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int max = Integer.MIN_VALUE;
            int smax = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (arr[i] >= max) {
                    smax = max;
                    max = arr[i];
                } else if (arr[i] >= smax && arr[i] <= max) {
                    smax = arr[i];
                }
            }
            int max_res = (max * smax) + (max - smax);
            System.out.println(max_res);

        }
    }
}