class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    numIslandsUtil(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void numIslandsUtil(char[][] grid , int i , int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length ||
        grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '2';

        numIslandsUtil(grid,i+1,j);
        numIslandsUtil(grid,i-1,j);
        numIslandsUtil(grid,i,j+1);
        numIslandsUtil(grid,i,j-1);
    }
}
