package Array;

public class RotateArray {
    static int[] rotateArrayByOnePlace(int[] array, int len){
        //to rotate left side
        int temp = array[0];
        for(int i = 1; i < len; i++){
            array[i-1] = array[i];
        }
        array[len - 1] = temp;

        return array;
    }
    static int[] rotateLeftArrayByKPlaces(int[] arr, int n, int k){
        int[] temp = new int[k];
        for(int i = 0; i < k; i++){
            temp[i] = arr[i];
        }
        for(int i = k; i < n; i++){
            arr[i-k] = arr[i];
        }
        for(int i = n- k; i < n; i++){
            arr[i] = temp[i - (n-k)];
        }
        return arr;
    }

    static int[] rotateRightArrayByKPlaces(int[] arr,int n, int k){
        k = k % n;
        int[] temp = new int[k];
        for(int i = n - k; i < n; i++){
            temp[i - n + k] = arr[i];
        }
        for(int i = n - 1 ; i >= k; i--){
            arr[i] = arr[i - k];
        }
        for(int i = 0; i < k; i++){
            arr[i] = temp[i];
        }

        return arr;
    }
    
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k) {
        //optimal approach
        // 1 2 3 4 5 6 7 --> here k = 3
        // 4 3 2 1 5 6 7 --> reverse 0 to n - k
        // 4 3 2 1 7 6 5 --> reverse last k elements
        // 5 6 7 1 2 3 4 --> reverse full array
        int n=nums.length;
        k = k%n;

        reverse(nums, 0, n-k-1);
        
        reverse(nums, n-k, n-1);

        reverse(nums, 0, n-1);
    }

    static void display(int[] array){
        for(int ele : array){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7};
        //int [] arr2 = {3,6,1,81,64,90};
        display(arr);
        rotate(arr,3);
        display(arr);


    }
}
