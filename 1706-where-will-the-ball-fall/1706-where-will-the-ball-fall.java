class Solution {
    public int[] findBall(int[][] grid) {
        int[] result = new int[grid[0].length];
        for (int i=0; i<grid[0].length; i++){
            result[i] = dfs(grid, 0, i);
        }
        return result;
    }
    
    public int dfs(int[][] grid, int row, int column){
        
        if (row==grid.length)
            return column;
                  
        if (grid[row][column]==1) {
            if (column==grid[row].length-1||grid[row][column+1]==-1)
                return -1;
            else
                return dfs(grid,row+1,column+1);
        }
        
        if (grid[row][column]==-1) {
            if (column==0||grid[row][column-1]==1)
                return -1;
            else
                return dfs(grid,row+1,column-1);
        }        
        return -1;
    }
    
}