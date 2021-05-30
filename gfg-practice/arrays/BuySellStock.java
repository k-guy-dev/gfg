import java.util.*;

class Interval {
    int buy, sell;
}

class BuySellStock {
    static ArrayList<ArrayList<Integer>> stockBuySell(int[] a, int n) {
        ArrayList<Interval> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        int i = 0;
        int min = Integer.MIN_VALUE;

        while (i < n - 1) {
            if (n == 0 || n == 1) {
                return res;
            }

            // Getting the minimum first (Local Minima)
            while ((i < n - 1) && a[i] >= a[i + 1]) {
                i++;
            }
            if (i == n - 1)
                break;

            Interval e = new Interval();

            e.buy = i++;

            while (i < n - 1 && a[i] >= a[i - 1]) {
                i++;
            }
            e.sell = i - 1;

            ans.add(e);

        }
        for (int j = 0; j < ans.size(); j++) {
            res.add(new ArrayList<Integer>());
            res.get(j).add(0, ans.get(j).buy);
            res.get(j).add(1, ans.get(j).sell);
        }

        return res;

    }
}