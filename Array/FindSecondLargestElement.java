package Array;

import java.util.Arrays;

//for finding smallest element you need to just tweak operators and indexes

public class FindSecondLargestElement {
    public static int secondLargestElement(int[] arr){
        //its a brute force method 
        //works for array without duplicates 
        //Time complexity: O(n*log(n))
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static int findSecondLargestElement(int[] array){
        //optimal
        int secondLargest = Integer.MIN_VALUE, largest = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(largest < array[i]){
                secondLargest = largest;
                largest = array[i];
            }else if( array[i] > secondLargest && array[i] != largest){
                secondLargest = array[i];
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String args[]){
        int[] arr = {3,6,1,81,64,90};
        //System.out.println("Second Largest element(Brute force): " + secondLargestElement(arr));
        System.out.println("Second Largest element(optimal): "+findSecondLargestElement(arr));
    }
}
