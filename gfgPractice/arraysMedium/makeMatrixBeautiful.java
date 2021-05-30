package gfgPractice.arraysMedium;

import java.util.*;
// A beautiful matrix is a matrix in which the sum of elements
// in each row and column is equal.
// Given a square matrix of size NxN. Find the minimum number
// of operation(s) that are required to make the matrix beautiful.
// In one operation you can increment the value of any one cell by 1.

class makeMatrixBeautiful {

    static int findMinOp(int[][] mat, int n) {
        int[] sumCol = new int[n];
        int[] sumRow = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumRow[i] += mat[i][j];
                sumCol[j] += mat[i][j];
            }
        }
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, sumRow[i]);
            maxSum = Math.max(maxSum, sumCol[i]);
        }

        int count = 0;
        for (int i = 0, j = 0; i < n && j < n;) {
            int diff = Math.min(maxSum - sumRow[i], maxSum - sumCol[i]);
            mat[i][j] += diff;
            sumRow[i] += diff;
            sumCol[j] += diff;

            count += diff;

            if (sumRow[i] == maxSum) {
                i++;
            }
            if (sumCol[j] == maxSum) {
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}