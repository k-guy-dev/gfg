package lb_que;

import java.util.*;

class minJumps {
    public static void main(String[] args) {
            int n = arr.length;
            
            int dp[] = new int[n];
            Arrays.fill(dp, Integer.MAX_VALUE);
            for (int i = 0; i < n; i++) {
                int p = arr[i];
                if (p == 0)
                    continue;
                for (int j = i+1; j <= i + p && j < n; j++) {
                    dp[j] = Math.min(dp[j], dp[i] + 1);
                }
            }
            dp[n - 1] = (dp[n - 1] == Integer.MAX_VALUE) ? -1 : dp[n - 1];
            System.out.println(dp[n - 1]);
        }
    }
}