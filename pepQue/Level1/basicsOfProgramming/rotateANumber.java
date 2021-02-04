package pepQue.Level1.basicsOfProgramming;

class rotateANumber {
    static int rotate(int n, int k) {
        int rotated = 0;
        while (k-- > 0) {
            int new_first = n % 10;
            n -= new_first;
            n = n / 10;
            rotated = rotated * 10 + new_first;
        }
        // for(int i = 0;i<n-k;i++){
        // rotated = rotated * 10 +
        // }
        int temp = 0;
        temp = temp * (int) (Math.pow(10, k)) + (int) (n / Math.pow(10, k));
        return temp;
    }

    public static void main(String[] args) {
        rotateANumber rn = new rotateANumber();

    }

}