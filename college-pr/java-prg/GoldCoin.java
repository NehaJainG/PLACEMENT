import java.util.Scanner;

public class GoldCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter meenu's age ");
        int age = sc .nextInt();
        if(age <= 0){
            System.out.println("Invalid Age");
        }else{
            System.out.println("Count of gold coins: " + (int) Math.pow(age, 3));
        }
        sc.close();
    }
}
