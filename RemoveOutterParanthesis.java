public class RemoveOutterParanthesis {
    public String removeOuterParentheses(String s) {
        String result = "";
        //Stack<Character> s = new Stack<>();
        int paranc= 0;

        for(int i = 0; i < s.length(); i++){
            if((paranc > 0 && s.charAt(i) == '(') || (paranc > 1 && s.charAt(i) == ')') ){
                result += s.charAt(i);
            }
            if(s.charAt(i) == '(') paranc++;
            else paranc--;
        }

        return result;
    }
}
