package arrays;

import java.util.*;

class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Triplet g = new Triplet();
            if (g.findTriplets(a, n))
                System.out.println("1");
            else
                System.out.println("0");

        }
    }
}// } Driver Code Ends

/* Complete the function below */

class Triplet {
    // Function to check if triplet is present
    // arr[]: input array
    // n: size of the array
    public boolean findTriplets(int arr[], int n) {
        // add code here
        int sum;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    return true;
                } else if (sum > 0)
                    k--;
                else if (sum < 0)
                    j++;
            }
        }
        return false;
    }

}