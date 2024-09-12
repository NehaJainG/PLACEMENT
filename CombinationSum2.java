import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    void helper(int ind, int t, int[] arr, List<Integer> ds, List<List<Integer>> res){
        if(t==0){
            List<Integer> temp = new ArrayList<>(ds);
            res.add(temp);
            return;
        }
        for(int i = ind; i < arr.length; i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i]>t) break; 
            ds.add(arr[i]);
            helper(i+1,t-arr[i],arr,ds,res);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,target,candidates,new ArrayList<>(), result);
        return result;
    }
}
