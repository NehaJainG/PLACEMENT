import java.util.List;
import java.util.ArrayList;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        StringBuilder str = new StringBuilder();
        int left = 0, right = 0;
        while(right < nums.length){
            if(right < nums.length - 1 && nums[right+1] - nums[right] == 1){
                right++;
            }else if(left == right){
                result.add(nums[left++] + "");
            }else{
                str.append(nums[left]).append("->").append(nums[right]);
                result.add(str.toString());
                str.setLength(0);
                left = ++right;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
    }
}
