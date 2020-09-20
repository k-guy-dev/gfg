package sorting;

class selectionSort {
    // Find minimum element from the unsorted list and put it at the front

    void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_indx = i;
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {
                    min_indx = j;
                }
            }
            int temp = arr[min_indx];
            arr[min_indx] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {

    }
}