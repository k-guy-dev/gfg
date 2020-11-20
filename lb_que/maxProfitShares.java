package lb_que;

//Valley Peak
//valley-peak approach
/* 
                   80
                   /
    30            /
   /  \          25
  /    15       /
 /      \      /
2        10   /
           \ /
            8
 */
/**
 * There is one more approach for calculating this problem using Valley-Peak
 * approach i.e. take a variable profit and initialize it with zero and then
 * traverse through the array of price[] from (i+1)th position whenever initial
 * position value is greater than the previous value add it to variable profit.
 */
class maxProfitShares {

    public static void main(String[] args) {
        int price[] = { 2, 30, 15, 10, 8, 25, 80 };
        int profit = 0;

        for (int i = 0; i < price.length; i++) {
            int sub = price[i] - price[i - 1];
            if (sub > 0) {
                profit += sub;
            }
        }

        System.out.println(profit);
    }
}