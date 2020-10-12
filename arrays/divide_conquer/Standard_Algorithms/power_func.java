package arrays.divide_conquer.Standard_Algorithms;

class power_func {
    public long power(long x, long y) {
        long temp = 0;
        if (y == 0)
            return 1;
        temp = power(x, y / 2);
        if (y % 2 == 0) {
            return temp * temp;
        } else {
            if (y > 0) {
                if (y > 0)
                    return x * temp * temp;
                else
                    return (temp * temp) / x;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}