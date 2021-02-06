package pepQue.Level1.funcAndArrays;

import java.util.*;

class shellRotate {

    static void reverseUtil(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }
    }

    static void rotateRight(int[] arr, int n, int k) {
        if (k > arr.length - 1) {
            k = k % arr.length;
        } else if (k < 0) {
            k += arr.length;
        }
        int p11 = 0, p12 = n - k - 1, p21 = n - k, p22 = n - 1;
        reverseUtil(arr, p21, p22);
        reverseUtil(arr, p11, p12);
        reverseUtil(arr, p11, p22);
    }

    static int[] fillOnedFromShell(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr.length - s;
        int sz = 2 * (maxr - minr) + 2 * (maxc - minc);

        int[] oned = new int[sz];

        // left-wall
        int idx = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // right-wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // bottom-wall
        for (int i = maxr, j = minc + 1; j <= maxr; j++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // top-wall
        for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        return oned;

    }

    static void fillShellFromOned(int[][] arr, int s, int[] oned) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr.length - s;

        // left-wall
        int idx = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        // right-wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            arr[i][j] = oned[idx];
            idx++;
        }
        // bottom-wall
        for (int i = maxr, j = minc + 1; j <= maxr; j++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        // top-wall
        for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
            arr[i][j] = oned[idx];
            idx++;
        }

    }

    static void rotateShell(int[][] arr, int s, int r) {
        int[] oned = fillOnedFromShell(arr, s);
        int n = oned.length;
        rotateRight(oned, n, r);
        fillShellFromOned(arr, s, oned);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int s = sc.nextInt();
        int r = sc.nextInt();
        rotateShell(arr, s, r);

    }
}