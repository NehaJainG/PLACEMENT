package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {
    static List<Integer> majorityElement(int[] nums) {
        List<Integer> majority = new ArrayList<Integer>();
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0) + 1);
            if(freq.get(nums[i]) == (nums.length/3) + 1){
                majority.add(nums[i]);
            }
            if(majority.size() == 2) break;
        }

        return majority;
    }

    static List<Integer> majorityElement2(int[] nums) {
        List<Integer> majority = new ArrayList<Integer>();
        
        int c1 = 0, c2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(c1 == 0 && nums[i] != ele2){
                ele1 = nums[i];
                c1++;
            }else if(c2 == 0 && nums[i] != ele1){
                ele2 = nums[i];
                c2++;
            }else if(nums[i] == ele1){
                c1++;
            }else if(nums[i] == ele2){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }

        c1 = 0; c2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(ele1 == nums[i]) c1++;
            if(ele2 == nums[i]) c2++;
        }

        if(c1 > (nums.length/3)) majority.add(ele1);
        if(c2 > (nums.length/3)) majority.add(ele2);

        return majority;
        
    }
}
