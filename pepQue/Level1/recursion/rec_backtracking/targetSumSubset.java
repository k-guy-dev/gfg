package pepQue.Level1.recursion.rec_backtracking;

import java.uti.*;
import java.util.Scanner;

class targetSumSubset {

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if (idx == arr.length) {
            if (sos == tar) {
                System.out.println(set);
            }
            return;
        }

        printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ",", sos + arr[idx], tar);
        printTargetSumSubsets(arr, idx + 1, set, sos, tar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, target);
    }
}