class Solution {
    public boolean canJump(int[] nums) {
        // intution : we have to check where we can reach to final stage 
        // using i + nums[i] , and if the index to reach exceed this we will get false;
        int farthest = 0;
        for(int i = 0;i<nums.length;i++){
            if(farthest < i) return false;

            farthest = Math.max(farthest,i+nums[i]);
        }
        return true;
    }
}
