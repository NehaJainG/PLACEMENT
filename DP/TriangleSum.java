package DP;

import java.util.ArrayList;
import java.util.List;

public class TriangleSum {
        public int minimumTotal(List<List<Integer>> t) {
        int minSum = Integer.MAX_VALUE;
        int n = t.size();
        List<List<Integer>> dp = new ArrayList<>();
        dp.add(t.get(0));
        for(int i =1; i<n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<t.get(i).size();j++){
                int left = (j<dp.get(i-1).size()) ? dp.get(i-1).get(j): Integer.MAX_VALUE;
                int right = (j>0) ? dp.get(i-1).get(j-1):Integer.MAX_VALUE;
                temp.add(Math.min(left,right)+t.get(i).get(j));
            }
            dp.add(temp);
            temp.forEach(item -> System.out.print(item+" "));
            System.out.println();
        }
        for(int i =0; i<t.get(n-1).size(); i++){
            minSum = Math.min(minSum, dp.get(n-1).get(i));
        }
        return minSum;
    }
}
