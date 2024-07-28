public class Atoi {
    public int myAtoi2(String s) {
        //initial workout---> needs to be optimised and needs neat coding
        s = s.trim();
        if(s.length() == 0) return 0;
        double num = 0;
        boolean negFlag = false;
        int i = 0;
        char c = s.charAt(i);
        if(c == '+' || c == '-') i++;
        negFlag = c == '-'; 
        for(; i < s.length(); i++){
            c = s.charAt(i);
            if(!(c >= '0' && c <= '9')){
                break;
            }
            num = num * 10 + c - '0';
            if(num >= Math.pow(2,31)){
                break;
            }
        }
        if(negFlag) num = -num;
        return (int) num;
    }

    public int myAtoi(String s) {
        int len = s.length();
        int i = 0; 
        double num = 0;
        boolean negSign = false;

        while(i < len && s.charAt(i) == ' '){
            i++;
        }

        if( i < len && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            negSign = s.charAt(i) == '-';
            i++;
        } 

        while(i < len){
            int c = s.charAt(i) - '0';
            if(c < 0 || c > 9) break;
            num = num * 10 + c;
            if(num > Integer.MAX_VALUE){
                return negSign ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            i++;
        }
        num = negSign ? -num : num;
        return (int) num;
    }
}
