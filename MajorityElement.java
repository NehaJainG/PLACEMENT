import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    //using hash map to solve this
    public static int majorityElementHashMap(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0) + 1);
        }
        int n = nums.length / 2;
        
        for(int key : map.keySet()){
            if( n < map.get(key)) return key;
        }

        return 0;
    }

    //second approach is sorting the array and majority element will be present at n/2 position
    //because it occurs n/2 atleast

    public static int majorityElementSorting(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int num[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElementSorting(num));
    }

}
