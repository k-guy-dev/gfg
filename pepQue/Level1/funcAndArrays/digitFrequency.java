package pepQue.Level1.funcAndArrays;

import java.util.*;

class digitFrequency {
    public static int getDigitFrequency(int n, int d) {
        int freq = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = (n - lastDigit) / 10;
            if (lastDigit == d) {
                freq++;
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }
}