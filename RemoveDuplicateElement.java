// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.

import java.util.Scanner;

public class RemoveDuplicateElement {
    public static int removeDuplicates(int[] nums) {
        //function works for only sorted array.
        int pos = 0;
        for( int eleIndex = 1; eleIndex < nums.length; eleIndex++){
            if(nums[eleIndex] != nums[pos]){
                pos++;
                nums[pos] = nums[eleIndex];
            }
        }

        return pos;
    }

    public static void main(String[] args) {
        int k;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i < n; i++){
            nums[i] = sc.nextInt();
        }

        k = removeDuplicates(nums);

        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
    
}

// Custom Judge:

// The judge will test your solution with the following code:

// int[] nums = [...]; // Input array
// int[] expectedNums = [...]; // The expected answer with correct length

// int k = removeDuplicates(nums); // Calls your implementation

// assert k == expectedNums.length;
// for (int i = 0; i < k; i++) {
//     assert nums[i] == expectedNums[i];
// }
// If all assertions pass, then your solution will be accepted.


// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).
 