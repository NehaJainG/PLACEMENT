import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> bt = new LinkedList<>();
        if(root == null) return bt;
        
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = false;
        q.add(root);

        while(!q.isEmpty()){
            LinkedList<Integer> subarr = new LinkedList<>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode temp = q.remove();
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                if(flag) subarr.addFirst(temp.val);
                else subarr.addLast(temp.val);
            }
            bt.add(subarr);
            flag = !flag;
        }
        return bt;
    }
}
