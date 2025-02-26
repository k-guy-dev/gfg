package sorting;

class insertionSort {
    void insertin(int arr[]) {
        int n = arr.length;
        int key, j;
        for (int i = 0; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}