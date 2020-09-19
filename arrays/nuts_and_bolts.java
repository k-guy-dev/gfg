package arrays;

// { Driver Code Starts

//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            final int n = Integer.parseInt(br.readLine().trim());
            final char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(nuts, bolts, n);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    void matchPairs(final char nuts[], final char bolts[], final int n) {
        // code here
        final HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('!', 0);
        hm.put('#', 0);
        hm.put('$', 0);
        hm.put('%', 0);
        hm.put('&', 0);
        hm.put('*', 0);
        hm.put('@', 0);
        hm.put('^', 0);
        hm.put('~', 0);
        for (int i = 0; i < n; i++) {
            hm.replace((nuts[i]), 0, 1);
        }
        final char[] temp = new char[n];
        int[] t = {0};
        hm.forEach((k,v)->
        {
            if(hm.get(k) > 0){
                temp[t[0]] = k;
                t[0] += 1;
            }
        });
        for(int i =0;i<n;i++)
        {
            nuts[i] = temp[i];
            bolts[i] = temp[i];
        }
    }
}