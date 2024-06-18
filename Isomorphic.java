import java.util.*;

public class Isomorphic {
    
}

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<Character, Character>();
        boolean isIso = true;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)){
                isIso = false;
            }
            map.put(s.charAt(i), t.charAt(i));
        }


        return isIso;
        
    }
}