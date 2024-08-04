package Array;

import java.util.Scanner;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        // arr = [1,0,3] //len == 3
        //sum of first 3 number =( 3 * 4 ) / 2 ==> 6 = sum
        //subtract every value in array with sum. At last it will be left with number which is missing
        // 6 - 1 - 0 - 3 = 2
        int sum = nums.length * (nums.length + 1) / 2; //sum of first n numbers formula
        for(int i = 0; i < nums.length; i++) sum -= nums[i];
        return sum;
    }

    static int missingNumberXOR(int[] nums){
        int XOR = 0;
        for(int i = 0; i < nums.length; i++){
            XOR = XOR ^ nums[i] ^ (i+1);
        }
        //XOR = XOR ^ nums.length;
        return XOR;
    }

    public static void main(String[] args) {
        //int arr[] = {9,6,4,2,3,5,7,0,1};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr));
        System.out.println("XOR method: " + missingNumberXOR(arr));
        sc.close();
    }
}
