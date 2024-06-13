package sorting;

import java.util.Scanner;

public class InsertionSort {

    static int[] insertionSort(int arr[], int n){

        /*
         * place an element from unsorted array to crct position of sorted array
         */

        for(int i = 1; i < n; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
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

        array = insertionSort(array, n);

        System.out.println("Sorted array");;
        for(int i : array){
            System.out.print(i+" ");
        }

        sc.close();
    }
    
}
