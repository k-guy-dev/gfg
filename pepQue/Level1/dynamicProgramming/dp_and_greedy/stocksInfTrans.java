package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.util.*;

class stocksInfTrans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int buyDate = 0;
        int sellDate = 0;
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] >= prices[i - 1]) {
                sellDate++;
            } else {
                profit = prices[sellDate] - prices[buyDate];
                sellDate = buyDate = i;
            }
        }
        profit = prices[sellDate] - prices[buyDate];

        System.out.println(profit);

    }
}