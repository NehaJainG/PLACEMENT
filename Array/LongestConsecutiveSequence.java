package Array;

public class LongestConsecutiveSequence {
    static boolean linearSearch(int[] array, int ele){
        for(int i = 0; i < array.length; i++){
            if(array[i] == ele) return true;
        }
        
        return false;
    }
    static int longestSuccessiveElements(int[] arr){
        //brute force 
        int max = 1;
        for(int i = 0; i < arr.length; i++){
            int x = arr[i];
            int count = 1;
            while(linearSearch(arr, ++x)){
                count++;
            }
            if(max < count) max = count;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {100,5, 200, 1, 3, 4, 6,7,8};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
