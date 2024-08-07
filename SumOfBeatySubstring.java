public class SumOfBeatySubstring {
    public int beautySum(String s) {
        int sum = 0;
        

        for(int i = 0; i < s.length(); i++){
            int max = 0;
            int min = 27;
            int freqMap[] = new int[26];
            for(int j=i; j<s.length();j++){
                int c = s.charAt(j) - 'a';
                freqMap[c]++;
                for(int k=0;k<26;k++){
                    if(freqMap[k]>0){
                        max = freqMap[max] < freqMap[k] ? k : max;
                        min = min == 27 || freqMap[min] >= freqMap[k] ? k : min;
                    }
                }
                
                if(min != 27) {
                    sum += freqMap[max] - freqMap[min];
                }
            }
        }

        return sum;
    }
}
