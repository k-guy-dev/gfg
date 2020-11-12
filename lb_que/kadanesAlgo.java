package lb_que;

class kadanesAlgo {

    public static void main(String[] args) {
        int arr[] = { -1, -2, -3, -4, -5 };
        int n = arr.length;

        int sum = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (arr[0] < 0) {
                sum = arr[0];
            }
            temp += arr[i];
            if (temp > sum) {
                sum = temp;
            }
        }
        System.out.println(sum);
    }
}