package Array;

import java.util.Arrays;

public class NextPermutation {

    static void  reverse(int[] nums){
        int low = 0, high = nums.length - 1;
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp; 
        }
    }


    public static void nextPermutation(int[] nums) {
        int breakPoint = -1;
        
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                breakPoint = i;
                break;
            }
        }
        
        if(breakPoint == -1) {
            reverse(nums);
            return;
        }
        
        int small = breakPoint + 1;
        for(int i = breakPoint + 2; i < nums.length; i++){
            if(nums[i] < nums[small] && nums[i] > nums[breakPoint]){
                small = i;
            }
        }

        int temp = nums[small]; 
        nums[small] = nums[breakPoint];
        nums[breakPoint] = temp;

        Arrays.sort(nums,breakPoint + 1, nums.length);


    }

    public static void main(String[] args) {
        int[] arr = {3,2,1};
       nextPermutation(arr);

       for(int i : arr){
        System.out.print(i + " ");
       }
    }   
    
}
