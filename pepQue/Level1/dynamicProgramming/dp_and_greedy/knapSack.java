package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.util.*;

class knapSack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vals = new int[n];
        int[] wts = new int[n];

        for (int i = 0; i < n; i++) {
            vals[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            wts[i] = sc.nextInt();
        }
        int capacity = sc.nextInt();
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; i++) {
                if (j > wts[i - 1]) {
                    int remaining_capacity = j - wts[i - 1];
                    if (dp[i - 1][remaining_capacity] + vals[i - 1] > dp[i - 1][j]) {
                        dp[i][j] = dp[i - 1][remaining_capacity] + vals[i - 1];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][capacity]);
    }
}