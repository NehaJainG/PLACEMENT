package Array;


public class ConvertSortedArrayToTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    TreeNode arrayToTree(int[] nums,int left, int right){
        if (left>right) {
            return null;
        }
        int mid = (left + right) /2;
        TreeNode l = arrayToTree(nums, left, mid-1);
        TreeNode r = arrayToTree(nums, mid+1, right);
        TreeNode p = new TreeNode(nums[mid], l, r);
        return p;

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return arrayToTree(nums, 0, nums.length-1);
    }
}
