import java.util.Arrays;

public class ArrayIntersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        int p1 = 0, p2 = 0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1] < nums2[p2]){
                p1++;
            }else if(nums1[p1] > nums1[p2]){
                p2++;
            }else{
                nums1[k++] = nums1[p1++];
                p2++;
            }
        }

        return Arrays.copyOfRange(nums1, p2, k);
    }
}
