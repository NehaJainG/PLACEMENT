import java.util.Scanner;

public class LongestRepeatingSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = 0, len = 0;
        //wrong
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i+1)) len++;
            else{
                if(len > max) max = len;
                len = 0;
            }
        }
        System.out.println("Maximum len: "+ max);

        sc.close();
    }
}
