package pepQue.Level1.funcAndArrays;

import java.util.*;

class rotateby90 {
    static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void rotate(int[][] arr) {
        transpose(arr);
        for (int i = 0; i < arr.length; i++) {
            int low = 0;
            int high = arr[0].length;
            while (low < high) {
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] arr = new int[n1][n2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before Rotation");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        rotate(arr);
        System.out.println("After Rotation");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}