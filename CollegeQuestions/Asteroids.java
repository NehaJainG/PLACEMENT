package CollegeQuestions;

import java.util.ArrayList;
import java.util.Stack;

public class Asteroids {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 10, -25};
        //{5,2,-6,7,4};
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                while(!s.empty() && s.peek() < Math.abs(arr[i])){
                    s.pop();
                }
                if(s.empty()){
                    s.push(arr[i]);
                }
                
            }else{
                s.push(arr[i]);
            }
        }

        ArrayList<Integer>  newArr = new ArrayList<>();
        while(!s.empty()){
            newArr.add(0, s.pop());
        }

        for(int j = 0; j < newArr.size(); j++){
            System.out.print(newArr.get(j) + " ");
        }

    }
}
