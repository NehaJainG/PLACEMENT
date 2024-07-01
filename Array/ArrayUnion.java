package Array;

import java.util.HashSet;
import java.util.ArrayList;

public class ArrayUnion {

    static int[] unionOfArray_(int[] arr1, int[] arr2){
        HashSet<Integer> unionSet = new HashSet<>();
        for(int i = 0; i < arr1.length; i++){
            unionSet.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            unionSet.add(arr2[i]);
        }

        int[] unionArray = new int[unionSet.size()];
        int i = 0;
        for(int n : unionSet){
            unionArray[i++] = n;
        }

        return unionArray;
    }

    static ArrayList<Integer> unionOfArray(int[] arr1, int[] arr2){
        //using two pointer concepts
        ArrayList<Integer> union = new ArrayList<>();

        int p1 = 0, p2 =0;

        while(p1 < arr1.length && p2 < arr2.length){
            if(arr1[p1] <= arr2[p2] ){
                //check if the element is already added to list(because it is a sorted list you only check last element) 
                //or if it is the first element
                //same goes whenever trying to add element
                if(union.size() == 0 || arr1[p1] != union.get(union.size() - 1))union.add(arr1[p1]);
                p1++;
            }else{
                if(union.size() == 0 || arr2[p2] != union.get(union.size() - 1)) union.add(arr2[p2]);
                p2++;
            }
        }
        while(p1 < arr1.length){
           if(union.get(union.size() - 1) != arr1[p1]) union.add(arr1[p1]);
           p1++;
        }
        while(p2 < arr2.length){
            if(union.get(union.size() - 1) != arr2[p2] )union.add(arr2[p2]);
            p2++;
        }

        return union;
    }

    static void display(ArrayList<Integer> array){
        for(int ele : array){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] num1 = {1,1,2,3,4,5,6};
        int[] num2 = {4,5,6,7,8,9};
        ArrayList<Integer> union = unionOfArray(num1, num2);
        display(union);
    }
}
