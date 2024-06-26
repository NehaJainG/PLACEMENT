public class MaxConsecutivesOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(max < count) max = count;
                count = 0;
            }else{
                count++;
            }
        }
        return Math.max(max, count);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,0,0,1,1,1,1};
        int[] arr2 ={0};
        System.out.println(findMaxConsecutiveOnes(arr));
        System.out.println(findMaxConsecutiveOnes(arr2));
    }
}
