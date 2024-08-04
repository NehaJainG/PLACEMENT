public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] lastWord = s.split("\\s+");
        return lastWord[lastWord.length - 1].length();
    }
    public static void main(String[] args) {
        
    }
}
