package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class StockBuySellAtMostTwoTransactions {
    public static void main(String[] args) {
        int[] a = {2, 30, 15, 10, 8, 25, 80};

        int profit = getMaxProfit(a, a.length);
        System.out.println(profit);
    }

    private static int getMaxProfit(int[] price, int n) {

        int[] profit = new int[n];
        for(int i=0;i<n; i++){
            profit[i] = 0;
        }
        int maxPrice = price[n-1];
        int minPrice = price[0];

        for(int i=n-2; i>=0; i--) {

            if(price[i] > maxPrice) {
                maxPrice = price[i];
            }

            profit[i] = Math.max(profit[i+1], maxPrice-price[i]);
        }

        for(int i=1; i<n ;i++) {
            if(price[i] < minPrice) {
                minPrice = price[i];
            }

            profit[i] = Math.max(profit[i-1], profit[i]+ price[i]-minPrice);
        }

        return profit[n-1];
    }
}
