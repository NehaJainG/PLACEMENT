package Array;

public class ContainerWithMostWater {
    public int maxArea1(int[] height) {
        //brute force appoarch but exceeds time in leetcode.
        int max = 0;

        for(int i = 0; i<height.length; i++){
            for(int j = i+1; j<height.length; j++){
                int area = (j-i) * Math.min(height[j], height[i]);
                if(area > max) max = area;
            }
        }

        return max;
    }
    public int maxArea(int[] height) {
        //linear time complexity solution.
        int max = 0;
        int left = 0, right = height.length - 1;

        while(left < right){
            //System.out.println(left+" "+right);
            int area = (right - left) * Math.min(height[left],height[right]);
            max = Math.max(area,max);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return max;
    }
}
