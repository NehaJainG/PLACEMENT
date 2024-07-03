package Array;

import java.util.Scanner;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        //kendane's method

        int sum = nums[0], max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(sum < 0) sum = 0;
            sum += nums[i];
            if(sum > max) max = sum;
        }
        return max;
    }

    static void printMaxSubArray(int[] nums){
        int sum = nums[0], max = nums[0],left = 0, right = 0;

        for(int i = 0; i < nums.length; i++){
            if(sum < 0){
                left = i;
                sum = 0;
            }
            sum += nums[i];
            if(sum > max){
                max = sum;
                right = i;
            }
        }
        System.out.println("Sum " + max);
        System.out.print("SubArray: ");
        for(int i = left; i <= right; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int  i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //{1};
        //{5,4,-1,7,8};
        //{-2,1,-3,4,-1,2,1,-5,4};
        //System.out.println(maxSubArray(arr));
        printMaxSubArray(arr);
        sc.close();
    }
}
