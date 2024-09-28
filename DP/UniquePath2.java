package DP;

import java.util.Arrays;

public class UniquePath2 {
    //memioation
    int path(int i, int j, int[][]arr, int[][]dp){
        if(i<0||j<0) return 0;
        if(arr[i][j] == 1)return 0;
        if(i==0&&j==0)return 1;
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = path(i-1,j,arr,dp)+path(i,j-1,arr,dp);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return path(m-1,n-1,obstacleGrid,dp);
    }

    //tabulation method:
    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(obstacleGrid[i][j]==1) continue;
                if(i==0&&j==0)dp[i][j] =1;
                if(i>0) dp[i][j] += dp[i-1][j];
                if(j>0) dp[i][j] += dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
