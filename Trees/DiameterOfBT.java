class DiameterOfBT{
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

    int height(TreeNode root){
        if (root == null) return 0;

        int r = height(root.right);
        int l = height(root.left);

        return 1+Math.max(r,l);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        //naive method: brute force
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        int diL = diameterOfBinaryTree(root.left);
        int diR = diameterOfBinaryTree(root.right);
        return Math.max(lh+rh, Math.max(diL,diR));
    }


    int height(TreeNode root, int[] diameter){
        if (root == null) return 0;

        int r = height(root.right,diameter);
        int l = height(root.left,diameter);

        diameter[0] = Math.max(diameter[0], r+l);

        return 1+Math.max(r,l);
    }
    public int diameterOfBinaryTree2(TreeNode root) {
        //optimal soultion with T(n) time complexity
        int diameter[] = new int[1];
        height(root, diameter);
        return diameter[0];
    }
}