class Solution {
    public int findMin(int[] nums) {
        // while(left<right){
        //     mid = left+(right- left)/2;
        //     if(mid == )
        // }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
}
