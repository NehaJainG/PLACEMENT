public class Exception {
    // public static void main(String[] args) {
    //     // int a = 5;
    //     // int b = 0;
    
    //     // try{
    //     //     System.out.println(a/b);
    //     // }catch(ArithmeticException e){
    //     //     System.out.println(e.getMessage());
    //     //     System.out.println(e.toString());
    //     //     e.printStackTrace();
    //     // }
    // }

    // public static void main(String[] args) {
    //     String str = null;
    //     System.out.println(str.length());
    // }

    static int divideByZero(int a, int b){
        return a/b;
    }

    static int computeDvision(int a, int b){
        int res = 0;
        try{
            res = divideByZero(a, b);
        }catch(NumberFormatException e){
            System.out.println("Number Format Exception");
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[4];
        int i = arr[4];
        System.out.println("hiiiii");
    }
}
