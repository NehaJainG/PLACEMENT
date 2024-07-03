import java.util.Scanner;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int p1 = 0, p2 = 0;
        while(p1 < s.length() && p2 < t.length()){
            if(s.charAt(p1) == t.charAt(p2)) p1++;
            p2++;
        }

        if(p1 == s.length()) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(t + " is subsequence of " + s + "? " + isSubsequence(s,t));

        sc.close();
    }
}
