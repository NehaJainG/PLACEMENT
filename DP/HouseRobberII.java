package DP;

import java.util.Arrays;

public class HouseRobberII {
        public int robI(int[] nums) {
        int prev = nums[0], prev2=0;
        for(int i =1; i < nums.length; i++){
            int pick = prev2 + nums[i];
            prev2=prev;
            prev = Math.max(pick,prev);
        }
        return prev;        
    }

    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int ans1 = robI(Arrays.copyOfRange(nums,0,nums.length-1));
        int ans2 = robI(Arrays.copyOfRange(nums,1,nums.length));
        return Math.max(ans1,ans2);
    }
}
