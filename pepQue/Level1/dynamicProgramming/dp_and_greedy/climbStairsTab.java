package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.util.*;
//Tabulation
// 1. Make an array of size'n'(storage)and give meaning(eg:at index 4 store number of ways to go to zero from 4)
// 2. Direction
// 3. Travel and Solve

class climbStairsTab {

    public static int countPathsTabulation(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cp = countPathsTabulation(n);
        System.out.println(cp);
    }
}