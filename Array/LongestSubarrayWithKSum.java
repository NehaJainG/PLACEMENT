package Array;

import java.util.HashMap;

//Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
/* Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3. */

public class LongestSubarrayWithKSum {

    public static int longestSubarrayWithKSum1(int[] a,int k){
        HashMap<Integer,Integer> preSumMap = new HashMap<>();
        int sum =  0;
        int maxLen = 0;

        for(int i = 0; i < a.length; i++){
            sum += a[i];
            if(sum == k){
                maxLen = i + 1;
            }
            int rem = sum - k;
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum, i);
            }

        }

        return maxLen;
    }

    public static int longestSubarrayWithKSum(int[] a, int k){
        //two pointer approach that only works for postives and zeros
        int maxLen = 0, sum = a[0];
        int left = 0, right =0;
        while( right < a.length){
            while(left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if(right < a.length) sum += a[right];
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        System.out.println("Longest subarray with 10 as sum: " + longestSubarrayWithKSum(arr, 10));
            
    }
}
