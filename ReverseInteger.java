import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int x) {
        //problem:
        //Given a signed 32-bit integer x, return x with its digits reversed. 
        //If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], 
        //then return 0. Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
        long rev = 0;
        while(x != 0){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        
        return (int) rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((int) Math.pow(2, 31));
        System.out.println(reverse(num));
        sc.close();
    }
}
