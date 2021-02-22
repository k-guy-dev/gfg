package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.util.*;

class stocksOneTrans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int least_so_far = Integer.MAX_VALUE;
        int profitToday = 0;
        int overAllProfit = 0;

        for (int i = 0; i < n; i++) {
            if (prices[i] < least_so_far) {
                least_so_far = prices[i];
            }
            profitToday = prices[i] - least_so_far;
            if (profitToday > overAllProfit) {
                overAllProfit = profitToday;
            }
        }
        System.out.println(overAllProfit);
    }
}