import java.util.ArrayList;

public class MedianOfSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //bruete force method. needs T(n+m) space.
        int len = nums1.length + nums2.length;
        ArrayList<Integer> mergedList = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<nums1.length || p2<nums2.length){
            if(p2==nums2.length || p1<nums1.length && nums1[p1]<nums2[p2]){
                mergedList.add(nums1[p1++]);
            }else{
                mergedList.add(nums2[p2++]);
            }
        }

        double median = mergedList.get(len/2);
        if(len%2==0) median = (median + mergedList.get((len/2)-1))/2;
        
        return median;
    }

    public double findMedianSortedArrays_OPTIMAL(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int p1=0, p2=0;
        int term1=0,term2=0,tc=0;
        while(tc<len){
            if(p2>=nums2.length || (p1<nums1.length && nums1[p1]<nums2[p2])){
                if(tc == (len/2)-1) term1=nums1[p1];
                if(tc == (len/2)) term2 = nums1[p1];
                p1++;
            }else{
                if(tc == (len/2)-1) term1=nums2[p2];
                if(tc == (len/2)) term2 = nums2[p2];
                p2++;
            }
            if(tc == len/2){
                if(len%2!=0) return term2;
                return ((double) term1 + term2) /2;
            }
            tc++;
        }
        
        return 0;

    }
    public static void main(String[] args) {
        
    }
}
