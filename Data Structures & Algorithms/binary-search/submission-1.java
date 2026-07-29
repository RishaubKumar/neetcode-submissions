class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
        int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1; // because we have include in search earlier , so no need to check it again 
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
