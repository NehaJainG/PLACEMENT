import java.util.HashMap;

public class UniqueCharacterInString {
    public static void main(String[] args) {
        String str = "heellohd";
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //Character uniqueChar;
        // System.out.println(map);
        // for(Character uniqueChar : map.keySet()){
        //     if(map.get(uniqueChar) == 1){
        //         System.out.println(str.indexOf(uniqueChar) + 1);
                
        //     }
        // }
        for(int i = 0; i < str.length(); i++){
            if(map.get(str.charAt(i)) == 1){
                System.out.println(i+1);
                break;
            }
        }
    }
}
