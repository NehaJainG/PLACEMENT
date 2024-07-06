package Array;

public class RearrangeArrayBySign {
    public int[] rearrangeArray(int[] nums) {
        //initial brute force 
        int p1 = 0, p2 = 0;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            while(p1 < nums.length && nums[p1] < 0 ) p1++;
            while(p2 < nums.length && nums[p2] > 0 ) p2++;
            if(i%2 == 0) result[i] = nums[p1++];
            else result[i] = nums[p2++];
        }
        return result;
    }

    public int[] rearrangeArray2(int[] nums) {
        int p1 = 0, p2 = 1;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                result[p2] = nums[i];
                p2 += 2;
            }else{
                result[p1] = nums[i];
                p1 += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
    }
}
