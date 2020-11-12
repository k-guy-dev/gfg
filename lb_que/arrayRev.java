package lb_que;

class arrayRev {
    void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    void rev(int[] arr, int n) {
        int start = 0;
        int end = n;
        while (end > start) {
            swap(arr[start], arr[end]);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

    }
}