import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* for(int i = 0; i < n; i++){
    System.out.print(ANSI_YELLOW + list2.get(i) + ANSI_RESET + " ");
}
 */
public class Solution2 {
    public static final String ANSI_RESET = "\u001B[0m"; 
  
    // Declaring the color 
    // Custom declaration 
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED_BACKGROUND 
        = "\u001B[41m";  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            list.add(sc.nextLine());
        }
        
        Collections.reverse(list);
        Collections.copy(list2, list);

        for(int i = 0; i < n; i++){
            System.out.print(ANSI_YELLOW + list2.get(i) + ANSI_RESET + " ");
        }

        sc.close();

    }
}
