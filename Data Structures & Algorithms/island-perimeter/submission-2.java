class Solution {
    public int islandPerimeter(int[][] grid) {

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {

                if(grid[i][j] == 1) {
                    return islandPerimeterHelper(grid, i, j);
                }
            }
        }

        return 0;
    }
    public int islandPerimeterHelper(int[][] grid, int i ,int j){
        if( i < 0 || j<0 || i >= grid.length || j >= grid[0].length || 
        grid[i][j] == 0){
            return 1;
        }
        // here whenever we will touch water that means there is a boundary , we will add that boundary to the perimeter
        if(grid[i][j] == 2){
            return 0;  
        } // this is visited condition , if visited skip
        grid[i][j] = 2; // this is the dfs condition to set visited 2/true

        return islandPerimeterHelper(grid,i+1,j)
         + islandPerimeterHelper(grid,i,j+1)
         + islandPerimeterHelper(grid,i-1,j)
         + islandPerimeterHelper(grid,i,j-1);
    }
}

// class Solution {
//     public int islandPerimeter(int[][] grid) {
//         int perimeter =0;
//         for(int i = 0;i<grid.length;i++){
//             for(int j  = 0;j<grid[0].length;j++){
//                 if(grid[i][j] == 1){
//                     perimeter += 4;

//                     // up : if upper part is 1 then
//                     if(i>0 && grid[i-1][j] == 1){
//                         perimeter--;
//                     }
//                     // leftside : if side is 1
//                     if(j >0 && grid[i][j-1] == 1){
//                         perimeter--;
//                     }
//                     // righside : if side is 1
//                     if(j<grid[0].length-1 && grid[i][j+1] == 1){
//                         perimeter--;
//                     }
//                     // down : if down is 1
//                     if(i < grid.length-1 && grid[i+1][j]== 1){
//                         perimeter--;
//                     }
//                 }
//             }
//         }
//         return perimeter;
//     }
// }