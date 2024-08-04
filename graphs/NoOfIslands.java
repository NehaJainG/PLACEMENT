package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NoOfIslands{
    void bfs(int row, int col, boolean vis[][], char grid[][] ){
        vis[row][col] = true;
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{row,col});
        int rLen = grid.length;
        int cLen = grid[0].length;

        while(!queue.isEmpty()){
            int r = queue.peek()[0];
            int c = queue.peek()[1];
            queue.remove();

            for(int deltaRow = - 1; deltaRow < 2; deltaRow++){
                for(int deltaCol = -1; deltaCol < 2; deltaCol++){
                    int nr = r + deltaRow;
                    int nc = c + deltaCol;
                    if(nr >= 0 && nr < rLen && nc >= 0 && nc < cLen){
                        if(grid[nr][nc] == '1' && !vis[nr][nc]){
                            vis[nr][nc] = true;
                            queue.add(new Integer[]{nr,nc});
                        }
                    }
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(!visited[i][j] && grid[i][j] =='1'){
                    bfs(i,j,visited,grid);
                    count++;
                }
            }
        }

        return count;

    }
}