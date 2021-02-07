package pepQue.Level1.recursion.Intro;

import java.util.*;

class power {

    static int linearPower(int n, int x) {
        if (x == 0) {
            return 1;
        }
        return n * linearPower(n, x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int res = linearPower(n, x);
        System.out.println(res);
    }
}