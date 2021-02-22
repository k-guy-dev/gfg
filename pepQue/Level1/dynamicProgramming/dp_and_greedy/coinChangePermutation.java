package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.util.*;

class coinChangePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        int[] dp = new int[tar + 1];
        dp[0] = 1;
        for (int amt = 0; amt < tar; amt++) {
            for (int coin : coins) {
                if (coin <= amt) {
                    int remaining_amt = amt - coin;
                    dp[amt] += dp[remaining_amt];
                }
            }
        }
        System.out.println(dp[tar]);
    }
}