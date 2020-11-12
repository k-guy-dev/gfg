package lb_que;

class dutchNationalFlagAlgo {
    // To sort the arrays of 0,1,2 using O(N) time compl. and
    // O(1) space complexity;
    // Algorithm used is dutch national flag algo.
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 1, 1, 2, 2 };
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid = 0;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}