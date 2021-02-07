package pepQue.Level1.recursion.Intro;

import java.util.*;

class printDec {

    static int decreasing(int n) {
        System.out.println(n);
        if (n < 1) {
            return 0;
        }
        return decreasing(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decreasing(n);
    }
}