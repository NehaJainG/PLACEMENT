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
    
    //this question assumes that majority element is always present
    //second approach is sorting the array and majority element will be present at n/2 position
    //because it occurs n/2 atleast
    //unsorted: {2,2,1,1,1,2,2}
    //sorted  : {2,2,2,2,1,1,1}
    //n=7 ==> n/2 = 3 ==> (2)

    public static int majorityElementSorting(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    //Moore's voting algorithm:
    public static int majorityElement(int[] nums){
        int element = nums[0] , count = 1;
        for(int i = 1; i < nums.length ; i++){
            if(count == 0) element = nums[i];
            if(element == nums[i]) count++;
            else count--;
        }
        count = 0;
        for(int i = 0; i < nums.length; i++) if(nums[i] == element) count++;

        if(count > nums.length / 2) return element;
        return - 1;
    }

    public static void main(String[] args) {
        int num[] = {1,1,2,2,1};
        System.out.println(majorityElement(num));
    }

}
