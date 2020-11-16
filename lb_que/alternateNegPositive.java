package lb_que;

import java.util.*;

class alternateNegPositive {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (arr[i] < 0 && arr[j] > 0) {
                swap(arr[i], arr[j]);
                i++;
                j--;
            } else if (arr[i] > 0 && arr[j] < 0) {
                i++;
                j--;
            } else if (arr[i] > 0)
                i++;
            else if (arr[j] < 0)
                j--;
        }
        int k = 0;
        while (k < n && i < n) {
            swap(arr[k], arr[i]);
            k += 2;
            i++;
        }
        for (int z = 0; z < n; z++) {
            System.out.println(arr[z]);
        }
    }
}