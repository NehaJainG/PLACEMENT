import java.util.Scanner;

public class GainPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cost price ");
        int a = sc.nextInt();
        System.out.print("Repair price ");
        int b = sc.nextInt();
        System.out.print("Selling price ");
        int c = sc.nextInt();

        if(a < 0 || b < 0 || c < 0){
            System.out.println("Incorrect inputs");
        }else if(a+b > c){
            System.out.println("Unable to calculate Gain percentage");
        }else{
            System.out.printf("Gain percentage %.2f" ,(double) ((c - a + b) * 100)/(a+b));
        }


        sc.close();
    }
}
