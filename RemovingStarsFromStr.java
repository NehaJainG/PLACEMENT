import java.util.Stack;

public class RemovingStarsFromStr {
    public String removeStars(String s) {
        //using stack- overhead method
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(c == '*' && !stack.isEmpty()){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        String result = "";
        while(!stack.empty()){
            result = stack.pop() + result;
        }

        return result;
    }

    public String removeStars2(String s) {
        //using Stringbuilder alone
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                result.deleteCharAt(result.length() - 1);
            }else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }


}
