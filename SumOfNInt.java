public class SumOfNInt {

    static int bruteForce(int n){
        int sum = 0;
        for(int i = 1; i <= n ; i++) sum += i;
        return sum;
    }

    static int formulaMethod(int n){
        return (n+1)*n/2 ;
    }

    //functional recursive
    static int funcRecursive(int n){
        if (n == 1 ) return 1;
        else if(n <= 0) return 0;
        return funcRecursive(n-1) + n;
    }

    //parameterized way of recursion. 
    static void parameter(int i, int sum){
        if(i <= 0 ){
            System.out.println(sum);
            return;
        }
        parameter(i-1, sum+i);
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(bruteForce(n));
        System.out.println(formulaMethod(n));
        System.out.println(funcRecursive(n));
        parameter(n, 0);
    }
}
