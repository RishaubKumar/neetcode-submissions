class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[2];

       for(int i = 0;i<nums.length;i++){
            int first = nums[i];
            int second = target - first;
            if(hm.containsKey(second)){
                ans[0] = hm.get(second);
                ans[1] = i;
                return ans;
            }else{
                hm.put(first , i);
         }
       }
       return new int[2];
    }
}
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int arr[] = new int[2];
//         for(int i =0;i<nums.length;i++){
//             for(int j = i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j] == target){
//                     arr[0] = i;
//                     arr[1] = j;
//                 }
//             }
//         }
//         return arr;
//     }
// }
