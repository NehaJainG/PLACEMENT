import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDifferenceOf2Array {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> diff = new ArrayList<>();
        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        HashSet<Integer> ans1 = new HashSet<>();
        HashSet<Integer> ans2 = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            ans1.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++){
            ans2.add(nums2[i]);
        }

        for(int e : ans1){
            if(!ans2.contains(e)) diff1.add(e);
        }

        for(int e : ans2){
            if(!ans1.contains(e)) diff2.add(e);
        }

        diff.add(diff1);
        diff.add(diff2);

        return diff;
    }
    
    public static void main(String[] args) {
        
    }
}
