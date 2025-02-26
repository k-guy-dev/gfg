package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.util.*;

class goldMine {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mine = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                mine[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[n][m];
        for(int j = m-1;j>=0;j--){
            for(int i = n-1;i>=0;i--){
                if(j==m-1){
                    dp[i][j] = mine[i][j];
                }else if(i==0){
                    dp[i][j] = mine[i][j] + Math.max(dp[i][j+1],dp[i+1][j+1]);
                }else if(i == n - 1){
                    dp[i][j] = mine[i][j] + Math.max(dp[i][j+1],dp[i-1][j+1]);
                }else{
                    dp[i][j] = mine[i][j] + Math.max(dp[i][j+1],dp[i+1][j+1],dp[i-1][j+1]);
                }
            }
        }
        int max = dp[0][0]
        for(int i = 1;i<dp.length;i++){
            if(dp[i][0] > max){
                max = dp[i][0];
            }
        }
        System.out.println(max);
    }
}