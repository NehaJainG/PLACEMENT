import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
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

    public List<Integer> postorderTraversal_2Stack(TreeNode root) {
        List<Integer> post = new ArrayList<>();
        if(root == null) return post;

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        
        while(!s1.empty()){
            TreeNode node = s1.pop();
            if(node.left != null) s1.push(node.left);
            if(node.right != null) s1.push(node.right);
            s2.push(node);
        }

        while(!s2.empty()){
            post.add(s2.pop().val);
        }

        return post;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        //just a psuedo code..cause for some test case it generates wrong answer.
        List<Integer> post = new ArrayList<>();
        if(root == null) return post;

        Stack<TreeNode> s1 = new Stack<>();
        s1.push(root);
        TreeNode curr = null, temp = null;

        while(curr != null || !s1.empty()){
            if(curr != null){
                s1.push(curr);
                curr = curr.left;
            }else{
                temp = s1.peek().right;
                if(temp == null){
                    temp = s1.pop();
                    post.add(temp.val);
                    while(!s1.empty() && temp == s1.peek().right){
                        temp = s1.pop();
                        post.add(temp.val);
                    }
                }else{
                    curr = temp;
                }
            }
        }

        return post;
    }
}
