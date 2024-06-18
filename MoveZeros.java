public class MoveZeros {

    public void moveZero(int[] nums) {
        //this didn't work for half test case so look into why?
        /* nums =[4,2,4,0,0,3,0,5,1,0]
        Use Testcase
        Output
        [4,0,0,0,0,3,2,5,1,4]
        Expected
        [4,2,4,3,5,1,0,0,0,0] */
        int zeroIndex = 0 , nonZeroIndex = 1;
        while(zeroIndex < nums.length && nonZeroIndex < nums.length){
            if(nums[zeroIndex]  != 0) zeroIndex++;
            else if(nums[nonZeroIndex] == 0) nonZeroIndex++;
            else if(nums[zeroIndex] == 0 && nums[nonZeroIndex] != 0){
                int temp = nums[zeroIndex];
                nums[zeroIndex] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
                zeroIndex++;
                nonZeroIndex++;
            }
        }
        
    }

    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        //optimal code
        
        for(int x : nums){
            if(x != 0) 
                nums[nonZeroIndex++] = x;
        }

        while(nonZeroIndex < nums.length) nums[nonZeroIndex++] = 0;
               
    }
    public static void main(String[] args) {
        
    }
}
