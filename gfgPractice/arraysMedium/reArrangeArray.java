package gfgPractice.arraysMedium;

import java.util.*;

class reArrangeArray {
    static void rearrange(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] += ((arr[arr[i]]) % n) * n;
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= n;
        }
    }

    public static void main(String[] args) {

    }
}