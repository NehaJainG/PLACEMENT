package graphs;

import java.util.*;

public class CycleInUndirectedGraph {
    public boolean checkForCycle(int src, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        Queue<Integer[]> q = new LinkedList<>();
        vis[src] = true;
        q.add(new Integer[]{src,-1});
        
        while(!q.isEmpty()){
            Integer[] node = q.remove();
            
            for(int adjV : adj.get(node[0])){
                if(!vis[adjV]){
                    q.add(new Integer[]{adjV,node[0]});
                    vis[adjV] = true;
                }
                else if(adjV != node[1]) return true;
            }
        }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!visited[i] && checkForCycle(i,visited,adj)) return true;
        }
        return false;
        
    }
}
