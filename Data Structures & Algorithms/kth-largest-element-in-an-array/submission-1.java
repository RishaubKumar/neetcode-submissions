class Solution {
    public int findKthLargest(int[] nums, int k) {
        // This is the way with sorting array and finding out the element but this is not the most efficient way as it takes O(nlogn) time complexity , we can do this in O(nlogk)
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        
        // lets do this with the help of min heap , here elements are stored in ascending order
// PriorityQueue by default implement the min heap;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int n : nums){
            minHeap.add(n);
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }
        return minHeap.peek();
    }
}
