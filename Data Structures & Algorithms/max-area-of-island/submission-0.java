// I am going to solve this question by simple way , first I will calculate number of islands with there area in two separte function, then I will compare the area and return the maximum area in maxAreaOfland function: 

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea,areaOfIsland(grid,i,j));
                }
            }
        }
        return maxArea;
    }
    // area of island
   // number of island
   public static int areaOfIsland(int[][] grid,int i ,int j){
    if( i <0 || j< 0 || grid.length <= i || grid[0].length <= j || grid[i][j] != 1){
        return 0;
    }
    grid[i][j] = 2;

    return areaOfIsland(grid,i+1,j)+
    areaOfIsland(grid,i-1,j)+
    areaOfIsland(grid,i,j+1)+
    areaOfIsland(grid,i,j-1)+1;

   }
}
