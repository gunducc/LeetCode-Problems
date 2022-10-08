class Solution {
    
    long product = -1;
    int mod = 1000000007;
    
    public int maxProductPath(int[][] grid) {
         
         dfs(grid, 0, 0, grid[0][0]);
         return (int)(product%mod);
    }
    
    public void dfs(int[][] grid, int x, int y, long curr){
 
        if (grid[x][y]==0){
            product = Math.max(product,0);
            return;
        }
            

        if (x==grid.length-1 && y==grid[0].length-1){
            product = Math.max(product,curr);
            return;   
        }
        
        if (x+1<grid.length)
            dfs(grid, x+1, y, curr*grid[x+1][y]);
        
        if (y+1<grid[0].length){
            dfs(grid, x, y+1, curr*grid[x][y+1]);
        }
        
    }
    
}