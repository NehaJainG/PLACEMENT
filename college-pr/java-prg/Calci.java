import java.util.Scanner;

public class Calci {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Shift left " + (a<<b));
        System.out.println("Shift right " + (a>>b));
        System.out.println("Xor on itself " + (a ^ a ));
        System.out.println("And " + (a & b) );
        System.out.println("OR " + (a | b));
        if((a^1) == a+1) System.out.println("Even number");
        else System.out.println("Odd number");


    }
    
}
