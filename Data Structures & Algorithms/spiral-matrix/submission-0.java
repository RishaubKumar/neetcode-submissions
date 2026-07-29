class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       ArrayList<Integer> list = new ArrayList<>();
        int startRow = 0, endRow = matrix.length-1,startCol = 0, endCol = matrix[0].length-1;
        while(startRow<= endRow && startCol <=endCol){
            // printing first row
            for(int i = startCol;i<=endCol;i++){
                list.add(matrix[startRow][i]);
            }
            // Right side col print
            for(int i = startRow+1;i<=endRow;i++){
                list.add(matrix[i][endCol]);
            }
            // lower side
            for(int i = endCol-1;i>=startCol;i--){
                if(startRow == endRow){
                    break;
                }
                list.add(matrix[endRow][i]);
            }
            for(int i = endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                list.add(matrix[i][startCol]);
            }
            startRow++;endRow--;startCol++;endCol--;
        }
        return list;
    }
}
