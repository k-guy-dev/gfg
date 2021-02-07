package pepQue.Level1.recursion.Intro;

import java.util.*;

class logPower {

    static int logPower(int n, int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return logPower(n, x / 2) * logPower(n, x / 2);
        } else {
            return n * logPower(n, x / 2) * logPower(n, x / 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        System.out.println(logPower(n, x));
    }
}