package divide_conquer.Standard_Algorithms;

//Generate a random integer t, range of it lies in [start,end]
//Then we do t = t% (end - start + 1)
//Then t += start

class Randomized_BinarySearch {
    public static int getRandom(int x, int y) {
        return (x + (int) (Math.random() % (y - x + 1)));
    }

    public static int randomizedBS(int arr[], int l, int h, int k) {
        if (h >= l) {
            int mid = getRandom(l, h);

            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] > k) {
                return randomizedBS(arr, l, mid - 1, k);
            }
            return randomizedBS(arr, mid + 1, h, k);
        }
        return -1;

    }

    public static void main(String[] args) {

    }
}