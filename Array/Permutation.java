package Array;

import java.util.*;

public class Permutation {

    static void computePermutation(List<Integer> dsa, int[] n, List<List<Integer>> result, boolean[] flag){
        //this won't work if duplicates exists
        
        if(dsa.size() == n.length){
            result.add(new ArrayList<>(dsa));
            return;
        }

        for(int i = 0; i < n.length; i++){
            if(!flag[i]){
                flag[i] = true;
                dsa.add(n[i]);
                computePermutation(dsa, n, result, flag);
                dsa.remove(dsa.size() - 1);
                flag[i] = false;
            }
        }
    }

    static List<List<Integer>> allPossiblePermutation(int[] nums, int n){
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] flag = new boolean[n];
        List<Integer> dsa = new ArrayList<>();

        computePermutation(dsa,nums,ans,flag);

        return ans;
    }

    static void computePermutation2(int[] nums, int begin, List<List<Integer>> ans){

        if(begin == nums.length){
            List<Integer> permutation = new ArrayList<>(nums.length);
            for(int i = 0 ; i < nums.length; i++){
                permutation.add(nums[i]);
            }
            ans.add(permutation);
            return;
        }

        for(int i = begin; i < nums.length; i++){
            int temp = nums[begin];
            nums[begin] = nums[i];
            nums[i] = temp;
            computePermutation2(nums, begin+1, ans);
            temp = nums[begin];
            nums[begin] = nums[i];
            nums[i] = temp;
        }
    }

    static List<List<Integer>> findAllPossiblePrermutation(int[] nums, int n){
        List<List<Integer>> result = new ArrayList<>();

        computePermutation2( nums, 0,result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        //System.out.println(allPossiblePermutation(arr, 3));
        System.out.println(findAllPossiblePrermutation(arr, 3));
    }
}
