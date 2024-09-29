package DP;

public class FrogJump {
    //memoiation
    public int minEnergy(int i, int arr[], int[] dp){
        if(i<=0) return 0;
        if(dp[i] != -1) return dp[i];
        
        int left = minEnergy(i-1, arr, dp) + Math.abs(arr[i]-arr[i-1]);
        int right = Integer.MAX_VALUE;
        if(i>1) right = minEnergy(i-2,arr,dp) + Math.abs(arr[i]-arr[i-2]);
        dp[i] = Math.min(left,right);
        return dp[i];
    }
    public int minimumEnergy(int arr[],int N){
        //code here
        int[]ds = new int[N+1];
        for(int i =0; i <= N; i++){
            ds[i]=-1;
        }
        return minEnergy(N-1,arr,ds);
    }

    //dp method
    public int minimumEnergy2(int arr[],int N){
        //code here
        int[]dp = new int[N];
        dp[0]=0;
        for(int i =1; i<N; i++){
            int fs = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i>1) ss = dp[i-2] + Math.abs(arr[i] - arr[i-2]);
            dp[i] = Math.min(fs,ss);
        }
        return dp[N-1];
    }

    //dp with space optimisation
    public int minimumEnergy3(int arr[],int N){
        //code here
        int prev=0 , prev2=0;
        for(int i =1; i<N; i++){
            int fs = prev + Math.abs(arr[i] - arr[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i>1) ss = prev2 + Math.abs(arr[i] - arr[i-2]);
            prev2=prev;
            prev = Math.min(fs,ss);
        }
        return prev;
    }
}
