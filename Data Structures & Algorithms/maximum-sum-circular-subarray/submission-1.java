class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int minus[] = new int[nums.length];
        int sum = 0;

        for(int i =0;i<nums.length;i++){
            minus[i] = -nums[i];
            sum += nums[i];
        }
        int maxNormal = kadanes(nums);
        if(maxNormal < 0){
            return maxNormal;
        }
        int circularMax = sum + kadanes(minus);
        return Math.max(maxNormal,circularMax);
        
    }
    public int kadanes(int[] nums){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0;i<nums.length;i++){
            cs = nums[i] + cs;
            ms = Math.max(ms,cs);
            if(cs<0){
                cs = 0;
            }
        }
        return ms;
    }
}