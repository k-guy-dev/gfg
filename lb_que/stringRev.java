package lb_que;

import java.util.*;

class stringRev {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            String s = sc.nextLine();
            int n = s.length();
            char[] arr = new char[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.charAt(n - i);
            }
            String rev = new String(arr);
            System.out.println(rev);
            t--;
        }
    }
}