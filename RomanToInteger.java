import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            int val = map.get(s.charAt(i));
            //System.out.print(val + " ");
            if(i < s.length()-1 && val < map.get(s.charAt(i+1))) val = (-val);
            sum += val;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        System.out.println(romanToInt(roman));
        sc.close();
    }
}
