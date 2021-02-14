package pepQue.Level1.dynamicProgramming.time_and_space;

import java.util.*;

class mergerSort {
    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1; // size of first subarray
        int n2 = r - m; // size of second subarray

        // temp arrays to store values
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy value from original array to temp arrays
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        // initial indexs of temp arrays
        int i = 0, j = 0;
        // initial array of merged array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // copying rest of the elements
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Sort function that sorts the array by using merge
    void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);

        }
    }

    public static void main(String[] args) {

    }
}