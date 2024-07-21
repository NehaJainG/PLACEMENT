import java.util.*;

public class EncodeDecode {
    /* Example 1:

    Input: s = "3[a]2[bc]"
    Output: "aaabcbc"
    Example 2:

    Input: s = "3[a2[c]]"
    Output: "accaccacc"
    Example 3:

    Input: s = "2[abc]3[cd]ef"
    Output: "abcabccdcdcdef" */
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String str = "2[b10[a]]";
        //"3[abd]";
        //char[] charArr = str.toCharArray();
        String result = "";
        Stack<Integer> numStack = new Stack<>();
        Stack<String> charStack = new Stack<>();

        String temp = "";

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            System.out.println(c);
            if(Character.isDigit(c)){
                while(c <= '9' && c >= '0'){
                    temp = temp + c;
                    c = str.charAt(++i);
                }
                numStack.push(Integer.parseInt(temp));
                temp = ""; 
                i--;

            }else if(c == ']'){
                while(!charStack.isEmpty() && !charStack.peek().equals("[")){
                    temp = charStack.pop() + temp;
                }
                if(!charStack.isEmpty()) charStack.pop();
                int count = numStack.pop();
                charStack.push(temp.repeat(count));
                temp = "";

            }else{
                charStack.push(String.valueOf(c));
            }
        }
        while(!charStack.isEmpty()){
            result = charStack.pop() + result;
        }
        System.out.println(result);


    }
}
