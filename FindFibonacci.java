import java.util.Scanner;

public class FindFibonacci {
    static int fibonacci(int num){
        if(num == 1 || num == 2) return num - 1;
        return fibonacci(num-1) + fibonacci(num-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }
}
