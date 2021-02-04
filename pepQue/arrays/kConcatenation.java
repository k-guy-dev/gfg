package pepQue.arrays;

class kConcatenation {
    static int maxSum(int[] arr, int n, int k) {
        int curr_max = arr[0];
        int max_sofar = arr[0];

        for (int i = 0; i < n * k; i++) {
            curr_max = Math.max(curr_max + arr[i], arr[i]);
            max_sofar = Math.max(max_sofar, curr_max);
        }
        return max_sofar;
    }

    public static void main(String[] args) {

        kConcatenation kc = new kConcatenation();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] arr2 = new int[n * k];
            for (int i = 0; i < n * k; i += n) {
                for (int j = 0; j < n; j++) {
                    arr2[i + j] = arr[j];
                }
            }
            int res = kc.maxSum(arr2, n, k);
            System.out.println(res);
        }

    }
}
