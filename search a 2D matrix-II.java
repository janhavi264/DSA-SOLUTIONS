class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
     int Rows=matrix.length;//total rows in matrix
     int Columns=matrix[0].length;//total columns in a matrix
     int r=0; //row number(first row)
     int c= Columns-1; //column number
     while(r<Rows && c>=0){
        if(matrix[r][c]==target){
            return true;
        }else if(target<matrix[r][c]){
            c=c-1;
        }else{
            r=r+1;
        }
     } 
     return false;
    }
}


