import java.util.*;


public class VerticalOrder {
    class Tuple{
        TreeNode node;
        int x;
        int y;

        public Tuple(TreeNode node, int r, int c){
            this.node = node;
            this.x = r;
            this.y =c;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer,Map<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(root,0,0));

        while(!q.isEmpty()){
            Tuple item = q.remove();

            if(!map.containsKey(item.x)){
                map.put(item.x,new TreeMap<>());
            }if(!map.get(item.x).containsKey(item.y)){
                map.get(item.x).put(item.y, new PriorityQueue<>());
            }
            map.get(item.x).get(item.y).offer(item.node.val);

            if(item.node.left != null) q.add(new Tuple(item.node.left, item.x-1,item.y+1));
            if(item.node.right != null) q.add(new Tuple(item.node.right, item.x+1,item.y+1));
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(Map<Integer, PriorityQueue<Integer>> val : map.values()){
            List<Integer> list = new ArrayList<>();
            for(PriorityQueue<Integer> nodes : val.values()){
                while(!nodes.isEmpty())
                    list.add(nodes.remove());
            }
            ans.add(list);
        }
        return ans;
    }
}
