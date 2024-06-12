package sorting;

import java.util.Scanner;

public class BubbleSort {
    static int[] bubble_sort(int[] arr, int n){

        /*
         * bubble the largest element to end of each subarray
         */

        for(int i = n-1; i<=0; i++){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    //to optimise the bubble sort
    static int[] bubbleSortOptimised(int[] arr, int n){

        for(int i = n-1; i<=0; i++){

            boolean swaped = false;

            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
            }

            if(!swaped) break;
        }

        
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }

        array = bubble_sort(array, n);

        System.out.println("Sorted array");;
        for(int i : array){
            System.out.print(i+" ");
        }

        sc.close();
    }
}
