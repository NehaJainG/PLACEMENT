import java.util.Scanner;

public class CheckPrime {
    //try out this using square root of n.

    public static boolean isPrime(int number){
        return ((number - 1) % 6 == 0 ) || ((number + 1) % 6 == 0 );
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int sum = 0; 
        //int num2 = sc.nextInt();
        // for(int i = num1; i < num2; i++){
        //     if(isPrime(i) && i % 10 == 1) System.out.print(i + " ");
        // }
        while(num1 > 0){
            sum += (num1 % 10);
            num1 = num1 / 10;
            if(sum < 10 && num1 == 0) break;
            if(num1 == 0) num1 = sum;
        }
        System.out.println(sum);
    }
    
}
