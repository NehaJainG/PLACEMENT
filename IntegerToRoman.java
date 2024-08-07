import java.util.HashMap;

// Example 1:

// Input: num = 3749

// Output: "MMMDCCXLIX"

// Explanation:

// 3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
//  700 = DCC as 500 (D) + 100 (C) + 100 (C)
//   40 = XL as 10 (X) less of 50 (L)
//    9 = IX as 1 (I) less of 10 (X)
// Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places

public class IntegerToRoman {
    public static String intToRoman(int num) {
        
        //if you are allowed to use only crucial symbols. Then use this solution

        HashMap<Integer,String> symbols = new HashMap<Integer,String>();
        String result = "";
        int pos = 0;
        symbols.put(1,"I");symbols.put(5,"V");symbols.put(10, "X"); symbols.put(50,"L");
        symbols.put(100,"C"); symbols.put(500,"D");symbols.put(1000,"M");

        while(num > 0){
            int temp = num % 10;   //get the digit
            String t = new String();
            //System.out.println(temp);
            int key = (int) Math.pow(10, pos);   //get place of number like if 1s/1os/100th place...

            if(temp < 4){
                t = symbols.get(key).repeat(temp);    
            }else if(temp == 4){
                t =  symbols.get(key) + symbols.get( 5 * key);   
            }else if (temp < 9) {
                t = symbols.get( 5 * key) + symbols.get(key).repeat(temp - 5);
            }else{
                t =  symbols.get(key) + symbols.get( (int) Math.pow(10, pos+1)); 
            }

            result = t + " " + result;
            num /= 10;
            pos++;
        }
        return result; 
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
}
