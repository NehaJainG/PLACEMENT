import java.util.Stack;

public class MaximumDepthInParenthesis {
    public int maxDepth(String s) {
        int max = 0;
        Stack<Character> ps = new Stack<Character>();
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == '('){
                ps.push('(');
            }else if(s.charAt(i) == ')'){
                max = Math.max(max,ps.size());
                if(!ps.empty()) ps.pop();
            }
        }

        return max;
    }
}
