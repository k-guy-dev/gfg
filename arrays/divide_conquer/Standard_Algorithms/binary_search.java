package divide_conquer.Standard_Algorithms;

class binary_search {
    public static int binary(int arr[], int l, int h, int n) {
        if (h >= l) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == n) {
                return mid;
            }
            if (arr[mid] > n) {
                return binary(arr, l, mid - 1, n);
            }
            return binary(arr, mid + 1, h, n);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int low = 0;
        int high = arr.length;
        int n = 4;
        int result = binary(arr, low, high, n);
        System.out.println(result);
    }
}