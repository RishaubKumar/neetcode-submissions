class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return robHouse(nums,0,dp);

    }
    public int robHouse(int[] nums,int n,int dp[]){
        if(n >= nums.length){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        // rob
        int ans1 = nums[n]+robHouse(nums,n+2,dp); // as we a skipping immdiate neighbour directly;
        // skip
        int ans2 = robHouse(nums,n+1,dp);
        dp[n] = Math.max(ans1,ans2);
        return dp[n];
    }
}
