package pepQue.Level1.dynamicProgramming.dp_and_greedy;

import java.util.*;

class fractionalKnapsack {

    private static double getMaxValue(int[] wts, int[] vals, int capacity) {
        ItemValue[] iVal = new ItemValue[wts.length];

        for (int i = 0; i < wts.length; i++) {
            iVal[i] = new ItemValue(wts[i], vals[i], i);
        }

        Arrays.sort(iVal, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue v1, ItemValue v2) {
                return Double.compare(v1.cost, v2.cost);
            }
        });

        double totalValue = 0;
        for (ItemValue i : iVal) {
            double currWt = i.wt;
            double currVal = i.val;

            if (capacity - currWt >= 0) {
                // we can pick item as a whole
                totalValue += currVal;
            } else {
                // we can only pick fraction of it
                double fraction = ((double) capacity / (double) currWt);
                totalValue += (currVal * fraction);
                capacity = (int) (capacity - (currWt * fraction));
                break;
            }
        }
        return totalValue;
    }

    static class ItemValue {
        double cost;
        double wt, val, ind;

        public ItemValue(int wt, int val, int ind) {
            this.wt = wt;
            this.val = val;
            this.ind = ind;

            cost = (double) val / (double) wt;
        }
    }

    public static void main(String[] args) {

    }
}