/**
 * You are in a party of N people, where only one person is known to everyone.
 * Such a person may be present in the party, if yes, (s)he doesn’t know anyone
 * in the party. Your task is to find the stranger (celebrity) in party.
 * 
 */

// { Driver Code Starts
import java.util.*;

class Celebrity_Problem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Celebrity().getId(M, N));
            t--;
        }
    }
}
// } Driver Code Ends

class Celebrity {
    // The task is to complete this function
    int getId(int M[][], int n) {
        int a = 0, b = n - 1;
        while (a < b) {
            if (M[a][b] == 1)
                a++;
            else
                b--;
        }
        for (int i = 0; i < n; i++)
            if (i != a && (M[a][i] == 1 || M[i][a] == 0))
                return -1;
        return a;
    }
}
