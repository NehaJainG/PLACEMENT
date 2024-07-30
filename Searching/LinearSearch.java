package Searching;

import java.util.Scanner;

public class LinearSearch {
    static int linearSearch(int[] arr, int searchElement){
        for( int i = 0; i < arr.length; i++){
            if(arr[i] == searchElement){
                return (i + 1);
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
        int pos = linearSearch(arr, searchElement);
        if( pos != -1){
            System.out.println("Element is found at position " + pos);
        }else{
            System.out.println("Element is not found");
        }

    }
}
