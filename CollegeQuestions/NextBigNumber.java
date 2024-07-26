package CollegeQuestions;

import java.util.Scanner;

public class NextBigNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = scanner.nextLine();
        String nextGreatest = getNextGreatestNumber(number);

        if (nextGreatest.equals(number)) {
            System.out.println("No greater number can be formed with the same digits.");
        } else {
            System.out.println("Next greatest number: " + nextGreatest);
        }
        scanner.close();
    }

    private static String getNextGreatestNumber(String number) {
        char[] digits = number.toCharArray();
        int n = digits.length;

        // Step 1: Find the first digit that is smaller than the digit next to it
        int i;
        for (i = n - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                break;
            }
        }

        // If no such digit is found, that means the digits are sorted in descending order
        // which means we cannot get a greater number with the same digits
        if (i == -1) {
            return number;
        }

        // Step 2: Find the smallest digit on the right side of (i-th digit) which is larger than digits[i]
        int j;
        for (j = n - 1; j > i; j--) {
            if (digits[j] > digits[i]) {
                break;
            }
        }

        // Step 3: Swap the found digits[i] and digits[j]
        swap(digits, i, j);

        // Step 4: Reverse the digits after (i-th digit)
        reverse(digits, i + 1, n - 1);

        return new String(digits);
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
 }
}
} 