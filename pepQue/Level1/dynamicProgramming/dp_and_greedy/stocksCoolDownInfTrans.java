package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.util.*;

class stocksCoolDownInfTrans {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int obsp = -arr[0];
        int ossp = 0;
        int ocsp = 0;

        for(int i = 0;i<n;i++){
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;

            if(ocsp - arr[i] > obsp){
                nbsp = ocsp - arr[i];
            }else{
                nbsp = obsp;
            }

            if(obsp + arr[i] > ossp){
                nssp = obsp + arr[i];
            }else{
                nssp = ossp;
            }
            if(ossp > ocsp){
                ncsp = ossp;
            }else{
                ncsp = ocsp;
            }
            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        System.out.println()
    }
}