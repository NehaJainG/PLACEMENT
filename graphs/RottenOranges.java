package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    class Pair{
        int col, row, t;
        Pair(int r, int c, int t){
            this.col = c;
            this.row = r;
            this.t = t;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxTime = 0;
        int cntFresh = 0;
        Queue<Pair> queue = new LinkedList<Pair>();
        int[][] visited = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2){
                    visited[i][j] = 2;
                    queue.add(new Pair(i,j,0));
                }else if(grid[i][j] == 1){
                    visited[i][j] = 1;
                    cntFresh++;
                }
            }
        }

        int[] rowDel = {-1, 0, 1, 0};
        int[] colDel = {0, -1, 0, 1};

        while(!queue.isEmpty()){
            Pair node = queue.poll();

            maxTime = Math.max(maxTime, node.t);

            for(int i = 0; i < 4; i++){
                int nrow = node.row + rowDel[i];
                int ncol = node.col + colDel[i];
                if(nrow < n && nrow >= 0 && ncol < m && ncol >= 0 && visited[nrow][ncol] == 1){
                    visited[nrow][ncol] = 2;
                    queue.add(new Pair(nrow, ncol, node.t + 1));
                    cntFresh--;
                }
            } 
        }

        if(cntFresh > 0) return -1;

        return maxTime;
    }
}
