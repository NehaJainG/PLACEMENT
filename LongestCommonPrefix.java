import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        Arrays.sort(strs);
        //System.out.println(strs[0] + " "+ strs[strs.length -1]);
        String f = strs[0];
        String l = strs[strs.length - 1];
        for(int i = 0; i < Math.min(f.length(), l.length()); i++){
            if(f.charAt(i) == l.charAt(i)) prefix.append(f.charAt(i));
            else return prefix.toString();
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] v = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(v));
    }
}
