package Array;

public class CheckSortedArray {
    static boolean isSorted(int[] array){
        if(array.length == 0 || array.length == 1) return true;

        boolean isDecendingOrder = true, isAscendingOrder  = true;

        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i+1]){
                isAscendingOrder = false;
            }else if(array[i] < array[i+1]){
                isDecendingOrder = false;
            }
        }

        return isAscendingOrder || isDecendingOrder;
    }
    public static void main(String args[]){
        int[] arr = {3,6,1,81,64,90};
        int [] arr2 = {1,2,3,3,4,5};
        System.out.println("is the array sorted? " + isSorted(arr));
        System.out.println("arr2 is sorted? " + isSorted(arr2));
    }
}
