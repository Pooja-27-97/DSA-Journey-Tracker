public class Stocks {
    public static void buyAndSellStock(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int day = 0;

        for(int i=0; i < price.length; i++) {
            if(buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
                day = i;
            } else {
                buyPrice = price[i];
            }
        }
        System.out.println("Maximum profit " + maxProfit + " on " + day + "th day");
    }
    public static void main(String[] args) {
        int price[] = {9, 4, 6, 1, 7, 2};
        buyAndSellStock(price);
        // System.out.println("Maximum profit: " + buyAndSellStock(price));
    }
}
