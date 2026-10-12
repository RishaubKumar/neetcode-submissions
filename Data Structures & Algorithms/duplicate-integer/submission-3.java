class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i= 0;i<nums.length;i++){
            hs.add(nums[i]);
        }

        for(int i= 0 ; i<nums.length;i++){
            if(hs.contains(nums[i])){
                hs.remove(nums[i]);
            }else{
                return true;
            }
        }
        return false;
    }
}
// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         // boolean duplicatePresent = false;
//         for(int i = 0;i<nums.length;i++){
//             for(int j= i+1;j<nums.length;j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }