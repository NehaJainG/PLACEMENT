package sorting;

import java.util.Scanner;

public class Selection {
    static int[] selection_sort(int[] arr, int n){

        /*
         * To remember this:
         * As name suggest select minimum/maximum element 
         * and place at their right postion(ie., to the start or end)
        */

        for(int i = 0; i<n ; i++){
            int min = i;
            for(int j = i; j < n; j++)
                if(arr[j] < arr[min]) min = j;

            //swap:
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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

        array = selection_sort(array, n);

        for(int i : array){
            System.out.print(i+" ");
        }

        sc.close();
    }
}
