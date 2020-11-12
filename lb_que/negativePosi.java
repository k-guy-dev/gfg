package lb_que;

class neagativePosi {
    public static void separatorFunc(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            if (arr[low] < 0 && arr[high] < 0) {
                low++;
            } else if (arr[high] > 0) {
                high--;
            } else if (arr[low] > 0 && arr[high] < 0) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            } else if (arr[low] > 0 && arr[high] > 0) {
                high--;
            } else {
                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -5 };
        int n = arr.length;
        separatorFunc(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}