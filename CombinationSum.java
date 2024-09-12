import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public void sumSets(int ind, int t, int[] arr, 
                List<Integer> ds, List<List<Integer>>res){
                    if(t==0){
                        List<Integer> temp = new ArrayList<>();
                        temp.addAll(ds);
                        res.add(temp);
                        return;
                    }
                    if(ind>=arr.length || t<0 ){
                        return;
                    }

                    ds.add(arr[ind]);
                    sumSets(ind,t-arr[ind],arr,ds,res);
                    ds.remove(ds.size()-1);
                    sumSets(ind+1,t,arr,ds,res);
                }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<Integer>();
        sumSets(0,target,candidates,ds,result);
        return result;
    }
}
