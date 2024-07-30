package Trees;

import javax.swing.tree.TreeNode;

public class BinaryTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int key){
            val = key;
        }
    }

    public void computeTree(TreeNode root){
        if(root == null) return;
        System.out.print(root.val  + " ");
        computeTree(root.left);
        computeTree(root.right);
        if(root.val == 2){
            root.val = root.left.val == 1 || root.right.val == 1 ? 1 : 0;
        }else if(root.val == 3){
            root.val = root.left.val * root.right.val;
        }
        System.out.println("After compute " + root.val + " ");
    }
    public boolean evaluateTree(TreeNode root) {
        computeTree(root);
        if(root.val == 1) return true;
        return false;
    }
    
}
