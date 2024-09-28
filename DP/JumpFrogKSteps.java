package DP;

public class JumpFrogKSteps {
    public int minCost(int ind, int arr[], int k){
        if(ind == 0)return 0;
        int min = Integer.MAX_VALUE;
        for(int j=1; j<=k;j++){
            if(ind-j<0){
              break;
            }
            int jump = minCost(ind-j, arr,k) + Math.abs(arr[ind] - arr[ind-j]);
            min = Math.min(min,jump);
        }
        return min;
    }
    public int minimizeCost(int k, int arr[]) {
        // code here
        return minCost(arr.length-1, arr,k);
    }
    
    //memoiation
    public int minCost(int ind, int arr[], int k, int[] dp){
        if(ind == 0)return 0;
        if (dp[ind]!=-1) return dp[ind];
        
        dp[ind] = Integer.MAX_VALUE;
        for(int j=1; j<=k;j++){
            if(ind-j<0){
              break;
            }
            int jump = minCost(ind-j, arr,k,dp) + Math.abs(arr[ind] - arr[ind-j]);
            dp[ind] = Math.min(dp[ind],jump);
        }
        return dp[ind];
    }
    public int minimizeCost2(int k, int arr[]) {
        // code here
        int[] dp = new int[arr.length];
        for(int i=0;i<arr.length;i++) dp[i] = -1;
        return minCost(arr.length-1, arr,k,dp);
    }

    //tabulation method
    public int minimizeCost3(int k, int arr[]) {
        // code here
        int[] dp = new int[arr.length];
        for(int i=0;i<arr.length;i++) dp[i] = -1;
        dp[0]=0;
        
        for(int i =1; i<arr.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j =1; j<=k; j++){
                if(i-j>=0){
                    int jump = dp[i-j] + Math.abs(arr[i]-arr[i-j]);
                    min = Math.min(jump,min);
                }else break;
            }
            dp[i] = min;
        }
        return dp[arr.length-1];
    }
}
