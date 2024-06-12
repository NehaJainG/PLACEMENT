
class armstrong{
    public static void main(String[] args) {
        // optimal solution
        int num = 8200;  //8208 //371 //153

        //calculate the length: Two simple ways 
        //int len = String.valueOf(num).length();  //possible in java only??
        int len = (int) Math.log10(num) + 1;

        //extra variables needed
        int arm = 0; //to store armstrong value 
        int temp = num; //temp variable to access the each digit

        //calculate the armstrong: ( sum(pow(digit, length)) )
        while(temp > 0 ){
            arm += Math.pow(temp % 10, len);
            temp /= 10;
        }

        //check if given number is equals to armstrong evaluated.
        if (arm == num) {
            System.out.println( arm + " is armstrong no ");
        }else {
            System.out.println(num + " != "+ arm);
        }

    }
}