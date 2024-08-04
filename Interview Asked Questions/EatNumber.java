import java.util.HashSet;
public class EatNumber {
    public static void main(String[] args){
        String s = "aabcda";
        HashSet<Character> set = new HashSet<Character>();
        int max = 0;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                if(max < set.size()) max = set.size();
                set.clear();
            }
            set.add(c);
        }

        System.out.println(max);
    }
}
