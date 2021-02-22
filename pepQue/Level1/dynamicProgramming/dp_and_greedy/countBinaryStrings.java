package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.io.*;
import java.util.*;

public class countBinaryStrings {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count_1 = 1;
        int count_0 = 1;
        for (int i = 2; i <= n; i++) {
            int ncount0 = count_1;
            int ncount1 = count_1 + count_0;

            count_0 = ncount0;
            count_1 = ncount1;

        }
        System.out.println(count_0 + count_1);
    }

}