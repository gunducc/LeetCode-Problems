class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int xs = 0;
        int xe = matrix[0].length-1;
        int ys = 0;
        int ye = matrix.length-1;
        
        while(xs<=xe && ys<=ye){
            
            for (int x=xs; x<=xe; x++){
                result.add(matrix[ys][x]);           
            }
            ys++;

            for (int y=ys; y<=ye; y++){
                result.add(matrix[y][xe]);            
            }
            xe--;

            for (int x=xe; x>=xs && ys<=ye; x--){
                result.add(matrix[ye][x]);            
            }
            ye--;

            for (int y=ye; y>=ys && xs<=xe; y--){
                result.add(matrix[y][xs]);           
            }
            xs++;
            
        }
        
        return result;
    }
    
   
}