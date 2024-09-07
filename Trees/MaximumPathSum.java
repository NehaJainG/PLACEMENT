public class MaximumPathSum {
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
    
    //prerequite is how to find the height and width(diameter) of tree, then this problem is simple to solve.
    public int maxPath(TreeNode root, int[] max){
        if(root == null) return 0;

        int lSum =Math.max(0, maxPath(root.left,max));
        int rSum =Math.max(0, maxPath(root.right,max));
        max[0] = Math.max(max[0], lSum+rSum+root.val);

        return root.val + Math.max(lSum,rSum);
    }
    public int maxPathSum(TreeNode root) {
        int[] maxiSum = {Integer.MIN_VALUE};
        maxPath(root,maxiSum);
        return maxiSum[0];
    }
}
