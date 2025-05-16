import java.util.Arrays;

public class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices); // Sort to find two cheapest chocolates
        
        int totalCost = prices[0] + prices[1];

        if (totalCost <= money) {
            return money - totalCost;
        } else {
            return money;
        }
    }
}
