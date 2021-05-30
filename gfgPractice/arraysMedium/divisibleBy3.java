package gfgPractice.arraysMedium;

import java.util.*;

class divisibleBy3 {
    static int isPossible(int N, int arr[]) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        if (sum % 3 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}