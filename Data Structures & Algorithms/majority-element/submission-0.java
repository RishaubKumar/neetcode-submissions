class Solution {
    public int majorityElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<nums.length;i++){
            max = Math.max(max , nums[i]);
            min = Math.min(min , nums[i]);
        }
        int ans[] = new int[max - min +1];
        for(int i = 0;i<nums.length;i++){
            ans[nums[i] - min]++;
        }
        int majorEle = 0;
        for(int i =0;i<ans.length;i++){
            if(ans[i]>nums.length/2){
                majorEle = i + min;
            }
        }
        return majorEle;
    }
}