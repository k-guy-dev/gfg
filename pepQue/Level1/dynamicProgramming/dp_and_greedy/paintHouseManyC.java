package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.util.*;

class paintHouseManyC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[n][c];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[n][c];

        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        for (int i = 0; i < c; i++) {
            dp[0][i] = arr[0][i];
            if (arr[0][i] <= least) {
                sleast = least;
                least = arr[0][i];
            } else if (arr[0][i] <= sleast) {
                sleast = arr[0][i];
            }
        }
        for (int i = 1; i < dp.length; i++) {
            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;

            for (int j = 0; j < dp[0].length; j++) {
                int res = 0;
                if (least == dp[i - 1][j]) {
                    res = sleast;
                } else {
                    res = least;
                }
                dp[i][j] = arr[i][j] + res;
                if (dp[i][j] <= nleast) {
                    nsleast = nleast;
                    nleast = dp[i][j];
                } else if (dp[i][j] <= nsleast) {
                    nsleast = arr[i][j];
                }
            }
            least = nleast;
            sleast = nsleast;
        }
        System.out.println(least);
    }
}