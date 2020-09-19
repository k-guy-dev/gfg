package array-operations;

class rotationByLeft {

    public void LeftRotation(int[] arr, int d, int n) {
        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr, n);
        }
    }

    public void leftRotateByOne(int[] arr, int n) {
        int temp = arr[0];
        int i;
        for (i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }

    public static void main(String[] args) {
        LeftRotation lr = new LeftRotation();
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 5;
        lr.LeftRotation(arr, 2, 5);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}