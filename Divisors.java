import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {
    static ArrayList<Integer> findDivisorsOfn(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        divisors.add(1);
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                divisors.add(i);
                divisors.add(n/i);
            }
        }
        return divisors;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> result = findDivisorsOfn(n);
        int sum = 0;

        System.out.println("all divisors:");
        for (Integer i : result ) {
            System.out.print(i+" ");
            sum += i;
        }
        System.out.println("\nsum: "+sum);
        sc.close();
    }
}
