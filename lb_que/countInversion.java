import java.io.*;
import java.util.*;

class countInversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println(mergeSort(arr, 0, n - 1));
        }
    }

    public static long mergeSort(int arr[], int s, int e) {
        if (s == e) {
            return 0;
        }
        int mid = (s + e) / 2;
        long a = mergeSort(arr, s, mid);
        long b = mergeSort(arr, mid + 1, e);
        long c = merge(arr, s, mid, e);
        return a + b + c;
    }

    public static long merge(int arr[], int s, int mid, int e) {
        int ls = s, le = mid, rs = mid + 1, re = e, count = 0;
        int temp[] = new int[e - s + 1];
        int k = 0;
        while (ls <= le && rs <= re) {
            if (arr[ls] <= arr[rs]) {
                temp[k] = arr[ls];
                k++;
                ls++;
            }
            if (arr[ls] > arr[rs]) {
                temp[k] = arr[rs];
                count = count + (le - ls + 1);
                k++;
                rs++;
            }
        }
        while (ls <= le) {
            temp[k] = arr[ls];
            ls++;
            k++;
        }
        while (rs <= re) {
            temp[k] = arr[rs];
            rs++;
            k++;
        }
        for (int i = 0; i < temp.length; i++)
            arr[s + i] = temp[i];
        return count;
    }
}
