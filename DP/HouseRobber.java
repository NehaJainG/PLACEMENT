package DP;

import java.util.Arrays;

public class HouseRobber {
    //recursion solution, works but time exceeds
    public int maxSumOfNonSub(int ind, int[] nums){
        if(ind == 0) return nums[0];
        if(ind<0) return 0;
        int pick = nums[ind] + maxSumOfNonSub(ind-2,nums);
        int notPick = maxSumOfNonSub(ind-1,nums);
        return Math.max(pick,notPick);
    }
    public int rob(int[] nums) {
        return maxSumOfNonSub(nums.length-1,nums);        
    }

    //memoiation method-> next level time optimisation
        public int maxSumOfNonSub(int ind, int[] nums, int[] dp){
        if(ind == 0) return nums[0];
        if(ind<0) return 0;
        if(dp[ind] != -1) return dp[ind];
        int pick = nums[ind] + maxSumOfNonSub(ind-2,nums,dp);
        int notPick = maxSumOfNonSub(ind-1,nums,dp);
        dp[ind] = Math.max(pick,notPick);
        return dp[ind];
    }
    public int rob2(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return maxSumOfNonSub(nums.length-1,nums,dp);        
    }

    //tabulation method (reduces the recursion stack space)
    public int rob3(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i =1; i < nums.length; i++){
            int pick = ((i-2<0) ? 0:dp[i-2]) + nums[i];
            int notPick = dp[i-1];
            dp[i] = Math.max(pick,notPick);
        }
        return dp[nums.length-1];        
    }

    //more level of space optimisation
    public int rob4(int[] nums) {
        int prev = nums[0], prev2=0;
        for(int i =1; i < nums.length; i++){
            int pick = prev2 + nums[i];
            prev2=prev;
            prev = Math.max(pick,prev);
        }
        return prev;        
    }
}
