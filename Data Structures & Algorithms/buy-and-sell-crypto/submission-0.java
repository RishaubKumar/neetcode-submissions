class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProf = 0;

        for(int i =0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i]-buyPrice;
                maxProf = Math.max(maxProf, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProf;
    }
}
