package pepQue.Level1.funcAndArrays;

import java.util.*;

class Search2D {

    // Array is Sorted and Square

    static void search2dArray(int[][] arr, int x) {

        int n = arr.length;
        int i = 0;
        int j = arr.length - 1;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == x) {
                System.out.println(i + " " + j);
                return;
            } else if (arr[i][j] < x) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        search2dArray(arr, x);

    }
}