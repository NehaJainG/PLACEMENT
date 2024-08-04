import java.util.Scanner;

public class RotateArray {
    public static int[] rotateArray(int[] arr, int k){
        // k is no of rotation to be performed
        //brute force solution

        for(int j = 0; j < k ; j++){
            int temp=arr[arr.length-1];
            for(int i = arr.length-1; i > 0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }

        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of rotation to be performed");
        int k = sc.nextInt();

        arr = rotateArray(arr, k);

        for(int i : arr)  System.out.print(i + " " );

        sc.close();
    }
}
