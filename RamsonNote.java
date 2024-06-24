import java.util.*;
public class RamsonNote {
    
    public static boolean canConstruct_firstSol(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c,1);
            }
        }
        for(char c : map.keySet()){
            System.out.println(c + " " + map.get(c));
        }
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(map.containsKey(c)){
                System.out.print(map.get(c));
                map.put(c,map.get(c) - 1);
                if(map.get(c) < 0){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean canConstruct(String r, String m){
        if(r.length() > m.length()) return false;

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        //add unique characters in m with it's frequency
        for(char c : m.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : r.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c) - 1);
                if(map.get(c) < 0){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        canConstruct("aa", "aab");
    }
}
