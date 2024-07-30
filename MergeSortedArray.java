/*
problem: 
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, 
 * but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, 
 * where the first m elements denote the elements that should be merged, 
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

import java.util.Scanner;

public class MergeSortedArray {
    public static void merge_N2(int[] nums1, int m, int[] nums2, int n) {
        int j = 0; //pointer to num2 array
        for(int i = m; i < m+n; i++){
            int k = i;
            nums1[k] = nums2[j++];
            while(k > 0 && nums1[k] < nums1[k-1]){
                int temp = nums1[k];
                nums1[k] = nums1[k-1];
                nums1[k-1] = temp;
                k--;
            }
        }  
    }

    public void merge_optimal(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1; //pointer to nums1
        int p2 = n-1; //pointer to nums2

        for(int i = n + m - 1; i >=0; i--){

            if(p1 < 0){
                nums1[i] = nums2[p2--];
            }
            else if(p2 < 0){
                nums1[i] = nums1[p1--];
            }
            else if(nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1--];
            }
            else{
                nums1[i] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];
        for(int i =0;i<m+n;i++){
            nums1[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            nums2[i] = sc.nextInt();
        }
        merge_N2(nums1, m, nums2, n);
        for(int i : nums1){
            System.out.print(i+" ");
        }

        sc.close();
        
    }
    
}


