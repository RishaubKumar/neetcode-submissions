// Brute force:
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//       for(int i = 0;i<matrix.length;i++){
//         for(int j = 0;j<matrix[0].length;j++){
//             if(target == matrix[i][j]){
//                 return true;
//             }
//         }
//       } 
//       return false; 
//     }
// }

// using Binary search

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int lo = 0;
        int hi = rows*cols-1;
        while(lo <=hi){
            int mid = lo+(hi-lo)/2;
            int val = matrix[mid/cols][mid%cols];
            if(val == target){
                return true;
            }else if(val<target){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return false;
    }
}
