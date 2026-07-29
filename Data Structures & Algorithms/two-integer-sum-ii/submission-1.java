class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start =0; int end = numbers.length-1;
        int result[] = new int[2];
        while(start<end){
            if(numbers[start]+numbers[end] == target){
                return new int[]{start+1,end+1};
            }else if(numbers[start]+numbers[end] < target){
                start++;
            }else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int result[] = new int[2];
//         for(int i =1;i<numbers.length;i++){
//             for(int j=1;j<numbers.length;j++){
//                 if(i!= j){
//                     if(numbers[i]+numbers[j] == target){
//                         result[1] = j;
//                         result[0] = i;
//                     }
//                 }
//             }
//         }
//         Arrays.sort(result);
//         return result;
//     }
// }
