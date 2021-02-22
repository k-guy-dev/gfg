package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.util.*;

class maxSumNonAdj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int inc = arr[0];
        int exc = 0;

        for (int i = 0; i < n; i++) {
            int next_inc = arr[i] + exc;
            int next_exc = inc > exc ? inc : exc;

            inc = next_inc;
            exc = next_exc;
        }
        System.out.println(Math.max(inc, exc));
    }
}