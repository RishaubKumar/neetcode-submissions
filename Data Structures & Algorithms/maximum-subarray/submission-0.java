class Solution {
    public int maxSubArray(int[] nums) {
        // we will use kadanes to solve this
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxVal = Integer.MIN_VALUE;
        boolean positive = false;
        for(int i =0;i<nums.length;i++){
            currSum += nums[i];
            if(currSum < 0){
                maxVal = Math.max(nums[i],maxVal);
                currSum = 0;
                // sum += currSum;
            }else{
                positive = true;
                maxSum = Math.max(currSum,maxSum);
            }
        }
        if(!positive){
            return maxVal;
        }
    return maxSum;
    }
}
