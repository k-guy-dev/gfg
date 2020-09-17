/*
 * Given an array A of N integers. The task is to find a peak element in A in O(
 * log N ) . An array element is peak if it is not smaller than its neighbours.
 * For corner elements, consider only one neighbour.
 */
package arrays;

// { Driver Code Starts
import java.util.*;

class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int A = new Peak().peakElement(a, n);
            int f = 0;
            if (n == 1)
                f = 1;
            else if (A == 0 && a[0] >= a[1])
                f = 1;
            else if (A == n - 1 && a[n - 1] >= a[n - 2])
                f = 1;
            else if (a[A] >= a[A + 1] && a[A] >= a[A - 1])
                f = 1;
            else
                f = 0;
            System.out.println(f);
        }
    }
}// } Driver Code Ends

/* Complete the function below */

class Peak {
    // Function to find the peak element
    // a[]: input array
    // n: size of array a[]
    public int peakElement(int[] a, int n) {

        return divideConqPeak(arr, 0, n - 1, n);
    }

    static int divideConqPeak(int arr[], int l, int r, int n) {
        int mid = l + (r - 1) / 2;
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1) || arr[mid + 1] > arr[mid]) {
            return mid;
        } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
            return divideConqPeak(arr, l, mid - 1, n);
        } else {
            return divideConqPeak(arr, mid + 1, r, n);
        }
    }

}