package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.util.*;

class partitionIntoSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n == 0 || k == 0 || n < k) {
            System.out.println(0);
            return;
        }
        long[][] dp = new long[k + 1][n + 1];

        for (int t = 1; t <= n; t++) {
            for (int p = 1; p <= n; p++) {
                if (p < t) {
                    dp[t][p] = 0;
                } else if (p == t) {
                    dp[t][p] = 1;
                } else {
                    dp[t][p] = dp[t - 1][p - 1] + dp[t][p - 1] * k;
                }
            }
        }
        System.out.println(dp[k][n]);
    }
}