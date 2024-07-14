package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs = new ArrayList<Integer>();
        boolean visited[] = new boolean[ V + 1];
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(0);
        visited[0] = true;
        
        while(!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);

            for(int adjVertex : adj.get(node)){
                if(!visited[adjVertex]){
                    q.add(adjVertex);
                    visited[adjVertex] = true;
                }
            }

        }
        
        return bfs;
    }
}
