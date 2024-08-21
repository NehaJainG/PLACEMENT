package graphs;

import java.util.ArrayList;

public class CyclesInGraphDFS {
    boolean dfs(int cur, int parent,boolean[] visited  ,ArrayList<ArrayList<Integer>> adj){
        visited[cur] = true;
        for(int i : adj.get(cur)){
           if(!visited[i]){
                if(dfs(i,cur,visited, adj)) return true;
            }else if(i != parent){
                return true;
            } 
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        for(int i=0; i<V; i++){
            if(!vis[i]){
                if(dfs(i,-1,vis,adj)) return true;;
            }
        }
        return false;
    }
}
