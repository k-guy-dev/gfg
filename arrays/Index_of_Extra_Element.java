// { Driver Code Starts
    import java.util.*;
    class ExtraElement {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                int[] b = new int[n - 1];
                for (int i = 0; i < n; i++) a[i] = sc.nextInt();
                for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
                GfG g = new GfG();
                System.out.println(g.findExtra(a, b, n));
            }
        }
    }// } Driver Code Ends
    
    
    /*Complete the function below*/
    class GfG {
        public int findExtra(int a[], int b[], int n) {
            // add code here.
            int i = 0;
            for(i = 0;i<n-1;i++)
            {
                if(a[i] != b[i])
                {
                    break;
                }
            }
            return i;
        }
    }