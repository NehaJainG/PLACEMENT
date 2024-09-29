import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BoundaryTraversal {
    static List<Integer> printBoundary(TreeNode root){
        List<Integer> bt = new ArrayList<>();
        if(root == null) return bt;

        bt.add(root.val);
        //left side nodes of the tree
        addLeftBoundary(root, bt);
        //leaf nodes
        addLeaves(root, bt);
        //right side nodes of the tree
        addRightBoundary(root, bt);

        return bt;
    }

    static void addLeftBoundary(TreeNode root, List<Integer> res){
        TreeNode curr = root.left;

        while(curr!=null){
            if(!isLeaf(curr)){
                res.add(curr.val);
            }
            if(curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    static void addRightBoundary(TreeNode root, List<Integer> res){
        TreeNode curr = root.right;
        Stack<Integer> s = new Stack<>();

        while (curr!=null) {
            if(!isLeaf(curr)){
                s.push(curr.val);
            }
            if(curr.right != null) curr = curr.right;
            else curr = curr.left;
        }

        while(!s.empty()){
            res.add(s.pop());
        }
    }

    static void addLeaves(TreeNode root, List<Integer> res){
        if(isLeaf(root)){
            res.add(root.val);
            return;
        }

        if(root.left!=null){
            addLeaves(root.left, res);
        }
        if(root.right!=null){
            addLeaves(root.right, res);
        }
    }

    static boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }

    static void printResult(List<Integer> result) {
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }


     public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Get the boundary traversal
        List<Integer> result = printBoundary(root);

        // Print the result
        System.out.print("Boundary Traversal: ");
        printResult(result);
    }


}
