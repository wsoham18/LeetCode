public class Solution {
 public int maxProfit(int[] prices) {
int min = Integer.MAX_VALUE;
int profit = 0;
 for (int price : prices) {
min = Math.min(min, price);
profit = Math.max(profit, price - min);
 }
return profit;
  }
 public static void main(String[] args) {
 Solution sol = new Solution();
 int[] prices = {7, 1, 5, 3, 6, 4};
 int result = sol.maxProfit(prices);
System.out.println("Maximum Profit: " + result);
    }
}
