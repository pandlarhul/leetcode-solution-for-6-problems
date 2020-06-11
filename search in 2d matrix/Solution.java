public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int i = 0;
        int j = 0;
        for( i = 0; i < rowLength ; i++){
            for(j = 0; j < colLength ; j ++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
            
        }
        return false;
    }
}

