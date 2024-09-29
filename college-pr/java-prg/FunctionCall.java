public class FunctionCall {
    static MyStack s = new MyStack();
    public static void add(){
        System.out.println("Return to " + s.pop());
    }
    public static void printCurrentLocation() {
        s.push(Thread.currentThread().getStackTrace()[s.top+1].getLineNumber());
        add();
        System.out.println("Return to " + s.pop());
    }

    public static void main(String[] args) {
            s.push(Thread.currentThread().getStackTrace()[s.top+1].getLineNumber());
            printCurrentLocation();    
    }
}
class MyStack{
    int[] arr;
    int top;
    MyStack(){
        arr = new int[100];
        top = -1;
    }

    void push(int n){
        if(top >= 100) return;
        System.out.println("Push current state "+n);
        arr[++top] = n;
    }
    int pop(){
        if(top<0) return -1;
        return arr[top--];
    }
}