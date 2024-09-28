package DP;

public class ClimbingStairs {
    public int climbStairs(int n) {
        //recursion solution
        if(n<=3) return n;

        return climbStairs(n-1) + climbStairs(n-2);
    }

    public int climbStairs2(int n) {
        //dp solution
        if(n<=3) return n;

        int prev2 = 2, prev =3;
        int curr =0;
        for(int i = 4; i<= n; i++){
            curr = prev2+prev;
            prev2=prev;
            prev = curr;
        }
        return prev;
    }
}
