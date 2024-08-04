import java.util.Scanner;

public class IncomeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of hours worked: ");
        int hr = sc.nextInt();

        if(hr > 24 || hr < 0){
            System.out.println("Unable to calculate the earnings");
        }else{
            System.out.println("Annual income: " + (hr*100*365));
        }

        sc.close();
    }
}
