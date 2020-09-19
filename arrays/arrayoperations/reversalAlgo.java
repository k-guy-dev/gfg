package arrays.arrayoperations;

class Main {

    void rotation(int[] arr, int d) {
        int n = arr.length;
        reversal(arr, 0, d);
        reversal(arr, d, n - 1);
        reversal(arr, 0, n - 1);
    }

    void reversal(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        /*** INSERT GENERIC THIINNNGSSSSSSS */
    }

}

           

    