package arrays;

// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Solution g = new Solution();

            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val : ans)
                System.out.print(val + " ");
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends

class Solution {
    ArrayList<Integer> countDistinct(int A[], int n, int k) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            hm.put(A[i], i);
            if (i == k - 1) {

            }
        }
    }
}
