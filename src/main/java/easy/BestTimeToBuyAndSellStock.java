package easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int lsf = prices[0];
        int op = 0;

        for (int i = 1; i < prices.length; i++) {
            if (lsf > prices[i]) lsf = prices[i];
            op = Math.max(op, prices[i] - lsf);
        }
        return op;
    }
}
