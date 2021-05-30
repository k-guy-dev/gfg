package gfgPractice.arraysMedium;

import java.util.*;

class kadanesOnlyNegative {

    static int kadanesNegativeOnly(int[] a) {
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 0; i < a.length; i++) {
            curr_max = Math.max(a[i], curr_max + a[i]);
            max_so_far = Math.max(curr_max, max_so_far);
        }
        return max_so_far;
    }

    // to print the subarray we maintaing the starting and ending indices
    // whenever we get the maximum sum
    static void maxSubarraySum(int[] a, int n) {
        int max_so_far = 0;
        int max_ending_here = 0, start = 0, end = 0, s = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here += a[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum Sum = " + max_so_far);
        System.out.println("Start: " + start + "End: " + end);
    }

    public static void main(String[] args) {

    }
}