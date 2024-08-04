import java.util.Scanner;

public class RevereseLettersInWord {
    static MyStack stack = new MyStack();

    static String reverse(){
        String rev = "";
        while(!stack.isEmpty()){
            rev += "" + stack.pop();
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' ') result.append(reverse()).append(" ");
            else if(i == s.length() -1){
                stack.push(c);
                result.append(reverse());
            }
            else stack.push(c);
        }

        System.out.println(result);
        sc.close();
        
    }
}

class MyStack{
    char[] arr;
    int top;
    MyStack(){
        arr = new char[100];
        top = -1;
    }

    void push(char n){
        if(top >= 100) return;
        //System.out.println("Push current state "+n);
        arr[++top] = n;
    }
    char pop(){
        if(top<0) return '\0';
        return arr[top--];
    }

    boolean isEmpty(){
        return top < 0;
    }
}
