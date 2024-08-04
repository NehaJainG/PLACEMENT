package sorting;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    static void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<Integer>();
        int p1 = low;
        int p2 = mid + 1;
        while(p1 <= mid && p2 <= high){
            if(arr[p1] <= arr[p2]){
                temp.add(arr[p1++]);
            }
            else{
                temp.add(arr[p2++]);
            }
        }
        while(p1 <= mid){
            temp.add(arr[p1++]);
        }
        while(p2 <= high){
            temp.add(arr[p2++]);
        }
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }
    static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }

        mergeSort(array, 0, n-1);

        System.out.println("Sorted array");;
        for(int i : array){
            System.out.print(i+" ");
        }

        sc.close();
    }
}
