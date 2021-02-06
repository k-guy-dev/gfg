package pepQue.Level1.Patterns;

import java.util.*;

class pattern12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int cnt2 = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(cnt + "\t");
                int cnt3 = cnt + cnt2;
                cnt = cnt2;
                cnt2 = cnt3;
            }
            System.out.println();
        }
    }
}