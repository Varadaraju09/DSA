public class BestTimeToBuySell {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // best day to buy
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 5, 3, 6, 4, 1 };
        System.out.println(maxProfit(prices));
    }
}
