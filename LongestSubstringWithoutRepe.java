import java.util.HashSet;

public class LongestSubstringWithoutRepe {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int left = 0, maxLength = 0;
        for(int right = 0; right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            if(maxLength < set.size()) maxLength = set.size();
        }

        return maxLength;
        
    }
}
