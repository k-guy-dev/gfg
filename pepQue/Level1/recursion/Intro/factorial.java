package pepQue.Level1.recursion.Intro;

import java.util.*;

class factorial {

    static int factorialFunc(int n) {
        if (n == 0) {
            return 1;
        }
        return (n * factorialFunc(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = factorialFunc(n);
    }
}