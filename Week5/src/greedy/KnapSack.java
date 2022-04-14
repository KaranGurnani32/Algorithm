package greedy;

public class KnapSack {
    public static void main(String[] args) {
        int[] profit = {70, 40, 10, 56, 30};
        int[] weight = {8, 3, 1, 4, 2};
        int capacity = 20;

        int maxProfit = profitandweight(profit, weight, capacity);
        System.out.println("maxProfit = " + maxProfit);
    }

    private static int profitandweight(int[] profit, int[] weight, int capacity) {

        int[] c = new int[profit.length];

        // calculated profit/weight
        for (int i = 0; i < profit.length; i++) {
            c[i] = profit[i] / weight[i];
        }

        int maxProfitOfObject = 0;
        int index = 0;

        for (int i = 0; i < c.length; i++) {
            // got the maximum profit
            if (c[i] > maxProfitOfObject) {
                maxProfitOfObject = c[i];
                index = i;
            }

        }

        while (weight[index] < capacity) {
            weight[index] = weight[index] + 1;
        }

        int maxProfit = weight[index] * maxProfitOfObject;

        return maxProfit;
    }
}
