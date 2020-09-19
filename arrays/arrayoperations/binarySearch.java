package arrays.arrayoperations;

class binarySearch {
    static int search(int[] arr, int low, int high, int n) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == n) {
            return mid;
        } else if (arr[mid] < n) {
            return search(arr, low, mid - 1, n);
        }
        return search(arr, mid + 1, high, n);

    }

    public static void main(String[] args) {
        // GENERIC CODE
    }
}