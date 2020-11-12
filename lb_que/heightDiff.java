package lb_que;

import java.io.*;
import java.util.*;

public class heightDiff {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends

// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        if (n == 1)
            return 0;

        // Sort all elements
        Arrays.sort(arr);

        // Initialize result
        int ans = arr[n - 1] - arr[0];

        // Handle corner elements
        int small = arr[0] + k;
        int big = arr[n - 1] - k;
        if (small > big) {
            int a = small;
            small = big;
            big = a;
        }

        // Traverse middle elements
        for (int i = 1; i < n - 1; i++) {
            int subtract = arr[i] - k;
            int add = arr[i] + k;

            // If both subtraction and addition
            // do not change diff
            if (subtract >= small || add <= big)
                continue;

            // Either subtraction causes a smaller
            // number or addition causes a greater
            // number. Update small or big using
            // greedy approach
            if (big - subtract <= add - small)
                small = subtract;
            else
                big = add;
        }

        return Math.min(ans, big - small);
    }
}
