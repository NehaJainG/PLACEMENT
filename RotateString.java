
import java.util.*;

public class RotateString {

    // public static void reverse(char[] nums, int start, int end){
    //     while(start < end){
    //         char temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }

    public boolean rotateString(String s, String goal) {
        //brute force method
        for(int i = 0; i < s.length();i++){
            s = s.substring(1) + s.charAt(0);
            if(s.equals(goal)) return true;
        }
        return false;
    }

    public boolean rotateString2(String s, String goal) {
        //optimal approach. but it takes space.
        if(s.length() != goal.length()) return false;
        String combined = s+s;
        return combined.contains(goal);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        //char[] str = str1.toCharArray();
        List<Character> strList1 = new ArrayList<Character>();
        List<Character> strList2 = new ArrayList<>();
        for(char c : str1.toCharArray()){
            strList1.add(c);
        }
        for(char c:str2.toCharArray()){
            strList2.add(c);
        }
        int k = sc.nextInt();

        
        Collections.rotate(strList1, k);
        System.out.println(strList1.equals(strList2) +""+ strList1);
        Collections.rotate(strList1, str1.length() - (2 * k));
        System.out.println(strList1.equals(strList2) +""+ strList1);
        System.out.println(str1);
        System.out.println(str2);

        sc.close();

    }
}
