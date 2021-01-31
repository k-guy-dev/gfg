package arrays.arrayoperations;

class findingPairWithAGivenSum {
    //Array is sorted and rotated
    static boolean pairSumPresent(int arr[], int n, int x) {
        int i;
        // Finding Pivot Element
        for (i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1])
                break;
        }
        int l = (i + 1) % n; // l being the index of smallest element
        int r = i; // r being the index of largest element

        while (l != r) {
            if (arr[l] + arr[r] == x) {
                return true;
            }
            if (arr[l] + arr[r] < x) {
                l = (l + 1) % r;
            } else {
                r = (n + r - 1) % n;
            }
        }
        return false;
    }
}
