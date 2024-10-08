package DP;

import java.util.Arrays;

public class UniquePath {

    //recursion solution:
    public int path(int m, int n){
        if(m==0 && n==0)return 1;
        if(m<0||n<0)return 0;

        int up = path(m-1,n);
        int down = path(m,n-1);

        return up+down;
    }
    public int uniquePaths1(int m, int n) {
        return path(m-1,n-1);
    }
    
    //memoiation method:
        public int path(int m, int n, int[][] dp){
        if(m==0 && n==0)return 1;
        if(m<0||n<0)return 0;
        if(dp[m][n] !=-1) return dp[m][n];

        int up = path(m-1,n,dp);
        int down = path(m,n-1,dp);
        dp[m][n] = up+down;
        return dp[m][n];
    }
    public int uniquePaths2(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i =0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return path(m-1,n-1,dp);
    }

    //tabulation method:
    public int uniquePaths3(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i =0; i <m;i++){
            for(int j=0; j<n; j++){
                if(i!=0) dp[i][j] += dp[i-1][j];
                if(j!=0) dp[i][j] += dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
