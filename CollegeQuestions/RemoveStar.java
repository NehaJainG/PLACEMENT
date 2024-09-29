package CollegeQuestions;

import java.util.Stack;

//input leet**cod*e
//output: lecoe. when uncounter star remove previous character
public class RemoveStar {
    public static void main(String[] args) {
        String str = "leet**cod*e";
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '*'){
                if(!s.empty()){
                    s.pop();
                }
            }else{
                s.push(str.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();
        while(!s.empty()){
            result.insert(0,s.pop());
        }

        System.out.println(result);

    }
    
}
