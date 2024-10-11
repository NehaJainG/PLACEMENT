package DP;

public class MaximumFallingPath {
    int minPath(int i, int j, int[][] mat){
        if(i<0||i>=mat.length||j<0||j>=mat[i].length) return Integer.MAX_VALUE;
        if(i==0) return mat[i][j];
        //if(dp[i][j]!=-1)return dp[i][j];
        int up = minPath(i-1,j,mat);
        int ld = minPath(i-1,j-1,mat);
        int rd = minPath(i-1,j+1,mat);
        System.out.println(i+" "+j+" "+up+" "+ld+" "+rd);
        return Math.min(Math.min(ld,rd),up)+mat[i][j];
    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<m;i++){
            min =Math.min(min,minPath(n-1,i,matrix));
        }
        return min;
    }

    //memoization method
    int minPath(int i, int j, int[][] mat, int[][] dp){
        if(i<0||i>=mat.length||j<0||j>=mat[i].length) return Integer.MAX_VALUE;
        if(i==0) return mat[i][j];
        if(dp[i][j]!=-1)return dp[i][j];
        int up = minPath(i-1,j,mat,dp);
        int ld = minPath(i-1,j-1,mat,dp);
        int rd = minPath(i-1,j+1,mat,dp);
        System.out.println(i+" "+j+" "+up+" "+ld+" "+rd);
        return dp[i][j] = Math.min(Math.min(ld,rd),up)+mat[i][j];
    }
    public int minFallingPathSum2(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) dp[i][j]=-1;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<m;i++){
            min =Math.min(min,minPath(n-1,i,matrix,dp));
        }
        return min;
    }

    //tabulation method
    public int minFallingPathSum3(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int mini = Integer.MAX_VALUE;
        int[][] dp = new int[n][m];
        for(int i =0; i < n; i++){
            for(int j=0; j<m; j++){
                if(i==0) dp[i][j] = matrix[i][j];
                else{
                    int min = dp[i-1][j];
                    if(j>0) min = Math.min(dp[i-1][j-1],min);
                    if(j<m-1) min = Math.min(dp[i-1][j+1],min);
                    dp[i][j] = min+matrix[i][j];
                }
            }
        }
        for(int i=0; i<m;i++){
            if(mini>dp[n-1][i]) mini = dp[n-1][i];
        }
        return mini;
    }

}
