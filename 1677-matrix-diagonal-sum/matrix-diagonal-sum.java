class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        int half = n/2;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j && n%2==0){
                    sum = sum+mat[i][j];
                }
                if(i==j && n%2!=0){
                    if(i != half)
                        sum = sum+mat[i][j];
                }
                if(i+j == n-1){
                    sum = sum+mat[i][j];
                }
        }   
        }
        return sum;
    }
}