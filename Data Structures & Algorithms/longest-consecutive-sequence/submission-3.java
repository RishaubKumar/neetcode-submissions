class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int maxLen = 1;
        
            int val = nums[0] ;
            int count = 1;
            for(int j = 0;j<nums.length;j++){
                if(val+1 == nums[j]){
                    count++;
                    maxLen = Math.max(count,maxLen);
                    val = nums[j];
                }else if(val == nums[j]){
                    continue;
                }else{
                    count = 1;
                    val = nums[j];
                }
            }
        
        return maxLen;
    }
}
