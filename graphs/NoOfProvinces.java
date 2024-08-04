package graphs;

//import java.util.ArrayList;

public class NoOfProvinces {
    /* 
    if u are given with adjList..solution

    void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adjList){
        vis[node] = true;

        for(int i = 0; i < adjList.get(node).size(); i++){
            if(!vis[adjList.get(node).get(i)]) dfs(adjList.get(node).get(i), vis, adjList);
        }

    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        //change the adjacence matrix to list
        for(int i = 0; i < isConnected.length; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < isConnected[i].length; j++){
                if(isConnected[i][j] == 1 && j != i){
                    list.add(j);
                }
            }
            adjList.add(list);
        }

        int count = 0;
        boolean[] visited = new boolean[adjList.size()];
        for(int i = 0; i < adjList.size(); i++){
            if(!visited[i]){
                dfs(i, visited, adjList);
                count++;
            }
        }

        return count;
    } */

    void dfs(int[][] adjMatrix, int node, boolean[] vis){
        vis[node] = true;

        for(int i = 0; i < adjMatrix[node].length; i++){
            if(adjMatrix[node][i] == 1 && vis[i] == false){
                dfs(adjMatrix, i, vis);
            }
        }

    }
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        boolean[] visited = new boolean[isConnected.length];
        for(int i = 0; i < isConnected.length; i++){
            if(!visited[i]){
                dfs(isConnected, i, visited);
                count++;
            }
        }

        return count;
    }
}
