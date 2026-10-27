class Solution {
    public int diagonalSum(int[][] mat) {
     int sum=0;
     for(int i=0;i<mat.length;i++){
        sum+=mat[i][i];
        // for(int j=mat.length-1;j>=0;j--){
        //     if(i%2!=0 || j%2!=0)
        //     sum+=mat[i][j];
        // }
        if(i!=mat.length-1-i)
        sum+=mat[i][mat.length-1-i];
     } 
     return sum;  
    }
}