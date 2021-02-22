package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.util.*;

class stocksFeeInfTrans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int fee = sc.nextInt();

        int obsp = -arr[0]; // obsp = old buy state profit
        int ossp = 0; // ossp = old sell state profit

        for (int i = 1; i < arr.length; i++) {
            int nbsp = 0; // nbsp = new buy state profit
            int nssp = 0; // nssp = new sell state profit

            if (ossp - arr[i] > obsp) {
                nbsp = ossp - arr[i];
            } else {
                nbsp = obsp;
            }

            if (obsp + arr[i] - fee > ossp) {
                nssp = obsp + arr[i] - fee;
            } else {
                nssp = ossp;
            }
            obsp = nbsp;
            ossp = nssp;
        }
        System.out.println(ossp);
    }
}