class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
    
        int rowstart=0;
        int rowend=matrix.length - 1;
        int colstart=0;
        int colend=matrix[0].length - 1;
        while(rowstart<=rowend && colstart<=colend){
            for(int col=colstart;col<=colend;col++){
                res.add(matrix[rowstart][col]);
            }
            rowstart++;
            for(int row=rowstart;row<=rowend;row++){
                res.add(matrix[row][colend]);
            }
            colend--;
            if (rowstart <= rowend) {
            for(int col=colend;col>=colstart;col--){
                res.add(matrix[rowend][col]);
            }
            rowend--;
            }
            if (colstart <= colend) {
            for(int row=rowend;row>=rowstart;row--){
                res.add(matrix[row][colstart]);
            }
            colstart++;
            }
        }
        return res;
    }
}
