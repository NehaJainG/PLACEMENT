package Array;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    static ArrayList<Integer> findLeadersInArray(int[] nums){
        //brute force method
        ArrayList<Integer> leaders = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            boolean flag = true;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] > nums[i]) flag = false;
            }
            if(flag) leaders.add(nums[i]);
        }
        return leaders;
    }

    static ArrayList<Integer> leadersOfArray(int[] nums){
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i = nums.length - 1; i >= 0; i--){
            if(max < nums[i]){
                leaders.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(leaders);

        return leaders;
    }

    
    public static void main(String[] args) {
        int[] arr = {100,6,1,81,64,9};
        System.out.println(leadersOfArray(arr));
    }
}
