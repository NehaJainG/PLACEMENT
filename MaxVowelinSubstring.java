public class MaxVowelinSubstring {
    boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))) count++;
        }
        int max = count;
        for(int i=k; i<s.length();i++){
            //if the selected character is vowel then increment
            if(isVowel(s.charAt(i))) count++;
            //if the removed character is vowel then decrement
            if(isVowel(s.charAt(i-k))) count--;
            if(max<count) max = count;
        }
        return max;

    }
}
