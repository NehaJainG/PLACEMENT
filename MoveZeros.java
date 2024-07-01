public class MoveZeros {

    public void moveZeroesMySolution(int[] nums) {
        int zeroIndex = 0 , nonZeroIndex = 1;
        while(zeroIndex < nums.length && nonZeroIndex < nums.length){
            if(nums[zeroIndex]  != 0) {
                zeroIndex++;
                if(zeroIndex >= nonZeroIndex) nonZeroIndex = zeroIndex + 1;
            }
            else if(nums[nonZeroIndex] == 0) nonZeroIndex++;
            else if(nums[zeroIndex] == 0 && nums[nonZeroIndex] != 0){
                int temp = nums[zeroIndex];
                nums[zeroIndex++] = nums[nonZeroIndex];
                nums[nonZeroIndex++] = temp;
            }
        }
     
    }

    public static void moverZerosToEnd(int[] nums){
        int zeroIndex = -1;

        //find the index where first zero is found
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroIndex = i;
                break;
            }
        }

        if(zeroIndex == -1 ) return;

        //traaverse through the rest of array and swap the elements from zeroIndex with i if nums[i] is non-zero Number.
        for(int i = zeroIndex + 1; i < nums.length; i++){
            if(nums[i] != 0){
                nums[zeroIndex] = nums[i];
                nums[i] = 0;
                zeroIndex++;
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
