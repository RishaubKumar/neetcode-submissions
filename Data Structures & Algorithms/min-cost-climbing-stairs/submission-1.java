class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int val[] = new int[cost.length];
        for(int i = 0;i<val.length;i++){
            val[i] = -1;
        }
        return Math.min(minCost(cost,cost.length-1,val),minCost(cost,cost.length-2,val));
    }
    public int minCost(int[] cost, int n,int[] val){
        if(n == 0 || n == 1){
            return cost[n];
        }
        if(val[n] != -1){
            return val[n];
        }
        int ans1 = minCost(cost,n-1,val);
        int ans2 = minCost(cost,n-2, val);
        val[n] =  Math.min(ans1,ans2)+cost[n];
        return val[n];
    }
}
