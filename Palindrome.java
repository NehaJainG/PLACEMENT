public class Palindrome {

   /*  A phrase is a palindrome if, after converting all uppercase letters
    into lowercase letters and removing all non-alphanumeric characters, 
    it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
 */
    public boolean isPalindrome(String s) {
        s = s.toUpperCase();
        int low = 0 , high = s.length() - 1;
        while(low < high){
            while(!Character.isLetterOrDigit(s.charAt(low)) && low < s.length() -1) low++;
            while(!Character.isLetterOrDigit(s.charAt(high)) && high > 0) high--;
            if(low == s.length() - 1 && high == 0) return true;
            if(s.charAt(low) != s.charAt(high) ) return false;
            low++;
            high--;
        }
        return true;
        
    }
}
