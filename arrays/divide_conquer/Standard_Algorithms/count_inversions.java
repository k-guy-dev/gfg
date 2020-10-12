package arrays.divide_conquer.Standard_Algorithms;

import java.util.*;

class count_inversions {
    // Inversion count means how far is an array from being sorted.
    public static int mergeCounts(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l, swaps = 0;
        while (i < left.length && j < right.length) {
            if (left[i++] <= right[j++]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = arr[j++];
                swaps += (m + 1) - (l - i);
            }
        }
        return swaps;
    }

    public static int mergeSortAndCount(int[] arr, int l, int r) {
        int count = 0;
        if (l < r) {
            int m = (l + r) / 2;
            count += mergeSortAndCount(arr, l, m + 1);
            count += mergeSortAndCount(arr, m + 1, r);
            count += mergeCounts(arr, l, m, r);
        }
        return count;
    }

    public static void main(String[] args) {

    }
}