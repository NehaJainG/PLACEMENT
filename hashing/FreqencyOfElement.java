package hashing;

//import java.util.Scanner;

//BRUTE FORCE METHOD
//Solution 1: use of two loops. 
//Time complexity: O(N*N)
public class FreqencyOfElement {

    static void findFrequencyOfElement(int arr[], int n){
       boolean[] visited = new boolean[n];
       int c;

       for(int i = 0; i < n ; i++){
        if (visited[i]) continue;

        c = 0;
        for(int j = 0; j < n; j++){
            if(arr[i] == arr[j]) {
                c++;
                visited[j] = true;
            }
        }
        System.out.println(arr[i] + " " + c);
       }
    }
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        int arr[] = {10,5,10,15,10,5};
        findFrequencyOfElement(arr,arr.length);
        //sc.close();

    }
}
