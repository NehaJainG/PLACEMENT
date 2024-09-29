package DP;

import java.util.Arrays;

public class MinimumPathSum {
    //recursion method
    int path(int i, int j, int[][] grid){
        if(i==0&&j==0) return grid[i][j];
        if(i<0||j<0) return Integer.MAX_VALUE;

        int left = path(i-1,j,grid);
        int up = path(i,j-1,grid);

        return Math.min(up,left)+grid[i][j];
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return path(m-1,n-1,grid);
    }

    //memoization method:
    int path(int i, int j, int[][] grid, int[][] dp){
        if(i==0&&j==0) return grid[i][j];
        if(i<0||j<0) return Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];

        int left = path(i-1,j,grid,dp);
        int up = path(i,j-1,grid,dp);

        return dp[i][j] = Math.min(up,left)+grid[i][j];
    }
    public int minPathSum2(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][]dp = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return path(m-1,n-1,grid,dp);
    }

    //tabulation method:
    public int minPathSum3(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][]dp = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(i==0&&j==0) {
                    dp[0][0] = grid[0][0];
                }else{
                    int left = i>0 ? dp[i-1][j] : Integer.MAX_VALUE;
                    int up = j>0 ? dp[i][j-1] : Integer.MAX_VALUE;
                    dp[i][j] = Math.min(left,up) + grid[i][j];
                }
            }
        }
        return dp[m-1][n-1];
    }

    //space optimised
        public int minPathSum4(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[]prev = new int[n];
        Arrays.fill(prev,Integer.MAX_VALUE);
        
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(i==0&&j==0) {
                    prev[0] = grid[0][0];
                }else{
                    int left = j>0 ? prev[j-1] : Integer.MAX_VALUE;
                    prev[j] = Math.min(left,prev[j]) + grid[i][j];
                }
            }
        }
        return prev[n-1];
    }
}
