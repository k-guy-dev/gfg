package pepQue.Level1.Patterns;

import java.util.*;

class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = 2 * n - 3;
        int st = 1;

        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int j = 0; j < st; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            if (i == n - 1) {
                st--;
            }
            for (int j = 0; j < st; j++) {
                System.out.print(val + "\t");
                val--;
            }

            st++;
            sp -= 2;

            System.out.println();
        }
    }
}