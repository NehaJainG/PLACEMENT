
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
