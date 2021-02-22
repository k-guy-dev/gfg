package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.util.*;

class unboundedKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] val = new int[n];
        int[] wts = new int[n];

        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            wts[i] = sc.nextInt();
        }
        int capacity = sc.nextInt();
        int[] dp = new int[capacity + 1];
        dp[0] = 0;
        for (int bagc = 0; bagc <= capacity; bagc++) {
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (wts[i] <= bagc) {
                    int remaining_bagc = bagc - wts[i];
                    int remaining_bagv = dp[remaining_bagc];
                    int total_value = remaining_bagv + val[i];
                    if (total_value > max) {
                        max = total_value;
                    }
                }
            }
            dp[bagc] = max;
        }
        System.out.println(dp[capacity]);
    }
}