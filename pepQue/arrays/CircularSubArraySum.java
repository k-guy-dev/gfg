package pepQue.arrays;

class CircularSubArraySum {
    static int maxCircularSum(int[] a, int n) {
        if (n == 1) {
            return a[0]; // Corner case
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        int max_so_far = a[0], curr_max = a[0], min_so_far = a[0], curr_min = a[0];

        for (int i = 1; i < n; i++) {
            curr_max = Math.max(curr_max + a[i], a[i]);
            max_so_far = Math.max(curr_max, max_so_far);

            curr_min = Math.min(curr_min + a[i], a[i]);
            min_so_far = Math.min(curr_min, min_so_far);
        }
        if (min_so_far == sum) {
            return min_so_far;
        }
        return Math.max(max_so_far, sum - min_so_far);
    }

    public static void main(String[] args) {

    }
}