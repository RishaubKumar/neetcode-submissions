class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> val = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(val.contains(nums[i])){
                val.remove(nums[i]);
            }else{
                val.add(nums[i]);
            }
        }
        Iterator<Integer> it = val.iterator();
        return it.next();
    }
}
