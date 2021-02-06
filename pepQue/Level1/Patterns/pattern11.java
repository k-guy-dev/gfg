package pepQue.Level1.Patterns;

import java.util.*;

class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for (int i = 0; cnt < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(cnt++);
            }
            System.out.println();
        }
    }
}