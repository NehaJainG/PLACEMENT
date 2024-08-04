import java.util.ArrayList;
import java.util.Scanner;

public class FindMissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> missing = new ArrayList<Integer>();
        
        //get inputs
        int range = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //for each item in range
        for(int i = 1; i <= range; i++){
            boolean  flag = false;
            //search through the loop
            for(int j : arr) 
                if(j == i) {
                    flag = true;
                    break;
                }
            if(!flag) missing.add(i);
        }

        System.out.println("Missing elements");
        for(int i : missing) System.out.print(i + " ");

        sc.close();


    }
}
