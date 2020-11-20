package lb_que;

class spiralTraversalOfMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();

            int arr1[][] = new int[n1][m1];

            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++)
                    arr1[i][j] = sc.nextInt();
            }

            new Traverse().spirallyTraverse(n1, m1, arr1);

            System.out.println();
        }
    }
}

class Traverse {
    // Complete this function
    static void spirallyTraverse(int n, int m, int a[][]) {
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++)
                System.out.print(a[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++)
                System.out.print(a[i][right] + " ");
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(a[bottom][i] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(a[i][left] + " ");
                left++;
            }
        }
    }
}