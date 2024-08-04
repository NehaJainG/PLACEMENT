public class SingleNumber{

    /* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
        You must implement a solution with a linear runtime complexity and use only constant extra space. 
        Input: nums = [4,1,2,1,2]
        Output: 4*/

        public static int singleNumber(int[] nums) {
            // n ^ n = 0
            // 0 ^ n = n
            //use ^ and these explains how it is possible to find out the number which occurs once
            int ans = 0;
            for(int i = 0; i < nums.length; i++){
                ans = ans ^ nums[i];
            }
    
            return ans;
        }

    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
}