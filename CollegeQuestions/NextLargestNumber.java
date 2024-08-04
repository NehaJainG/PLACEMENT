package CollegeQuestions;

import java.util.Arrays;
import java.util.Scanner;

/* 
 * Get a number and display the next greatest number that can be formed using
 * the digits of the given number
 * Input: 123
 * output: 132
 * 
 * input: 847629128
 * output: ??
 * 
 */

public class NextLargestNumber {
    static int arrayToInteger(int[] arr){
        int number = 0;
        for(int i = 0; i < arr.length; i++){
            number = (number * 10) + arr[i];
        }
        return number;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int[] digits = new int[String.valueOf(num).length()];
        int leastEleIndex = digits.length - 1;
        for(int i = digits.length - 1; i >= 0 ; i--){
            digits[i] = num % 10;
            if(digits[i] < digits[leastEleIndex]) leastEleIndex = i;
            num /= 10;
        }
        //System.out.println(arrayToInteger(digits));

        if(leastEleIndex != digits.length - 1){
            Arrays.sort(digits, leastEleIndex+1, digits.length);
            int temp = digits[leastEleIndex];
            digits[leastEleIndex] = digits[leastEleIndex + 1];
            digits[leastEleIndex + 1] = temp;
        }
        System.out.println("Next biggest number: " + arrayToInteger(digits));

        sc.close();
    }
}
