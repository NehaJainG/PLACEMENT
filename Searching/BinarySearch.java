package Searching;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] arr, int k){
        int low = 0, high = arr.length;
        int mid = 0;
        while(low<high){
            mid = (low + high) / 2;
            if(arr[mid] == k) return (mid + 1);
            else if(arr[mid] < k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.print("Enter no of elements ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array");
        for(; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched ");
        int searchElement = sc.nextInt();
        int pos = binarySearch(arr, searchElement);
        if( pos != -1){
            System.out.println("Element is found at position " + pos);
        }else{
            System.out.println("Element is not found");
        }
    }
}
